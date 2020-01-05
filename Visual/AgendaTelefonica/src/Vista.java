import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Vista extends JFrame{
    private JPanel jPanel;
    private JTextField txtBuscar;
    private JTextField txtAñadirContacto;
    private JTextField txtAñadirTelefono;
    private JTextField txtBorrarContacto;
    private JButton botonBuscar;
    private JButton botonAñadir;
    private JButton botonBorrar;
    private JTextArea txtResultadoArea;
    private JButton botonLimpiar;
    private JButton botonMostrarContactos;

    public Vista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jPanel);
    }

    public void iniciarVista() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String getTxtAñadirContacto() {
        return txtAñadirContacto.getText();
    }

    public String getTxtAñadirTelefono() {
        return txtAñadirTelefono.getText();
    }

    public String getTxtBuscar() {
        return txtBuscar.toString();
    }

    public String getTxtBorrarContacto() {
        return txtBorrarContacto.getText();
    }

    public void limpiarTxtResultado() {
        txtResultadoArea.setText(" ");
    }

    public void mostrarContactos(ArrayList<Contacto> contactos) {
        for (int i = 0; i < contactos.size(); i++) {
            txtResultadoArea.append(contactos.get(i).getNombre());
            txtResultadoArea.append(contactos.get(i).getTelefono());
            txtResultadoArea.append(System.getProperty("line.separator"));
        }
    }

    public void añadirContacto(int numero) {
        limpiarTxtResultado();
        txtResultadoArea.append(getTxtAñadirContacto());
        txtResultadoArea.append(getTxtAñadirTelefono());
        txtResultadoArea.append(System.getProperty("line.separator"));
    }

    public void buscarContacto(Contacto contacto) {
        limpiarTxtResultado();
        txtResultadoArea.append(contacto.getNombre());
    }

    public void borrarContacto(Contacto contacto) {
        limpiarTxtResultado();
        txtResultadoArea.append(contacto.getNombre());
    }

    public void setControlador(ActionListener actionListener) {
        botonMostrarContactos.addActionListener(actionListener);
        botonMostrarContactos.setActionCommand("Mostrar");
        botonBuscar.addActionListener(actionListener);
        botonAñadir.setActionCommand("Buscar");
        botonAñadir.addActionListener(actionListener);
        botonAñadir.setActionCommand("Añadir");
        botonBorrar.addActionListener(actionListener);
        botonBorrar.setActionCommand("Borrar");
        botonLimpiar.addActionListener(actionListener);
        botonLimpiar.setActionCommand("Limpiar");
    }
}
