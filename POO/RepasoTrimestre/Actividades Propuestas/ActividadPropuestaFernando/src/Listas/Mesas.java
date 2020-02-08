package Listas;

import Excepciones.ExceptionMesa;
import ModeloNegocio.Mesa;

import java.util.ArrayList;

public class Mesas {
    private ArrayList<Mesa> abiertas;
    private ArrayList<Mesa> cerradas;

    public Mesas() {
        abiertas = new ArrayList<>();
        cerradas = new ArrayList<>();
    }

    public ArrayList<Mesa> getAbiertas() {
        return abiertas;
    }

    public void setAbiertas(ArrayList<Mesa> abiertas) {
        this.abiertas = abiertas;
    }

    public ArrayList<Mesa> getCerradas() {
        return cerradas;
    }

    public void setCerradas(ArrayList<Mesa> cerradas) {
        this.cerradas = cerradas;
    }

    public void abrirMesa(Mesa mesa) {
        if (abiertas.contains(mesa)) {
            try {
                throw new ExceptionMesa("La mesa " + mesa.getId() + " ya está abierta.");
            } catch (ExceptionMesa exceptionMesa) {
                exceptionMesa.printStackTrace();
            }
        } else if (mesa.isEstado() == false) {
            mesa.setEstado(true);
            abiertas.add(mesa);
        }
    }

    public void cerrarMesa(Mesa mesa) {
        if (cerradas.contains(mesa)) {
            try {
                throw new ExceptionMesa("La mesa " + mesa.getId() + " ya está cerrada.");
            } catch (ExceptionMesa exceptionMesa) {
                exceptionMesa.printStackTrace();
            }
        } else  {
            mesa.setEstado(false);
            cerradas.add(mesa);
        }
    }

    @Override
    public String toString() {
        return "Mesas{" +
                "abiertas=" + abiertas +
                ", cerradas=" + cerradas +
                '}';
    }
}
