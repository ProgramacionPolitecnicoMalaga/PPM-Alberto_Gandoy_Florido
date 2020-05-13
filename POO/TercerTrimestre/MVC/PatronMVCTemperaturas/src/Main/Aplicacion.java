package Main;

import Controlador.Controlador;
import Modelo.Temperaturas;

public class Aplicacion {
    public static void main(String[] args) {
         Controlador controlador = new Controlador(new Temperaturas());


    }
}
