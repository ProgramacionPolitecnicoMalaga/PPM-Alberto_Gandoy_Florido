package com.politecnico.Eventos;

import com.politecnico.Modelo.Vehiculo;

public class Subasta extends Evento{
    public Subasta(Vehiculo vehiculo, String fecha) {
        super(vehiculo, fecha);
    }
}
