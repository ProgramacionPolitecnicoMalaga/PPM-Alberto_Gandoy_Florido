package com.politecnico.modelo;

import java.util.Objects;

public abstract class Empleado {
    private String nombre, apellido, nif;

    public Empleado(String nombre, String apellido, String nif) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "com.politecnico.modelo.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nif='" + nif + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(nombre, empleado.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
