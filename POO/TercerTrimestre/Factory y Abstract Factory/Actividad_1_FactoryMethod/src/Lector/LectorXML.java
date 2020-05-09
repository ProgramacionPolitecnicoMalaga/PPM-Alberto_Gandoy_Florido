package Lector;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;

public class LectorXML {

    public static NodeList getNodeXML() {
        String dir =  System.getProperty("user.dir");
        File file = new File( dir + File.separator +"XML/poblacion.xml");
        NodeList nodeList = null;
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(file);
            doc.getDocumentElement().normalize();
            XPath xPath = XPathFactory.newInstance().newXPath();
            nodeList = (NodeList) xPath.compile("/root/row").evaluate(doc, XPathConstants.NODESET);
            XPath path = XPathFactory.newDefaultInstance().newXPath();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return nodeList;
    }
}


