package ControlConsumidorTemperaturas;

import Modelo.Temperatura;

import java.util.ArrayList;

public class Diario implements ConsumidorDeTemperaturas {
    private ArrayList<Temperatura> temperaturas;

    public ArrayList<Temperatura> getTemperaturas() {
       return temperaturas;
    }

    @Override
    public void setNuevaTemperatura(double temperatura, String hora) {
        temperaturas = new ArrayList<>();
        temperaturas.add(new Temperatura(temperatura, hora));
    }

    @Override
    public String toString() {
        return "Diario{" +
                "temperaturas=" + temperaturas +
                '}';
    }
}
