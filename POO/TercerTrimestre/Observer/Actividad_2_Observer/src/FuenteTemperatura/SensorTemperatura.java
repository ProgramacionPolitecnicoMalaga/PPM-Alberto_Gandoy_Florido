package FuenteTemperatura;

import ControlConsumidorTemperaturas.ConsumidorDeTemperaturas;
import Modelo.Temperatura;

import java.util.ArrayList;

public class SensorTemperatura implements FuenteDeTemperaturas {
    private Temperatura temperatura;
    private ArrayList<ConsumidorDeTemperaturas> consumidores;

    public SensorTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
        this.consumidores = new ArrayList<>();
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    public ArrayList<ConsumidorDeTemperaturas> getConsumidores() {
        return consumidores;
    }

    public void setConsumidores(ArrayList<ConsumidorDeTemperaturas> consumidores) {
        this.consumidores = consumidores;
    }

    @Override
    public void registrarConsumidor(ConsumidorDeTemperaturas consumidor) {
        consumidores.add(consumidor);
    }

    @Override
    public void informarAConsumidores() {
        for (ConsumidorDeTemperaturas consumidor : consumidores) {
            consumidor.setNuevaTemperatura(temperatura.getGrado(), temperatura.getHora());
        }
    }
}
