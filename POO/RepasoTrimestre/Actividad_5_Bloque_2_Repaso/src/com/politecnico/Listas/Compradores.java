package com.politecnico.Listas;

import com.politecnico.Modelo.Persona;
import com.politecnico.Modelo.Vehiculo;

import java.util.ArrayList;

public class Compradores {
    private ArrayList<Persona> autorizadas;

    public Compradores() {
        autorizadas = new ArrayList<>();
    }

    public ArrayList<Persona> getAutorizadas() {
        return autorizadas;
    }

    public void setAutorizadas(ArrayList<Persona> autorizadas) {
        this.autorizadas = autorizadas;
    }

    public void addAutorizado(Persona persona) {
            autorizadas.add(persona);
    }

    public Persona buscarPersonaById(String idSubasta) {
        Persona personaEncontrada = null;
        boolean encontrado = false;
        int i = 0;
        while (autorizadas.size() > i && !encontrado) {
            if (autorizadas.get(i).getNombre().equals(idSubasta)) {
                personaEncontrada = autorizadas.get(i);
                encontrado = true;
            }
            i++;
        }
        return personaEncontrada;
    }
}
