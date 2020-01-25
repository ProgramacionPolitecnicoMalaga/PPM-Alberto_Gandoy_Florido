package com.politecnico.presentacion;

import com.politecnico.VC.Controlador;
import com.politecnico.VC.Vista;
import com.politecnico.modelo.*;
import com.politecnico.negocio.CalcularNomina;
import com.politecnico.negocio.GenerarNomina;

import java.awt.event.ActionListener;

public class Demo {
    public static void main(String[] args) throws ExceptionEmpleado {
        Empleados empleados = new Empleados();
        Vista vista = new Vista();
        ActionListener controlador = new Controlador(vista, empleados);
        vista.setControlador(controlador);
        vista.iniciarVista();






        /*Empleado asalariado = new Asalariado("Fernando", "Romero","64518654-Z");
        Empleado comisionado = new Comisionado("David","Fernández","8524556-F");
        Empleado porHora = new PorHora("Laura","Navarro","25456485-E");*/

         /*   CalcularNomina calcularNomina = GenerarNomina.generadorNomina(porHora);
        System.out.println("ASALARIADO: " + calcularNomina.calculo(asalariado));
        System.out.println("POR HORAS: " + calcularNomina.calculo(porHora));
        System.out.println("COMISIONADO: " + calcularNomina.calculo(comisionado));*/


    }
}
