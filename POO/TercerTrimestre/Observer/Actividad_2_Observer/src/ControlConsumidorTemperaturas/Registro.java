package ControlConsumidorTemperaturas;

import Modelo.Temperatura;

import java.util.ArrayList;
import java.util.Random;

public class Registro implements ConsumidorDeTemperaturas {
    private ArrayList<Temperatura> registrosMaximasTemperaturas;

    public Registro() {
        registrosMaximasTemperaturas = new ArrayList<>();
    }

    public ArrayList<Temperatura> getRegistrosMaximasTemperaturas() {
        return registrosMaximasTemperaturas;
    }

    public void setRegistrosMaximasTemperaturas(ArrayList<Temperatura> registrosMaximasTemperaturas) {
        this.registrosMaximasTemperaturas = registrosMaximasTemperaturas;
    }

    @Override
    public void setNuevaTemperatura(double temperatura, String hora) {
        Random aleatorio = new Random();
        if (temperatura > aleatorio.nextDouble())
            registrosMaximasTemperaturas.add(new Temperatura(temperatura, hora));
        else
            System.out.println("La temperatura máxima registrada hasta el momento es de: "
                    + aleatorio.nextDouble() + " ºC");
    }

    @Override
    public String toString() {
        return "Registro{" +
                "registrosMaximasTemperaturas=" + registrosMaximasTemperaturas +
                '}';
    }
}
