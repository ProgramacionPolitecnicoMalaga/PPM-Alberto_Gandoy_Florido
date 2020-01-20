package LeerEscribir;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import proyecto.Comercial;
import proyecto.Comerciales;
import proyecto.Venta;
import proyecto.VentaMensual;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;

public class LecturaXML implements Lector {//ALGO QUE NO ME CUADRA
    private Document doc;

    public LecturaXML(){
    }

    public LecturaXML(String nombreFichero){
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

    public void leerArchivo(String nombreFichero){
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

    @Override
    public Comerciales lecturaComerciales(Comerciales comerciales) {
        NodeList listaDeNodos = null;
        try {
            listaDeNodos = evaluateXPath("/comerciales/comercial");
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < listaDeNodos.getLength(); i++) {
            Comercial comercial = new Comercial();
            Node n = listaDeNodos.item(i);

            if ((n != null) && (n.getNodeType() == Element.ELEMENT_NODE)) {
                NamedNodeMap atributos = n.getAttributes();
                comercial.setNombre(atributos.item(1).getNodeValue());
                comerciales.addComercial(comercial);
            }
        }
        return comerciales;
    }

    @Override
    public VentaMensual lecturaVentas(VentaMensual ventaMensual) {
        NodeList listaDeNodos = null;
        try {
            listaDeNodos = evaluateXPath("/VentasMensuales/venta");
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < listaDeNodos.getLength(); i++) {
            Venta venta = new Venta();
            Node n = listaDeNodos.item(i);

            if ((n != null) && (n.getNodeType() == Element.ELEMENT_NODE)) {
                NamedNodeMap atributos = n.getAttributes();

                venta.setId(Integer.parseInt(atributos.item(1).getNodeValue()));
                ventaMensual.addVenta(venta);
            }
        }
        return ventaMensual;
    }
}

