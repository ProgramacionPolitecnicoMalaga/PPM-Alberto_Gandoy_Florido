import java.awt.event.ActionListener;
import java.io.IOException;

public class Aplicacion {
    public static void main(String[] args) throws IOException {
        Pilotos pilotos = new Pilotos();
        Vista vista = new Vista();
        ActionListener actionListenerCtr = new Controlador(vista, pilotos);
        vista.setControlador(actionListenerCtr);
        vista.init();
    }
}
