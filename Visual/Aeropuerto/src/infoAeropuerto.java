import java.awt.event.ActionListener;

public class infoAeropuerto {
    public static void main(String[] args) {
            VistaAeropuerto vista = new VistaAeropuerto();
            XPathEvaluator xpath = new XPathEvaluator("aeropuertos.xml");
            ActionListener controlador = new ctrAeropuerto(xpath,vista);
            vista.setControlador(controlador);
            vista.arranca();
    }
}
