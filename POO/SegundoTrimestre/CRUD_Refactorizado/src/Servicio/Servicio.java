package Servicio;

import DAO.EmpleadoImple;
import Modelo.Empleado;
import Modelo.Iempleado;

import java.util.ArrayList;

public class Servicio {
    private Iempleado empleadoDAO;

    public Servicio() {
        this.empleadoDAO = new EmpleadoImple();
    }

    public Empleado insertarEmpleado(String nombre, int edad) {
        Empleado empleado = empleadoDAO.insertar(nombre, edad);
        return  empleado;
    }

    public Empleado editarEmpleado(String nombre, int edad, int id) {
        Empleado empleado = empleadoDAO.editar(nombre, edad, id);
        return empleado;
    }

    public boolean eliminarEmpledo(int id) {
        ArrayList<Empleado> empleados = empleadoDAO.mostrar();
        Empleado empleado = empleadoDAO.buscar(id);
        empleadoDAO.eliminar(id);
        empleados.remove(empleado);
        if (!empleados.contains(empleado))
            return false;
        else
            return true;
    }

    public Empleado buscarEmpleado(int id) {
        Empleado empleado = empleadoDAO.buscar(id);
        return empleado;
    }

    public ArrayList<Empleado> mostrarEmpleados() {
        return empleadoDAO.mostrar();
    }
}
