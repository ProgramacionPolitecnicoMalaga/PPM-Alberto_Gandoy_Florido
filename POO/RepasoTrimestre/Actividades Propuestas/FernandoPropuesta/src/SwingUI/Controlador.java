package SwingUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private GestorControlador gestorControlador;

    public Controlador(GestorControlador gestorControlador) {
        this.gestorControlador = gestorControlador;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("AbrirMesa")) {
            gestorControlador.addMesaAbierta();
        } else if (e.getActionCommand().equals("AddProducto")) {
            gestorControlador.addProducto();
        } else if (e.getActionCommand().equals("MostrarMesa")) {
            gestorControlador.mostrarAbiertas();
        } else if (e.getActionCommand().equals("Recuento")) {
            gestorControlador.recuentoMesas();
        } else if (e.getActionCommand().equals("Cobrar")) {
            gestorControlador.cobrar();
        }
    }
}
