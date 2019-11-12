import org.w3c.dom.Document;
import org.w3c.dom.Element;
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

public class XPathEvaluator {
    private Document doc;


    public XPathEvaluator(String nombreFichero){
        String dir = System.getProperty("user.dir");
        try {
            File inputFile = new File(dir + File.separator + "aeropuertos.xml");
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

    public  ArrayList<String> buscarAeropuertos(String pais){
            // XPathEvaluator eval = new XPathEvaluator("aeropuertos.xml");
            ArrayList<String> res = new ArrayList<>();

            try {
                NodeList nodeSet = evaluateXPath("/aeropuertos/aeropuerto");
                for (int k = 0; k < nodeSet.getLength(); k++) {
                    Element aeropuerto = (Element) nodeSet.item(k);
                    if(pais.equals(aeropuerto.getAttribute("pais"))){
                        // System.out.println(aeropuerto.getAttribute("nombreLargo"));
                        res.add(aeropuerto.getAttribute("nombreLargo"));
                    }
                }
            } catch (XPathExpressionException e) {
                e.printStackTrace();
            }

        return res;
    }

    public  ArrayList<String> datosAeropuertoSeleccionado(String aeropuertoSelec){
        // XPathEvaluator eval = new XPathEvaluator("aeropuertos.xml");
        ArrayList<String> res = new ArrayList<>();

        try {
            NodeList nodeSet = evaluateXPath("/aeropuertos/aeropuerto");
            for (int k = 0; k < nodeSet.getLength(); k++) {
                Element aeropuerto = (Element) nodeSet.item(k);
                if(aeropuertoSelec.equals(aeropuerto.getAttribute("nombreLargo"))){
                    // System.out.println(aeropuerto.getAttribute("nombreLargo"));
                    res.add(aeropuerto.getAttribute("area"));
                    res.add(aeropuerto.getAttribute("lat"));
                    res.add(aeropuerto.getAttribute("lon"));
                    res.add(aeropuerto.getAttribute("matricula"));
                }
            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        return res;
    }


}