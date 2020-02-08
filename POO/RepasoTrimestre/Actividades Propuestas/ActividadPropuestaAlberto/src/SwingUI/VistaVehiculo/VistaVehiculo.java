package SwingUI.VistaVehiculo;

import Proyecto.Cliente;
import Proyecto.Vehiculo;

import javax.swing.*;
import java.awt.event.ActionListener;

public class VistaVehiculo extends JPanel{
    private JPanel panelVehiculo;
    private JTextField txtModelo;
    private JTextField txtMarca;
    private JTextField txtColor;
    private JTextField txtCombustion;
    private JTextField txtEstado;
    private JTextField txtMatricula;
    private JComboBox boxVehiculo;
    private JButton btnVender;
    private JLabel lblNombreCliente;
    private JLabel lblNotificacionV;
    private JButton btnComprar;
    private JTextField txtPrecioCompraVenta;

    public VistaVehiculo() {
        add(panelVehiculo);
        lblNombreCliente.setText("Gestión de vehículos");
    }

    public String getTxtModelo() {
        return txtModelo.getText();
    }

    public String getTxtMarca() {
        return txtMarca.getText();
    }

    public String getTxtcolor() {
        return txtColor.getText();
    }

    public String getTxtCombustion() {
        return txtCombustion.getText();
    }

    public String getTxtEstado() {
        return txtEstado.getText();
    }

    public String getxtMatricula() {
        return txtMatricula.getText();
    }

    public String getTxtPrecio() {
        return txtPrecioCompraVenta.getText();
    }

    public void addBoxVehiculo(Vehiculo vehiculo) {
        boxVehiculo.addItem(vehiculo.getMatricula());
    }

    public String getComboxVehiculo(){
        return boxVehiculo.getSelectedItem().toString();
    }

    public void removeComboBox(Vehiculo vehiculo){
            boxVehiculo.removeItem(vehiculo.getMatricula());
        }

    public void limpiarV() {
        txtModelo.setText("");
        txtPrecioCompraVenta.setText("");
        txtColor.setText("");
        txtEstado.setText("");
        txtMatricula.setText("");
        txtMarca.setText("");
        txtCombustion.setText("");
    }

    public void mostrarMensaje(String mensaje) {
        lblNotificacionV.setText(mensaje);
    }

    public void setControlador(ActionListener actionListener) {
        btnVender.addActionListener(actionListener);
        btnVender.setActionCommand("Vender");
        btnComprar.addActionListener(actionListener);
        btnComprar.setActionCommand("Comprar");
    }

}
