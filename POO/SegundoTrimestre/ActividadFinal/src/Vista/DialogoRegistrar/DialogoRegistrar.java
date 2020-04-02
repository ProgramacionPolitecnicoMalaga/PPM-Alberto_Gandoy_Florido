package Vista.DialogoRegistrar;

import Vista.DataTransfer;

import javax.swing.*;
import java.awt.event.*;

public class DialogoRegistrar extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField txtNick;
    private JPasswordField txtPassword;
    private JComboBox boxAlgoritmo;
    private DataTransfer dataTransfer;
    public static String clave;

    public DialogoRegistrar(DataTransfer dataTransfer) {
        this.dataTransfer = dataTransfer;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        boxAlgoritmo.addItem("SHA");
        boxAlgoritmo.addItem("BCrypt");
        boxAlgoritmo.addItem("MD5");
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

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        setLocationRelativeTo(getParent());
        pack();
        setVisible(true);
    }


    private void onOK() {
        dataTransfer.setDato("nombre",txtNick.getText());
        char[] array = txtPassword.getPassword();
        clave = new String(array);
        dataTransfer.setDato("clave",clave);
        dataTransfer.setDato("algoritmo",boxAlgoritmo.getSelectedItem().toString());
        dispose();
    }

    private void onCancel() {
        dispose();
    }
}
