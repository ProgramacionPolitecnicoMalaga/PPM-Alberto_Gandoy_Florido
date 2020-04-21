package Servicio_Login;

import Excepciones.ConexionException;
import Excepciones.QueryException;
import Properties.Propiedades;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

public class Login {

    public boolean verificarClaveLogin(String nombre, String clave) throws IOException, SQLException,
            ConexionException, NoSuchAlgorithmException, QueryException {
        Servicio servicio = new Servicio();
        boolean verificado = false;
        if (servicio.verificarEncriptador(clave, nombre)) {
            Propiedades propiedades = new Propiedades();
            propiedades.setProperties("Usuario_Actual", nombre);
            propiedades.guardar();
            verificado = true;
        }
        return verificado;
    }
}
