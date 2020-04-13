package GenerarDocumento;

import Lector.LectorXML;
import Modelo.Empadronados;
import Modelo.FileException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerarTEXT implements Generador{

    private LectorXML lectorXML;

    public GenerarTEXT(String fichero) {
        lectorXML = new LectorXML("Nacionalidades.xml");
        try {
            generarDocumentos(fichero);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void generarDocumentos(String fichero) throws IOException {
        String ruta = "./ArchivosGenerados/"+fichero+".txt";
        String contenido = lectorXML.leerXML(new Empadronados());
        File file = new File(ruta);

        if (!file.exists()) {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } else {
            try {
                throw new FileException("El fichero de texto ya existe.");
            } catch (FileException e) {
                e.printStackTrace();
            }
        }
    }
}
