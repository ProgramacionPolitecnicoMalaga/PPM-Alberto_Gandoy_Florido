import java.util.Objects;

public class Piloto {
    private String nombre, escuderia;
    private int posicion;

    public Piloto(String nombre, String escuderia, int posicion) {
        this.nombre = nombre;
        this.escuderia = escuderia;
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "\n" + "=====================================" + "\n" +
                "Nombre: " + nombre + '\'' +
                "Escudería: " + escuderia + '\'' +
                "Posición: " + posicion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piloto piloto = (Piloto) o;
        return Objects.equals(nombre, piloto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
