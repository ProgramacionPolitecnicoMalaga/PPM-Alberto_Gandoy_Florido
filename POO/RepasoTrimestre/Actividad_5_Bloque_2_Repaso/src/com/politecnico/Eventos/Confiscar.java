package com.politecnico.Eventos;

import com.politecnico.Modelo.Vehiculo;

public class Confiscar extends Evento {
    public Confiscar(Vehiculo vehiculo, String fecha) {
        super(vehiculo, fecha);
    }
}
