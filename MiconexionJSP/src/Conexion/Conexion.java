package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection conectar() {
        Connection con = null;

        String usuario = "remoto";
        String password = "malagaserade2Bproximamente";
        String url = "jdbc:mysql://vps456458.ovh.net:3306/LOGINS?useUnicode=yes&characterEncoding=UTF-8";

        try {
            con = DriverManager.getConnection(url,usuario,password);
            if (con != null) {
                System.out.println("Conectado!!");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
        return con;
    }
}
