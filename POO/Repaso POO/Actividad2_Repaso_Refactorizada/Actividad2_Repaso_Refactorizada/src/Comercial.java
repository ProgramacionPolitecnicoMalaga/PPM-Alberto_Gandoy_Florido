import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Comercial {
    private String nombre;
    private ArrayList<Venta> ventas;

    public Comercial(String nombre) {
        this.nombre = nombre;
        ventas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public void addVenta(Venta venta) {
        ventas.add(venta);
    }

    public void mostrarVenta() {
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }

    public int calcularPromedioVenta(Comercial comercial) {
        int suma = 0;
        int resultado = 0;
        for (int i = 0; i < comercial.getVentas().size(); i++) {
            suma += comercial.getVentas().get(i).getVenta();
            resultado = suma/ comercial.getVentas().size();
        }
        return resultado;
    }

    public int calcularVentas(Comercial comercial) {
        int suma = 0;
        for (int i = 0; i < comercial.getVentas().size(); i++) {
            suma += comercial.getVentas().get(i).getVenta();
        }
        return suma;
    }

    @Override
    public String toString() {
        return  "COMERCIAL " + "\n" +
                "Nombre: " + nombre + "\n" +
                "Ventas: " + ventas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comercial comercial = (Comercial) o;
        return Objects.equals(nombre, comercial.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
