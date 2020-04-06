package Main;

import Servicio.Servicio;
import Swing.Controlador;
import Swing.Vista;

import java.awt.event.ActionListener;

public class Aplicacion {
    public static void main(String[] args) {
        Vista vista = new Vista();
        ActionListener controlador = new Controlador(vista, new Servicio());
        vista.setActionListener(controlador);
        vista.iniciarVista();
    }
}
