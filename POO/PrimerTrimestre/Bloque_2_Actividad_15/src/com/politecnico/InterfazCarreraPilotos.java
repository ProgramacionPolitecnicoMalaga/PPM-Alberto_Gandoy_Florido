package com.politecnico;

import java.io.IOException;
import java.util.Random;

public class InterfazCarreraPilotos {

    RakingPilotos rakingPilotos = new RakingPilotos();

    Piloto p1 = new Piloto("Hamilton L.","Mercedes",4,false);
    Piloto p2 = new Piloto("Magnussen K.", "Haas",10,false);
    Piloto p3 = new Piloto("Albon A.", "Red Bull",6,true);
    Piloto p4 = new Piloto("Grosjean R.", "Haas",15,true);

    public InterfazCarreraPilotos() throws IOException {}


    public void posicionIncialPilots() {
        System.out.println("=====================Esto es una carrera de F1=====================\n" +
                "Los pilotos que particiopan son:\n" +
                "==============================================================================\n" +
                rakingPilotos.listaPilotos + "\n");
    }

    public void ordenAlfabetico(){
        System.out.println("======================ORDEN ALFABÉTICO======================\n");
        rakingPilotos.ordenarPilotoPorNombre();
        System.out.println(rakingPilotos.listaPilotos);
    }

    public void adelantarPosiciones(){
        System.out.println("Hamilton se pone en la tercera posición: ");
        rakingPilotos.adelantarPiloto(p1);
        System.out.println("Magnussen hasta la novena posición: ");
        rakingPilotos.adelantarPiloto(p2);
        System.out.println(rakingPilotos.listaPilotos);
    }

    public void descalificarPilotos(){
        System.out.println("Los pilotos Albon y Gosjean son descalificados: ");
        rakingPilotos.eliminarPilotos(p3);
        rakingPilotos.eliminarPilotos(p4);
        System.out.println(rakingPilotos.listaPilotos);
    }

    public void fin(){
        rakingPilotos.eliminarPilotos(p3);
        rakingPilotos.eliminarPilotos(p4);
        System.out.println(rakingPilotos.listaPilotos);
    }

}
