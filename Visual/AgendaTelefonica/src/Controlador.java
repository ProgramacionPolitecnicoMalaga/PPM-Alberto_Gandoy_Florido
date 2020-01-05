import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//  private LectorXML lectorXML;
// private GenerarXML generarXML; es una opción para cuando añada un contacto también se añada al xml.
public class Controlador implements ActionListener {
    private Vista vista;
    private Agenda agenda;

    public Controlador(Vista vista, Agenda agenda) {
        this.vista = vista;
        this.agenda = agenda;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Mostrar")) {
            vista.mostrarContactos(agenda.getContactos());
        } else if (e.getActionCommand().equals("Añadir")) {
            String nombre = vista.getTxtAñadirContacto();
            String telefono = vista.getTxtAñadirTelefono();
            int numero = agenda.getContactos().size() + 1;
            Contacto c = new Contacto(nombre, telefono);
            agenda.agregarNuevoContacto(c);
            vista.añadirContacto(numero);
        } else if (e.getActionCommand().equals("Buscar")) {
            String nombre = vista.getTxtBuscar();
            Contacto contacto = agenda.buscarContacto(nombre);
            vista.buscarContacto(contacto);
        } else if (e.getActionCommand().equals("Limpiar")) {
            vista.limpiarTxtResultado();
        } else if (e.getActionCommand().equals("Borrar")) {
            String contactoBorrado = vista.getTxtBorrarContacto();
            String prueba = vista.getTxtBorrarContacto();
            Contacto cB = new Contacto(contactoBorrado, prueba);
            agenda.contactoEliminado(cB);
        }
    }
}
