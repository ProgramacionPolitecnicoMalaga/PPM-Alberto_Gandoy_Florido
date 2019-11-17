package com.politecnico;

public class Partida {
    public static void main(String[] args) throws TableroException {
        Jugador j1 = new Jugador("azul", "Pedro",0);
        Jugador j2 = new Jugador("rojo", "José",0);
        Jugador j3 = new Jugador("azul", "Antonio",0);
        Tablero t = new Tablero();



        j1.avanzarCasilla(3);
        j1.avanzarCasilla(2);
        j1.avanzarCasilla(5);
        j1.retrocederCasilla(2);
        j1.historial();
        System.out.println("-------------------------");
        j1.undo();
        j1.undo();
        j1.redo();
        j1.historial();

    }
}
