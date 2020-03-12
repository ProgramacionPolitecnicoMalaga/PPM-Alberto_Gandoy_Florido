package Main;

import DAO.Consulta;
import MVC.Controlador;
import MVC.Vista;
import MVC.VistaEmpleado;

import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Consulta consulta = new Consulta(vista, new VistaEmpleado());
        ActionListener controlador = new Controlador(consulta);
        vista.setControlador(controlador);
        vista.iniciarVista();
    }
}