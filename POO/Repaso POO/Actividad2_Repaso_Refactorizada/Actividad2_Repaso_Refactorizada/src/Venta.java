public class Venta {
    private int venta;

    public Venta(int venta) {
        this.venta = venta;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    @Override
    public String toString() {
        return "" + venta;
    }
}
