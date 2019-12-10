import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPathExpressionException;

public class Evaluator {

    LecturaXML lecturaCurso = new LecturaXML("curso.xml");
    LecturaXML lecturaAsignatura = new LecturaXML("ed_S11AW.xml");

    //FORMA "CHULA"
    /*public void mostrarCursoXML() {
        try {
            NodeList listaDeNodos = lecturaCurso.evaluateXPath("/curso");
           // lecturaCurso.recorrerNodos(listaDeNodos);
        } catch (XPathExpressionException e) {
            e.printStackTrace();

        }
    }*/

  private static String getSeparador(int numeroEspacios){
        String espacios = "";
        for (int i=0; i<numeroEspacios; i++) espacios += "\t";
        return espacios;
    }


    private static void printNodeAttributes(Node n, int nivelProfundidad){
        if ((n!=null) && (n.getNodeType() == Element.ELEMENT_NODE)){
            NamedNodeMap atributos = n.getAttributes();
            if (atributos != null)
                for (int i=0; i<atributos.getLength(); i++)
                    System.out.println(getSeparador(nivelProfundidad) +  atributos.item(i).toString());
        }
    }

    private static void printNodeInfo(Node n, int nivelProfundidad){
        System.out.println(getSeparador(nivelProfundidad) + n.getNodeName());
    }


    public static void printNodeList(NodeList listaDeNodos, int nivelProfundidad){
        if (listaDeNodos !=  null){
            for (int i = 0; i < listaDeNodos.getLength(); i++) {
                System.out.println("---------------------------------------------" +"\n");
                Node n = listaDeNodos.item(i);
                printNodeInfo(n, nivelProfundidad);
                printNodeAttributes(n,nivelProfundidad);
                printNodeList(n.getChildNodes(), nivelProfundidad + 1);
            }
        }
    }
    public void mostrarCursoXML() {
    	try {
        NodeList nodeSetCurso = lecturaCurso.evaluateXPath("/curso");
   //    NodeList nodeSet2 = lecturaCurso.evaluateXPath("/curso/asignatura");
        printNodeList(nodeSetCurso, 0);

    } catch (
    XPathExpressionException e) {
        e.printStackTrace();
    }
    }

    public void mostrarAsignaturaXML() {
        try {
            NodeList nodeSetAsignatura = lecturaAsignatura.evaluateXPath("/asignatura");
            printNodeList(nodeSetAsignatura, 0);

        } catch (
                XPathExpressionException e) {
            e.printStackTrace();
        }
    }
}
