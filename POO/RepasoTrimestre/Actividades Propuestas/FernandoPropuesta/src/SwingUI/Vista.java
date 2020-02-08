package SwingUI;

import Negocio.Mesa;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Vista extends JFrame{
    private JPanel panel;
    private JTextField txtNombreProducto;
    private JTextField txtPrecio;
    private JButton btnAddProducto;
    private JComboBox boxMesaAbierta;
    private JButton btnAbrirMesa;
    private JLabel lblNotificacion;
    private JTextField txtIdMesa;
    private JButton btnMostrarMesa;
    private JButton btnRecuento;
    private JButton btnCobrar;

    public Vista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
    }

    public void init() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String getTxtNombreProducto() {
        return txtNombreProducto.getText();
    }

    public String getTxtPrecioProducto() {
        return txtPrecio.getText();
    }

    public String getTxtIdMesa() {
        return txtIdMesa.getText();
    }
    public void addBoxAbiertas(Mesa mesa) {
        boxMesaAbierta.addItem(mesa.getId());
    }

    public String getBoxAbiertas(){
        return boxMesaAbierta.getSelectedItem().toString();
    }

    public void removeBoxAbiertas(Mesa mesa){
        boxMesaAbierta.removeItem(mesa.getId());
    }

    public void mostrarMensaje(String mensaje) {
        lblNotificacion.setText(mensaje);
    }

    public void mostrarDatosSt(Mesa mesa) {
        lblNotificacion.setText(mesa.toString());
    }

    public void setControlador(ActionListener actionListener) {

        btnAbrirMesa.addActionListener(actionListener);
        btnAbrirMesa.setActionCommand("AbrirMesa");
        btnAddProducto.addActionListener(actionListener);
        btnAddProducto.setActionCommand("AddProducto");
        btnMostrarMesa.addActionListener(actionListener);
        btnMostrarMesa.setActionCommand("MostrarMesa");
        btnRecuento.addActionListener(actionListener);
        btnRecuento.setActionCommand("Recuento");
        btnCobrar.addActionListener(actionListener);
        btnCobrar.setActionCommand("Cobrar");
    }
}
