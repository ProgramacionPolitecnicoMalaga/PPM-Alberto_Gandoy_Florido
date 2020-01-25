package com.politecnico.negocio;

import com.politecnico.modelo.*;

public class GenerarNomina {
    public  CalcularNomina generadorNomina(Empleado empleado) throws ExceptionEmpleado {
        if (empleado instanceof Asalariado)
            return new CalcularNominaAsalariado();
        else if (empleado instanceof PorHora)
            return new CalcularNominaPorHora();
        else if (empleado instanceof Comisionado) return new CalcularNominaComisionado();
        else throw new ExceptionEmpleado();
    }
}
