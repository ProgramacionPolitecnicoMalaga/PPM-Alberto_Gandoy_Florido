public class App {
    public static void main(String[] args) throws ExceptionVentas, ExceptionComercialExistente {
        Interfaz interfaz = new Interfaz();

        System.out.println("==================================================\n" + "MOSTRAR LAS VENTAS REALIZADAS POR LOS COMERCIALES\n" + "==================================================");

        interfaz.getNumeroDeVentas();

        System.out.println("==================================================\n" + "MOSTRAR EL PROMEDIO\n" + "==================================================");

        interfaz.getPromedioVentas();

        System.out.println("==================================================\n" + "MOSTRAR QUIÉN TIENE MÁS PROMEDIO\n" + "==================================================");

        interfaz.calcularMayorPromedio();

        //OJO ----------> NO SÉ POR QUÉ, PERO CUANDO SELECCIONAS DESDE EL PRINCIPIO A UN COMERCIAL EN ESTE APARTADO SOLO TE DA LA INFORMACIÓN DEL COMERCIAL QUE HAS SELECIONADO AL PRINCIPIO

        System.out.println("==================================================\n" + "MOSTRAR COMERCIALES Y SUS VENTAS\n" + "==================================================");

        interfaz.getComerciales();

    }
}
