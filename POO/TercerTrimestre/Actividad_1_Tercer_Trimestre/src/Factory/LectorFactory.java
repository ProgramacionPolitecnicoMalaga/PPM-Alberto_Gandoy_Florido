package Factory;

import Lector.Lector;
import Lector.LectorHTML;
import Lector.LectorTEXT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PipedReader;

public class LectorFactory {


    private static String getFileExtension(String fileName){
        String[] fileNameParts = fileName.split("\\.");
        return fileNameParts[fileNameParts.length-1];
    }

    public static String lecturaFactory(String file) throws Exception {
        String extension = getFileExtension(file);
        if (extension.equals("txt")) {
            Lector lector = new LectorTEXT();
            return lector.leerDocumento(file);
        } else if (extension.equals("html")) {
            Lector lector = new LectorHTML();
            return lector.leerDocumento(file);
        } else
            throw new Exception("");

    }

}
