package com.politecnico.negocio;

import com.politecnico.modelo.Figura;
import com.politecnico.modelo.Triangulo;

public class CalculadoraAreaTriangulo implements CalculadoraArea{
    @Override
    public double calcular(Figura figura) {
        double res = 0;
        if (figura instanceof Triangulo) {
            Triangulo triangulo = (Triangulo) figura;
            res = (triangulo.getBase() * triangulo.getAltura()) /2;
        }
        return res;
    }
}
