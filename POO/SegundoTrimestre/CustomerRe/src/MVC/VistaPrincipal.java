package MVC;


import Modelo.Item;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.time.LocalDate;
import java.util.ArrayList;

public class VistaPrincipal extends JFrame {

    private JPanel panelPrincipal;
    private JList jList;
    private JButton butEliminar;
    private JButton butNuevo;
    private VistaPrincipal vistaPrincipal;
    private DefaultListModel<Item> defaultListModel;

    public VistaPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panelPrincipal);
        vistaPrincipal = this;
        defaultListModel = new DefaultListModel<>();
        jList.setModel(defaultListModel);
        jList.setFixedCellWidth(panelPrincipal.getWidth());
        medidasPanel();
        medidasVenta();// LocalDate.of(2020,3,13)
        Item item1 = new Item("Juan Morales","2020-03-21","Aplicado el parche #1128 desde Jonatino/patch-1. Resultado aparentemente correcto","hola");
        defaultListModel.addElement(item1);

    }

    public void iniciarVistaPrincipal() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void medidasPanel() {
        jList.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                jList.setFixedCellHeight(1000);
                jList.setFixedCellHeight(-1);
            }
        });
    }

    public void medidasVenta() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
         setPreferredSize(new Dimension(toolkit.getScreenSize().height - 200,300));
         setMinimumSize(new Dimension(toolkit.getScreenSize().height - 200 ,200));
    }


    public void setControlador(ActionListener actionListener) {
        butNuevo.addActionListener(actionListener);
        butNuevo.setActionCommand("nuevo");
        butEliminar.addActionListener(actionListener);
        butEliminar.setActionCommand("eliminar");
    }
}
