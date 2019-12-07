import org.w3c.dom.*;
import org.w3c.dom.xpath.XPathEvaluator;
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


public class LecturaXML {

    private Document doc;

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











/* FORMA CHORIZACO

    public void mostrarCursoXML() {
        try {
            File archivo = new File("curso.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
            Document document = documentBuilder.parse(archivo);
            document.getDocumentElement().normalize();
            //     System.out.println("Elemento raiz:" + document.getDocumentElement().getNodeName());

            System.out.println("============Cursos===============");
            NodeList listaCursoNodo = document.getElementsByTagName("curso");
            for (int i = 0; i < listaCursoNodo.getLength(); i++) {
                Node nodoCurso = listaCursoNodo.item(i);
                //   System.out.println("Elemento:" + nodo.getNodeName());
                if (nodoCurso.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nodoCurso;
                    System.out.println("id: " + element.getAttribute("id"));
                    System.out.println("Nombre: " + element.getAttribute("nombre"));

                    System.out.println("============Asignaturas===============");
                    NodeList listaAsignaturaNodo = document.getElementsByTagName("asignatura");
                    for (int k = 0; k < listaAsignaturaNodo.getLength(); k++) {
                        Node nodoAsignatura = listaAsignaturaNodo.item(k);
                        if (nodoAsignatura.getNodeType() == Node.ELEMENT_NODE) {
                            Element element1 = (Element) nodoAsignatura;
                            System.out.println("id: " + element1.getAttribute("id"));
                            System.out.println("asignatura: " + element1.getAttribute("nombre"));
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void mosotrarS11AWxml() {
        try {
            File archivo = new File("ed_S11AW.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
            Document document = documentBuilder.parse(archivo);
            document.getDocumentElement().normalize();
            //     System.out.println("Elemento raiz:" + document.getDocumentElement().getNodeName());

            System.out.println("============Asignaturas===============");
            NodeList listaAsignaturaNodo = document.getElementsByTagName("asignatura");
            for (int k = 0; k < listaAsignaturaNodo.getLength(); k++) {
                Node nodoAsignatura = listaAsignaturaNodo.item(k);
                if (nodoAsignatura.getNodeType() == Node.ELEMENT_NODE) {
                    Element element1 = (Element) nodoAsignatura;
                    System.out.println("id: " + element1.getAttribute("id"));
                    System.out.println("asignatura: " + element1.getAttribute("nombre"));
                }

                System.out.println("============Alumno===============");
                NodeList nodoAlumnado = document.getElementsByTagName("alumno");
                for (int x = 0; x < nodoAlumnado.getLength(); x++) {
                    Node nodoAlumno = nodoAlumnado.item(x);
                    if (nodoAlumno.getNodeType() == Node.ELEMENT_NODE) {
                        Element element1 = (Element) nodoAlumno;
                        System.out.println("alumno: " + element1.getAttribute("nombre"));
                    }
                    System.out.println("============Indicadores===============");
                    NodeList nodoIndicador = document.getElementsByTagName("indicador");

                    Node nodoIndicado = nodoIndicador.item(x);
                    if (nodoAlumno.getNodeType() == Node.ELEMENT_NODE) {
                            Element element3 = (Element) nodoIndicado;
                            System.out.println("tipo: " + element3.getAttribute("tipo"));
                            System.out.println("nota: " + element3.getAttribute("nota"));
                        }
                    }
                }
            } catch (ParserConfigurationException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (SAXException ex) {
            ex.printStackTrace();
        }
    }*/
}
