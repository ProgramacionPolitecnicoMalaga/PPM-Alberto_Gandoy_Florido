package MVC.VistaAgregar;

import DAO.Consulta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorAgregar implements ActionListener {
    private Consulta consulta;

    public ControladorAgregar(Consulta consulta) {
        this.consulta = consulta;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("agregar")) {
            consulta.insertarItem();
        }
    }
}
