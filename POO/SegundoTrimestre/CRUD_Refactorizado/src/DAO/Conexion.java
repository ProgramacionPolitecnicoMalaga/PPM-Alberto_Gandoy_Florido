package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection conexionBD() {
        Connection con = null;

        String usuario = "empleadosuser";
        String clave = "Perro20";
        String url = "jdbc:mysql://vps791421.ovh.net:3306/Empleados?useUnicode=yes&characterEncoding=UTF-8";

        try {
            con = DriverManager.getConnection(url, usuario, clave);
            if (con != null) {
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
