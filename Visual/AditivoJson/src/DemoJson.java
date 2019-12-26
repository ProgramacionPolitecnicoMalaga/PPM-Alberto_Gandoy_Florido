import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DemoJson {
    private JPanel jPanel;
    private JTextField txtBusqueda;
    private JButton botonBuscar;
    private JTable table1;
    private JTextArea textArea1;
    final int OBJECT_ADICTIVO = 3;
    DefaultTableModel defaultTableModel = new DefaultTableModel();
    ArrayList<Aditivo> listaDeAdictivos = new ArrayList<>();

    public DemoJson() throws FileNotFoundException {
        LectorJson lectorJson = new LectorJson("aditivos.json");
        listaDeAdictivos = lectorJson.generarJson();

        Object object[] = new Object[OBJECT_ADICTIVO];
        defaultTableModel.addColumn("Nombre");
        defaultTableModel.addColumn("Peligrosidad");
        defaultTableModel.addColumn("Comentario");
        table1.setModel(defaultTableModel);

        botonBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String metido = "";
                for (int i = 0; i < defaultTableModel.getRowCount(); i++) {
                    defaultTableModel.removeRow(i);
                }
                for (int k = 0; k < listaDeAdictivos.size(); k++) {
                    metido = txtBusqueda.getText();
                    if (listaDeAdictivos.get(k).getNombre().contains(metido) || listaDeAdictivos.get(k).getPeligrosidad().contains(metido)
                    || listaDeAdictivos.get(k).getDescripcion().contains(metido)) {
                        object[0] = listaDeAdictivos.get(k).getNombre();
                        object[1] = listaDeAdictivos.get(k).getPeligrosidad();
                        object[2] = listaDeAdictivos.get(k).getDescripcion();

                        defaultTableModel.addRow(object);
                    }
                }

            }
        });
        table1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int elegida = table1.getSelectedRow();
                String cadena = "";
                cadena = defaultTableModel.getValueAt(elegida,0).toString();
                cadena += defaultTableModel.getValueAt(elegida,1).toString();
                cadena += defaultTableModel.getValueAt(elegida,2).toString();

                textArea1.setText(cadena);
            }
        });
    }

    public static void main(String[] args) throws FileNotFoundException {
        JFrame frame = new JFrame("Aditivo");
        frame.setContentPane(new DemoJson().jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1000,1000));
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
}
