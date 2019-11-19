package com.politecnico;

public class Partida {
    public static void main(String[] args) throws TableroException {
        Jugador juagador_1 = new Jugador("amarillo", "Mortadelo",0);
        Jugador juagador_2 = new Jugador("rojo", "Paca",0);
        Jugador jugador_3 = new Jugador("azul", "Federico",0);
        Jugador juagador_4 = new Jugador("verde", "María",0);
        Tablero tablero = new Tablero();

        juagador_1.avanzarCasilla(tablero.tirarDado());
        juagador_1.avanzarCasilla(tablero.tirarDado());
        juagador_1.avanzarCasilla(tablero.tirarDado());
        juagador_1.avanzarCasilla(tablero.tirarDado());
        juagador_1.avanzarCasilla(tablero.tirarDado());
        juagador_1.retrocederCasilla(tablero.tirarDado());
        juagador_1.avanzarCasilla(tablero.tirarDado());
        juagador_1.avanzarCasilla(tablero.tirarDado());
        juagador_1.retrocederCasilla(tablero.tirarDado());
        juagador_1.historial();
        System.out.println("==================================");
        juagador_1.undo();
        juagador_1.undo();
        juagador_1.redo();
        juagador_1.historial();

    }
}
