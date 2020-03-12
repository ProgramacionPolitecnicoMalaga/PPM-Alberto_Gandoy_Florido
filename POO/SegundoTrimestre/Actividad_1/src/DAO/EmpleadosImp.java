package DAO;

import Modelo.Empleado;
import Modelo.EmpleadoDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpleadosImp implements EmpleadoDAO {
    private ArrayList<Empleado> empleados;
    private Connection con = null;
    private Statement stm = null;
    private ResultSet rs = null;

    public EmpleadosImp() {
        empleados = new ArrayList<>();
    }

    @Override
    public boolean insertarEmpleado(Empleado empleado) {
        boolean registrado = false;
        String consultaSql = "INSERT INTO  Empleado(nombre,edad) values ('"+empleado.getNombre()+"','"+empleado.getEdad()+"')";

        try {
            con = Conexion.conexionBD();
            stm = con.createStatement();
            stm.executeUpdate(consultaSql);
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
    public ArrayList<Empleado> mostrarEmpleado() {
        String consultaSql = "SELECT * FROM Empleado";

        try {
            con = Conexion.conexionBD();
            stm = con.createStatement();
            rs = stm.executeQuery(consultaSql);
            empleados.removeAll(empleados);//Por que se duplica la lista.
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
            System.out.println("Error: Clase EmpleadoImp, método mostrarEmpleado");
            e.printStackTrace();
        }
        return empleados;
    }

    @Override
    public boolean editarEmpleado(Empleado empleado, int idEmpleado) {
        boolean actualizar = false;
        String  consultaSql = "UPDATE Empleado SET nombre = '"+empleado.getNombre()+"', edad = '"+empleado.getEdad()+"' WHERE id = '"+idEmpleado+"'";

        try {
            con = Conexion.conexionBD();
            stm = con.createStatement();
            stm.execute(consultaSql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoImp, método editarEmpleado");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean eliminarEmpleado(int idEmpleado) {
        boolean eliminar = false;
        String consultaSql = "DELETE FROM Empleado WHERE id ="+idEmpleado;

        try {
            con = Conexion.conexionBD();
            stm = con.createStatement();
            stm.execute(consultaSql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoImp, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }

    @Override
    public Empleado buscarEmpleado(int idEmpleado) {
        Empleado empleado = new Empleado();
        String consultaSql = "SELECT * FROM Empleado WHERE id LIKE '%"+idEmpleado+"%'";

        try {
            con = Conexion.conexionBD();
            stm = con.createStatement();
            rs = stm.executeQuery(consultaSql);

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
}