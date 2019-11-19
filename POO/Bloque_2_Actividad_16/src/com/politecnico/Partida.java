package com.politecnico;

public class Partida {
    public static void main(String[] args) throws TableroException {

        Jugadas jugadas = new Jugadas();
        
        jugadas.mostrarParticipantes();
        jugadas.primerJugador();
        jugadas.segundoJugador();
        jugadas.tercerJugador();
        jugadas.cuartoJugador();
    }
}
