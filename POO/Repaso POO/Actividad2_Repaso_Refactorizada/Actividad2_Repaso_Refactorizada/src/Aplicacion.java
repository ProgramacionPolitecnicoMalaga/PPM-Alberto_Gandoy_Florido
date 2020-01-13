public class Aplicacion {
    public static void main(String[] args) throws ExceptionComercialExistente, ExceptionOpcionIncorrecta {
        Interfaz i = new Interfaz();

        i.añadirVentaAcomercial();

        System.out.println("===============================================");
        System.out.println("                    PREGUNTA 1                 ");
        System.out.println("===============================================");
        //1. Empleados que vendieron un número de items
        i.mostrarVentas();


        System.out.println("===============================================");
        System.out.println("                    PREGUNTA 2                 ");
        System.out.println("===============================================");
       // 2. Obtener el promedio de ventas de cada uno
        i.mostrasPromedio();

        System.out.println("===============================================");
        System.out.println("                    PREGUNTA 3                 ");
        System.out.println("===============================================");
        //3. Averiguar quién han conseguido el mayor número de ventas en un día
        i.mostrarMayorVenta();

        System.out.println("===============================================");
        System.out.println("                    PREGUNTA 4                 ");
        System.out.println("===============================================");
        //   4. Insertar un nuevo empleado y sus ventas
        i.mostrarComerciales();


    }
}
