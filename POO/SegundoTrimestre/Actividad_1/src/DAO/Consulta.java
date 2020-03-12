package DAO;

import MVC.Vista;
import MVC.VistaEmpleado;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;

public class Consulta {
    private Vista vista;
    private VistaEmpleado vistaEmpleado;
    private EmpleadoDAO dao;

    public Consulta(Vista vista, VistaEmpleado vistaEmpleado) {
        this.vista = vista;
        this.vistaEmpleado = vistaEmpleado;
        this.dao = new EmpleadosImp();
    }

    public Vista getVista() {
        return vista;
    }

    public void mostrarEmpleados(){
        vista.cargarColores();
        vista.cargarDatos(dao.mostrarEmpleado());
    }

    public void agregarEmpleado() {
        String nombre = vistaEmpleado.getTxtNombre();
        int edad = Integer.parseInt(vistaEmpleado.getTxtEdad());
        Empleado empleado = new Empleado(nombre, edad);
        dao.insertarEmpleado(empleado);
        vista.cargarDatos(dao.mostrarEmpleado());
    }

    public void editarEmpleado() {
        String nombre = vista.getTxtNombre();
        int edad = Integer.parseInt(vista.getTxtEdad());
        Empleado empleado = new Empleado(nombre, edad);
        int id = Integer.parseInt(vista.getTxtID());
        dao.editarEmpleado(empleado, id);
        mostrarEmpleados();
    }

    public void eliminarEmpleado() {
        String id = vista.getTxtID();
        dao.eliminarEmpleado(Integer.parseInt(id));
        vista.cargarDatos(dao.mostrarEmpleado());
    }

    public void buscarEmpleado() {
        int idEmpleado = Integer.parseInt(vista.getTxtID());
        Empleado empleadoBuscado =  dao.buscarEmpleado(idEmpleado);
        vista.limpiarTabla();
        vista.cargarDatosDeUnEmpleado(empleadoBuscado);
    }
}
