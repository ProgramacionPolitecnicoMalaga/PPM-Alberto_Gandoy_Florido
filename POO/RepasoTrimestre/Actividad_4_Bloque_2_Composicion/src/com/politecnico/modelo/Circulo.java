package com.politecnico.modelo;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String color) {
        super(color);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
