package ControlConsumidorTemperaturas;

import Modelo.Temperatura;

import java.util.ArrayList;

public class Promedio implements ConsumidorDeTemperaturas {
    private ArrayList<Temperatura> promediosTemperaturas;

    public Promedio() {
        promediosTemperaturas = new ArrayList<>();
    }

    public double calcularPromedio() {
        double resultadoPromedio = 0;
        for (Temperatura temperatura : promediosTemperaturas) {
            resultadoPromedio += temperatura.getGrado();
        }
        return resultadoPromedio / promediosTemperaturas.size();
    }

    @Override
    public void setNuevaTemperatura(double temperatura, String hora) {
        temperatura = calcularPromedio();
        promediosTemperaturas.add(new Temperatura(temperatura, hora));
    }

    @Override
    public String toString() {
        return "Promedio{" +
                "promediosTemperaturas=" + promediosTemperaturas +
                '}';
    }
}
