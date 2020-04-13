package LeerEscribir;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LectorFactory {
    public static Lector leerArchivo(String fileName) throws IOException {
        String checkedFile = fileName;
        if (!fileNotFound(fileName)){
            throw new FileNotFoundException("Archivo no encontrado");
        } else {
            switch (getFileExtension(checkedFile)){
                case "xml": return new LecturaXML(checkedFile);
                case "csv": return new LecturaCSV();
                default: throw new FileNotFoundException("Formato no reconocido");
            }
        }
    }

    private static boolean fileNotFound(String fileName){
        File file = new File(fileName);
        return file.exists();
    }

    private static String getFileExtension(String fileName){
        String[] fileNameParts = fileName.split("\\.");
        return fileNameParts[fileNameParts.length-1];
    }

    public static Lector crearLectorXML()  {
        return new LecturaXML();
    }

    public static Lector crearLectorCSV() throws IOException {
        return new LecturaCSV();
    }

}
