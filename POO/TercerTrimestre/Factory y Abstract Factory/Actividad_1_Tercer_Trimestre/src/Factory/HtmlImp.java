package Factory;

import GenerarDocumento.Generador;
import GenerarDocumento.GenerarHTML;

public class HtmlImp implements LectorFactory {

    @Override
    public Generador generarLector() {
        return new GenerarHTML();

    }
}
