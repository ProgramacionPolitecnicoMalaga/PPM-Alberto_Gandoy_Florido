package FactoryAbstract;

import VideoJuego.General.Jugador;
import VideoJuego.General.Obstaculo;
import VideoJuego.General.Villano;

public interface EscenarioFactory {
    Jugador crearJugador();
    Villano crearVillano();
    Obstaculo crearObstaculo();
}
