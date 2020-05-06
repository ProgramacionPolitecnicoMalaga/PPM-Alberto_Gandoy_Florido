package FuenteTemperatura;

import ControlConsumidorTemperaturas.ConsumidorDeTemperaturas;

public interface FuenteDeTemperaturas {//Publisher
    void registrarConsumidor(ConsumidorDeTemperaturas consumidor);
    public void informarAConsumidores();//ACTUALIZA
}
