package Factory;

import GenerarDocumento.Generador;
import GenerarDocumento.GenerarTEXT;

public class TextImple implements LectorFactory{
    @Override
    public Generador generarLector() {
        return new GenerarTEXT();
    }
}
