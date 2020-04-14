package Factory;

import Modelo.Escenario.Escenario;
import Modelo.Jugador.Indiana;
import Modelo.Jugador.Jugador;
import Modelo.Jugador.Patton;
import Modelo.Jugador.UssEnterprise;
import Modelo.Obstaculo.CarceleroTurco;
import Modelo.Obstaculo.NaveKlingon;
import Modelo.Obstaculo.Obstaculo;
import Modelo.Obstaculo.Tanque;
import Modelo.Partida.Partida;
import Modelo.Villano.Khan;
import Modelo.Villano.Molaram;
import Modelo.Villano.Rommel;
import Modelo.Villano.Villano;

public class GestorPartida {

    private static Jugador jugador;
    private static Villano villano;
    private static Obstaculo obstaculo;

    public static Partida generarPartidaSelva() {
        jugador = new Indiana();
        villano = new Molaram();
        obstaculo = new CarceleroTurco();
        String escenario = String.valueOf(Escenario.Selva);
        return new Partida(escenario,jugador.getNombre(),villano.getNombre(),obstaculo.getTipo());
    }


    public static Partida generarPartidaDesierto() {
        jugador = new Patton();
        villano = new Rommel();
        obstaculo = new Tanque();
        String escenario = String.valueOf(Escenario.Desierto);
        return new Partida(escenario,jugador.getNombre(),villano.getNombre(),obstaculo.getTipo());
    }

    public static Partida generarPartidaEspacio() {
        jugador = new UssEnterprise();
        villano = new Khan();
        obstaculo = new NaveKlingon();
        String escenario = String.valueOf(Escenario.Espacio);
        return new Partida(escenario,jugador.getNombre(),villano.getNombre(),obstaculo.getTipo());
    }


}
