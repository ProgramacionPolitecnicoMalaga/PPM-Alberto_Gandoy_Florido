package Main;

import Modelo.Cafeteria;
import SwingUI.Controlador;
import SwingUI.GestorControlador;
import SwingUI.Vista;

import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria();
        Vista vista = new Vista();
        GestorControlador gestorControlador = new GestorControlador(vista, cafeteria);
        ActionListener controlador = new Controlador(gestorControlador);
        vista.setControlador(controlador);
        vista.init();
    }
}
