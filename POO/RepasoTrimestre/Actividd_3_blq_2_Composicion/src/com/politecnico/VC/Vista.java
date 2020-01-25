package com.politecnico.VC;

import com.politecnico.modelo.Empleado;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Vista extends JFrame{
    private JPanel jPanel;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JLabel apellido;
    private JTextField txtNif;
    private JButton crearButtonAsalariado;
    private JTextArea txtResultado;
    private JButton mostrarButton;
    private JComboBox comboBox;
    private JButton crearComisionadoButton;
    private JButton crearPorHorasButton;
    private JButton limpiarButton;

    public Vista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jPanel);
    }

    public void iniciarVista() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String getNombreTxt() {
        return txtNombre.getText();
    }

    public String getApellidoTxt() {
        return txtApellido.getText();
    }

    public String getNifTxt() {
        return txtNif.getText();
    }

    public void limpiarTexto() {
        txtNombre.setText(" ");
        txtApellido.setText("");
        txtNif.setText(" ");
        txtResultado.setText(" ");
    }

    public void añadirEmpleadoBox(Empleado empleado) {
        comboBox.addItem(empleado.getNombre());
    }

    public void mostrarMensaje(String mensaje) {
        limpiarTexto();
        txtResultado.setText(mensaje);
    }

    public void mostrarEmpleados(ArrayList<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            txtResultado.append(empleado.toString());
            txtResultado.append(System.getProperty("line.separator"));
        }
    }

    public void setControlador(ActionListener actionListener) {
        crearButtonAsalariado.addActionListener(actionListener);
        crearButtonAsalariado.setActionCommand("asalariado");
        crearComisionadoButton.addActionListener(actionListener);
        crearComisionadoButton.setActionCommand("comisionado");
        crearPorHorasButton.addActionListener(actionListener);
        crearPorHorasButton.setActionCommand("porHoras");
        mostrarButton.addActionListener(actionListener);
        mostrarButton.setActionCommand("mostrar");
        limpiarButton.addActionListener(actionListener);
        limpiarButton.setActionCommand("limpiar");
    }
}
