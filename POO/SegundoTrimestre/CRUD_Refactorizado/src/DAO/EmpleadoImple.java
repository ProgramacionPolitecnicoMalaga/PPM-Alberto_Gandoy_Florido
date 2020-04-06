package DAO;

import Modelo.Empleado;
import Modelo.Iempleado;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpleadoImple implements Iempleado {
    private Connection con = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private ArrayList<Empleado> empleados;

    public EmpleadoImple() {
        empleados = new ArrayList<>();
    }

    @Override
    public Empleado insertar(String nombre, int edad) {
        String querry = "INSERT INTO Empleado(nombre,edad) VALUES('"+nombre+"','"+edad+"')";
        Empleado empleado = new Empleado(nombre,edad);
        try {
            con = Conexion.conexionBD();
            stm = con.createStatement();
            stm.executeUpdate(querry);
            stm.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleado;
    }

    @Override
    public Empleado editar(String nombre, int edad, int id) {
        String  querry = "UPDATE Empleado SET nombre = '"+nombre+"', edad = '"+edad+"' WHERE id = '"+id+"'";
        Empleado empleado = new Empleado(id,nombre,edad);
        try {
            con = Conexion.conexionBD();
            stm = con.createStatement();
            stm.execute(querry);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleado;
    }

    @Override
    public boolean eliminar(int id) {
        boolean eliminar = false;
        String querry = "DELETE FROM Empleado WHERE id ="+id;

        try {
            con = Conexion.conexionBD();
            stm = con.createStatement();
            stm.execute(querry);
            eliminar = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return eliminar;
    }

    @Override
    public Empleado buscar(int id) {
        Empleado empleado = new Empleado();
        String querry = "SELECT * FROM Empleado WHERE id LIKE '%"+id+"%'";

        try {
            con = Conexion.conexionBD();
            stm = con.createStatement();
            rs = stm.executeQuery(querry);

            while (rs.next()) {
                empleado.setId(rs.getInt("id"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setEdad(rs.getInt("edad"));
                empleados.add(empleado);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleado;
    }

    @Override
    public ArrayList<Empleado> mostrar() {
        String querry = "SELECT * FROM Empleado";
        try {
            con = Conexion.conexionBD();
            stm = con.createStatement();
            rs = stm.executeQuery(querry);
            empleados.removeAll(empleados);
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setId(rs.getInt("id"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setEdad(rs.getInt("edad"));
                empleados.add(empleado);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleados;
    }
}
