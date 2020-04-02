package Main;

import Servicio.Servicio;
import Vista.Vista;
import Vista.ControladorVista;

import java.awt.event.ActionListener;

public class Aplicacion {
    public static void main(String[] args) {
        Vista vista = new Vista();
        ActionListener controlador = new ControladorVista(new Servicio(), vista);
        vista.setActionListenerControlador(controlador);
        vista.iniciarVista();
    }
}
