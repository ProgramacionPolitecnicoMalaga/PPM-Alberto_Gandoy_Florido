package Lector;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;

public class LectorXML {

    public NodeList getNodelist() {
        NodeList nodeList = null;
        try {
            String dir = System.getProperty("user.dir");
            File inputFile = new File( dir + File.separator + "Nacionalidades.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            XPath xPath = XPathFactory.newInstance().newXPath();
            nodeList = (NodeList) xPath.compile("/root/row").evaluate(doc, XPathConstants.NODESET);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return nodeList;
    }
}
