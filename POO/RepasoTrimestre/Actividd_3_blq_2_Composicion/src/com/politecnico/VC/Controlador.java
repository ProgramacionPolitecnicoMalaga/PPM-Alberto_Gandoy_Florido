package com.politecnico.VC;

import com.politecnico.modelo.*;
import com.politecnico.negocio.CalcularNomina;
import com.politecnico.negocio.GenerarNomina;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Vista vista;
    private Empleados empleados;
    private GenerarNomina generarNomina;

    public Controlador(Vista vista, Empleados empleados) {
        this.vista = vista;
        this.empleados = empleados;
        generarNomina = new GenerarNomina();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("asalariado")) {
            String nombre = vista.getNombreTxt();
            String apellido = vista.getApellidoTxt();
            String nif = vista.getNifTxt();
            Empleado asalariado = new Asalariado(nombre,apellido,nif);
            ((Asalariado)asalariado).setSueldo(2000);
            vista.añadirEmpleadoBox(asalariado);
            double nomina = 0;
            try {
                nomina = generarNomina.generadorNomina(asalariado).calculo(asalariado);
            } catch (ExceptionEmpleado exceptionEmpleado) {
                exceptionEmpleado.printStackTrace();
            }
            vista.limpiarTexto();
            vista.mostrarMensaje("El empleado asalariado: " + asalariado.getNombre() + " " + asalariado.getApellido() + " con DNI: " + asalariado.getNif() + " se ha añadido correctamente," + " tiene una nomina de " +  nomina + "€");
            empleados.addEmpleado(asalariado);
        } else if (e.getActionCommand().equals("comisionado")) {
            String nombre = vista.getNombreTxt();
            String apellido = vista.getApellidoTxt();
            String nif = vista.getNifTxt();
            Empleado comisionado = new Comisionado(nombre,apellido,nif);
            ((Comisionado) comisionado).setSueldo(888);
            ((Comisionado) comisionado).setSueldoExta(222);
            ((Comisionado) comisionado).setVenta(111);
            vista.añadirEmpleadoBox(comisionado);
            double nomina = 0;
            try {
                nomina = generarNomina.generadorNomina(comisionado).calculo(comisionado);
            } catch (ExceptionEmpleado exceptionEmpleado) {
                exceptionEmpleado.printStackTrace();
            }
            vista.limpiarTexto();
            vista.mostrarMensaje("El empleado comisionado: " + comisionado.getNombre() + " " + comisionado.getApellido() + " con DNI: " + comisionado.getNif() + " se ha añadido correctamente, " + " tiene una nomina de " +  nomina + "€");
            empleados.addEmpleado(comisionado);
        } else if (e.getActionCommand().equals("porHoras")) {
            String nombre = vista.getNombreTxt();
            String apellido = vista.getApellidoTxt();
            String nif = vista.getNifTxt();
            Empleado porHora = new PorHora(nombre,apellido,nif);
            ((PorHora) porHora).setHora(50);
            ((PorHora) porHora).setSueldo(950);
            vista.añadirEmpleadoBox(porHora);
            double nomina = 0;
            try {
                 nomina = generarNomina.generadorNomina(porHora).calculo(porHora);
            } catch (ExceptionEmpleado exceptionEmpleado) {
                exceptionEmpleado.printStackTrace();
            }
            vista.limpiarTexto();
            vista.mostrarMensaje("El empleado por horas: " + porHora.getNombre() + " " + porHora.getApellido() + " con DNI: " + porHora.getNif() + " se ha añadido correctamente, " + " tiene una nomina de " +  nomina + "€");
            empleados.addEmpleado(porHora);
        } else if (e.getActionCommand().equals("mostrar")) {
            vista.limpiarTexto();
           vista.mostrarEmpleados(empleados.getEmpleados());
        } else if (e.getActionCommand().equals("limpiar")) {
            vista.limpiarTexto();
        }
    }
}
