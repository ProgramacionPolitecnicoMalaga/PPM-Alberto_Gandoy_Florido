package MVC;

import DAO.Consulta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorEmpleado implements ActionListener {
    private Consulta consulta;

    public ControladorEmpleado(Consulta consulta) {
        this.consulta = consulta;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("AddEmpleado")) {
            consulta.agregarEmpleado();
        }
    }
}
