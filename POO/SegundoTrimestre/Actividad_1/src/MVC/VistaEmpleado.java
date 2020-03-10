package MVC;

import javax.swing.*;
import java.awt.event.ActionListener;

public class VistaEmpleado extends JPanel{
    private JPanel jPanelEmpleado;
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JButton butAñadirEmpleado;

    public VistaEmpleado() {
        add(jPanelEmpleado);
    }

    public String getTxtNombre() {
        return txtNombre.getText();
    }

    public String getTxtEdad() {
        return txtEdad.getText();
    }

    public void setControladorEmpleado(ActionListener actionListener) {
        butAñadirEmpleado.addActionListener(actionListener);
        butAñadirEmpleado.setActionCommand("AddEmpleado");
    }
}
