package DAO;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection conexionBD() {
        Connection con = null;

        try {
            Dotenv dotenv =  Dotenv.configure().directory("./ConnENV").load();
            String url = "jdbc:mysql://"+dotenv.get("DDBB_HOST")+"/"+dotenv.get("DDBB_DATABASE");
            String usuario = dotenv.get("DDBB_USER");
            String clave = dotenv.get("DDBB_PASSWORD");
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