package Actividad13;

public class MiExcepcion extends Exception {

    public MiExcepcion(String mensaje) {

        System.out.println("Perdon, pero tu cola no se puede extraer");
    }


    public String advertencia() {
        return "Perdon, pero tu cola no se puede extraer!";

    }
}
