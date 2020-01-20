package proyecto;

import java.util.Calendar;
import java.util.Objects;

public class Venta {
    private int id;
    private String descripcion;
    private Calendar fecha;

    public Venta(int numero) {//es para evitar la creación de una venta inválida.
        if (numero < 0) {
            try {
                throw new VentaException("Una venta no puede ser negativa");
            } catch (VentaException e) {
                e.printStackTrace();
            }
        }
            this.id = numero;
        fecha = Calendar.getInstance();
    }

    public Venta(int numero, Calendar date, String descripcion) {
        if (numero < 0) {
            try {
                throw new VentaException("Una venta no puede ser negativa");
            } catch (VentaException e) {
                e.printStackTrace();
            }
        }
        this.id = numero;
        this.descripcion = descripcion;
        this.fecha = date;

    }

    public Venta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String imprimirFecha(){
        return String.valueOf(fecha.get(Calendar.DAY_OF_MONTH)) + "/" + String.valueOf(fecha.get(Calendar.MONTH+1)) + "/" + String.valueOf(fecha.get(Calendar.YEAR));
    }

    @Override
    public String toString() {
        return "\nVENTA" +
                "Id: " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venta venta = (Venta) o;
        return id == venta.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
