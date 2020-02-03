import javax.swing.*;
import java.awt.event.ActionListener;

public class Vista extends JFrame{
    private JPanel jPanel;
    private JButton btnSuma;
    private JTextField txtSuma;
    private JLabel lblResultado;

    public Vista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jPanel);
    }

    public void init() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void setControlador(ActionListener aL) {
        btnSuma.addActionListener(aL);
        btnSuma.setActionCommand("Sumar");
    }

    public JLabel getLblResultado() {
        return lblResultado;
    }

    public String getTxtSuma() {
        return txtSuma.getText();
    }

}
