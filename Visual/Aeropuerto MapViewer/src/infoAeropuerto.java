import org.w3c.dom.NodeList;

import javax.xml.xpath.XPathExpressionException;
import java.awt.event.ActionListener;

public class infoAeropuerto {
    public static void main(String[] args) throws XPathExpressionException {


        VistaAeropuerto vista = new VistaAeropuerto();
        XPathEvaluator xpath = new XPathEvaluator("aeropuertos.xml");
        NodeList nodoAero = xpath.evaluateXPath("xpathExpr");
        ActionListener controlador = new ctrAeropuerto(xpath,vista);
        vista.setControlador(controlador);
        vista.arranca();

        for (int i = 0; i < nodoAero.getLength(); i++){
            if(vista.obtenerNomAeropuertoBox().equals(nodoAero.item(i).getAttributes().getNamedItem("pais").getNodeValue())){
                Double lon = Double.parseDouble(nodoAero.item(i).getAttributes().getNamedItem("lon").getNodeValue());
                Double lat = Double.parseDouble(nodoAero.item(i).getAttributes().getNamedItem("lat").getNodeValue());
                vista.mostrarMap(lat,lon);
            }
        }
    }
}
