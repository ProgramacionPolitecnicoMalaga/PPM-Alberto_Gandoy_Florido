package FactoryAbstract;

import VideoJuego.General.Jugador;
import VideoJuego.General.Obstaculo;
import VideoJuego.General.Villano;
import VideoJuego.Obstacles.Tanques;
import VideoJuego.Players.PattonPlayer;
import VideoJuego.Villains.Rommel;

public class DesiertoFactory implements EscenarioFactory {
    @Override
    public Jugador crearJugador() {
        return new PattonPlayer();
    }

    @Override
    public Villano crearVillano() {
        return new Rommel();
    }

    @Override
    public Obstaculo crearObstaculo() {
        return new Tanques();
    }
}
