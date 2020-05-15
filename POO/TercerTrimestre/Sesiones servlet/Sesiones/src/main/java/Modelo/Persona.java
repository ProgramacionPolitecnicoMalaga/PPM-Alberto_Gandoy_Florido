package Modelo;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Persona {
    private String nombre, fecha;
    private int edad;


    public Persona(String nombre, int edad, String fecha) {
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", fecha=" + fecha +
                '}';
    }
}
