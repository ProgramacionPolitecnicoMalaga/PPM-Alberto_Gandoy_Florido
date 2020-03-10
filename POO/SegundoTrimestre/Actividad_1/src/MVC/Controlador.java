package MVC;

import DAO.Consultas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Consultas consulta;

    public Controlador(Consultas consulta) {
        this.consulta = consulta;
        consulta.mostrarEmpleados();
    }

    public void crearVentana() {
        VistaEmpleado vistaEmpleado = new VistaEmpleado();
        JFrame ventana = new JFrame("Añadir empleado");
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado(new Consultas(consulta.getVista(),vistaEmpleado));
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
        } else if (e.getActionCommand().equals("Add")) {
           crearVentana();
        } else if (e.getActionCommand().equals("Borrar")) {
            consulta.eliminarEmpleado();
        } else if (e.getActionCommand().equals("Editar")) {
            consulta.editarEmpleado();
        }
    }
}
