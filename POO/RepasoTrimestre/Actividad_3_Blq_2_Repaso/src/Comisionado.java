import java.util.ArrayList;

public class Comisionado extends Empleado {
    private final double SUELDO_EXTRA = 50;
    private final double SUELDO_BASE = 1800;
    private ArrayList<Integer> ventas;

    public Comisionado(String nombre, String apellido, String nif, double sueldo, Nomina nomina) {
        super(nombre, apellido, nif, sueldo, nomina);
        super.setSueldo(SUELDO_BASE);
        ventas = new ArrayList<>();
    }

    public double getSUELDO_EXTRA() {
        return SUELDO_EXTRA;
    }

    public double getSUELDO_BASE() {
        return SUELDO_BASE;
    }

    public ArrayList<Integer> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Integer> ventas) {
        this.ventas = ventas;
    }

    public void addVenta(int venta) throws ExceptionEmpleado {
        if (venta <= 0) {
            throw new ExceptionEmpleado("Una venta no puede ser negativa");
        } else if (venta > 0) {
            ventas.add(venta);
        }
    }

    public void printVentas() {
        for (int venta : ventas) {
            System.out.println(venta);
        }
    }
}
