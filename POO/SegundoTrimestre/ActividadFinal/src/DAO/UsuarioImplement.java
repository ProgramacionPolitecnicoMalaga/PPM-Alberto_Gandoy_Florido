package DAO;

import Modelo.Usuario;

import java.sql.*;
import java.util.ArrayList;

public class UsuarioImplement implements UsuarioDAO {

    @Override
    public ArrayList<Usuario> mostrar() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String querry = "SELECT * FROM Usuario";

        try {
            Connection con = Conexion.conexionBD();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(querry);
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setNick(rs.getString("nombre"));
                usuario.setPassword(rs.getString("clave"));
                usuario.setAlgoritmo(rs.getString("algoritmo"));
                usuarios.add(usuario);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    @Override
    public boolean insertar(Usuario usuario) {
        boolean registrado = false;

        try {
            Connection con = Conexion.conexionBD();
            String query = "INSERT INTO Usuario (nombre,clave, algoritmo)" + " VALUES (?, ?, ?)";
            PreparedStatement stm =  con.prepareStatement(query);
            stm.setString (1, usuario.getNick());
            stm.setString (2, usuario.getPassword());
            stm.setString (3, usuario.getAlgoritmo());
            registrado = true;
            stm.execute();
            stm.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registrado;
    }

    @Override
    public Usuario buscarUsuario(String nick) {
        Usuario usuario = new Usuario();
        String querry = "SELECT * FROM Usuario WHERE nombre LIKE '%"+nick+"%'";

        try {
            Connection con = Conexion.conexionBD();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(querry);

            while (rs.next()) {
                usuario.setId(rs.getInt("id"));
                usuario.setNick(rs.getString("nombre"));
                usuario.setPassword(rs.getString("clave"));
                usuario.setAlgoritmo(rs.getString("algoritmo"));
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    @Override
    public boolean eliminar(String nick) {
        boolean eliminar = false;
        String querry = "DELETE FROM Usuario WHERE nombre = '"+nick+"'";

        try {
            Connection  con = Conexion.conexionBD();
            Statement stm = con.createStatement();
            stm.execute(querry);
            eliminar = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return eliminar;
    }
}