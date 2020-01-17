package com.politecnico;

public class Jugadas {

    Tablero tablero = new Tablero();
    Jugador jugador_1 = new Jugador("amarillo", "Alejandro",0);
    Jugador jugador_2 = new Jugador("rojo", "Laura",0);
    Jugador jugador_3 = new Jugador("azul", "Esteban",0);
    Jugador jugador_4 = new Jugador("verde", "Raquel",0);

    public void mostrarParticipantes() {

        System.out.println("==================PARTICIPANTES==================\n"
                + jugador_1.toString() + jugador_2.toString() + jugador_3.toString() + jugador_4.toString());
    }

    public void primerJugador(){

        System.out.println("==================Jugador_1==================");
        jugador_1.avanzarCasilla(tablero.tirarDado());
        jugador_1.avanzarCasilla(tablero.tirarDado());
        jugador_1.avanzarCasilla(tablero.tirarDado());
        jugador_1.avanzarCasilla(tablero.tirarDado());
        jugador_1.avanzarCasilla(tablero.tirarDado());
        jugador_1.retrocederCasilla(tablero.tirarDado());
        jugador_1.avanzarCasilla(tablero.tirarDado());
        jugador_1.avanzarCasilla(tablero.tirarDado());
        jugador_1.retrocederCasilla(tablero.tirarDado());
        jugador_1.historial();
        System.out.println("================Historial Jugador==================");
        jugador_1.undo();
        jugador_1.undo();
        jugador_1.redo();
        jugador_1.historial();
    }

    public void segundoJugador()  {

        System.out.println("==================Jugador_2==================");
        jugador_2.avanzarCasilla(tablero.tirarDado());
        jugador_2.avanzarCasilla(tablero.tirarDado());
        jugador_2.avanzarCasilla(tablero.tirarDado());
        jugador_2.avanzarCasilla(tablero.tirarDado());
        jugador_2.avanzarCasilla(tablero.tirarDado());
        jugador_2.retrocederCasilla(tablero.tirarDado());
        jugador_2.avanzarCasilla(tablero.tirarDado());
        jugador_2.avanzarCasilla(tablero.tirarDado());
        jugador_2.retrocederCasilla(tablero.tirarDado());
        jugador_2.historial();
        System.out.println("================Historial Jugador==================");
        jugador_2.undo();
        jugador_2.undo();
        jugador_2.redo();
        jugador_2.historial();
    }

    public void tercerJugador(){


        System.out.println("==================Jugador_3==================");
        jugador_3.avanzarCasilla(tablero.tirarDado());
        jugador_3.avanzarCasilla(tablero.tirarDado());
        jugador_3.avanzarCasilla(tablero.tirarDado());
        jugador_3.avanzarCasilla(tablero.tirarDado());
        jugador_3.avanzarCasilla(tablero.tirarDado());
        jugador_3.retrocederCasilla(tablero.tirarDado());
        jugador_3.avanzarCasilla(tablero.tirarDado());
        jugador_3.avanzarCasilla(tablero.tirarDado());
        jugador_3.retrocederCasilla(tablero.tirarDado());
        jugador_3.historial();
        System.out.println("================Historial Jugador==================");
        jugador_3.undo();
        jugador_3.undo();
        jugador_3.redo();
        jugador_3.historial();
    }

    public void cuartoJugador(){

        System.out.println("==================Jugador_4==================");
        jugador_4.avanzarCasilla(tablero.tirarDado());
        jugador_4.avanzarCasilla(tablero.tirarDado());
        jugador_4.avanzarCasilla(tablero.tirarDado());
        jugador_4.avanzarCasilla(tablero.tirarDado());
        jugador_4.avanzarCasilla(tablero.tirarDado());
        jugador_4.retrocederCasilla(tablero.tirarDado());
        jugador_4.avanzarCasilla(tablero.tirarDado());
        jugador_4.avanzarCasilla(tablero.tirarDado());
        jugador_4.retrocederCasilla(tablero.tirarDado());
        jugador_4.historial();
        System.out.println("================Historial Jugador==================");
        jugador_4.undo();
        jugador_4.undo();
        jugador_4.redo();
        jugador_4.historial();
    }

    public void añadirJugadores() throws TableroException {
        tablero.añadirJugador(jugador_1);
        tablero.añadirJugador(jugador_2);
        tablero.añadirJugador(jugador_3);
        tablero.añadirJugador(jugador_4);
    }
}
