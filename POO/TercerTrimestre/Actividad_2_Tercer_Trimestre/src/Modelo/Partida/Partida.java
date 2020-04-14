package Modelo.Partida;

import Modelo.Escenario.Escenario;
import Modelo.Jugador.Jugador;
import Modelo.Obstaculo.Obstaculo;
import Modelo.Villano.Villano;

public class Partida {
    private String escenario;
    private String jugador;
    private String villano;
    private String obstaculo;

    public Partida(String escenario, String jugador, String villano, String obstaculo) {
        this.escenario = escenario;
        this.jugador = jugador;
        this.villano = villano;
        this.obstaculo = obstaculo;
    }

    public String getEscenario() {
        return escenario;
    }

    public void setEscenario(String escenario) {
        this.escenario = escenario;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public String getVillano() {
        return villano;
    }

    public void setVillano(String villano) {
        this.villano = villano;
    }

    public String getObstaculo() {
        return obstaculo;
    }

    public void setObstaculo(String obstaculo) {
        this.obstaculo = obstaculo;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "escenario='" + escenario + '\'' +
                ", jugador='" + jugador + '\'' +
                ", villano='" + villano + '\'' +
                ", obstaculo='" + obstaculo + '\'' +
                '}';
    }
}
