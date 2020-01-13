import java.util.Scanner;

public class Interfaz {
    private Scanner sc;
    private Comerciales comerciales;
    private Comercial isabel, vicente;

    public Interfaz() throws ExceptionComercialExistente {
        sc = new Scanner(System.in);
        comerciales = new Comerciales();
        isabel = new Comercial("Isable");
        vicente = new Comercial("Vicente");
        comerciales.addComercial(isabel);
        comerciales.addComercial(vicente);
    }

    public void añadirVentaAcomercial() throws ExceptionComercialExistente {
        isabel.addVenta(new Venta(7));
        isabel.addVenta(new Venta(7));
        isabel.addVenta(new Venta(10));
        isabel.addVenta(new Venta(6));
        isabel.addVenta(new Venta(4));

        vicente.addVenta(new Venta(4));
        vicente.addVenta(new Venta(7));
        vicente.addVenta(new Venta(5));
        vicente.addVenta(new Venta(4));
        vicente.addVenta(new Venta(5));
    }

    public void mostrarComerciales() throws ExceptionComercialExistente {
        añadirVentaAcomercial();
        comerciales.mostrarComercial();
    }

    public void mostrarVentas() throws ExceptionOpcionIncorrecta {
        System.out.println("Empleados que vendieron un número de items:\n" +
                "1. Isabel\n" +
                "2. Vicente");
        byte opcion = sc.nextByte();

        if (opcion <= 0 || opcion >= 3) {
            throw new ExceptionOpcionIncorrecta("Opción incorecta");
        }else if (opcion == 1) {
            isabel.mostrarVenta();
        } else if (opcion == 2) {
            vicente.mostrarVenta();
        }
    }

    public void mostrasPromedio() throws ExceptionOpcionIncorrecta {
        System.out.println(" Obtener el promedio de ventas de cada uno\n" +
                "1. Isabel\n" +
                "2. Vicente");
        byte opcion = sc.nextByte();
        if (opcion <= 0 || opcion >= 3) {
            throw new ExceptionOpcionIncorrecta("Opción incorecta");
        }else if (opcion == 1) {
            System.out.println("El promedio de ventas de " + isabel.getNombre() + ": " + isabel.calcularPromedioVenta(isabel));
        } else if (opcion == 2) {
            System.out.println("El promedio de ventas de " + vicente.getNombre() + ": " + vicente.calcularPromedioVenta(vicente));
        }
    }

    public void mostrarMayorVenta() throws ExceptionOpcionIncorrecta {
        if (isabel.calcularPromedioVenta(isabel) > vicente.calcularPromedioVenta(vicente)) {
            System.out.println(isabel.getNombre() + " tiene el mayor número de ventas con " + isabel.calcularVentas(isabel) + " ventas");
        } else {
            System.out.println(vicente.getNombre() + " tiene el mayor número de ventas con " + vicente.calcularVentas(vicente) + " ventas");
        }
    }
}
