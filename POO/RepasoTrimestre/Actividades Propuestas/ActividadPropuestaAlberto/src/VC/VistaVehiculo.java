package VC;

import Proyecto.Cliente;
import Proyecto.Vehiculo;
import com.sun.jdi.request.StepRequest;

import javax.swing.*;
import java.awt.event.ActionListener;

public class VistaVehiculo extends JPanel{
    private JPanel panel2;
    private JTextField txtModelo;
    private JTextField txtMarca;
    private JTextField txtColor;
    private JTextField txtCombustion;
    private JTextField txtEstado;
    private JTextField txtPreicio;
    private JButton añadirVehiculoButton;
    private JButton comprarButton;
    private JButton venderButton;
    private JTextArea txtResultado;
    private JTextField txtMatricula;
    private JComboBox boxVehiculo;
    private JTextField txtOperacion;

    public VistaVehiculo(Cliente cliente) {
        add(panel2);
    }

    public String getTxtModelo() {
        return txtModelo.getText();
    }

    public String getTxtMarca() {
        return txtMarca.getText();
    }

    public String getTxtColor() {
        return txtColor.getText();
    }

    public String getTxtCombustion() {
        return txtCombustion.getText();
    }

    public String getTxtEstado() {
        return txtEstado.getText();
    }

    public String getTxtPrecio() {
        return txtPreicio.getText();
    }

    public String getTxtMatricula() {
        return txtMatricula.getText();
    }

    public String getTxtOperacion() {
        return txtOperacion.getText();
    }
    public void añadirVehiculoBox(Vehiculo vehiculo) {
        boxVehiculo.addItem(vehiculo.getMatricula());
    }

    public void borrarBox(Vehiculo vehiculo) {
        boxVehiculo.removeItem(vehiculo);
    }
    public String getBoxVehiculo(){
        return boxVehiculo.getSelectedItem().toString();
    }

    public void mostrarMensaje(String mensaje) {
        txtResultado.setText(mensaje);
    }


    public void setControlador(ActionListener actionListener) {
        añadirVehiculoButton.addActionListener(actionListener);
        añadirVehiculoButton.setActionCommand("AñadirVehiculo");
        venderButton.addActionListener(actionListener);
        venderButton.setActionCommand("Vender");
        comprarButton.addActionListener(actionListener);
        comprarButton.setActionCommand("Comprar");
    }

}
