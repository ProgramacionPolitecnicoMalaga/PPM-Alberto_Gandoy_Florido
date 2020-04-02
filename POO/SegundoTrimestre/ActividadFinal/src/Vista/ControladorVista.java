package Vista;

import Modelo.Usuario;
import Servicio.Servicio;
import Vista.DialogoRegistrar.DialogoRegistrar;
import Vista.DialogoValidar.DialogoValidar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;

public class ControladorVista implements ActionListener {
    private Servicio servicio;
    private Vista vista;

    public ControladorVista(Servicio servicio, Vista vista) {
        this.servicio = servicio;
        this.vista = vista;
        this.vista.cargarTodosLosDatos(servicio.mostrarUsuarios());
    }

    public void crearDialogoRegistro() throws NoSuchAlgorithmException {
        DataTransfer datos = new DataTransfer();
        DialogoRegistrar dialogo = new DialogoRegistrar(datos);
        String nombre = (String) datos.getDato("nombre");
        String clave = (String) datos.getDato("clave");
        String algoritmo = (String) datos.getDato("algoritmo");
        servicio.agregarUsuario(nombre, clave, algoritmo);
        vista.cargarTodosLosDatos(servicio.mostrarUsuarios());
    }

    public void crearDialogoValidar() throws NoSuchAlgorithmException {
        DataTransfer datos = new DataTransfer();
        DialogoValidar dialogo = new DialogoValidar(datos);
        String nombre = (String) datos.getDato("nombre");
        String clave = (String) datos.getDato("clave");
        Usuario usuario = servicio.buscarUsuario(nombre);
        boolean verificar = servicio.verificarEncriptador(clave,usuario.getAlgoritmo(),usuario);
        vista.setLabelsPaneIcon(verificar);
        vista.cargarDatosUsuario(usuario);
    }

    public void eliminarUsuarioSeleccionado() {
        Usuario usuario = servicio.buscarUsuario(vista.getdataSelectedNick());
        servicio.eliminarUusario(usuario.getNick());
        vista.getDefaultModelToRemoveNicks();
        vista.cargarTodosLosDatos(servicio.mostrarUsuarios());
    }

    public void cargarNicks() {
        Usuario usuario = servicio.buscarUsuario(vista.getdataSelectedNick());
        vista.cargarDatosUsuario(usuario);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("registrar")) {
            try {
                crearDialogoRegistro();
            } catch (NoSuchAlgorithmException ex) {
                ex.printStackTrace();
            }
        } else if (e.getActionCommand().equals("validar")) {
            try {
                crearDialogoValidar();
            } catch (NoSuchAlgorithmException ex) {
                ex.printStackTrace();
            }
        } else if (e.getActionCommand().equals("eliminar")) {
            eliminarUsuarioSeleccionado();
        } else if (e.getActionCommand().equals("cargar")) {
            cargarNicks();

        }
    }
}
