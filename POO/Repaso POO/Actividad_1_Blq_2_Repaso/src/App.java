public class App {
    public static void main(String[] args) throws ExceptionCalculos {
        PedirPorPantalla pedirPorPantalla = new PedirPorPantalla();
        pedirPorPantalla.elegirUnidad();
        pedirPorPantalla.elegirOperacion();
        pedirPorPantalla.pedirNumeros();
        pedirPorPantalla.realizarCalculos();
    }
}
