package Lector;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorTEXT implements Lector{

    @Override
    public String leerDocumento(String archivo) throws IOException {
        String cadena;
        FileReader f = new FileReader("./ArchivosGenerados/");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            return cadena;
        }
        b.close();
        return cadena;
    }
}
