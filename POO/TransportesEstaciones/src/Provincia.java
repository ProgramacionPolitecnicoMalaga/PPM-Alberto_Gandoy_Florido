import java.util.ArrayList;
import java.util.Objects;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades;
    private ArrayList<Estacion> estaciones;

    public Provincia(String nombre) {
        this.nombre = nombre;
        ciudades = new ArrayList<>();
        estaciones = new ArrayList<>();
    }

    public Provincia() {
        ciudades = new ArrayList<>();
        estaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public void añadirCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
    }

    public void añadirEstacion(Estacion estacion) {
        estaciones.add(estacion);
    }




    @Override
    public String toString() {
        return "===================================================="  + "\n" + "Provincia: " + nombre + "\n" + "Estaciones: " + estaciones + "\n" +
                "Ciudades: " + ciudades + "\n";

    }

}
