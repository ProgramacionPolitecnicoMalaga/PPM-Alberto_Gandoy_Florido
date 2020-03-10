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
                System.out.println("Conexión establecida,");
            }
        } catch (SQLException e) {
            System.out.println("Fallo en la conexión.");
            e.printStackTrace();
        }
        return con;
    }
}
