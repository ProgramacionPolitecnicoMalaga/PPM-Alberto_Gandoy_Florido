package Vistas;

import Controlador.Controlador;
import Modelo.Fuente;
import Modelo.Temperaturas;

import javax.swing.*;
import java.util.List;


public class VistaPromedio extends JPanel implements Fuente {
    private JPanel panelPromedio;
    private JList jListPromedio;
    private DefaultListModel<Double> defaultListModelPromedio;
    private Controlador controlador;
    private Temperaturas temperaturas;

    public VistaPromedio(Controlador controlador, Temperaturas temperaturas) {
        this.controlador = controlador;
        this.temperaturas = temperaturas;
        this.defaultListModelPromedio = new DefaultListModel<>();
        this.jListPromedio.setModel(defaultListModelPromedio);
    }

    public void iniciarVistaPromedio() {
        add(panelPromedio);
        JFrame ventana = new JFrame("Promedio");
        ventana.setDefaultCloseOperation(2);
        ventana.setContentPane(this);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }

    public double realizarPromedio(List<Double> grados) {
        double promedio = 0.0;
        for (Double grado : grados) {
            promedio += grado;
        }
        return promedio / grados.size();
    }

    @Override
    public void setListadoTemperaturas(List<Double> temperaturas) {
        defaultListModelPromedio.removeAllElements();
        double resultadoPromedio = realizarPromedio(temperaturas);
        defaultListModelPromedio.addElement(resultadoPromedio);
    }
}
