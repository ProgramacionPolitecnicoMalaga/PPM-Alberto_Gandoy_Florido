package VC;

import Gestores.GestorControlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private GestorControlador gestorControlador;

    public Controlador(GestorControlador gestorControlador) {
        this.gestorControlador = gestorControlador;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("AñadirCliente")) {
            gestorControlador.añadirCliente();
        } else if (e.getActionCommand().equals("nuevaVentana")) {
            gestorControlador.abrirNuevoMenu();
        }

    }
}
