package FactoryAbstract;

import VideoJuego.General.Jugador;
import VideoJuego.General.Obstaculo;
import VideoJuego.General.Villano;
import VideoJuego.Obstacles.NavesKlingon;
import VideoJuego.Players.UssEnterprise;
import VideoJuego.Villains.Khan;


public class EspacioFactory implements EscenarioFactory {
    @Override
    public Jugador crearJugador() {
        return new UssEnterprise();
    }

    @Override
    public Villano crearVillano() {
        return new Khan();
    }

    @Override
    public Obstaculo crearObstaculo() {
        return new NavesKlingon();
    }
}
