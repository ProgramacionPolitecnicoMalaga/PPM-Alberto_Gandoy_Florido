package SwingUI.VistaCliente;

import Proyecto.Cliente;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Vista extends JFrame{
    private JPanel panel;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtNif;
    private JComboBox boxCliente;
    private JButton btnAddCliente;
    private JTextField txtIban;
    private JTextField txtSaldo;
    private JLabel lblNotificacion;
    private JButton btnAddVehiculo;

    public Vista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
    }

    public void init() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String getTxtNombre() {
        return txtNombre.getText();
    }

    public String getTxtApellido() {
        return txtApellido.getText();
    }

    public String getTxtNIF() {
        return txtNif.getText();
    }

    public String getTxtIBAN() {
        return txtIban.getText();
    }

    public String getTxtSaldo() {
        return txtSaldo.getText();
    }

    public void addBoxCliente(Cliente cliente) {
        boxCliente.addItem(cliente.getNif());
    }

    public void mostrarMensaje(String mensaje) {
        lblNotificacion.setText(mensaje);
    }

    public String getBoxCliente(){
        return boxCliente.getSelectedItem().toString();
    }

    public void limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtNif.setText("");
        txtIban.setText("");
        txtSaldo.setText("");
    }

    public void setControlador(ActionListener actionListener) {
        btnAddCliente.addActionListener(actionListener);
        btnAddCliente.setActionCommand("AddCliente");
        btnAddVehiculo.addActionListener(actionListener);
        btnAddVehiculo.setActionCommand("GestionarVehiculo");
    }
}

