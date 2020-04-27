package Modelo.Villano;

import java.util.Objects;

public abstract class Villano {
    private String nombre;

    public Villano(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Villano{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Villano villano = (Villano) o;
        return Objects.equals(nombre, villano.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
