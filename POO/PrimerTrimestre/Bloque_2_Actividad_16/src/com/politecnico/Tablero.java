package com.politecnico;

import java.awt.List;
import java.util.*;

public class Tablero {

    private LinkedList<Jugador> jugadores = new LinkedList<Jugador>();
    private int valorTirada;

    public void añadirJugador(Jugador jugador) throws  TableroException{
        int i =0;
        boolean encontrado = false;
        while(i<jugadores.size() && !encontrado){
            if(jugador.equals(jugadores.get(i))){
                throw new TableroException("Ya hay un jugador igual creado");
            }
        }
        jugadores.add(jugador);
    }

    public int tirarDado(){
        Random generadorTiradas = new Random();
        valorTirada = generadorTiradas.nextInt(6) + 1;
        return valorTirada;
    }



}



