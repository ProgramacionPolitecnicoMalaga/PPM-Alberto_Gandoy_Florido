package com.politecnico;

import java.awt.*;
import java.io.ObjectStreamException;
import java.util.Objects;

public class Piloto implements Comparable<Piloto>{

    private String nombre,escuderia;
    private int posicionDeSalirda;
    private boolean descalificado;

    public Piloto(String nombre, String escuderia, int posicionDeSalirda,boolean descalificado){
        this.nombre = nombre;
        this.escuderia = escuderia;
        this.posicionDeSalirda = posicionDeSalirda;
        this.descalificado = descalificado;
    }

    public Piloto(){}

    public Piloto(String nombre, String escuderia, int posicionDeSalirda){
        this.nombre = nombre;
        this.escuderia = escuderia;
        this.posicionDeSalirda = posicionDeSalirda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    public int getPosicionDeSalida() {
        return posicionDeSalirda;
    }

    public void setPosicionDeSalirda(int posicionDeSalirda) {
        this.posicionDeSalirda = posicionDeSalirda;
    }

    public boolean isDescalificado() {
        return descalificado;
    }

    public void setDescalificado(boolean descalificado) {
        this.descalificado = descalificado;
    }

    @Override
    public String toString() {
        return   "==========================" + "\n" +
                "Nombre: " + nombre + "\n"+
                "Escudería: " + escuderia + "\n" +
                "Posición de salida: " + posicionDeSalirda + "\n" +
                "Descalificado: " + descalificado + "\n" +
                "\n==========================\n";
    }

    @Override
    public boolean equals(Object o) {
        boolean resultado = false;
       if (o instanceof Piloto){
           Piloto otro_piloto = (Piloto) o;
          resultado = this.nombre.equalsIgnoreCase(otro_piloto.getNombre()) && this.escuderia.equalsIgnoreCase(otro_piloto.getEscuderia());
       }
           return resultado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre.toUpperCase()) + Objects.hash(escuderia.toUpperCase());
    }
    public void x (Piloto piloto){
        if (this.equals(piloto)){
            System.out.println("si");
        }else System.out.println("no");
    }

    @Override
    public int compareTo(Piloto o) {
        return this.nombre.compareTo(o.getNombre());
    }
}
