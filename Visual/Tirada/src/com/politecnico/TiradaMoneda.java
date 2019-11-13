package com.politecnico;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TiradaMoneda {
    private JButton botonTirada;
    private JTextField txtIntroducirTirada;
    private JPanel jPanel;
    private JScrollPane jScroll;
    private JButton BotonRepetirTirada;
    private JButton botonLimpiar;
    private JTextField txtporcentajeTotal;
    private JTextField txtporcentajeCruz;
    private JTextField txtporcentajeCara;
    private JLabel JlabelMonedas;
    private JTextField txtLanzamientos;
    private int introducirTiradas;
    private double porcentaje = 0.5;
    static ImageIcon cruz = new ImageIcon("C:\\Users\\34676\\Desktop\\1 CFGS\\Programación\\Programación Visual\\Tirada\\src\\com\\politecnico\\imagenesMonedas\\cruz.png");
    static ImageIcon cara = new ImageIcon("C:\\Users\\34676\\Desktop\\1 CFGS\\Programación\\Programación Visual\\Tirada\\src\\com\\politecnico\\imagenesMonedas\\cara.jpg");
    static ImageIcon caraYcruz = new ImageIcon("C:\\Users\\34676\\Desktop\\1 CFGS\\Programación\\Programación Visual\\Tirada\\src\\com\\politecnico\\imagenesMonedas\\caraYcruz.png");


    public TiradaMoneda() {

        JlabelMonedas.setHorizontalAlignment(JlabelMonedas.getVerticalAlignment());


        botonTirada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                introducirTiradas = (Integer.parseInt(txtIntroducirTirada.getText()));

                if (Math.random() < porcentaje ){
                    JlabelMonedas.setIcon(cruz);
                }else {
                    JlabelMonedas.setIcon(cara);
                }
                introducirTiradas = (Integer.parseInt(txtIntroducirTirada.getText()));

                double calcularPorcentajeTiradas = 50 * introducirTiradas/100;
                double sumaPorcentajeTotal = calcularPorcentajeTiradas + calcularPorcentajeTiradas;

                txtporcentajeCara.setText(String.valueOf(calcularPorcentajeTiradas));
                txtporcentajeCruz.setText(String.valueOf(calcularPorcentajeTiradas));
                txtporcentajeTotal.setText(String.valueOf(sumaPorcentajeTotal));
                txtLanzamientos.setText(txtIntroducirTirada.getText());
            }
        });
        BotonRepetirTirada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                introducirTiradas = (Integer.parseInt(txtIntroducirTirada.getText()));

                if (Math.random() < porcentaje ){
                    JlabelMonedas.setIcon(cruz);
                }else {
                    JlabelMonedas.setIcon(cara);
                }
                introducirTiradas = (Integer.parseInt(txtIntroducirTirada.getText()));

                double calcularPorcentajeTiradas = 50 * introducirTiradas/100;
                double sumaPorcentajeTotal = calcularPorcentajeTiradas + calcularPorcentajeTiradas;

                txtporcentajeCara.setText(String.valueOf(calcularPorcentajeTiradas));
                txtporcentajeCruz.setText(String.valueOf(calcularPorcentajeTiradas));
                txtporcentajeTotal.setText(String.valueOf(sumaPorcentajeTotal));
                txtLanzamientos.setText(txtIntroducirTirada.getText());
            }
        });
        botonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtIntroducirTirada.setText("");
                txtporcentajeCara.setText("");
                txtporcentajeCruz.setText("");
                txtporcentajeTotal.setText("");
                txtLanzamientos.setText("");
                JlabelMonedas.setIcon(caraYcruz);
            }

        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("La casa de la apuesta");
        frame.setContentPane(new TiradaMoneda().jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
