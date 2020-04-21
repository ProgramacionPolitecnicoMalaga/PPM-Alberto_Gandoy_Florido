import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class VistaPrincioal {
    private JPanel pnlMain;
    private JButton btnDialogo1;
    private JButton btnDialogo2;
    private JTextArea txtAreaAcciones;
    private JButton btnMostrarAcciones;
    private int últimaAcciónMostrada = 0;

    public VistaPrincioal() {
        btnDialogo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LogAcciones logAcciones = LogAcciones.getInstance();
                logAcciones.anotar("VistaPrincipal:btnDialogo1 pulsado");
                Dialogo1 dialogo1 = new Dialogo1();
            }
        });
        btnDialogo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LogAcciones logAcciones = LogAcciones.getInstance();
                logAcciones.anotar("VistaPrincipal:btnDialogo2 pulsado");
                Dialogo2 dialogo2 = new Dialogo2();
            }
        });
        btnMostrarAcciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LogAcciones logAcciones = LogAcciones.getInstance();
                logAcciones.anotar("VistaPrincipal:btnMostrarAcciones pulsado");
                mostrarAcciones();
            }
        });
    }
    public void mostrarAcciones(){
        LogAcciones logAcciones = LogAcciones.getInstance();
        List<String> acciones = logAcciones.getAcciones();
        for (int i=últimaAcciónMostrada; i<acciones.size(); i++){
            txtAreaAcciones.append(acciones.get(i)+"\n");
        }
        últimaAcciónMostrada = acciones.size()+1;
    }

    public JPanel getPanel(){
        return pnlMain;
    }

}
