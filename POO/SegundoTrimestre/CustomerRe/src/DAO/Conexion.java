package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection conexionBD() {
        Connection con = null;

        String usuario = "usuarioBD";
        String clave = "qwerty98";
        String url = "jdbc:mysql://51.68.123.197:3306/Customer";

        try {
            con = DriverManager.getConnection(url, usuario, clave);
            if (con != null) {
                System.out.println("Conexión establecida");
            }
        } catch (SQLException e) {
            System.out.println("Fallo en la conexión");
            e.printStackTrace();
        }
        return con;
    }
}