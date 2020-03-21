package Main;

import DAO.Conexion;
import DAO.Consulta;
import DAO.ItemImple;
import MVC.Controlador;
import MVC.VistaAgregar;
import MVC.VistaPrincipal;
import Modelo.Item;
import Modelo.ItemDAO;

import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {

        VistaPrincipal vistaPrincipal = new VistaPrincipal();
        Consulta consulta = new Consulta(vistaPrincipal, new VistaAgregar());
        ActionListener controlador = new Controlador(consulta);
        vistaPrincipal.setControlador(controlador);
        vistaPrincipal.iniciarVistaPrincipal();
    }
}
