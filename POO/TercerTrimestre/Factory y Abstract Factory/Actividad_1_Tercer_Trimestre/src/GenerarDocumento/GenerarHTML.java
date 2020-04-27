package GenerarDocumento;


import Lector.LectorXML;
import Modelo.Empadronado;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GenerarHTML implements Generador {
    private LectorXML lectorXML;

    public GenerarHTML() {
        lectorXML = new LectorXML();
    }

    @Override
    public void generador() {
        try {
            NodeList nodeList = lectorXML.lecturaXML();
            System.out.println("<table>");
            if (nodeList != null) {
                for (int i = 0; i < nodeList.getLength(); i++) {
                    Node node = nodeList.item(i);
                    NamedNodeMap nodeMap = node.getAttributes();
                    String annyo = nodeMap.getNamedItem("Año").getTextContent();
                    String nacionalidad = nodeMap.getNamedItem("Nacionalidad").getTextContent();
                    String numEmpadronados = nodeMap.getNamedItem("Número_de_empadronados").getTextContent();
                    System.out.println("\t<tr>\n \t\t<th>" + nacionalidad + "</th><th>" + annyo + "</th><th>" + numEmpadronados + "</th>\n\t</tr>");
                    Empadronado emp = new Empadronado(annyo, nacionalidad, numEmpadronados);
                }
            }
            System.out.println("</table>");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}