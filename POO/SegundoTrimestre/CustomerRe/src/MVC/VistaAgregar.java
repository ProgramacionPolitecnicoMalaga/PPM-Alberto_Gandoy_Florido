package MVC;

import Modelo.Item;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VistaAgregar extends JPanel {//implements ListCellRenderer<Item>
    private JPanel panelPrincipal;
    private JButton butAgregar;
    private JTextField txtNombre;
    private JTextField txtFecha;
    private JTextArea txtDescripcion;
    private JComboBox boxTema;

    public VistaAgregar() {
        add(panelPrincipal);
        agregarBox("IT");
        agregarBox("Desarrolo");
        agregarBox("Mantenimiento");
        agregarBox("General");
    }

    public String getTxtNombre() {
        return txtNombre.getText();
    }

    public String getTxtFecha() {
        return txtFecha.getText();
    }

    public String getTxtDescripcion() {
        return txtDescripcion.getText();
    }

    public void agregarBox(String tm) {
        boxTema.addItem(tm);
    }

    public String getBox() {
        return boxTema.getSelectedItem().toString();
    }


    public void setControladorEmpleado(ActionListener actionListener) {
        butAgregar.addActionListener(actionListener);
        butAgregar.setActionCommand("agregar");
    }
}
