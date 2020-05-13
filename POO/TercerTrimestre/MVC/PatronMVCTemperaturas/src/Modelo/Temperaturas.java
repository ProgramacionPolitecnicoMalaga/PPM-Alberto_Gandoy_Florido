package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Temperaturas implements Consumidor {
    private List<Double> listaDeTemperaturas;
    private List<Fuente> fuenteDeTemperaturas;

    public Temperaturas() {
        this.listaDeTemperaturas = new ArrayList<>();
        this.fuenteDeTemperaturas = new ArrayList<>();
    }

    public List<Double> getListaDeTemperaturas() {
        return listaDeTemperaturas;
    }

    @Override
    public void addConsumidor(Fuente fuente) {
        if (fuente != null)
            fuenteDeTemperaturas.add(fuente);
        else throw new IllegalArgumentException("La fuente de temperaturas en nula.");
    }

    @Override
    public void notificar() {
        for (Fuente fuente : fuenteDeTemperaturas)
            fuente.setListadoTemperaturas(listaDeTemperaturas);
    }

    public void addTemperatura(double temperatura) {
        listaDeTemperaturas.add(temperatura);
    }

}
