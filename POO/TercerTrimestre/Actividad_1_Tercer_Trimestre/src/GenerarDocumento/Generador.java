package GenerarDocumento;

import Modelo.FileException;

import java.io.IOException;

public  interface Generador {
   void generarDocumentos(String fichero) throws IOException, FileException;
}
