import javax.swing.*;
import java.awt.event.*;

public class Dialogo1 extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField txtTexto;

    public Dialogo1() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        txtTexto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LogAcciones logAcciones = LogAcciones.getInstance();
                logAcciones.anotar("Dialogo1:txtTexto click de ratón");
            }
        });

        txtTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                LogAcciones logAcciones = LogAcciones.getInstance();
                logAcciones.anotar("Dialogo1:txtTexto, tecla " + e.getKeyChar() + " pulsada");
            }
        });

        pack();
        setLocationRelativeTo(SwingUtilities.getRoot(null));
        setVisible(true);

    }

    private void onOK() {
        LogAcciones logAcciones = LogAcciones.getInstance();
        logAcciones.anotar("Dialogo1:btnOk clicado");
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
}


