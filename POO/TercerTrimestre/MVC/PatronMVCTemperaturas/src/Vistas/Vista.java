package Vistas;

import Controlador.Controlador;
import Modelo.Temperaturas;

import javax.swing.*;
import java.awt.event.ActionListener;


public class Vista extends JFrame {
    private JPanel panel;
    private JButton butPromedio;
    private JButton butCriticas;
    private JList jList;
    private DefaultListModel<Double> defaultListModel;
    private JSpinner spinnerTemperatura;
    private JButton butAdd;
    private JTextField txtTemperatura;
    private Temperaturas temperaturas;
    private Controlador controlador;

    public Vista(Controlador controlador, Temperaturas temperaturas) {
        this.controlador = controlador;
        this.temperaturas = temperaturas;
        iniciarVista();
    }

    public void iniciarVista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void getGradosToAdd() {
        controlador.agregarTemperaturasAlaLista(Double.parseDouble(txtTemperatura.getText()));
    }

    public void setActionListenerControlador (ActionListener actionListener) {
        butAdd.addActionListener(actionListener);
        butAdd.setActionCommand("agregar");
        butPromedio.addActionListener(actionListener);
        butPromedio.setActionCommand("promedio");
        butCriticas.addActionListener(actionListener);
        butCriticas.setActionCommand("criticas");
    }
}
