package Swing;

import Modelo.Empleado;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Vista extends JFrame{
    private JPanel jPanel;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTable jTable;
    private JButton butBuscar;
    private JButton butCargar;
    private JButton butBorrar;
    private JButton butEditar;
    private JButton butAgregar;
    private DefaultTableModel modeloTabla;

    public Vista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jPanel);
        this.modeloTabla = new DefaultTableModel();
        this.jTable.updateUI();//Actualiza la tabla.
        cargarColores();

    }
    public void iniciarVista() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void cargarColores() {
        this.jTable.setModel(modeloTabla);
        this.jTable.setBorder(new LineBorder(Color.decode("#FFFFFF")));
        this.jTable.setBackground(Color.decode("#EFD24E"));
    }

    public String getTxtNombre() {
        return txtNombre.getText();
    }

    public String getTxtEdad() {
        return txtEdad.getText();
    }

    public String getTxtID() {
        return txtId.getText();
    }

    public void cargarDatos(ArrayList<Empleado> empleados) {
        limpiarTabla();
        Object[] datosFila = new Object[3];
        datosFila[0] = "ID";
        datosFila[1] = "NOMBRE";
        datosFila[2] = "EDAD";
        modeloTabla.addRow(datosFila);
        for (int i = 0; i < empleados.size(); i++) {
            datosFila[0] = empleados.get(i).getId();
            datosFila[1] = empleados.get(i).getNombre();
            datosFila[2] = empleados.get(i).getEdad();
            this.modeloTabla.addRow(datosFila);
        }
    }

    public void cargarDatosDeUnEmpleado(Empleado empleado){
        Object[] datosFila = new Object[3];
        datosFila[0] = empleado.getId();
        datosFila[1] = empleado.getNombre();
        datosFila[2] = empleado.getEdad();
        this.modeloTabla.addRow(datosFila);
    }

    public void limpiarTabla() {
        this.modeloTabla.setNumRows(0);
        this.modeloTabla.setColumnCount(3);
    }

    public void setActionListener(ActionListener actionListener) {
        butBuscar.addActionListener(actionListener);
        butBuscar.setActionCommand("buscar");
        butAgregar.addActionListener(actionListener);
        butAgregar.setActionCommand("insertar");
        butBorrar.addActionListener(actionListener);
        butBorrar.setActionCommand("eliminar");
        butEditar.addActionListener(actionListener);
        butEditar.setActionCommand("editar");
        butCargar.addActionListener(actionListener);
        butCargar.setActionCommand("cargar");
    }
}
