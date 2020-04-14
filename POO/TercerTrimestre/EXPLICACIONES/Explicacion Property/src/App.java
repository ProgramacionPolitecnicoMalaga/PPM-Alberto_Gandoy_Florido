import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Propiedades propiedades = new Propiedades();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Introduce un nombre para la propiedad: ");
        String nombre = sc.next();
        System.out.println("Introduce un valor para la propiedad: ");
        String clave = sc.next();
        propiedades.setProperties(nombre, clave);
        propiedades.guardar();
    }
}
