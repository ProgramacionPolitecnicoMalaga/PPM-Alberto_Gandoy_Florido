package com.politecnico.Modelo;

public class Camion extends Vehiculo{
    private String matricula;
    private double ancho, altura, longitud;

    public Camion(String fechaFabricacion, String fechaEntrada, String numeroBastidor) {
        super(fechaFabricacion, fechaEntrada, numeroBastidor);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
