package SwingGUI.Controlador;

import Modelo.Persona;
import SwingGUI.VistaUsuario.Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Vista vista;

    public Controlador(Vista vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Borrar")) {
            vista.borrarRow();
        } else if (e.getActionCommand().equals("Print")) {
            System.out.println(vista.getPersonas());
        } else if (e.getActionCommand().equals("Insertar")) {
            vista.agregarPersonaToTheTable();
        }
    }

}





