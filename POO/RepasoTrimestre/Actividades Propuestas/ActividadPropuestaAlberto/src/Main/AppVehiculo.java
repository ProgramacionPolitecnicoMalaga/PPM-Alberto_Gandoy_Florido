package Main;

import Modelo.Concesionario;
import SwingUI.VistaCliente.Controlador;
import SwingUI.VistaCliente.GestorControlador;
import SwingUI.VistaCliente.Vista;

import java.awt.event.ActionListener;

public class AppVehiculo {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();
        Vista vista = new Vista();
        GestorControlador gestorControlador = new GestorControlador(vista, concesionario);
        ActionListener controlador = new Controlador(gestorControlador);
        vista.setControlador(controlador);
        vista.init();

    }
}
