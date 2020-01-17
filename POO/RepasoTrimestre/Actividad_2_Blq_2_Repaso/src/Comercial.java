import java.util.ArrayList;
import java.util.Objects;

public class Comercial {
    private String nombre;
    private ArrayList ventas;

    public Comercial(String nombre) {
        this.nombre = nombre;
        ventas = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList ventas) {
        this.ventas = ventas;
    }

    public void añadirVentas(int numeroDeVentas) throws ExceptionVentas {
        if (ventas.size() > 4) {
            throw new ExceptionVentas("No se pueden introducir más de " + ventas.size() + " ventas");
        }else {
            ventas.add(numeroDeVentas);
        }
    }

    public void mostrarVentas() {
        for (int i = 0; i < ventas.size(); i++) {
            System.out.println(nombre + " ha realizado: " + ventas.get(i) + " ventas");
        }
    }

    public void calcularPromedio(ArrayList<Integer> ventas) {
        int sumaTotal = 0;
        for (int i = 0; i < ventas.size(); i++) {
            sumaTotal += (ventas.get(i)/5);
        }
        System.out.println("El promedio de ventas de " + nombre + " es de: " + sumaTotal + " ventas");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
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
