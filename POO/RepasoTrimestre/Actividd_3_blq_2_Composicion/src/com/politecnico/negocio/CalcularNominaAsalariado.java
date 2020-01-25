package com.politecnico.negocio;

import com.politecnico.modelo.Asalariado;
import com.politecnico.modelo.Empleado;

public class CalcularNominaAsalariado implements CalcularNomina {
    @Override
    public double calculo(Empleado empleado) {
        double resultado = 0;
        if (empleado instanceof Asalariado) {
            Asalariado asalariado = (Asalariado) empleado;
            resultado = asalariado.getSueldo();
        }
        return resultado;
    }
}
