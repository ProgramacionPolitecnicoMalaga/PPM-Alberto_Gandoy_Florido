package DAO;

import Excepciones.ConexionException;
import Modelo.Mensaje;

import java.sql.SQLException;
import java.util.ArrayList;

public interface MensajeDAO {
    boolean insertar(Mensaje mensaje) throws SQLException;
    ArrayList<Mensaje> mostrar();
    Mensaje buscarMensaje(String emisor) throws SQLException, ConexionException;
}
