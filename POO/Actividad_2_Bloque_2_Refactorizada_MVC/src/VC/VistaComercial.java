package VC;

import com.toedter.calendar.JDateChooser;
import proyecto.Comercial;
import proyecto.Venta;
import proyecto.VentaMensual;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

public class VistaComercial extends JPanel{

   private JDateChooser jDateChooser;
    private JPanel jPanel;
    private JPanel jPanel2;
    private JLabel nombre;
    private JLabel record;
    private JTree tree;
    private JTextField txtVenta;
    private JButton eliminarButton;
    private JButton añadirVentaButton;
    private JLabel mensaje;
    private JButton mostrarButton;

    public VistaComercial(Comercial comercial) {
      //  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jPanel);
        jDateChooser = new JDateChooser();
        jDateChooser.setDateFormatString("dd/MM/yyyy");
        jPanel2.add(jDateChooser);
        jDateChooser.getCalendarButton().setActionCommand("");
        nombre.setText(comercial.getNombre());
        record.setText("Record: " + comercial.getRecordVenta().getVentas().size());

        DefaultMutableTreeNode limpia = new DefaultMutableTreeNode("");
        DefaultTreeModel tModel = (DefaultTreeModel) tree.getModel();
        tModel.setRoot(limpia);
        tree = new JTree(tModel);
    }



    public Calendar getFecha() {
        return jDateChooser.getCalendar();
    }

    public String getTxtVenta() {
        return txtVenta.getText();
    }


    public void mostrarMensaje(String mensaje) {
        this.mensaje.setText(mensaje);
    }

    public void mostrarVentasAnuales(ArrayList<VentaMensual> ventaMensuales, Calendar calendar) {
        DefaultMutableTreeNode anyo = new DefaultMutableTreeNode(calendar.get(Calendar.YEAR));

        for (VentaMensual ventaMensual : ventaMensuales) {
            DefaultMutableTreeNode mes = new DefaultMutableTreeNode(ventaMensual.getFecha().get(Calendar.MONTH));
            for (Venta venta : ventaMensual.getVentas()) {
                DefaultMutableTreeNode ventaAñadir = new DefaultMutableTreeNode(venta.getDescripcion());
                mes.add(ventaAñadir);
            }
            anyo.add(mes);
        }

        DefaultTreeModel tModel = (DefaultTreeModel) tree.getModel();
        tModel.setRoot(anyo);
        tree = new JTree(tModel);
        //  tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
    }

    public void setControlador(ActionListener actionListener) {
        añadirVentaButton.addActionListener(actionListener);
        añadirVentaButton.setActionCommand("AñadirVenta");
        eliminarButton.addActionListener(actionListener);
        eliminarButton.setActionCommand("Eliminar");
        mostrarButton.addActionListener(actionListener);
        mostrarButton.setActionCommand("Mostrar");

    }


}
