package VC;

import Proyecto.Cliente;
import Proyecto.Vehiculo;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Vista extends  JFrame{
    private JPanel panel;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtNif;
    private JTextField txtIban;
    private JTextField txtSaldo;
    private JButton añadirClienteButton;
    private  JComboBox boxCliente;
    private JButton motrarMenuVehiculoButton;
    private JTextArea txtResultado;
    private JComboBox comboBox1;

    public Vista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
    }

    public void init() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String getNombre() {
        return txtNombre.getText();
    }

    public String getApellido() {
        return txtApellido.getText();
    }

    public String getNif() {
        return txtNif.getText();
    }

    public String getIban() {
        return txtIban.getText();
    }

    public String getTxtSaldo() {
        return txtSaldo.getText();
    }

    public void añadirClienteBox(Cliente cliente) {
        boxCliente.addItem(cliente.getNif());
    }

    public String getBoxCliente(){
        return boxCliente.getSelectedItem().toString();
    }

    public void mostrarMensaje(String mensaje) {
       txtResultado.setText(mensaje);
    }

    public void addV(Vehiculo vehiculo) {
        boxCliente.addItem(vehiculo.getMatricula());
    }

    public void setControlador(ActionListener actionListener) {
        añadirClienteButton.addActionListener(actionListener);
        añadirClienteButton.setActionCommand("AñadirCliente");
        motrarMenuVehiculoButton.addActionListener(actionListener);
        motrarMenuVehiculoButton.setActionCommand("nuevaVentana");
    }
}
