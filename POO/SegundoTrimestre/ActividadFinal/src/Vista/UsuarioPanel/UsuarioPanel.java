package Vista.UsuarioPanel;

import Modelo.Usuario;
import Vista.DialogoRegistrar.DialogoRegistrar;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class UsuarioPanel extends JPanel implements ListCellRenderer<Usuario> {
    private JLabel lblPassword;
    private JLabel lblNombre;
    private JLabel lblAlgoritmo;
    private JLabel lblHash;
    private JLabel lblVerificado;
    private ImageIcon error;
    private ImageIcon ok;

    public UsuarioPanel() {
        setLayout(new BorderLayout(10, 10));
        ok = new ImageIcon("./Fotos/okey.PNG");
        error = new ImageIcon("./Fotos/error.PNG");
        lblVerificado = new JLabel();
        lblAlgoritmo = new JLabel();
        lblHash = new JLabel();
        lblNombre = new JLabel();
        lblPassword = new JLabel();

        Border margenTemaAutor = new EmptyBorder(10, 10, 0, 5);//Lo que va a ocupar el borde, no es margen como tal
        Border margenAutorFecha = new EmptyBorder(10, 5, 0, 10);
        Border margenTexto = new EmptyBorder(0, 10, 20, 10);
        Border margenHash = new EmptyBorder(0, 10, 30, 15);

        lblNombre.setBorder(margenTemaAutor);
        lblPassword.setBorder(margenAutorFecha);
        lblAlgoritmo.setBorder(margenTexto);
        lblHash.setBorder(margenAutorFecha);
        lblVerificado.setBorder(margenHash);

        add(lblVerificado, BorderLayout.WEST);
        add(lblNombre, BorderLayout.NORTH);
        add(lblPassword, BorderLayout.EAST);
        add(lblAlgoritmo, BorderLayout.SOUTH);
        add(lblHash, BorderLayout.CENTER);
    }


    public void colorearTema(JLabel label) {
        if (label.getText().equals("SHA")) {
            lblNombre.setBackground(Color.decode("#7C471C"));
            lblNombre.setOpaque(true);
        } else if (label.getText().equals("MD5")) {
            lblNombre.setBackground(Color.decode("#A2C34C"));
            lblNombre.setOpaque(true);
        } else {
            lblNombre.setBackground(Color.decode("#A2C34C"));
            lblNombre.setOpaque(true);
        }
    }

    public void setLabelsPassword(boolean resultado) {
        if (resultado == true) {
             lblVerificado.setIcon(ok);
        } else
            lblVerificado.setIcon(error);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Usuario> jList, Usuario usuario, int i, boolean isSelected, boolean cellHasFocus) {
        lblNombre.setText("Nombre: "+usuario.getNick());
        lblHash.setText("Hash: "+usuario.getPassword());
        lblPassword.setText("Contraseña: "+ DialogoRegistrar.clave);
        lblAlgoritmo.setText("Algoritmo: " + usuario.getAlgoritmo());

        if (isSelected) {
            setBackground(Color.LIGHT_GRAY);
            colorearTema(lblNombre);
        } else {
            setBackground(Color.WHITE);
            lblNombre.setBackground(Color.WHITE);
        }
        return this;
    }
}
