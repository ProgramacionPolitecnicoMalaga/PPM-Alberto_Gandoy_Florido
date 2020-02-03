import java.awt.event.ActionListener;

public class Demo {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Suma suma = new Suma();
        GestorControlador gestorControlador = new GestorControlador(suma,vista);
        suma.setAvisadorCambioSuma(gestorControlador.avisadorCambioSuma);
        gestorControlador.setSuma(suma);
        ActionListener controlador = new Controlador(gestorControlador);
        vista.setControlador(controlador);
        vista.init();
    }
}
