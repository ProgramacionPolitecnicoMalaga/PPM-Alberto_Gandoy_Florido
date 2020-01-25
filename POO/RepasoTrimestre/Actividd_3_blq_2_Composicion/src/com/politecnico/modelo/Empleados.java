package com.politecnico.modelo;

import java.util.ArrayList;

public class Empleados {
    private ArrayList<Empleado> empleados;

    public Empleados() {
        empleados = new ArrayList<>();
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void addEmpleado(Empleado empleado) {
        try {
        if(getEmpleados().contains(empleado))
                throw new ExceptionEmpleado("Ya está añadido");
        else empleados.add(empleado);
            } catch (ExceptionEmpleado exceptionEmpleado) {
                exceptionEmpleado.printStackTrace();
            }
    }

    public void mostrarEpleados() {
        for(Empleado e : empleados) {
            System.out.println(e);
        }
    }

    public Empleado buscarEmpleado(String nombre) {
        Empleado empleado = null;
        boolean encontrado = false;
        int i = 0;
        while (empleados.size() > i && !encontrado) {
            if (empleados.get(i).getNombre().equals(nombre)) {
                empleado = empleados.get(i);
                encontrado = true;
            }
            i++;
        }
        return empleado;
    }

    @Override
    public String toString() {
        return "com.politecnico.modelo.Empleados{" +
                "empleados=" + empleados +
                '}';
    }
}
