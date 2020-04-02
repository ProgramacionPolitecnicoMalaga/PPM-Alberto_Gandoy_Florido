package Servicio;

import DAO.UsuarioDAO;
import DAO.UsuarioImplement;
import Encriptador.Encriptador;
import Modelo.Usuario;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class Servicio {
    private UsuarioDAO usuarioDAO;

    public Servicio() {
        this.usuarioDAO = new UsuarioImplement();
    }

    public ArrayList<Usuario> mostrarUsuarios() {
       return usuarioDAO.mostrar();
    }

    public void agregarUsuario(String nick, String password, String algoritmo) throws NoSuchAlgorithmException {
        String encriptado = encriptador(password, algoritmo);
        Usuario usuario = new Usuario(nick, encriptado, algoritmo);
        usuarioDAO.insertar(usuario);
    }

    public Usuario buscarUsuario(String nick) {
        return usuarioDAO.buscarUsuario(nick);
    }

    public void eliminarUusario(String nick) {
        usuarioDAO.eliminar(nick);
    }

    public String encriptador(String clave, String algoritmo) throws NoSuchAlgorithmException {
        Encriptador encpt = new Encriptador(clave, algoritmo);
        return encpt.generarHash();
    }

    public boolean verificarEncriptador(String clave, String algoritmo, Usuario usuario) throws NoSuchAlgorithmException {
        usuario = buscarUsuario(usuario.getNick());
        Encriptador encriptador = new Encriptador(clave, algoritmo);
        return encriptador.verficarClave(usuario.getPassword());
    }
}
