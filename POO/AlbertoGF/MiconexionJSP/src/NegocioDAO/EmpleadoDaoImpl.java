package NegocioDAO;

import Modelo.Empleado;
import Modelo.IEmpleadoDao;
import Conexion.Conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDaoImpl implements IEmpleadoDao {
    List<Empleado> empleados;

    public EmpleadoDaoImpl() {
        empleados = new ArrayList<Empleado>();
    }

    @Override
    public boolean registrar(Empleado empleado) {
        boolean registrar = false;

        Statement stm = null;
        Connection con = null;

       String sql = "INSERT INTO  EMPLEADOS(NOMBRE,APELLIDOS,FECHA_NACIMIENTO)values ('"+empleado.getNombre()+"','"+empleado.getApellidos()+"','"+empleado.getFechaNacimiento()+"')";

        try {
            con= Conexion.conectar();
            stm = con.createStatement();
            stm.executeUpdate(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método registrar");

            e.printStackTrace();
        }
        return registrar;
    }



 @Override
    public List<Empleado> obtener() {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM USUARIOS";

        try {
            co = Conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setId(rs.getInt(1));
                empleado.setNombre(rs.getString(2));
                empleado.setApellidos(rs.getString(3));
                empleado.setFechaNacimiento(rs.getString(4));
                empleados.add(empleado);
                System.out.println("HOLA SOY EL RS " + rs.getString(5));
            }

            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método obtener");
            e.printStackTrace();
        }
        return empleados;
    }

    @Override
    public boolean actualizar(Empleado empleado) {
        Connection connect = null;
        Statement stm = null;

        boolean actualizar = false;

        String sql = "UPDATE EMPLEADOS SET NOMBRE='"+empleado.getNombre()+"', APELLIDOS='"+empleado.getApellidos()+"', FECHA_NACIMIENTO=" + "'"+empleado.getFechaNacimiento()+"'" +" WHERE ID_EMPLEADO="+empleado.getId();
        try {
            connect = Conexion.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean eliminar(Empleado empleado) {
        Connection connect= null;
        Statement stm= null;


        boolean eliminar=false;

        String sql="DELETE FROM EMPLEADOS WHERE ID_EMPLEADO ="+empleado.getId();
        try {
            connect=Conexion.conectar();
            stm=connect.createStatement();
            stm.execute(sql);
            eliminar=true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }
}
