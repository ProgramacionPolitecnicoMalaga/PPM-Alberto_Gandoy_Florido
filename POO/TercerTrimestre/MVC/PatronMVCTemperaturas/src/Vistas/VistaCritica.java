package Vistas;

import Controlador.Controlador;
import Modelo.Fuente;

import javax.swing.*;
import java.util.List;
import java.util.Random;

public class VistaCritica extends JPanel implements Fuente {
    private JPanel panel;
    private JList jList;
    private DefaultListModel<Double> defaultListModel;
    private Controlador controlador;

    public VistaCritica(Controlador controlador) {
        this.controlador = controlador;
        this.defaultListModel = new DefaultListModel<>();
        this.jList.setModel(defaultListModel);
    }

    public void iniciarVistaCritica() {
        add(panel);
        JFrame ventana = new JFrame("Críticas");
        ventana.setDefaultCloseOperation(2);
        ventana.setContentPane(this);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }


    public double getCriticas(List<Double> temperaturas) {
        Random aleatorio = new Random();
        double res = 0.0;
        for (Double criticas : temperaturas) {
            res = criticas;
            if (res > aleatorio.nextDouble()) {
                temperaturas.add(res);
                return res;
            } else {
                return aleatorio.nextDouble();
            }
        }
        return aleatorio.nextDouble();
    }

    @Override
    public void setListadoTemperaturas(List<Double> temperaturas) {
        defaultListModel.removeAllElements();
        defaultListModel.addElement(getCriticas(temperaturas));
    }
}
