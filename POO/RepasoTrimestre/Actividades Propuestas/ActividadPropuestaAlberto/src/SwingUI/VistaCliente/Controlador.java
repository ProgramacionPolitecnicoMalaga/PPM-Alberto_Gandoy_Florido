package SwingUI.VistaCliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private GestorControlador gestorControlador;

    public Controlador(GestorControlador gestorControlador) {
        this.gestorControlador = gestorControlador;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("AddCliente")) {
            gestorControlador.addCliente();
        } else if (e.getActionCommand().equals("GestionarVehiculo")) {
            gestorControlador.abrirGestionVehiculo();
        }
    }
}
