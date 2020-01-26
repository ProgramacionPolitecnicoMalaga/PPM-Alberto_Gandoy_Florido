package com.politecnico.Modelo;

import java.util.Objects;

public abstract class Vehiculo {
    private String fechaFabricacion, fechaEntrada, numeroBastidor;
    private boolean estado;

    public Vehiculo(String fechaFabricacion, String fechaEntrada, String numeroBastidor) {
        this.fechaFabricacion = fechaFabricacion;
        this.fechaEntrada = fechaEntrada;
        this.numeroBastidor = numeroBastidor;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getNumeroBastidor() {
        return numeroBastidor;
    }

    public void setNumeroBastidor(String numeroBastidor) {
        this.numeroBastidor = numeroBastidor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(numeroBastidor, vehiculo.numeroBastidor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroBastidor);
    }

    @Override
    public String toString() {
        return "Vehículo{" +
                "fechaFabricacion=" + fechaFabricacion +
                ", fechaEntrada=" + fechaEntrada +
                ", numeroBastidor='" + numeroBastidor + '\'' +
                ", estado=" + estado +
                '}';
    }
}
