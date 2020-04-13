package GenerarDocumento;


import Lector.LectorXML;
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
            NodeList poblaciones = lectorXML.getNodelist();
            System.out.println("<table>");
            if (poblaciones != null) {
                for (int i = 0; i < poblaciones.getLength(); i++) {
                    Node poblacion = poblaciones.item(i);
                    NamedNodeMap atributosPoblacion = poblacion.getAttributes();
                    String año = atributosPoblacion.getNamedItem("Año").getTextContent();
                    String nacionalidad = atributosPoblacion.getNamedItem("Nacionalidad").getTextContent();
                    String empadronados = atributosPoblacion.getNamedItem("Número_de_empadronados").getTextContent();
                    System.out.println("\t<tr>\n \t\t<th>" + nacionalidad + "</th><th>" + año + "</th><th>" + empadronados + "</th>\n\t</tr>");
                }
            }
            System.out.println("</table>");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}