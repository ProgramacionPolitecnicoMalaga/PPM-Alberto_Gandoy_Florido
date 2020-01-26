package com.politecnico.Modelo;

import java.util.Objects;

public abstract class Persona {
    private String nombre, apellido, idSubasta;
    private boolean estado;

    public Persona(String nombre, String apellido, String idSubasta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idSubasta = idSubasta;
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

    public String getIdSubasta() {
        return idSubasta;
    }

    public void setIdSubasta(String idSubasta) {
        this.idSubasta = idSubasta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", idSubasta='" + idSubasta + '\'' +
                ", estado=" + estado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(idSubasta, persona.idSubasta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSubasta);
    }
}
