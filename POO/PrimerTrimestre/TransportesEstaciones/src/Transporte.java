public class Transporte {
    private String tipoDeTransporte;

    public Transporte(String transporttype) {
        this.tipoDeTransporte = transporttype;
    }

    public String getTipoDeTransporte() {
        return tipoDeTransporte;
    }

    @Override
    public String toString() {
        return tipoDeTransporte;
    }
}
