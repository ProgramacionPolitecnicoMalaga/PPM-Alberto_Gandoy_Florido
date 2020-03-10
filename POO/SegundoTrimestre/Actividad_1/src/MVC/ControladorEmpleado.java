package MVC;

import DAO.Consultas;
import Modelo.Empleado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorEmpleado implements ActionListener {
    private Consultas consulta;

    public ControladorEmpleado(Consultas consulta) {
        this.consulta = consulta;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("AddEmpleado")) {
            consulta.registrarEmpleado();

        }
    }
}
