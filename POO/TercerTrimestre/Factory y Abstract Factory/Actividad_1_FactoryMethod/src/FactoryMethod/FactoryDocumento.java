package FactoryMethod;

import ControlDocumentos.GeneradorDeDocumentoTEXT;
import ControlDocumentos.GeneradorDeDocumento;
import ControlDocumentos.GeneraradorDeDocumentoHTML;
import Lector.LectorENV;

public class FactoryDocumento {
    public static GeneradorDeDocumento eleccion() {
        if (LectorENV.getDotenv().equalsIgnoreCase("HTML"))
            return new GeneraradorDeDocumentoHTML();
        else if (LectorENV.getDotenv().equalsIgnoreCase("TEXT"))
            return new GeneradorDeDocumentoTEXT();
        else throw new IllegalArgumentException("El documento indicado no existe");
    }
}
