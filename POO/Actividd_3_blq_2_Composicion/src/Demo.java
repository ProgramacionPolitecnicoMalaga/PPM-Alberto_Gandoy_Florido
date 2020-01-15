public class Demo {
    public static void main(String[] args) {
        GestionNomina gestionNomina = new GestionNomina();
        Empleados empleados = new Empleados();
        Ventas ventas = new Ventas();
        System.out.println("Asalariado: " + gestionNomina.nomina(new Asalariado("Alberto", "Gandoy Florido", "02020202", 0)));
        System.out.println("Por hora: " + gestionNomina.nomina(new PorHora("Perito de los", "Palotes ", "78787878", 1200,20)));
        System.out.println("Comisionado: " + gestionNomina.nomina(new Comisionado("Pepe", "Grillo", "456456578", 200,200, ventas)));

        try {
            ventas.addVenta(2);
            ventas.addVenta(3);
            ventas.addVenta(55);
            ventas.addVenta(77);
            ventas.addVenta(88);
            ventas.addVenta(88);
        } catch (ExceptionEmpleado exceptionEmpleado) {
            exceptionEmpleado.printStackTrace();
        }

    }
}
