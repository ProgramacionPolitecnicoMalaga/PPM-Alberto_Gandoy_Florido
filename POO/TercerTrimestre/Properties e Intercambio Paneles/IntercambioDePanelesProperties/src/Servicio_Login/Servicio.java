package Servicio_Login;

import DAO.CredencialDAO;
import DAO.CredencialImple;
import DAO.MensajeDAO;
import DAO.MensajeImple;
import Encriptador.Encriptador;
import Excepciones.ConexionException;
import Excepciones.QueryException;
import Modelo.Credencial;
import Modelo.Mensaje;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Servicio {
    private CredencialDAO credencialDAO;
    private MensajeDAO mensajeDAO;

    public Servicio() {
        credencialDAO = new CredencialImple();
        mensajeDAO = new MensajeImple();
    }

    public ArrayList<Credencial> mostrarNombreCredencial() {
        return credencialDAO.mostrarNombres();
    }

    public ArrayList<Credencial> mostrarCredemciales() {
        return credencialDAO.mostrar();
    }
    public void agregarCredenciales(String nick, String password, String algoritmo) throws NoSuchAlgorithmException {
        String encriptado = encriptador(password, algoritmo);
        credencialDAO.insertar(new Credencial(nick, encriptado, algoritmo));
    }

    public Credencial buscarCredencial(String nick) throws ConexionException, QueryException, SQLException {
        return credencialDAO.buscarUsuario(nick);
    }

    public int buscarIDcredencial(String nick) {
        return credencialDAO.buscarID(nick);
    }

    public String encriptador(String clave, String algoritmo) throws NoSuchAlgorithmException {
        Encriptador encpt = new Encriptador(clave, algoritmo);
        return encpt.generarHash();
    }

    public boolean verificarEncriptador(String clave, String nombre)
            throws NoSuchAlgorithmException, ConexionException, QueryException, SQLException {
       Credencial credencial = buscarCredencial(nombre);
       Encriptador encriptador = new Encriptador(clave, credencial.getAlgoritmo());
       return encriptador.verficarClave(credencial.getClave());
    }

    public void agregarMensaje(String titulo, String texto, String emisor, String receptor, String fecha, int idmFK)
            throws SQLException {
        mensajeDAO.insertar(new Mensaje(titulo, texto, emisor, receptor, fecha, idmFK));
    }

    public ArrayList<Mensaje> mostrarMensaje() {
        return mensajeDAO.mostrar();
    }

    public Mensaje buscarMensaje(String emisor) throws ConexionException, SQLException {
        return mensajeDAO.buscarMensaje(emisor);
    }
}
