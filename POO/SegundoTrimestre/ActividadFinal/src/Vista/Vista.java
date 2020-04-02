package Vista;

import Modelo.Usuario;
import Vista.UsuarioPanel.UsuarioPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;

public class Vista extends JFrame {
    private JPanel panel;
    private JList jListDatos;
    private JButton butValidar;
    private JButton butRegistrar;
    private JButton butEliminar;
    private JList jListNicks;
    private JButton butCargar;
    private UsuarioPanel usuarioPanel;
    private DefaultListModel<Usuario> defaultListModelDatos;
    private DefaultListModel<String> defaultListModelNicks;

    public Vista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        defaultListModelDatos = new DefaultListModel<>();
        defaultListModelNicks = new DefaultListModel<>();
        usuarioPanel = new UsuarioPanel();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        this.jListDatos.updateUI();
        this.jListNicks.updateUI();
        this.setPreferredSize(new Dimension(300,  toolkit.getScreenSize().height - 200));
        this.setMinimumSize(new Dimension(300,200));
        jListDatos.setModel(defaultListModelDatos);
        jListDatos.setCellRenderer(usuarioPanel);
        jListNicks.setModel(defaultListModelNicks);
        jListDatos.setFixedCellWidth(panel.getWidth());
        jListDatos.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                jListDatos.setFixedCellHeight(1000);
                jListDatos.setFixedCellHeight(-1);
            }
        });
    }

    public void iniciarVista() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public int getjListNicks() {
        return jListNicks.getAnchorSelectionIndex();
    }

    public Object getDefaultModelToRemoveNicks() {
        return defaultListModelNicks.remove(getjListNicks());
    }

    public void setLabelsPaneIcon(boolean resultado) {
        usuarioPanel.setLabelsPassword(resultado);

    }
    public void cargarDatosUsuario(Usuario usuario) {
        defaultListModelDatos.removeAllElements();//"actualizamos" jLista cada vez que realizamos operaciones.
        defaultListModelDatos.addElement(usuario);
    }

    public void cargarTodosLosDatos(ArrayList<Usuario> usuarios) {
        defaultListModelDatos.removeAllElements();
        defaultListModelNicks.removeAllElements();//"actualizamos" jLista cada vez que realizamos operaciones.
        for (Usuario usuario : usuarios) {
            defaultListModelNicks.addElement(usuario.getNick());
        }
    }

    public String getdataSelectedNick() {
       return jListNicks.getSelectedValue().toString();//Muestra el objeto selecionado
    }

    public void setActionListenerControlador(ActionListener actionListener) {
        butRegistrar.addActionListener(actionListener);
        butRegistrar.setActionCommand("registrar");
        butValidar.addActionListener(actionListener);
        butValidar.setActionCommand("validar");
        butEliminar.addActionListener(actionListener);
        butEliminar.setActionCommand("eliminar");
        butCargar.addActionListener(actionListener);
        butCargar.setActionCommand("cargar");
    }
}
