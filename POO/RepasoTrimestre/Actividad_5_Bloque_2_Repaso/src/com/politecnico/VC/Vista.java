package com.politecnico.VC;

import com.politecnico.Eventos.Evento;
import com.politecnico.Modelo.Persona;
import com.politecnico.Modelo.Vehiculo;

import javax.naming.event.EventContext;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Vista extends JFrame {

    private JPanel jPanel;
    private JTextField txtDateFabricar;
    private JTextField txtDateEntrada;
    private JTextField txtBastidor;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JButton añadirVehiculo;
    private JButton mostrarVendidosButton;
    private JButton mostrarDepostioButton;
    private JButton mostrarSubastaButton;
    private JRadioButton cocheRadioButton;
    private JButton limpiarButton;
    private JTextArea txtResultado;
    private JTextField txtPrecioSubasta;
    private JTextField fechaSubasta;
    private JButton añadirVentasButton;
    private JComboBox boxDeposito;
    private JComboBox boxSubasta;
    private JButton subastarButton;
    private JRadioButton camionRadioButton;
    private JRadioButton barcoRadioButton;
    private JTextField txtMatricula;
    private JRadioButton personaJurídicaRadioButton;
    private JRadioButton personaFísicaRadioButton;
    private JButton añadirPersonaButton;
    private JTextField txtId;
    private JComboBox boxPersonas;


    public Vista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jPanel);
    }

    public void init() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String getFabricacion() {
        return txtDateFabricar.getText();
    }

    public String getEntrada() {
        return txtDateEntrada.getText();
    }

    public String getBastidor() {
        return txtBastidor.getText();
    }

    public String getTxtNombre() {
        return txtNombre.getText();
    }

    public String getTxtApellidos() {
        return txtApellido.getText();
    }

    public String getTxtPrecio() {
        return txtPrecioSubasta.getText();
    }

    public String getTxtID() {
        return txtId.getText();
    }
    public String getTxtFechaSubasta() {
        return fechaSubasta.getText();
    }

    public String getTxtMatriculaNombre() {
        return txtMatricula.getText();
    }

    public void limpiarTexto() {
        txtResultado.setText("");
    }

    public void limpiarTodosLosTxt() {
        txtDateFabricar.setText("");
        txtDateEntrada.setText("");
        txtBastidor.setText("");
        txtMatricula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtPrecioSubasta.setText("");
        fechaSubasta.setText("");
        txtResultado.setText("");
    }

    public void addBoxDeposito(Vehiculo vehiculo) {
        boxDeposito.addItem(vehiculo.getNumeroBastidor());
    }

    public String getBoxDeposito() {
        return boxDeposito.getSelectedItem().toString();
    }

    public void removeBoxDeposito(Vehiculo vehiculo) {
        boxDeposito.removeItem(vehiculo.getNumeroBastidor());
    }

    public void addBoxSubastado(Vehiculo vehiculo) { boxSubasta.addItem(vehiculo.getNumeroBastidor()); }

    public String getBoxSubasta() {
        return boxSubasta.getSelectedItem().toString();
    }

    public void removeBoxSubastado(Vehiculo vehiculo) {
        boxSubasta.removeItem(vehiculo.getNumeroBastidor());
    }

    public void addBoxPersonas(Persona persona) { boxPersonas.addItem(persona.getIdSubasta()); }


    public String getBoxPersonas() { return boxPersonas.getSelectedItem().toString(); }

    public void removeBoxPersonas(Persona persona) { boxPersonas.removeItem(persona.getIdSubasta()); }

    public void mostrarMensaje(String mensaje) {
        limpiarTexto();
        txtResultado.setText(mensaje);
    }

    public void mostrarDeposito(ArrayList<Vehiculo> depositados) {
        limpiarTexto();
        for(Vehiculo vehiculo : depositados) {
            txtResultado.append(vehiculo.toString());
            txtResultado.append(System.getProperty("line.separator"));
        }
    }

    public void mostrarSubastados(ArrayList<Vehiculo> subastados) {
        limpiarTexto();
        for(Vehiculo vehiculo : subastados) {
            txtResultado.append(vehiculo.toString());
            txtResultado.append(System.getProperty("line.separator"));
        }
    }

  public void mostrarVendidos(ArrayList<Vehiculo> vendidos) {
        limpiarTexto();
        for(Vehiculo vehiculo : vendidos) {
            txtResultado.append(vehiculo.toString());
            txtResultado.append(System.getProperty("line.separator"));
        }
    }

    public void mostrarEventoVenta(ArrayList<Evento> eventos) {
        limpiarTexto();
        for (Evento evento : eventos) {
            txtResultado.append(evento.toString());
            txtResultado.append(System.getProperty("line.separator"));
        }
    }

    public String obetenerRadioButtonVehiculo() {
        String res = "";
        if(barcoRadioButton.isSelected()) res = "barco";
        else if(camionRadioButton.isSelected()) res = "camion";
        else res = "coche";
        return res;
    }


    public String obetenerRadioButtonPersona() {
        String res = "";
        if(personaJurídicaRadioButton.isSelected()) res = "jurídica";
        else if (personaFísicaRadioButton.isSelected())res = "física";
        return res;
    }

    public void setControlador(ActionListener actionListener) {
        añadirVehiculo.addActionListener(actionListener);
        añadirVehiculo.setActionCommand("añadirVehiculo");
        mostrarDepostioButton.addActionListener(actionListener);
        mostrarDepostioButton.setActionCommand("mostrarDeposito");
        subastarButton.addActionListener(actionListener);
        subastarButton.setActionCommand("subastar");
        mostrarSubastaButton.addActionListener(actionListener);
        mostrarSubastaButton.setActionCommand("mostrarSubasta");
        añadirPersonaButton.addActionListener(actionListener);
        añadirPersonaButton.setActionCommand("añadirPersona");
        limpiarButton.addActionListener(actionListener);
        limpiarButton.setActionCommand("limpiar");
        mostrarVendidosButton.addActionListener(actionListener);
        mostrarVendidosButton.setActionCommand("mostrarVendido");
        añadirVentasButton.addActionListener(actionListener);
        añadirVentasButton.setActionCommand("vender");
        barcoRadioButton.addActionListener(actionListener);
        barcoRadioButton.setActionCommand("barco");
    }
}
