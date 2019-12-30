import java.util.ArrayList;
import java.util.Objects;

public class Ciudad {
    private String nombre;
    private ArrayList<Estacion> estaciones;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        estaciones = new ArrayList<>();
    }

    public Ciudad() {
        estaciones = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public void añadirEstacion(Estacion estacion) {
        estaciones.add(estacion);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ciudad ciudad = (Ciudad) o;
        return Objects.equals(nombre, ciudad.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Ciudad: " + nombre +
                " Estaciones: " + estaciones;
    }
}
