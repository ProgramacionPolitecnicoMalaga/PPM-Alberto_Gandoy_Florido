package com.politecnico.Eventos;

import com.politecnico.Modelo.Vehiculo;

import java.util.Objects;

public abstract class Evento {
    private Vehiculo vehiculo;
    private String fecha;

    public Evento(Vehiculo vehiculo, String fecha) {
        this.vehiculo = vehiculo;
        this.fecha = fecha;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "vehiculo=" + vehiculo +
                ", fecha='" + fecha + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return Objects.equals(vehiculo, evento.vehiculo) &&
                Objects.equals(fecha, evento.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehiculo, fecha);
    }
}
