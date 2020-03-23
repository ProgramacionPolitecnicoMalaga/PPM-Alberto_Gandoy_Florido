package MVC.Vista;

import DAO.Consulta;
import MVC.VistaAgregar.ControladorAgregar;
import MVC.VistaAgregar.VistaAgregar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Consulta consulta;

    public Controlador(Consulta consulta) {
        this.consulta = consulta;
        consulta.mostrarItems();
    }

    public void crearVentana() {
        VistaAgregar vistaAgregar = new VistaAgregar();
        JFrame ventana = new JFrame("Agregar Items");
        ControladorAgregar controladorAdd = new ControladorAgregar(new Consulta(consulta.getVista(), vistaAgregar));
        vistaAgregar.setControladorEmpleado(controladorAdd);
        ventana.setDefaultCloseOperation(2);
        ventana.setContentPane(vistaAgregar);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("nuevo")) {
            crearVentana();
        } else if (e.getActionCommand().equals("eliminar")) {
            consulta.eliminarItem();
        }
    }
}
