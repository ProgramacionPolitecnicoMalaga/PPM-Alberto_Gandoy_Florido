package com.politecnico.modelo;

public class PorHora extends Empleado {
    private int hora;
    private double sueldo;

    public PorHora(String nombre, String apellido, String nif) {
        super(nombre, apellido, nif);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
