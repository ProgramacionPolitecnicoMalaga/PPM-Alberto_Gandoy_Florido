import java.util.Objects;

public class Estacion {
    private String nombre, telefono, direccion;
    private Transporte transporte;
    private Ubicacion ubicacion;

    public Estacion(String nombre, String telefono, String direccion, Transporte transporte, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.transporte = transporte;
        this.ubicacion = ubicacion;
    }
    public Estacion(String nombre) {
        this.nombre = nombre;
    }

    public Estacion() {

    }

    public String getNombre() {
        return nombre;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estacion estacion = (Estacion) o;
        return Objects.equals(nombre, estacion.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Estación: " + nombre + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Dirección: " + direccion + "\n" +
                "Transporte: " + transporte + ubicacion;
    }
}
