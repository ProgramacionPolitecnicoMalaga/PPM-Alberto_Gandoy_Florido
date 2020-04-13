package Consulta;

import MVC.Vista;
import Modelo.Empleado;
import Modelo.IEmpleadoDao;
import NegocioDAO.EmpleadoDaoImpl;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class Consultas {
    private Vista vista;

    public Consultas(Vista vista) {
        this.vista = vista;
    }

    //llama al DAO para guardar un cliente
    public void registrar() {
        String nombre = vista.getTxtNombre();
        String apellidos = vista.getTxtApellidos();
        String fecha = vista.getTxtFecha();
        Empleado empleado = new Empleado(nombre, apellidos, fecha);
        IEmpleadoDao dao = new EmpleadoDaoImpl();
        dao.registrar(empleado);
        vista.mostrarMensaje("OPERACIÓN REALIZADA CORRECTAMENTE");
    }

    //llama al DAO para actualizar un cliente
    public void actualizar() {
        String nombre = vista.getTxtNombre();
        String apellidos = vista.getTxtApellidos();
        String fecha = vista.getTxtFecha();
        IEmpleadoDao dao = new EmpleadoDaoImpl();
        Empleado empleado = new Empleado(nombre,apellidos,fecha);
        dao.actualizar(empleado);
    }

    //llama al DAO para eliminar un cliente
    public void eliminar() {
        String nombre = vista.getTxtNombre();
        String apellidos = vista.getTxtApellidos();
        String fecha = vista.getTxtFecha();
        IEmpleadoDao dao = new EmpleadoDaoImpl();
        Empleado empleado = new Empleado(nombre,apellidos,fecha);
        dao.eliminar(empleado);
    }

    //llama al DAO para obtener todos los clientes y luego los muestra en la vista
    public void verEmpleados(){
        List<Empleado> empleados = new ArrayList<Empleado>();
        IEmpleadoDao dao = new EmpleadoDaoImpl();
        empleados = dao.obtener();
        vista.verEmpleados(empleados);
        for (Empleado empleado : empleados) {
            vista.getBox().addItem(empleado.getId());
        }
        vista.mostrarMensaje("LA BASE DE DATOS TIENE ACTUALMENTE " + empleados.size() + " EMPLEADOS.");
    }
}
