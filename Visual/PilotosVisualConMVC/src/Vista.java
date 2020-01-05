import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class Vista extends JFrame {
    private JTextField txtNombre;
    private JButton botonAñadir;
    private JPanel jPanel;
    private JTextArea txtResultado;
    private JButton botonBuscar;
    private JTextField txtEscuderia;
    private JTextField txtBuscar;
    private JButton botonLimpiar;
    private JButton mostrarTodoButton;
    private JButton cargarDatosButton;

    public Vista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jPanel);
    }

    public void init() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String getTxtNombre() {
        return txtNombre.getText();
    }

    public String getTxtEscuderia() {
        return txtEscuderia.getText();
    }

    public String getTxtBuscar() {
        return txtBuscar.getText();
    }

    public void mostrarPilotos(ArrayList<Piloto> pilotos) {
        for (int i = 0; i < pilotos.size(); i++) {
            txtResultado.append(pilotos.get(i).getNombre());
            txtResultado.append(pilotos.get(i).getEscuderia());
            txtResultado.append(String.valueOf(pilotos.get(i).getPosicion()));
            txtResultado.append(System.getProperty("line.separator"));

        }
    }
    public void mostrarUnPiloto(Piloto piloto) {
            limpiarTexto();
            txtResultado.append(piloto.getNombre());
            txtResultado.append(piloto.getEscuderia());
            txtResultado.append(String.valueOf(piloto.getPosicion()));
        }


    public void agregarPiloto(int posicion) {
        txtResultado.append(getTxtNombre());
        txtResultado.append(getTxtEscuderia());
        txtResultado.append(String.valueOf(posicion));
        txtResultado.append(System.getProperty("line.separator"));
    }

    public void limpiarTexto() {
        txtResultado.setText("");
    }

    public void setControlador(ActionListener actionListener) {
        mostrarTodoButton.addActionListener(actionListener);
        mostrarTodoButton.setActionCommand("Mostrar");
        botonBuscar.addActionListener(actionListener);
        botonAñadir.setActionCommand("Buscar");
        botonAñadir.addActionListener(actionListener);
        botonAñadir.setActionCommand("Añadir");
        botonLimpiar.addActionListener(actionListener);
        botonLimpiar.setActionCommand("Limpiar");
        cargarDatosButton.addActionListener(actionListener);
        cargarDatosButton.setActionCommand("Cargar");
    }
}
