package com.politecnico.Listas;

import com.politecnico.Eventos.Evento;
import com.politecnico.Eventos.ExceptionEvento;
import com.politecnico.Modelo.ExceptionVehiculo;
import com.politecnico.Modelo.Vehiculo;

import java.util.ArrayList;

public class Aparcamiento {
    private ArrayList<Vehiculo> depositados;
    private ArrayList<Vehiculo> subastados;
    private ArrayList<Vehiculo> vendidos;
    private ArrayList<Evento> eventos;
    private Compradores compradores;

    public Aparcamiento(Compradores compradores) {
        depositados = new ArrayList<>();
        subastados = new ArrayList<>();
        vendidos = new ArrayList<>();
        eventos = new ArrayList<>();
        this.compradores = compradores;
    }

    public ArrayList<Vehiculo> getDepositados() {
        return depositados;
    }

    public ArrayList<Vehiculo> getSubastados() {
        return subastados;
    }

    public ArrayList<Vehiculo> getVendidos() {
        return vendidos;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public Compradores getCompradores() {
        return compradores;
    }

    public void addVehiculoEnDeposito(Vehiculo vehiculo) throws ExceptionVehiculo {
        if (depositados.contains(vehiculo)) {
            throw new ExceptionVehiculo("El vehículo: " + vehiculo.getNumeroBastidor() + " ya está en la lista de deposito");
        }else {
            vehiculo.setEstado(true);
            depositados.add(vehiculo);
        }
    }

    public Vehiculo buscarByBastidorDeposito(String bastidor) {
        Vehiculo vehiculoEncontrado = null;
        boolean encontrado = false;
        int i = 0;
        while (depositados.size() > i && !encontrado) {
            if (depositados.get(i).getNumeroBastidor().equals(bastidor)) {
                vehiculoEncontrado = depositados.get(i);
                encontrado = true;
            }
            i++;
        }
        return vehiculoEncontrado;
    }

    public Vehiculo buscarByBastidorSubastado(String bastidor) {
        Vehiculo vehiculoEncontrado = null;
        boolean encontrado = false;
        int i = 0;
        while (subastados.size() > i && !encontrado) {
            if (subastados.get(i).getNumeroBastidor().equals(bastidor)) {
                vehiculoEncontrado = subastados.get(i);
                encontrado = true;
            }
            i++;
        }
        return vehiculoEncontrado;
    }



    public Vehiculo buscarByBastidorVentas(String bastidor) {
        Vehiculo vehiculoEncontrado = null;
        boolean encontrado = false;
        int i = 0;
        while (vendidos.size() > i && !encontrado) {
            if (vendidos.get(i).getNumeroBastidor().equals(bastidor)) {
                vehiculoEncontrado = vendidos.get(i);
                encontrado = true;
            }
            i++;
        }
        return vehiculoEncontrado;
    }

    public void addVehiculoSubastas (Vehiculo vehiculo){
        depositados.remove(vehiculo);
        subastados.add(vehiculo);
    }

    public void addVehiculoVendido(Vehiculo vehiculo) {
        subastados.remove(vehiculo);
        vendidos.add(vehiculo);
    }

    public ArrayList<Vehiculo> getVehiculosVendidos() {
        ArrayList<Vehiculo> res = new ArrayList<>();
        for (Vehiculo vehiculo : vendidos) {
            res.add(vehiculo);
        }
        return res;
    }

    public void addEvento(Evento evento) throws ExceptionEvento {
       /* if (eventos.contains(evento)) {
            throw new ExceptionEvento("El evento ya existe");
        } else eventos.add(evento);*/
       eventos.add(evento);
    }
}
