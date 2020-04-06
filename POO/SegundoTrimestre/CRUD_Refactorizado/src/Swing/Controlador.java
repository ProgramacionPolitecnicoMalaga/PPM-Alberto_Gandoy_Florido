package Swing;

import Modelo.Empleado;
import Servicio.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Vista vista;
    private Servicio servicio;

    public Controlador(Vista vista, Servicio servicio) {
        this.vista = vista;
        this.servicio = servicio;
    }

    public void buscar() {
        String id = vista.getTxtID();
        vista.cargarDatosDeUnEmpleado(servicio.buscarEmpleado(Integer.parseInt(id)));
    }

    public void insertar() {
        String nombre = vista.getTxtNombre();
        String edad = vista.getTxtEdad();
        servicio.insertarEmpleado(nombre, Integer.parseInt(edad));
    }

    public void eliminar() {
        String id = vista.getTxtID();
        servicio.eliminarEmpledo(Integer.parseInt(id));
    }

    public void editar() {
        String id = vista.getTxtID();
        String nombre = vista.getTxtNombre();
        String edad = vista.getTxtEdad();
        servicio.editarEmpleado(nombre, Integer.parseInt(edad), Integer.parseInt(id));
    }

    public void mostrar() {
        vista.cargarDatos(servicio.mostrarEmpleados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand().equals("buscar"))
        buscar();
    else if (e.getActionCommand().equals("insertar"))
        insertar();
        else if (e.getActionCommand().equals("eliminar"))
            eliminar();
            else if (e.getActionCommand().equals("editar"))
                editar();
                else if (e.getActionCommand().equals("cargar"))
                    mostrar();
    }
}
