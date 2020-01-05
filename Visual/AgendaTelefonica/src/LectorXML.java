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
import java.util.ArrayList;

public class LectorXML {
    private String archivo;
    private Document doc;

    public LectorXML(String archivo) {
        this.archivo = archivo;
    }

    public void abrirDocumento() {
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
        try {
            File inputFile = new File(dir + File.separator + archivo);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    public void obtenerContactos(ArrayList<Contacto> contactos) {
        try {
            XPath xPath = XPathFactory.newInstance().newXPath();
            String xpathExpr = "/agenda/contacto";
            NodeList litaNodoAgenda = (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < litaNodoAgenda.getLength(); i++){
                Element elementoAgenda = (Element) litaNodoAgenda.item(i);
                String nombreContacto = elementoAgenda.getAttribute("nombre");
                String telefonoContacto = elementoAgenda.getAttribute("telefono");
                Contacto contacto = new Contacto(nombreContacto, telefonoContacto);
                contactos.add(contacto);
            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }
}
