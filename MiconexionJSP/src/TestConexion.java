import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConexion {
    public static void main(String[] args) {
        //Conexiones
        Connection connection = null;

        //Usuario y contraseña
        String usuario = "remoto";
        String clave = "malagaserade2Bproximamente";

        //Cadena de conexión, en un solo parámetro se concatena el usuario y la clave
        String url = "jdbc:mysql://vps456458.ovh.net:3306/INMOLOSA?useUnicode=yes&characterEncoding=UTF-8";
        try {
            connection = DriverManager.getConnection(url, usuario, clave);
            if (connection != null) {
                System.out.println("La conexión se ha realizado, CRACK!");
            }
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
