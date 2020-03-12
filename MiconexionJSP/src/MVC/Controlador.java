package MVC;

import Consulta.Consultas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Consultas consultas;

    public Controlador(Consultas consultas) {
        this.consultas = consultas;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("mostrar")) {
            consultas.verEmpleados();
        } else if (e.getActionCommand().equals("agregar")) {
            consultas.registrar();
        } else if (e.getActionCommand().equals("borrar")) {
            consultas.eliminar();
        } else if (e.getActionCommand().equals("modificar")) {
            consultas.actualizar();
        } else if (e.getActionCommand().equals("mensaje")) {
        }
    }
}
