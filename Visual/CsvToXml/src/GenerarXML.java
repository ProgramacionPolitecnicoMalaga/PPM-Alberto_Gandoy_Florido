import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GenerarXML implements OperacionesSobreXML {

    @Override
    public void aeropuertoXML(ArrayList<Pais> paises, ArrayList<Aeropuerto> aeropuertos) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element root = doc.createElement("Aeropuertos");
            doc.appendChild(root);

            for (int  i = 0; i < paises.size(); i++) {
                Element nodoPais = doc.createElement("Pais");

                Attr nombrePais = doc.createAttribute("name");
                nombrePais.setValue(paises.get(i).getName());

                for (int j = 0; j < aeropuertos.size(); j++) {
                    if (aeropuertos.get(j).equals(paises.get(j))) {
                        Element nodoAeropuerto = doc.createElement("aeropuerto");

                        Element aeropuertoName = doc.createElement("nombre");
                        aeropuertoName.setTextContent(aeropuertos.get(i).getAeropuertoName());

                        Element iata = doc.createElement("iata");
                        iata.setTextContent(aeropuertos.get(i).getIata());

                        Element nodoLocalizacion = doc.createElement("localizacion");

                        Element ciudad = doc.createElement("ciudad");
                        ciudad.setTextContent(aeropuertos.get(i).getCiudad());

                        Element latitud = doc.createElement("latitud");
                        latitud.setTextContent(aeropuertos.get(i).getLatitud());

                        Element longitud = doc.createElement("longitud");
                        longitud.setTextContent(aeropuertos.get(i).getLongitud());

                        nodoPais.appendChild(nodoAeropuerto);
                        nodoAeropuerto.appendChild(aeropuertoName);
                        nodoAeropuerto.appendChild(iata);
                        nodoAeropuerto.appendChild(nodoLocalizacion);
                        nodoAeropuerto.appendChild(ciudad);
                        nodoAeropuerto.appendChild(latitud);
                        nodoAeropuerto.appendChild(longitud);
                    }
                }
                nodoPais.setAttributeNode(nombrePais);
                root.appendChild(nodoPais);
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("aeropuertos.xml"));
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            transformer.transform(source,result);

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void aerolineaXML(ArrayList<Pais> paises, ArrayList<Aerolinea> aerolineas) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element root = doc.createElement("Aeropuertos");
            doc.appendChild(root);

            for (int  k = 0; k < paises.size(); k++) {
                Element nodoPais = doc.createElement("Pais");

                Attr nombrePais = doc.createAttribute("name");
                nombrePais.setValue(paises.get(k).getName());

                for (int x = 0; x < aerolineas.size(); x++) {
                    if (aerolineas.get(x).equals(paises.get(k))) {
                        Element nodoAerolinea = doc.createElement("aerolina");

                        Attr id = doc.createAttribute("id");
                        id.setValue(aerolineas.get(x).getId());

                        Attr nombre = doc.createAttribute("nombre");
                        nombre.setValue(aerolineas.get(x).getNombre());

                        Attr iata = doc.createAttribute("iata");
                        iata.setValue(aerolineas.get(x).getIata());

                        Attr codigoLlamada = doc.createAttribute("codigoLlamada");
                        codigoLlamada.setValue(aerolineas.get(x).getCodigoLlamada());

                        nodoPais.appendChild(nodoAerolinea);
                        nodoAerolinea.setAttributeNode(id);
                        nodoAerolinea.appendChild(nombre);
                        nodoAerolinea.appendChild(iata);
                        nodoAerolinea.appendChild(codigoLlamada);
                    }
                }
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File("airlines.xml"));
                transformer.setOutputProperty(OutputKeys.INDENT,"yes");
                transformer.transform(source,result);
                nodoPais.setAttributeNode(nombrePais);
                root.appendChild(nodoPais);
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void xmlToCsvAeropuerto(String archivo) {
        CargarXML cargarXML = new CargarXML();
        ArrayList<String> aeropuertos = new ArrayList<>();

        cargarXML.cargar(archivo);
        try {
            XPath xPath = XPathFactory.newInstance().newXPath();
            String xpathExpr = "/Aeropuertos/Pais";
            NodeList nodosPais = (NodeList) xPath.compile(xpathExpr).evaluate(cargarXML.getDoc(), XPathConstants.NODESET);

            for (int e = 0; e < nodosPais.getLength(); e++) {
                Element elementoPais = (Element) nodosPais.item(e);
                String namePais = elementoPais.getAttribute("name");

                NodeList nodoAeropuerto = elementoPais.getElementsByTagName("aeropuerto");

                for (int c = 0; c < nodoAeropuerto.getLength(); c++) {
                    int item = 0;
                    Element elementIdAeropuerto = (Element) nodoAeropuerto.item(c);
                    String nombre = elementIdAeropuerto.getElementsByTagName("nombre").item(item).getTextContent();
                    String iata = elementIdAeropuerto.getElementsByTagName("iata").item(item).getTextContent();

                    NodeList nodoLocalizacion = elementIdAeropuerto.getElementsByTagName("localizacion");
                    for (int v = 0 ; v < nodoLocalizacion.getLength(); v++){
                        Element elementoLoc = (Element) nodoLocalizacion.item(v);
                        String ciudad = elementoLoc.getElementsByTagName("ciudad").item(item).getTextContent();
                        String lat = elementoLoc.getElementsByTagName("latitud").item(item).getTextContent();
                        String lon = elementoLoc.getElementsByTagName("longitud").item(item).getTextContent();

                        aeropuertos.add(namePais + " " + nombre + " " + iata + " " + ciudad + " " + lat + " " + lon);
                    }

                    FileWriter fileWriter = null;
                    try {
                        fileWriter = new FileWriter("aeropuertos.csv");
                        for (String cadena : aeropuertos) {
                            fileWriter.write(cadena + "\n" );
                        }
                        fileWriter.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
    } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }

        @Override
    public void xmlToCsvAerolinea(String archivo) {
        CargarXML cargarXML = new CargarXML();
        ArrayList<String> aerolineas = new ArrayList<>();

        cargarXML.cargar(archivo);
            try {
                XPath xPath = XPathFactory.newInstance().newXPath();
                String xpathExpr = "/Aeropuertos/Pais";
                NodeList nodosPais = (NodeList) xPath.compile(xpathExpr).evaluate(cargarXML.getDoc(), XPathConstants.NODESET);
                for (int y = 0; y < nodosPais.getLength(); y++){

                    Element elementoPais = (Element) nodosPais.item(y);
                    String namePais = elementoPais.getAttribute("name");

                    NodeList nodoAerolinea = elementoPais.getElementsByTagName("aerolinea");

                    for (int s = 0; s < nodoAerolinea.getLength(); s++){
                        int item = 0;
                        Element elementIdAerolinea = (Element) nodoAerolinea.item(s);
                        String idAer = elementIdAerolinea.getAttribute("id");
                        String nombre = elementIdAerolinea.getElementsByTagName("nombre").item(item).getTextContent();
                        String iata = elementIdAerolinea.getElementsByTagName("iata").item(item).getTextContent();
                        String codigoLlamada = elementIdAerolinea.getElementsByTagName("codigoLlamada").item(item).getTextContent();

                        aerolineas.add(namePais + " " + idAer + "," + nombre + " " + iata + " " + codigoLlamada);

                        FileWriter fileWriter = null;
                        try {
                            fileWriter = new FileWriter("aerolineas.csv");
                            for (String cadena : aerolineas) {
                                fileWriter.write(cadena + "\n");
                            }
                            fileWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }
            } catch (XPathExpressionException e) {
                e.printStackTrace();
            }
        }
}
