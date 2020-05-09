package FactoryAbstract;

import VideoJuego.General.Jugador;
import VideoJuego.General.Obstaculo;
import VideoJuego.General.Villano;
import VideoJuego.Obstacles.CarceleroTurco;
import VideoJuego.Players.IndianaPlayer;
import VideoJuego.Villains.Molaram;

public class SelvaFactory implements EscenarioFactory {
    @Override
    public Jugador crearJugador() {
        return new IndianaPlayer();
    }

    @Override
    public Villano crearVillano() {
        return new Molaram();
    }

    @Override
    public Obstaculo crearObstaculo() {
        return new CarceleroTurco();
    }
}
