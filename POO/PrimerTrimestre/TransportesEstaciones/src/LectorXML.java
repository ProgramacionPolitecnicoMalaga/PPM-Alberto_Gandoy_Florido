import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;

public class LectorXML {
    private Document doc;

    public LectorXML(String nombreFichero){
        String dir = System.getProperty("user.dir");
        try {
            File inputFile = new File(dir + File.separator + nombreFichero);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
            doc = docBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public NodeList evaluateXPath(String xpathExpr) throws XPathExpressionException {
        XPath xPath = XPathFactory.newInstance().newXPath();
        NodeList nodeList = (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);
        return nodeList;
    }


    public void cargarXML(NodeList nodos, Provincias provincias) {

        for (int i=0; i < nodos.getLength();i++){
            Element elemento = (Element) nodos.item(i);

            //AÑADIMOS LAS PROVINCIAS
            Node nodoProvincia = elemento.getElementsByTagName("territory").item(0);
            Provincia provincia = new Provincia(nodoProvincia.getTextContent());
            if (!provincias.getProvincias().contains(provincia)) {
                provincias.añadirProvincia(provincia);
            }

            //AÑADIMOS LAS CIUDADES DE CADA PROVINCIAS, SI TIENE CIUDAD
            Ciudad ciudad = new Ciudad();
            NodeList nodolocalidad = elemento.getElementsByTagName("locality");
            if (nodolocalidad.getLength() > 0) {
                ciudad.setNombre(nodolocalidad.item(0).getTextContent());
                if (!provincia.getCiudades().contains(ciudad)) {
                    provincia.añadirCiudad(ciudad);
                }
            }

            //CREAMOS TRANSPORTE
            Node nodoTipoTransporte = elemento.getElementsByTagName("transporttype").item(0);
            Transporte transporte = new Transporte(nodoTipoTransporte.getTextContent());

            //CREAMOS UBICACION
            NodeList nodoLatitud = elemento.getElementsByTagName("latwgs84");
            NodeList nodoLongitud = elemento.getElementsByTagName("lonwgs84");
            double lat = 0, lon = 0;
            if (nodoLatitud.getLength() > 0 && nodoLongitud.getLength() > 0) {
               lat = Double.valueOf(nodoLatitud.item(0).getTextContent());
               lon = Double.valueOf(nodoLongitud.item(0).getTextContent());
            }
            Ubicacion ubicacion = new Ubicacion(lat, lon);

            //AÑADIMOS LA ESTACIÓN
            Node nodoNombreEstacion = elemento.getElementsByTagName("documentname").item(0);
            Node nodoTelefono = elemento.getElementsByTagName("phone").item(0);
            Node nodoDireccion = elemento.getElementsByTagName("address").item(0);
            Estacion estacion = new Estacion(nodoNombreEstacion.getTextContent(), nodoTelefono.getTextContent(), nodoDireccion.getTextContent(),transporte, ubicacion);
            //AÑADE LA ESTACIÓN A CIUDAD O PROVINCIA EN FUNCIÓN SI ES MAYOR A CERO O NO.
                ciudad.añadirEstacion(estacion);
                provincia.añadirEstacion(estacion);
        }
    }
}

