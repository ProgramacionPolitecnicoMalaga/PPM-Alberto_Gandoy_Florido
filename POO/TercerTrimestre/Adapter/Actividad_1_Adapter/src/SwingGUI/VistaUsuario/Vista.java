package SwingGUI.VistaUsuario;

import Modelo.Persona;
import SwingGUI.Adapter.AdaptadorModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

public class Vista extends JFrame {
    private JPanel panel;
    private JButton butBorrar;
    private JButton butPrint;
    private JButton butInsertar;
    private JTable jTable;
    private Toolkit toolkit;
    private List<Persona> personas;
    private AdaptadorModel adaptadorModel;

    public Vista(List<Persona> listaPersonas) {
        iniciarVista();
        this.personas = listaPersonas;
        this.adaptadorModel = new AdaptadorModel(personas);
        this.jTable.setModel(adaptadorModel);
        this.jTable.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DELETE){
                    jTable.getCellEditor().stopCellEditing();
                    adaptadorModel.removeRow(jTable.getSelectedRow());
                }
            }
        });
    }

    public void iniciarVista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Alberto Gandoy Florido");
        this.toolkit = Toolkit.getDefaultToolkit();
        this.setMinimumSize(new Dimension(300,200));
        this.setPreferredSize(new Dimension(300,  toolkit.getScreenSize().height - 200));
    }

    public void agregarPersonaToTheTable() {
        adaptadorModel.addRow();
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void borrarRow() {
        adaptadorModel.removeRow(jTable.getSelectedRow());
    }

    public void setActionListenerControlador(ActionListener actionListener) {
        butBorrar.addActionListener(actionListener);
        butBorrar.setActionCommand("Borrar");
        butPrint.addActionListener(actionListener);
        butPrint.setActionCommand("Print");
        butInsertar.addActionListener(actionListener);
        butInsertar.setActionCommand("Insertar");
    }
}
