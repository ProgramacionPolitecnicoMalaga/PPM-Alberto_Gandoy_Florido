package MVC;

import Modelo.Empleado;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

public class Vista extends JFrame {
    private JPanel panel;
    private JTextField txtID;
    private JTextField txtNombre;
    private JTextField txtFecha;
    private JTextField txtApellidos;
    private JButton butMostrar;
    private JButton butAgregar;
    private JButton butBorrar;
    private JButton butModificar;
    private JLabel lblMensaje;
    private JComboBox boxEmpleado;
    private JTable tabla;

    public Vista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);

    }

    public void init() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String getTxtID() {
        return txtID.getText();
    }

    public String getTxtNombre() {
        return txtNombre.getText();
    }

    public String getTxtApellidos() {
        return txtApellidos.getText();
    }

    public String getTxtFecha() {
        return txtFecha.getText();
    }

    public void verUnEmpleado(Empleado empleado) {
        System.out.println("Datos del Cliente: " + empleado);
    }

    public void verEmpleados(List<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            System.out.println("Datos del Cliente: " + empleado);
        }
    }

    public void mostrarMensaje(String mensaje) {
        lblMensaje.setText(mensaje);
    }

    public String getBoxItem() {
       return boxEmpleado.getSelectedItem().toString();
    }
    public JComboBox getBox() {
       return boxEmpleado;
    }

    public void setControlador(ActionListener actionListener) {
        butMostrar.addActionListener(actionListener);
        butMostrar.setActionCommand("mostrar");
        butAgregar.addActionListener(actionListener);
        butAgregar.setActionCommand("agregar");
        butBorrar.addActionListener(actionListener);
        butBorrar.setActionCommand("borrar");
        butModificar.addActionListener(actionListener);
        butModificar.setActionCommand("modificar");
        boxEmpleado.addActionListener(actionListener);
        boxEmpleado.setActionCommand("mensaje");
    }
}