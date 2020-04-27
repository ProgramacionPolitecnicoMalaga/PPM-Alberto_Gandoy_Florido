package DAO;

import Excepciones.ConexionException;
import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    public static Connection conexionBD() throws SQLException, ConexionException {
        Dotenv dotenv =  Dotenv.configure().directory("./ConnENV").load();
        String url = "jdbc:mysql://"+dotenv.get("DDBB_HOST")+"/"+dotenv.get("DDBB_DATABASE");
        String usuario = dotenv.get("DDBB_USER");
        String clave = dotenv.get("DDBB_PASSWORD");

        Connection conn = DriverManager.getConnection(url, usuario, clave);

        if (conn != null)
        return conn;
        else
            throw new ConexionException("Fallo en la conexión a la base de datos");
    }
}
