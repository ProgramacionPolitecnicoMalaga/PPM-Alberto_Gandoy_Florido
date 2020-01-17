package Actividad6;

import java.util.Scanner;

public class Interfaz {
    int numHoras;
    int numVentas;
    int eleccion;
    String nombre;
    String primerApellido;
    String segundoApellido;
    int dni;
    Scanner sc = new Scanner(System.in);



    public Interfaz(){
        System.out.println("¿Qué nómina quiere calcular?\n" +
                "1. Comisionados\n" +
                "2. Asalariados\n" +
                "3. Por Horas");
       eleccion = sc.nextByte();
        if (eleccion == 1){
            System.out.println("Introduzca el nombre del comisionado");
             nombre = sc.next();
            System.out.println("Introduce el primer apellido del comisionado");
            primerApellido = sc.next();
            System.out.println("Introduce el segundo apellido del comisionado");
            segundoApellido = sc.next();
            System.out.println("Introduce el dni del comisionado");
            dni = sc.nextInt();
            System.out.println("Introduce el número de ventas");
            numVentas = sc.nextInt();
            Comisionados comisionado = new Comisionados(nombre,primerApellido,segundoApellido,dni,numVentas);
            System.out.println("-----------DATOS----------------");
            System.out.println("Nombre del comisionado: " + nombre + "\n"
            + "Apellidos del comisionado " + primerApellido + " " + segundoApellido+ "\n"
            + "DNI del comisionado " + dni + "\n" +
                    "Número de ventas realizadas " + numVentas + " ventas");
            int calculoComisionado = comisionado.getSalarioBase() + (comisionado.getEurosPorVentas()*numVentas);
            System.out.println("Cobra: " + calculoComisionado + " €");
        }else if (eleccion == 2){
            System.out.println("Introduzca el nombre del asalariado");
             nombre = sc.next();
            System.out.println("Introduce el primer apellido del asalariado");
            primerApellido = sc.next();
            System.out.println("Introduce el segundo apellido del asalariado");
            segundoApellido = sc.next();
            System.out.println("Introduce el dni del asalariado");
            dni = sc.nextInt();
            Asalariados asalariado = new Asalariados(nombre,primerApellido,segundoApellido,dni);
            System.out.println("-----------DATOS----------------");
            System.out.println("Nombre del asalariado: " + nombre + "\n"
                    + "Apellidos del asalariado " + primerApellido + " " + segundoApellido+ "\n"
                    + "DNI del asalariado " + dni);
            int pagaAsalariado = asalariado.getPagaFija();
            System.out.println("Cobra: " + pagaAsalariado + " €");
        }else if (eleccion == 3){
            System.out.println("Introduzca el nombre del trabajador por horas");
            String nombre = sc.next();
            System.out.println("Introduce el primer apellido del trabajador por horas");
            primerApellido = sc.next();
            System.out.println("Introduce el segundo apellido del trabajador por horas");
            segundoApellido = sc.next();
            System.out.println("Introduce el dni del trabajador por horas");
            dni = sc.nextInt();
            System.out.println("Introduce el número de horas trabajadas");
            numHoras = sc.nextInt();
            PorHoras porHoras = new PorHoras(nombre,primerApellido,segundoApellido,dni,numHoras);
            System.out.println("-----------DATOS----------------");
            System.out.println("Nombre del del trabajador por horas: " + nombre + "\n"
                    + "Apellidos del trabajador por horas " + primerApellido + " " + segundoApellido+ "\n"
                    + "DNI del trabajador por horas " + dni + "\n" +
             "Número de horas trabajadas " + numHoras + " horas");
            int calculoPorHoras = numHoras * porHoras.getSalarioPorHoras();
            System.out.println("Cobra " + calculoPorHoras + " €");
        }














    }








}
