package proyecto;

import java.util.ArrayList;
import java.util.Calendar;

public class VentaMensual {
    private ArrayList<Venta> ventas;
    private Calendar fecha;

    public VentaMensual() {
        ventas = new ArrayList<>();
        fecha = Calendar.getInstance();
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void addVenta(Venta venta) {
        ventas.add(venta);
    }

    @Override
    public String toString() {
        return "proyecto.VentaMensual{" +
                "ventas=" + ventas +
                ", fecha=" + fecha.get(Calendar.DAY_OF_MONTH) + fecha.get(Calendar.MONTH+1)+ fecha.get(Calendar.YEAR) +
                '}';
    }
}
