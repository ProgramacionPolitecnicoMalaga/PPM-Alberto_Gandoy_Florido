import java.util.ArrayList;
import java.util.Scanner;

public class Interfaz {
    Comercial isabel = new Comercial("Isabel");
    Comercial vicente = new Comercial("Vicente");
    private Scanner sc;
    private int numero;

    public Interfaz() {
        sc = new Scanner(System.in);
    }

    public void getNumeroDeVentas() throws ExceptionVentas {
        System.out.println("Introduce un número para obtener las ventas de un comercial: \n" +
                "1. Isabel\n" +
                "2. Vicente");
        numero = sc.nextByte();
        if (numero == 1) {
            isabel.añadirVentas(7);
            isabel.añadirVentas(7);
            isabel.añadirVentas(10);
            isabel.añadirVentas(6);
            isabel.añadirVentas(4);
            isabel.mostrarVentas();
        } else if (numero == 2) {
            vicente.añadirVentas(4);
            vicente.añadirVentas(7);
            vicente.añadirVentas(5);
            vicente.añadirVentas(4);
            vicente.añadirVentas(5);
            vicente.mostrarVentas();
        } else if (numero > 2) {
            throw new ExceptionVentas("Debe elegir entre 1 o 2");
        }
    }

    public void getPromedioVentas() throws ExceptionVentas {
        System.out.println("Introduce un número para obtener el promedio:\n" +
                "1. Isabel.\n" +
                "2. Vicente");
        numero = sc.nextByte();
        if (numero == 1) {
            isabel.calcularPromedio(isabel.getVentas());
        } else if (numero == 2) {
            vicente.calcularPromedio(vicente.getVentas());
        } else if (numero > 2) {
            throw new ExceptionVentas("Debe elegir entre 1 o 2");
        }
    }

    public void calcularMayorPromedio() {
        int promedioTotalIsa = 0;
        int promedioTotalVicente = 0;
        for (int i = 0; i < isabel.getVentas().size(); i++){
            int promedioIsa = 0;
            promedioIsa = (int) isabel.getVentas().get(i);
            promedioTotalIsa += (promedioIsa)/5;
        }
        for (int j = 0; j < vicente.getVentas().size(); j++){
            int promedioVice = 0;
            promedioVice = (int) vicente.getVentas().get(j);
            promedioTotalVicente += (promedioVice)/5;
        }
        if (promedioTotalIsa > promedioTotalVicente) {
            System.out.println(isabel.getNombre() + " tiene un promedio mayor que " + vicente.getNombre() +  " con un promedio total de: " + promedioTotalIsa + " ventas");
        }else if (promedioTotalVicente > promedioTotalVicente) {
            System.out.println(vicente.getNombre() + " tiene un promedio mayor que " + isabel.getNombre() + " con un promedio total de: " + promedioTotalVicente + " ventas");
        } else if (promedioTotalIsa == promedioTotalVicente) {
            System.out.println(vicente.getNombre() + " e " + isabel.getNombre() + " tienen el mismo primedio de ventas");
        }
    }

    public void getComerciales() throws ExceptionComercialExistente {
        Comerciales comerciales = new Comerciales();
        comerciales.añadirComercial(isabel);
        comerciales.añadirComercial(vicente);
        comerciales.mostrarComerciales();
    }
}
