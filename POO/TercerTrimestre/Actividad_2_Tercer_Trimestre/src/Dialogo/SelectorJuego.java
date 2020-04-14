package Dialogo;

import Factory.FactoryEscenario;
import Modelo.Partida.Partida;

import java.util.Scanner;

public class SelectorJuego {
    private static Scanner sc;

    public SelectorJuego() {
        sc = new Scanner(System.in);
    }

    public static Partida elegirEscenario() throws Exception {
        System.out.println("Elige un escenario: " +
                "\n"+"1.Selva"+"\n"+"2.Desierto"+"\n"+"3.Espacio"+"\n"+
                "('Tienes que escribir una de las tres opciones')");
        String escenario = sc.nextLine();
        return FactoryEscenario.escenarioFactory(escenario);
    }
}
