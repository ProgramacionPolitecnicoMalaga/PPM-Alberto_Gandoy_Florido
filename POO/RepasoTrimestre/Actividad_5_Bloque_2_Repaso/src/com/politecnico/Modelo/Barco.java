package com.politecnico.Modelo;

public class Barco extends Vehiculo{
    private String nombre;
    private double eslora, calado, manga;

    public Barco(String fechaFabricacion, String fechaEntrada, String numeroBastidor) {
        super(fechaFabricacion, fechaEntrada, numeroBastidor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public double getCalado() {
        return calado;
    }

    public void setCalado(double calado) {
        this.calado = calado;
    }

    public double getManga() {
        return manga;
    }

    public void setManga(double manga) {
        this.manga = manga;
    }
}
