package com.politecnico.modelo;

public class Asalariado extends Empleado {

    private double sueldo;

    public Asalariado(String nombre, String apellido, String nif) {
        super(nombre, apellido, nif);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
