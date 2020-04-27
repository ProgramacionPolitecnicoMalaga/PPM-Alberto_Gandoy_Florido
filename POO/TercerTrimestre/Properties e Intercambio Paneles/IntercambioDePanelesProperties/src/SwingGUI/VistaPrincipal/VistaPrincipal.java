package SwingGUI.VistaPrincipal;

import Excepciones.ConexionException;
import Excepciones.QueryException;
import Excepciones.VistaException;
import Properties.Propiedades;
import Servicio_Login.Login;
import Servicio_Login.Servicio;
import SwingGUI.VistaEscritura.VistaEscritura;
import SwingGUI.VistaLectura.VistaLectura;
import com.mysql.cj.log.Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

public class VistaPrincipal extends JPanel {
    private JPanel panelIntercambio;
    private JMenu menuAcciones;
    private JMenuItem menuPanelLectura;
    private JMenuItem menuPanelEscritura;
    private JPanel jPanel;
    private JTextField txtNombre;
    private JPasswordField txtClave;
    private JButton aceptarButton;
    private VistaLectura vistaLectura;
    private VistaEscritura vistaEscritura;
    private Login login;


    public VistaPrincipal(VistaEscritura vistaEscritura, VistaLectura vistaLectura) throws IOException {
        this.vistaLectura = new VistaLectura();
        this.vistaEscritura = new VistaEscritura();
        this.login = new Login();
        this.panelIntercambio.add(vistaLectura.getPanelLectura(),"Lectura");
        this.panelIntercambio.add(vistaEscritura.getPanelEscritura(),"Escritura");

        Propiedades propiedades = new Propiedades();
        String usuario = propiedades.getProperties("Usuario_Actual");

        if (usuario != null) {
            cargarPanelLectura();
        }

        menuPanelLectura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarPanelLectura();
            }
        });

        menuPanelEscritura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarPanelEscritura();
            }
        });

        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    verificarClaveLogin();
                } catch (IOException | VistaException | NoSuchAlgorithmException ex) {
                    ex.printStackTrace();
                } catch (ConexionException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } catch (QueryException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public JPanel getjPanel() {
        return jPanel;
    }

    public String getTxtPassword() {
        char[] arrayChar = txtClave.getPassword();
        String clave = new String(arrayChar);
        return clave;
    }

    public void cargarPanelLectura() {
        CardLayout layout = (CardLayout) panelIntercambio.getLayout();
        layout.show(panelIntercambio, "Lectura");
    }

    public void cargarPanelEscritura() {
        CardLayout layout = (CardLayout) panelIntercambio.getLayout();
        layout.show(panelIntercambio, "Escritura");
    }

    public void verificarClaveLogin() throws SQLException, ConexionException, NoSuchAlgorithmException,
            IOException, VistaException, QueryException {
        boolean res = login.verificarClaveLogin(txtNombre.getText(), getTxtPassword());
        if (res == true)
            cargarPanelLectura();
        else
            throw new VistaException("El logeo es incorrecto");
    }
}
