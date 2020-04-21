package Properties;

import java.io.*;
import java.util.Properties;

public class Propiedades {
    private Properties properties;

    public Propiedades() throws IOException {
        properties = new Properties();
        File archivoPropiedades = new File("config.properties");

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
        FileOutputStream output = new FileOutputStream("config.properties");
        properties.store(output, "Configuración");
    }
}
