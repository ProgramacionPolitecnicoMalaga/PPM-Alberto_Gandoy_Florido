package com.politecnico.negocio;

import com.politecnico.modelo.Cuadrado;
import com.politecnico.modelo.Figura;
import com.politecnico.modelo.Triangulo;

public class Generator {
     public static CalculadoraArea generar(Figura figura) {
        if(figura instanceof Triangulo)
            return new CalculadoraAreaTriangulo();
        else if (figura instanceof Cuadrado)
            return new CalculadoraAreaCuadrado();
        else return new CalculadoraAreaCirculo();
    }
}
