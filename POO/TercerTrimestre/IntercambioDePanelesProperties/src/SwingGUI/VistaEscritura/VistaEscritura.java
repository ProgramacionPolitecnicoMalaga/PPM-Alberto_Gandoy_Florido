package SwingGUI.VistaEscritura;

import Modelo.Credencial;
import Servicio_Login.Servicio;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class VistaEscritura {
    private JPanel panelEscritura;
    private JTextArea txtEscribirMensaje;
    private JTextField txtTitulo;
    private JComboBox boxDestinatario;
    private JButton butEnviar;
    private JTextField txtEmisor;
    private JTextField txtFecha;

    public VistaEscritura() {
        addNombreBox();
        butEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    escribirMensaje();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public JPanel getPanelEscritura() {
        return panelEscritura;
    }

    public void addNombreBox() {
        Servicio servicio = new Servicio();
        ArrayList<Credencial> credenciales = servicio.mostrarNombreCredencial();
        for (Credencial credencial : credenciales) {
            boxDestinatario.addItem(credencial.getNombre());
        }
    }

    public void escribirMensaje() throws SQLException {
        Servicio servicio = new Servicio();
        String titulo = txtTitulo.getText();
        String texto = txtEscribirMensaje.getText();
        String emisor = txtEmisor.getText();
        String receptor = boxDestinatario.getSelectedItem().toString();
        String fecha = txtFecha.getText();
        int idM = servicio.buscarIDcredencial(emisor);
        servicio.agregarMensaje(titulo, texto, emisor, receptor, fecha, idM);
    }
}
