package Factory;

import GenerarDocumento.Generador;
import GenerarDocumento.GenerarHTML;
import GenerarDocumento.GenerarTEXT;


public class GeneradorFactory {

    public static void generarFactory(String nombreDocumento, String envFactory)  {
         Generador generador = null;
        if (EnvFactory.EnvFactory("TEXT").equals(envFactory))
            generador = new GenerarTEXT(nombreDocumento);
        else
            generador = new GenerarHTML(nombreDocumento);

    }
}
