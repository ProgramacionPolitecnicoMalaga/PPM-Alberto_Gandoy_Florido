package com.politecnico.Modelo;

public class Producto {
    private String nombre;
    private double precio, valoracionProducto;

    public Producto(String nombre, double precio, double valoracionProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.valoracionProducto = valoracionProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getValoracionProducto() {
        return valoracionProducto;
    }

    public void setValoracionProducto(double valoracionProducto) {
        this.valoracionProducto = valoracionProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", valoracionProducto=" + valoracionProducto +
                '}';
    }
}
