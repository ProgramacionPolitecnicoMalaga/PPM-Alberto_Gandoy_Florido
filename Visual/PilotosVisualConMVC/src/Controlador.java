import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class Controlador implements ActionListener {

    private Vista vista;
    private Pilotos pilotos;
    public Controlador(Vista vista, Pilotos pilotos) {
        this.pilotos = pilotos;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) { //DÓNDE TENDRÍA QUE HACER EL MÉTODO PARA OBTENER UN PILOTO POR POSICIÓN O POR NOMBRE???????
        if (e.getActionCommand().equals("Cargar")) {
            try {
                pilotos.getLectorCSV().cargarCSV(pilotos.getPilotos());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }else if (e.getActionCommand().equals("Mostrar")) {
            vista.mostrarPilotos(pilotos.getPilotos());
        } else if (e.getActionCommand().equals("Buscar")) {
            String nombre = vista.getTxtBuscar();
            Piloto piloto = pilotos.buscarPiloto(nombre);
            vista.mostrarUnPiloto(piloto);
        } else if (e.getActionCommand().equals("Añadir")) {
            String nombre = vista.getTxtNombre();
            String escuderia = vista.getTxtEscuderia();
            int pos = pilotos.getPilotos().size() + 1;
            Piloto piloto = new Piloto(nombre, escuderia, pos);
            pilotos.añadirPiloto(piloto);
            vista.agregarPiloto(pos);
        }else if (e.getActionCommand().equals("Limpiar")) {
        vista.limpiarTexto();
    }
    }
}

