import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private GestorControlador gC;

    public Controlador(GestorControlador gC) {
        this.gC = gC;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Sumar")) {
            gC.sumar();
        }
    }
}
