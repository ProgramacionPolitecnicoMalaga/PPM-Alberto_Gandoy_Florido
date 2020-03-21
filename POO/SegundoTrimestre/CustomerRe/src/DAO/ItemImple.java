package DAO;

import Modelo.Item;
import Modelo.ItemDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ItemImple implements ItemDAO {
    private Connection con = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private ArrayList<Item> items;

    public ItemImple() {
        items = new ArrayList<>();
    }

    @Override
    public boolean insertarItem(Item item) {
        boolean registrado = false;
         String consulta = "INSERT INTO item( autor, fecha, descripcion, tema) VALUES('"+item.getAutor()+"'+'"+item.getFecha()+"'+'"+item.getDescripcion()+"'+'"+item.getTema()+"')";
        try {
            con = Conexion.conexionBD();
            stm = con.createStatement();
            stm.executeUpdate(consulta);
            registrado = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoImp, método insertarEmpleado");
            e.printStackTrace();
        }
        return registrado;
    }

    @Override
    public ArrayList<Item> mostrarItems() {
        String consulta = "SELECT * FROM item";

        try {
            con = Conexion.conexionBD();
            stm = con.createStatement();
            rs = stm.executeQuery(consulta);
         //   item.removeAll(empleados);//Por que se duplica la lista.
            while (rs.next()) {
                Item item = new Item();
                item.setId(rs.getInt("id"));
                item.setAutor(rs.getString("autor"));
                item.setFecha(rs.getString("fecha"));
                item.setDescripcion(rs.getString("descripcion"));
                item.setDescripcion(rs.getString("tema"));
                items.add(item);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoImp, método mostrarEmpleado");
            e.printStackTrace();
        }
        return items;
    }
}
