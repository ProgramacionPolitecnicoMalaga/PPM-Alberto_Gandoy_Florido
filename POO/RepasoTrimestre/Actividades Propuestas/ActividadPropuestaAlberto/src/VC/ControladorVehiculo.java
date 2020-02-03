package VC;

import Gestores.GestorControladorVehiculo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorVehiculo implements ActionListener {
    private GestorControladorVehiculo gestorControladorVehiculo;

    public ControladorVehiculo(GestorControladorVehiculo gestorControladorVehiculo) {
        this.gestorControladorVehiculo = gestorControladorVehiculo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("AñadirVehiculo")) {
            gestorControladorVehiculo.añadirVehiculo();
        } else if (e.getActionCommand().equals("Vender")) {
            gestorControladorVehiculo.venderVehiculo();
        } else if (e.getActionCommand().equals("Comprar")) {
            gestorControladorVehiculo.comprarVehículo();
        }
    }
}
