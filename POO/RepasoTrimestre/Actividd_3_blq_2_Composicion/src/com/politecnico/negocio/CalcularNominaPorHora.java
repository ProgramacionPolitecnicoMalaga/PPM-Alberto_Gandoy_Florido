package com.politecnico.negocio;

import com.politecnico.modelo.Empleado;
import com.politecnico.modelo.PorHora;

public class CalcularNominaPorHora implements CalcularNomina{
    @Override
    public double calculo(Empleado empleado) {
        double resultado = 0;
        if (empleado instanceof PorHora) {
            PorHora porHora = (PorHora) empleado;
            resultado = (porHora.getHora()) * (porHora.getSueldo());
        }
        return resultado;
    }
}
