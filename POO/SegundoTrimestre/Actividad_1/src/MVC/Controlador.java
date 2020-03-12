package MVC;

import DAO.Consulta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Consulta consulta;

    public Controlador(Consulta consulta) {
        this.consulta = consulta;
        consulta.mostrarEmpleados();
    }

    public void crearVentana() {
        VistaEmpleado vistaEmpleado = new VistaEmpleado();
        JFrame ventana = new JFrame("Registrar Empleados");
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado(new Consulta(consulta.getVista(),vistaEmpleado));
        vistaEmpleado.setControladorEmpleado(controladorEmpleado);
        ventana.setDefaultCloseOperation(2);
        ventana.setContentPane(vistaEmpleado);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Buscar")) {
            consulta.buscarEmpleado();
        } else if (e.getActionCommand().equals("Cargar")) {
            consulta.mostrarEmpleados();
        } else if (e.getActionCommand().equals("Insertar")) {
           crearVentana();
        } else if (e.getActionCommand().equals("Borrar")) {
            consulta.eliminarEmpleado();
        } else if (e.getActionCommand().equals("Editar")) {
            consulta.editarEmpleado();
        }
    }
}
