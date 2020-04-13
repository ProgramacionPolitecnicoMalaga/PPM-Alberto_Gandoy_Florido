package Lector;

import Modelo.Empadronado;
import Modelo.Empadronados;
import org.w3c.dom.*;
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
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

    public NodeList evaluateXPath(String xpathExpr) throws XPathExpressionException {
        XPath xPath = XPathFactory.newInstance().newXPath();
        NodeList nodeList = (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);
        return nodeList;
    }


    public String leerXML(Empadronados empadronados) {
        NodeList listaDeNodos = null;

        try {
            listaDeNodos = evaluateXPath("/root/row");
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < listaDeNodos.getLength(); i++) {
            Empadronado empadronado = new Empadronado();
            Node node = listaDeNodos.item(i);
                NamedNodeMap atributos = node.getAttributes();

            if ((node != null) && (node.getNodeType() == Element.ELEMENT_NODE)) {
                empadronado.setAnyo(atributos.item(0).getTextContent());
                empadronado.setNacionalidad(atributos.item(1).getTextContent());
                empadronado.setNumeroDeEmpadronados(atributos.item(2).getTextContent());
                empadronados.agregarEmpadronado(empadronado);
            }
        }
        return empadronados.toString();
    }
}
