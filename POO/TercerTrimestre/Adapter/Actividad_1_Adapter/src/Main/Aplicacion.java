package Main;

import Modelo.Persona;
import SwingGUI.Adapter.AdaptadorModel;
import SwingGUI.Controlador.Controlador;
import SwingGUI.VistaUsuario.Vista;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Aplicacion {
    public static void main(String[] args) {
        List<Persona> listaPersonas = crearLista();
        Vista vista = new Vista(new AdaptadorModel(listaPersonas).getPersonas());
        ActionListener controlador = new Controlador(vista);
        vista.setActionListenerControlador(controlador);
        vista.iniciarVista();
    }

    private static List<Persona> crearLista() {
        List<Persona> lista = new ArrayList<Persona>(){
            @Override
            public String toString() {
                String resultado = "\n-----------------------------------";
                resultado += "\nEstado de la lista";
                for (Persona persona: this)
                    resultado += "\n" + persona.toString();
                return resultado;
            }
        };

        lista.add(new Persona("Lourdes" ,"Florido Rosas",60));
        lista.add(new Persona("Lourdes" ,"Gandoy Florido" ,28));
        lista.add(new Persona("Alberto" ,"Gandoy Florido",22));
        return lista;
    }

}
