package GenerarDocumento;

import Lector.LectorXML;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;



public class GenerarTEXT implements Generador{
    private LectorXML lectorXML;

    public GenerarTEXT() {
        lectorXML = new LectorXML();
    }

    @Override
    public void generador() {
        try {
            NodeList nodeList = lectorXML.lecturaXML();
            System.out.println("Listado de empadronamientos:\n");
            if (nodeList != null) {
                for (int i = 0; i < nodeList.getLength(); i++) {
                    Node node = nodeList.item(i);
                    NamedNodeMap nodeMap = node.getAttributes();
                    String año = nodeMap.getNamedItem("Año").getTextContent();
                    String nacionalidad = nodeMap.getNamedItem("Nacionalidad").getTextContent();
                    String numEmpadronados = nodeMap.getNamedItem("Número_de_empadronados").getTextContent();
                    System.out.println("El total de empadronados en " + año + " procedentes de " + nacionalidad + " fue de " + numEmpadronados + " persona/s.");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
