public class CalcularTiempo {

    public String calculoTotal() {
        double init = System.currentTimeMillis();
        double total = (System.currentTimeMillis() - init) / 1000.0;

        return "Tiempo total en crear XML: " + total + " Segundos.";
    }
}
