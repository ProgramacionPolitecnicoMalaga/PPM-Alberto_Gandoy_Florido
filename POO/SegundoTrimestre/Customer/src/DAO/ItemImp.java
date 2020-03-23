package DAO;

import Modelo.Item;
import Modelo.ItemDAO;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ItemImp implements ItemDAO {

    @Override
    public boolean insertarItem(Item item) {
        boolean registrado = false;

        try {
            Connection con = Conexion.conexionBD();
            String query = " INSERT INTO item (autor,fecha,texto,tema)" + " VALUES (?, ?, ?, ?)";
            PreparedStatement stm =  con.prepareStatement(query);
            stm.setString (1, item.getAutor());
            stm.setDate   (2, Date.valueOf(item.getFecha()));
            stm.setString(3, item.getTexto());
            stm.setString(4, item.getTema());
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
    public ArrayList<Item> mostrarItems() {
        ArrayList<Item> items = new ArrayList<>();

        try {
            Connection con = Conexion.conexionBD();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM item");
            while (rs.next()) {
                Item item = new Item();
                item.setAutor(rs.getString("autor"));
                item.setFecha(LocalDate.parse(rs.getString("fecha")));
                item.setTexto(rs.getString("texto"));
                item.setTema(rs.getString("tema"));
                items.add(item);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }

    @Override
    public boolean eliminarItem(String autor) {
        boolean eliminar = false;
        String consultaSql = "DELETE FROM item WHERE autor = '"+autor+"'";

        try {
            Connection  con = Conexion.conexionBD();
            Statement stm = con.createStatement();
            stm.execute(consultaSql);
            eliminar = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return eliminar;
    }
}
