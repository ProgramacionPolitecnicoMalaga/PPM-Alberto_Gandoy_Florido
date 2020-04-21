package DAO;

import Excepciones.ConexionException;
import Excepciones.QueryException;
import Modelo.Credencial;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CredencialDAO {
    ArrayList<Credencial> mostrar();
    boolean insertar(Credencial credencial);
    Credencial buscarUsuario(String nombre) throws ConexionException, SQLException, QueryException;
    Integer buscarID(String nombre);
    ArrayList<Credencial> mostrarNombres();
}
