package com.politecnico;

import com.politecnico.modelo.*;
import com.politecnico.negocio.*;

public class Demo {
    static Figura[] figuras;

    public static void main(String[] args) {
        figuras = new Figura[3];

        Figura circulo = new Circulo("Yellow");
        ((Circulo) circulo).setRadio(5);

        Figura cuadrado = new Cuadrado("Red");
        ((Cuadrado) cuadrado).setLado(10);

        Figura triangulo = new Triangulo("Blue");
        ((Triangulo) triangulo).setAltura(12);
        ((Triangulo) triangulo).setBase(32);

        figuras[0] = circulo;
        figuras[1] = cuadrado;
        figuras[2] = triangulo;

        CalculadoraArea C1 = new CalculadoraAreaCirculo();
        System.out.println("CIRCULO:" + C1.calcular(figuras[0]));

        CalculadoraArea C2 = new CalculadoraAreaCuadrado();
        System.out.println("CUADRADO: " + C2.calcular(figuras[1]));

        CalculadoraArea C3 = new CalculadoraAreaTriangulo();
        System.out.println("TRIANGULO: " + C3.calcular(figuras[2]));

        /*CalculadoraArea calculadoraArea = Generator.generar(triangulo);
        System.out.println(calculadoraArea.calcular(triangulo));
        System.out.println(calculadoraArea.calcular(circulo));
        System.out.println(calculadoraArea.calcular(cuadrado));*/
    }
}
