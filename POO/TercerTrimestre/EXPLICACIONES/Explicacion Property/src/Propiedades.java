import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class Propiedades {
    public final static String NOMBRE_ARCHIVO_PROPERTIES = "config.properties";
    private Properties properties;

    public Propiedades() throws IOException {
        properties = new Properties();
        File archivoPropiedades = new File(NOMBRE_ARCHIVO_PROPERTIES);

        if (archivoPropiedades.exists()) {
            properties.load(new FileInputStream(archivoPropiedades));
        }
    }

    public String getProperties(String nombrePropiedad) {
        return properties.getProperty(nombrePropiedad);
    }

    public void setProperties(String nombrePropiedad, String valorPropiedad) {
        properties.setProperty(nombrePropiedad, valorPropiedad);
    }

    public void guardar() throws IOException {
        FileOutputStream output = new FileOutputStream(NOMBRE_ARCHIVO_PROPERTIES);
        properties.store(output, "Configuración");
    }
}
