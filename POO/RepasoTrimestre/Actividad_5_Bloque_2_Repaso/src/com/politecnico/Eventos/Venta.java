package com.politecnico.Eventos;

import com.politecnico.Modelo.Persona;
import com.politecnico.Modelo.Vehiculo;

public class Venta extends Evento{
    private Persona persona;
    private String precio;

    public Venta(Vehiculo vehiculo, String fecha, String precio, Persona persona) {
        super(vehiculo, fecha);
        this.persona = persona;
        this.precio = precio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "persona=" + persona +
                ", precio=" + precio +
                '}';
    }
}
