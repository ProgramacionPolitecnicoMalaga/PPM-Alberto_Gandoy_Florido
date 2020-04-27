package DAO;

import Excepciones.ConexionException;
import Excepciones.QueryException;
import Modelo.Credencial;

import java.sql.*;

import java.util.ArrayList;

public class CredencialImple implements CredencialDAO {

    @Override
    public ArrayList<Credencial> mostrar() {
        ArrayList<Credencial> credenciales = new ArrayList<>();
        String querry = "SELECT * FROM Credencial";

        try {
            Connection conn = ConexionBD.conexionBD();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(querry);
            while (rs.next()) {
                Credencial credencial = new Credencial();
                credencial.setId( rs.getInt("id"));
                credencial.setNombre(rs.getString("nombre"));
                credencial.setClave(rs.getString("clave"));
                credencial.setAlgoritmo(rs.getString("algoritmo"));
                credenciales.add(credencial);
            }
            stm.close();
            rs.close();
        } catch (SQLException | ConexionException e) {
            e.printStackTrace();
        }
        return credenciales;
    }

    @Override
    public boolean insertar(Credencial credencial) {
        boolean registrado = false;
        String query = "INSERT INTO Credencial (nombre, clave, algoritmo)" + " VALUES (?, ?, ?)";

        try {
            Connection conn = ConexionBD.conexionBD();
            PreparedStatement stm =  conn.prepareStatement(query);
            stm.setString (1, credencial.getNombre());
            stm.setString (2, credencial.getClave());
            stm.setString (3, credencial.getAlgoritmo());
            registrado = true;
            stm.execute();
            stm.close();
            conn.close();
        } catch (SQLException | ConexionException e) {
            e.printStackTrace();
        }
        return registrado;
    }

    @Override
    public Credencial buscarUsuario(String nombre) throws ConexionException, SQLException, QueryException {
        Credencial credencial = null;
        String querry = "SELECT * FROM Credencial WHERE nombre LIKE '%"+nombre+"%'";

            Connection conn = ConexionBD.conexionBD();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(querry);

            while (rs.next()) {
                credencial = new Credencial();

                credencial.setId(rs.getInt("id"));
                credencial.setNombre(rs.getString("nombre"));
                credencial.setClave(rs.getString("clave"));
                credencial.setAlgoritmo(rs.getString("algoritmo"));
            }
            stm.close();
            rs.close();
            conn.close();

            if (credencial != null)
                return credencial;
            else
                throw new QueryException("El usuario es incorrecto");
        }

    @Override
    public Integer buscarID(String nombre) {
        int id = 0;
        String querry = "SELECT id FROM Credencial WHERE nombre LIKE '%"+nombre+"%'";

        try {
            Connection conn = ConexionBD.conexionBD();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(querry);

            while (rs.next()) {
                id = rs.getInt("id");
            }
            stm.close();
            rs.close();
            conn.close();
        } catch (SQLException | ConexionException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public ArrayList<Credencial> mostrarNombres() {
        ArrayList<Credencial> credenciales = new ArrayList<>();
        String querry = "SELECT nombre FROM Credencial";

        try {
            Connection conn = ConexionBD.conexionBD();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(querry);
            while (rs.next()) {
                Credencial credencial = new Credencial();
                credencial.setNombre(rs.getString("nombre"));
                credenciales.add(credencial);
            }
            stm.close();
            rs.close();
        } catch (SQLException | ConexionException e) {
            e.printStackTrace();
        }
        return credenciales;
    }
}
