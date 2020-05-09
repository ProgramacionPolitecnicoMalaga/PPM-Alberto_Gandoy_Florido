package ControlDocumentos;

import Lector.LectorXML;
import Modelo.Empadronado;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GeneradorDeDocumentoTEXT implements GeneradorDeDocumento {
    @Override
    public void generarDocumento() {
        NodeList nodoLectorXML = LectorXML.getNodeXML();
        for (int i = 0; i < nodoLectorXML.getLength(); i++) {
            Node node = nodoLectorXML.item(i);
            NamedNodeMap mapa = node.getAttributes();
            String annyo = mapa.getNamedItem("Año").getTextContent();
            String nacionalidad = mapa.getNamedItem("Nacionalidad").getTextContent();
            String numEmpadronado = mapa.getNamedItem("Número_de_empadronados").getTextContent();
            Empadronado empadronado = new Empadronado(annyo, nacionalidad, numEmpadronado);
            System.out.println(empadronado.toString());
        }
    }
}
