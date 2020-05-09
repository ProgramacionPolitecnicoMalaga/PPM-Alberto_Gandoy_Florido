package Main;

import FactoryAbstract.SelectorJuego;
import VideoJuego.General.ElegiEscenario;
import VideoJuego.General.Jugador;
import VideoJuego.General.Obstaculo;
import VideoJuego.General.Villano;

public class Demo {
    public static void main(String[] args) {
        SelectorJuego.inciarJuego(ElegiEscenario.DESIERTO);
        Jugador jugador = SelectorJuego.escenario.crearJugador();
        Villano villano = SelectorJuego.escenario.crearVillano();
        Obstaculo obstaculo = SelectorJuego.escenario.crearObstaculo();

        System.out.println("El jugador: " + jugador.getTipoDeJugador() + "\n" +
                "El villano: " + villano.getTipoDeVillano() + "\n" +
                "El obstáculo: " + obstaculo.getTipoDeObstaculo());
    }
}
