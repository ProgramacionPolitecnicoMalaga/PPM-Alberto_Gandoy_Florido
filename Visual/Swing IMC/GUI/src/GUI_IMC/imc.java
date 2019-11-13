package GUI_IMC;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class imc {
    private JPanel panelMain;
    private JTextField txtResultado;
    private JLabel Altura;
    private JButton botonCalcular;
    private JTextField txtAltura;
    private JTextField txtPeso;
    static float promedio = 0;

    public imc() {

        botonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              promedio = (float) (Float.parseFloat(txtPeso.getText())/ Math.pow(Float.parseFloat(txtAltura.getText()),2));
              txtResultado.setText(String.valueOf(promedio));
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora Para El Indice De Masa Corporal");
        frame.setContentPane(new imc().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        }
}


