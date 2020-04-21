import javax.swing.*;
import java.awt.*;

public class EjemploSingleton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Singleton");
        frame.setContentPane(new VistaPrincioal().getPanel()); // Alturas: nombre del Form enmarcado y de su clase correspondiente.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height - 200;
        int width = toolkit.getScreenSize().width - 400;
        frame.setPreferredSize(new Dimension(width, height));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
