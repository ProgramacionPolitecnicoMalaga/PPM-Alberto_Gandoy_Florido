package Main;

import SwingGUI.VistaEscritura.VistaEscritura;
import SwingGUI.VistaLectura.VistaLectura;
import SwingGUI.VistaPrincipal.VistaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        JFrame jFrame = new JFrame("Properties e Intercambio de Paneles Alberto Gandoy Florido");
        VistaPrincipal vistaPrincipal = new VistaPrincipal(new VistaEscritura(), new VistaLectura());
        jFrame.setContentPane(vistaPrincipal.getjPanel());
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int altura = toolkit.getScreenSize().height - 200;
        int ancho = toolkit.getScreenSize().width - 1500;
        jFrame.setPreferredSize(new Dimension(altura, ancho));
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
