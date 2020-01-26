package com.politecnico.Main;

import com.politecnico.VC.Controlador;
import com.politecnico.VC.Vista;
import com.politecnico.Modelo.*;
import com.politecnico.Listas.*;

import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) throws ExceptionVehiculo {
        Compradores compradores = new Compradores();
        Aparcamiento aparcamiento = new Aparcamiento(compradores);
        Vista vista = new Vista();
        ActionListener actionListenerCtr = new Controlador(vista,aparcamiento);
        vista.setControlador(actionListenerCtr);
        vista.init();

    }
}
