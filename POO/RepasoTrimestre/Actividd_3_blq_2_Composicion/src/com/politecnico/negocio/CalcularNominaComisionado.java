package com.politecnico.negocio;

import com.politecnico.modelo.Comisionado;
import com.politecnico.modelo.Empleado;

public class CalcularNominaComisionado implements CalcularNomina {
    @Override
    public double calculo(Empleado empleado) {
        double resultado = 0;
        if (empleado instanceof Comisionado) {
            resultado = (((Comisionado) empleado).getSueldoExta() * ((Comisionado) empleado).getVenta()) + ((Comisionado) empleado).getVenta();
        }
        return resultado;
    }
}

