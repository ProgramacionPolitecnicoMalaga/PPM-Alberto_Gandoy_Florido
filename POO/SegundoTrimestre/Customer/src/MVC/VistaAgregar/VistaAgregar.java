package MVC.VistaAgregar;

import javax.swing.*;
import java.awt.event.ActionListener;

public class VistaAgregar extends JPanel{
    private JPanel jPanel;
    private JButton butAgregar;
    private JTextArea txtTexto;
    private JTextField txtAutor;
    private JTextField txtFecha;
    private JComboBox boxTema;

    public VistaAgregar() {
        add(jPanel);
        agregarBox("IT");
        agregarBox("Desarrollo");
        agregarBox("Mantenimiento");
        agregarBox("General");
    }

    public String getTxtNombre() {
        return txtAutor.getText();
    }

    public String getTxtFecha() {
        return txtFecha.getText();
    }

    public String getTxtTexto() {
        return txtTexto.getText();
    }

    public void agregarBox(String tema) {
        boxTema.addItem(tema);
    }

    public String getBoxSelecionado() {
        return boxTema.getSelectedItem().toString();
    }

    public void setControladorEmpleado(ActionListener actionListener) {
        butAgregar.addActionListener(actionListener);
        butAgregar.setActionCommand("agregar");
    }
}
