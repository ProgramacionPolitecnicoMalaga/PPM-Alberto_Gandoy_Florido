package Main;

import ControlDocumentos.GeneradorDeDocumento;
import FactoryMethod.FactoryDocumento;
import Lector.LectorENV;

public class Demo {
    public static void main(String[] args) {
        GeneradorDeDocumento generador = FactoryDocumento.eleccion();
        generador.generarDocumento();
    }
}
