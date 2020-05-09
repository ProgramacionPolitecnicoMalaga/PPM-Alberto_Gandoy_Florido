package FactoryAbstract;

import VideoJuego.General.ElegiEscenario;
import VideoJuego.General.Jugador;
import VideoJuego.General.Obstaculo;
import VideoJuego.General.Villano;

public class SelectorJuego {
    public static EscenarioFactory escenario;

    public static void inciarJuego(ElegiEscenario eleccion) {
        if (eleccion == ElegiEscenario.SELVA)
            escenario = new SelvaFactory();
        else if (eleccion == ElegiEscenario.DESIERTO)
            escenario = new SelvaFactory();
        else if (eleccion == ElegiEscenario.ESPACIO)
            escenario = new EspacioFactory();
        else throw new IllegalArgumentException("No has elegido un escenario valido.");
    }
}
