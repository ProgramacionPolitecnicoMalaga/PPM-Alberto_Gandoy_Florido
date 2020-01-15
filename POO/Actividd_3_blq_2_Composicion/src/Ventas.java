import java.util.ArrayList;

public class Ventas {
    private ArrayList<Integer> ventas;

    public Ventas() {
        ventas = new ArrayList<>();
    }

    public ArrayList<Integer> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Integer> ventas) {
        this.ventas = ventas;
    }

    public void addVenta(int venta) throws ExceptionEmpleado {
        if (venta <= 0)
            throw new ExceptionEmpleado("Un venta no puede ser negativa");
        else
            ventas.add(venta);
    }
}
