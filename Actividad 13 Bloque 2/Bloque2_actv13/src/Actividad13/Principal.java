package Actividad13;

public class Principal {
    public static void main(String[] args) throws MiExcepcion {
        int prueba = 0;
        Colas cola1=new Colas();
        MiExcepcion df = new MiExcepcion(" ");


        try {
            prueba = cola1.extraer();

        }catch (MiExcepcion e){
            System.out.println(e.advertencia());
        }
        cola1.insertar(10);
        cola1.insertar(12);
        cola1.insertar(14);
        cola1.insertar(16);
        cola1.insertar(18);
        cola1.insertar(20);
        System.out.println(cola1.toString());
    }
}
