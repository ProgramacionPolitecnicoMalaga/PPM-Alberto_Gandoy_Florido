package Factory;

import GenerarDocumento.Generador;
import GenerarDocumento.GenerarHTML;
import GenerarDocumento.GenerarTEXT;

import java.io.IOException;

public class Factory {
   private static Generador generador;

    public static void getFactory(String ext) throws IOException {
        String env = EnvFactory.EnvFactory(ext);

        if (env.equals("TEXT")) {
           generador = new GenerarTEXT();
           generador.generador();
        } else
            generador = new GenerarHTML();
            generador.generador();
    }
}
