package SwingGUI.VistaLectura;

import Excepciones.ConexionException;
import Modelo.Credencial;
import Modelo.Mensaje;
import Servicio_Login.Servicio;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class VistaLectura {
    private JPanel panelLectura;
    private JList jListRemitente;
    private JTextArea txtMensaje;
    private JButton cargarMensajesButton;
    private DefaultListModel<String> defaultListMensajeNombres;
    private Servicio servicio;

    public VistaLectura() {
        this.servicio = new Servicio();
        this.defaultListMensajeNombres = new DefaultListModel<>();
        this.jListRemitente.setModel(this.defaultListMensajeNombres);
        this.jListRemitente.setFixedCellWidth(panelLectura.getWidth());
        //this.jListRemitente.setCellRenderer(this);
        this.jListRemitente.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                jListRemitente.setFixedCellHeight(1000);
                jListRemitente.setFixedCellHeight(-1);
            }
        });

        cargarDatosJlist();

        cargarMensajesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    cargarDatosTxtArea();
                    cargarDatosJlist();
                } catch (ConexionException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public JPanel getPanelLectura() {
        return panelLectura;
    }

    public void cargarDatosJlist() {
        defaultListMensajeNombres.removeAllElements();
        ArrayList<Mensaje> mensajes = servicio.mostrarMensaje();
        for (Mensaje mensaje : mensajes)
            defaultListMensajeNombres.addElement(mensaje.getEmisor());
    }

    public void cargarDatosTxtArea() throws ConexionException, SQLException {
        txtMensaje.removeAll();
        Mensaje mensaje = servicio.buscarMensaje(jListRemitente.getSelectedValue().toString());
        txtMensaje.setText(mensaje.getTitulo() + "\n" + mensaje.getTexto());
    }
}
