package App;

import Conexion.Conexion;
import Consulta.Consultas;
import MVC.Controlador;
import MVC.Vista;

import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
     /*   Empleado empleado = new Empleado(7777,"ALBERTO","GANDOY FLORIDO","2012-12-12");
        ControladorEmpleado cE = new ControladorEmpleado();

        cE.verEmpleados();

        empleado.setId(1);
        empleado.setNombre("PEPE");
        cE.actualizar(empleado);*/

        Vista vista = new Vista();
        Consultas consultas = new Consultas(vista);
        ActionListener controlador = new Controlador(consultas);
        vista.setControlador(controlador);
        vista.init();


    }
}
