package MVC.ItemPanel;

import Modelo.Item;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ItemPanel extends JPanel implements ListCellRenderer<Item> {
    private JLabel lblAutor;
    private JLabel lblFecha;
    private JTextArea txtAreaTexto;
    private JLabel lblTema;

    public ItemPanel(){
        setLayout(new BorderLayout(10,10));

        lblTema = new JLabel();
        lblAutor = new JLabel();
        lblFecha = new JLabel();
        txtAreaTexto = new JTextArea();
        txtAreaTexto.setWrapStyleWord(true);
        txtAreaTexto.setLineWrap(true);

        Border margenTemaAutor = new EmptyBorder(10,10,0,5);//Lo que va a ocupar el borde, no es margen como tal
        Border margenAutorFecha = new EmptyBorder(10,10,0,10);
        Border margenTexto = new EmptyBorder(0,10,20,10);

        lblTema.setBorder(margenTemaAutor);
        lblAutor.setBorder(margenAutorFecha);
        lblFecha.setBorder(margenAutorFecha);
        txtAreaTexto.setBorder(margenTexto);

        add(lblTema, BorderLayout.NORTH);
        add(lblAutor, BorderLayout.WEST);
        add(lblFecha, BorderLayout.EAST);
        add(txtAreaTexto, BorderLayout.SOUTH);
    }

    public void colorearTema(JLabel label) {
        if (label.getText().equals("IT")) {
            lblTema.setBackground(Color.decode("#7C471C"));
            lblTema.setOpaque(true);
        }else if (label.getText().equals("Desarrollo")) {
            lblTema.setBackground(Color.decode("#A2C34C"));
            lblTema.setOpaque(true);

        }else if (label.getText().equals("Mantenimiento")) {
            lblTema.setBackground(Color.decode("#A2C34C"));
            lblTema.setOpaque(true);

        }else if (label.getText().equals("General")) {
            lblTema.setBackground(Color.decode("#45EC71"));
            lblTema.setOpaque(true);
        }
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Item> jList, Item item, int i, boolean isSelected, boolean cellHasFocus) {
        lblTema.setText(item.getTema());
        lblAutor.setText(item.getAutor());
        lblFecha.setText(item.getFecha().toString());
        txtAreaTexto.setText(item.getTexto());
        txtAreaTexto.setSize(jList.getWidth(),Short.MAX_VALUE);

        if (isSelected){
            setBackground(Color.LIGHT_GRAY);
            colorearTema(lblTema);
        } else {
            setBackground(Color.WHITE);
            lblTema.setBackground(Color.WHITE);
        }

        if (cellHasFocus){
            txtAreaTexto.setFont(new Font("SansSerif",Font.BOLD,14));
        } else {
            txtAreaTexto.setFont(new Font("SansSerif",Font.PLAIN,10));
        }
        return this;
    }
}
