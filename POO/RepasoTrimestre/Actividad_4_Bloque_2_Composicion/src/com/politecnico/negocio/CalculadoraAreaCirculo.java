package com.politecnico.negocio;

import com.politecnico.modelo.Circulo;
import com.politecnico.modelo.Figura;

public class CalculadoraAreaCirculo implements CalculadoraArea {
    @Override
    public double calcular(Figura figura) {
        double res = 0;
        if (figura instanceof Circulo) {
            Circulo circulo = (Circulo) figura;
            res = Math.PI * (Math.pow(circulo.getRadio(),2));
        }
        return res;
    }
}
