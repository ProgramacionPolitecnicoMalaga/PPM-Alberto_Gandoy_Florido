package DAO;

import Excepciones.ConexionException;
import Modelo.Mensaje;

import java.sql.*;
import java.util.ArrayList;

public class MensajeImple implements MensajeDAO{

    @Override
    public boolean insertar(Mensaje mensaje) {
        boolean insertado = false;
        String query = "INSERT INTO Mensaje (titulo, texto, emisor, receptor, fecha, idM)" + " VALUES (?, ?, ?, ?, ? ,?)";

        try {
            Connection conn = ConexionBD.conexionBD();
            PreparedStatement stm =  conn.prepareStatement(query);
            stm.setString (1, mensaje.getTitulo());
            stm.setString (2, mensaje.getTexto());
            stm.setString (3, mensaje.getEmisor());
            stm.setString (4, mensaje.getReceptor());
            stm.setString (5,   mensaje.getFecha());
            stm.setInt (6,   mensaje.getImdFK());
            insertado = true;
            stm.execute();
            stm.close();
            conn.close();
        } catch (SQLException | ConexionException e) {
            e.printStackTrace();
        }
        return insertado;
    }

    @Override
    public ArrayList<Mensaje> mostrar() {
        ArrayList<Mensaje> mensajes = new ArrayList<>();
        String querry = "SELECT * FROM Mensaje";

        try {
            Connection conn = ConexionBD.conexionBD();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(querry);
            while (rs.next()) {
                Mensaje mensaje = new Mensaje();
                mensaje.setId(rs.getInt("id"));
                mensaje.setTitulo(rs.getString("titulo"));
                mensaje.setTexto(rs.getString("texto"));
                mensaje.setEmisor(rs.getString("emisor"));
                mensaje.setReceptor(rs.getString("receptor"));
                mensaje.setFecha(rs.getString("fecha"));
                mensaje.setImdFK(rs.getInt("idm"));
                mensajes.add(mensaje);
            }
            stm.close();
            rs.close();
        } catch (SQLException | ConexionException e) {
            e.printStackTrace();
        }
        return mensajes;
    }

    @Override
    public Mensaje buscarMensaje(String emisor) throws SQLException, ConexionException {
        String querry = "SELECT * FROM Mensaje WHERE emisor LIKE '%"+emisor+"%'";
        Mensaje mensaje = new Mensaje();

        Connection conn = ConexionBD.conexionBD();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(querry);

        while (rs.next()) {
            mensaje.setTitulo(rs.getString("titulo"));
            mensaje.setTexto(rs.getString("texto"));
        }
        stm.close();
        rs.close();
        conn.close();

        return mensaje;
    }
}
