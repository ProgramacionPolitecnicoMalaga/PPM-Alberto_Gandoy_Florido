package MVC.Vista;

import MVC.ItemPanel.ItemPanel;
import Modelo.Item;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;


public class Vista extends JFrame {
    private JPanel jPanel;
    private JList jList;
    private JButton butEliminar;
    private JButton butNuevo;
    private DefaultListModel<Item> defaultListModel;
    private ItemPanel itemPanel;

    public Vista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jPanel);
        defaultListModel = new DefaultListModel<>();
        itemPanel = new ItemPanel();
        medidasVentana();
    }

    public JList getjList() {
        return jList;
    }

    public DefaultListModel<Item> getDefaultListModel() {
        return defaultListModel;
    }

    public void iniciarVista() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void cargarDatosItem(ArrayList<Item> items) {
        limpiarJlist();
        for (Item item : items) {
            defaultListModel.addElement(item);
        }

        jList.setModel(defaultListModel);
        jList.setCellRenderer(itemPanel);

        jList.setFixedCellWidth(jPanel.getWidth());

        jList.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                jList.setFixedCellHeight(1000);

                jList.setFixedCellHeight(-1);
            }
        });
    }

    public void limpiarJlist() { // jList.setSelectedIndex();
        defaultListModel.removeAllElements();
    }

    public void medidasVentana() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height - 200;
        int width = 300;
        this.setPreferredSize(new Dimension(width, height));
        this.setMinimumSize(new Dimension(width,200));
    }

    public void setControlador(ActionListener actionListener) {
        butNuevo.addActionListener(actionListener);
        butNuevo.setActionCommand("nuevo");
        butEliminar.addActionListener(actionListener);
        butEliminar.setActionCommand("eliminar");
    }
}
