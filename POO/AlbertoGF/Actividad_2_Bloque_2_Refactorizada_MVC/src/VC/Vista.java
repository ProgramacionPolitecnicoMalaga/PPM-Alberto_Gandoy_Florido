package VC;

import com.toedter.calendar.JDateChooser;
import proyecto.Comercial;
import proyecto.Venta;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

public class Vista extends JFrame{
    private JTextField txtComercial;//COMPROBAR: Generar archivo xml le hace falta FactoryXML y en lectura xml, falta lecturaCSV
    private JButton cargarButton;
    private JTextArea txtResultado;
    private JButton añadirBotonComercial;
    private JPanel jPanel;
    private JButton limpiarButton;
    private JButton buscarButton;
    private JTextField txtVenta;
    private JButton recordVentaButton;
    private JTextField txtBuscar;
    private JPanel jPanel2;
    private JTextField txtGenerateFile;
    private JComboBox comboBox;
    private JButton añadirVentaButton;
    private JButton mostrarButton;
    private JButton eliminarButton;
    private JTextField txtEliminar;
    private JDateChooser jDateChooser;

    public Vista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jPanel);
        jDateChooser = new JDateChooser();
        jDateChooser.setDateFormatString("dd/MM/yyyy");
        jPanel2.add(jDateChooser);
        //jDateChooser.getCalendarButton().setActionCommand("");
    }

    public void init() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String getTxtComercial() {
        return txtComercial.getText();
    }

    public String getTxtVenta() {
        return txtVenta.getText();
    }

    public String getTxtBuscar() {
        return txtBuscar.getText();
    }

    public String getTxtGenerateFile() {
        return txtGenerateFile.getText();
    }

    public String getTxtEliminar() {
        return txtEliminar.getText();
    }
    public Calendar getFecha() {
        return jDateChooser.getCalendar();
    }

    public String getComboxComercial(){
        return comboBox.getSelectedItem().toString();
    }

/*    public void addComercialEnPosicion(int posicion) {
        txtResultado.append(getTxtComercial());
        txtResultado.append(System.getProperty("line.separator"));
        txtResultado.append(getTxtVenta());
        txtResultado.append(System.getProperty("line.separator"));
    }*/

   /* public void mostrarVentasComercial(ArrayList<Comercial> comercialesVentas) {
        for (Comercial comercial : comercialesVentas) {
            txtResultado.append(String.valueOf(comercial.getVentasMensuales()));
            txtResultado.append(System.getProperty("line.separator"));
        }
    }*/

  //  public void eliminarComercial() {}

    public void limpiarTexto() {
        txtResultado.setText(" ");
        txtBuscar.setText(" ");
        txtVenta.setText(" ");
        txtComercial.setText(" ");
        txtGenerateFile.setText(" ");
    }

    public void mostrarComerciales(ArrayList<Comercial> comerciales) {
        for (Comercial comercial : comerciales) {
            comboBox.addItem(comercial.getNombre());
        }
    }

    public void añadirComercialBox(Comercial comercial) {
        comboBox.addItem(comercial.getNombre());
    }

    public void buscarComercial(Comercial comercial) {
        limpiarTexto();
        txtResultado.append(comercial.getNombre());
    }

    public void mostrarDatosVentas(ArrayList<Venta> ventas) {
        limpiarTexto();
        for (Venta venta:ventas) {
            txtResultado.append("-" + venta.getId() + ": " + venta.getDescripcion() + ".  date: " + venta.imprimirFecha());
            txtResultado.append(System.getProperty("line.separator"));
        }
    }

    public void mostrarMensaje(String mensaje) {
        limpiarTexto();
        txtResultado.setText(mensaje);
    }

    public void setControlador(ActionListener actionListener) {
        limpiarButton.addActionListener(actionListener);
        limpiarButton.setActionCommand("Limpiar");
        añadirBotonComercial.addActionListener(actionListener);
        añadirBotonComercial.setActionCommand("AñadirComercial");
        añadirVentaButton.addActionListener(actionListener);
        añadirVentaButton.setActionCommand("AñadirVenta");
        buscarButton.addActionListener(actionListener);
        buscarButton.setActionCommand("Buscar");
        cargarButton.addActionListener(actionListener);
        cargarButton.setActionCommand("Nuevodocumento");
        recordVentaButton.addActionListener(actionListener);
        recordVentaButton.setActionCommand("Record");
        mostrarButton.addActionListener(actionListener);
        mostrarButton.setActionCommand("Mostrar");
        eliminarButton.addActionListener(actionListener);
        eliminarButton.setActionCommand("Eliminar");
    }
}
