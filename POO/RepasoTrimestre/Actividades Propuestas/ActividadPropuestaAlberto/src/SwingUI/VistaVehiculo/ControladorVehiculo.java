package SwingUI.VistaVehiculo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorVehiculo implements ActionListener {
    private GestorControladorVehiculo gestorControladorVehiculo;

    public ControladorVehiculo(GestorControladorVehiculo gestorControladorVehiculo) {
        this.gestorControladorVehiculo = gestorControladorVehiculo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Vender")) {
            gestorControladorVehiculo.vender();
        } else if (e.getActionCommand().equals("Comprar")) {
            gestorControladorVehiculo.comprar();
        }
    }
}
