public class Suma {
    private int total;
    private AvisadorCambioSuma aCs;

    public void sumar(int numero) {
        total += numero;
        aCs.avisar(this);
    }

    public int getTotal() {
        return total;
    }

    public void setAvisadorCambioSuma(AvisadorCambioSuma aCs) {
        this.aCs = aCs;
    }
}
