package com.politecnico.negocio;

import com.politecnico.modelo.Cuadrado;
import com.politecnico.modelo.Figura;

public class CalculadoraAreaCuadrado implements CalculadoraArea{
    @Override
    public double calcular(Figura figura) {
        double res = 0;
        if (figura instanceof Cuadrado) {
            Cuadrado cuadrado = (Cuadrado) figura;
            res = (Math.pow(cuadrado.getLado(), 2)) * (Math.pow(cuadrado.getLado(), 2));
        }
        return res;
    }
}
