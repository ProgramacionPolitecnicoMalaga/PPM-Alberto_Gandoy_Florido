package com.politecnico.modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Comisionado extends Empleado {
    private double sueldoExta, sueldo;
    private int venta;
    public Comisionado(String nombre, String apellido, String nif) {
        super(nombre, apellido, nif);
    }

    public double getSueldoExta() {
        return sueldoExta;
    }

    public void setSueldoExta(double sueldoExta) {
        this.sueldoExta = sueldoExta;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }
}
