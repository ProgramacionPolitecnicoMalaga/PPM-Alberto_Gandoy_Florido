package Main;

import DAO.Consulta;
import MVC.Vista.Controlador;
import MVC.Vista.Vista;
import MVC.VistaAgregar.VistaAgregar;


import java.awt.event.ActionListener;

public class Demo {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Consulta consulta = new Consulta(vista, new VistaAgregar());
        ActionListener controlador = new Controlador(consulta);
        vista.setControlador(controlador);
        vista.iniciarVista();
    }
}
