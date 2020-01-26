package com.politecnico.Modelo;

public class Coche extends Vehiculo{
    private String matricula;
    private double ancho, altura, largo;

    public Coche(String fechaFabricacion, String fechaEntrada, String numeroBastidor) {
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

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
}
