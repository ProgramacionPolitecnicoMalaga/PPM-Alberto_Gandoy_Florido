package ModeloNegocio;

public class Cuenta {
    private Mesa mesa;
    private double cuenta;

    public Cuenta() {
    }

    public Cuenta(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "mesa=" + mesa +
                ", cuenta=" + cuenta +
                '}';
    }
}
