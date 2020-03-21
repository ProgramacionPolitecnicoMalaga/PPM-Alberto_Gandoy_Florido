package MVC;

import DAO.Consulta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Consulta consulta;

    public Controlador(Consulta consulta) {
        this.consulta = consulta;
    }

    public void crearVentanaNueva() {
        VistaAgregar vistaAgregar = new VistaAgregar();
        JFrame ventana = new JFrame("Agregar Items");
        ControladorAgregar controladorAdd = new ControladorAgregar(new Consulta(consulta.getVistaPrincipal(), vistaAgregar));
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
            crearVentanaNueva();
        } else if (e.getActionCommand().equals("eliminar")) {

        }
    }
}
