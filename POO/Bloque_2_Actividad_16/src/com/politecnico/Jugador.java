package com.politecnico;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Random;

public class Jugador {
    private String color;
    private String nombreJuador;
    private int casillaActual;
    private LinkedList<Integer> historial = new LinkedList<Integer>();
    private LinkedList<Integer> movimientosEliminados = new LinkedList<Integer>();

    public Jugador(String color, String nombreJuador, int casillaActual) {
        this.color = color;
        this.nombreJuador = nombreJuador;
        this.casillaActual = casillaActual;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombreJuador() {
        return nombreJuador;
    }

    public void setNombreJuador(String nombreJuador) {
        this.nombreJuador = nombreJuador;
    }

    public int getCasillaActual() {
        return casillaActual;
    }

    public void setCasillaActual(int casillaActual) {
        this.casillaActual = casillaActual;
    }

    public LinkedList<Integer> getHistorial() {
        return historial;
    }

    @Override
    public String toString() {
        return "===================================================" + "\n" +
                "Color: "+ color + "\n" +
                "Nombre: " + nombreJuador + "\n" +
                "Casilla actula: " + casillaActual + "\n" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        boolean resultado = false;
        if (o instanceof  Jugador){
            Jugador otro_jugador = (Jugador) o;
            resultado = this.color.equalsIgnoreCase(otro_jugador.getColor());
        }
        return resultado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color.toUpperCase());
    }

    public void avanzarCasilla(int dado){
        casillaActual = casillaActual + dado;
        historial.add(dado);
    }
    public void retrocederCasilla(int dado){
        if(dado > casillaActual){
            historial.add(-casillaActual); // Al estar en la casilla 3 por ejemplo y queremos retroceder 6 casillas, solo podemos 3 casillas-
            casillaActual = 0;
        } else{
            casillaActual = casillaActual - dado;
            historial.add(-dado);
        }

    }

    public void historial(){
        int posicion = 0;
        String msg = "";
        System.out.println("El jugador " + color + " realizó los siguientes movimientos: ");
        for (Integer movimientos : historial){
            if(movimientos > 0) msg = "Avance";
            else msg= "Retroceso";
            posicion = posicion + movimientos;
            System.out.println(msg + " a la casilla " + posicion);
        }
    }

    public void undo(){
        movimientosEliminados.addFirst(historial.removeLast());
        casillaActual = casillaActual - movimientosEliminados.getFirst();
    }

    public void redo(){
       historial.add(movimientosEliminados.removeFirst());
       casillaActual = casillaActual + historial.getLast();
    }
}
