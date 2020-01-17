package com.politecnico;

import java.io.IOException;

public class Carrera {
    public static void main(String[] args) throws IOException, RankingException {
        InterfazCarreraPilotos interfaz = new InterfazCarreraPilotos();

        interfaz.posicionIncialPilots();
        interfaz.ordenAlfabetico();
        interfaz.adelantarPosiciones();
        interfaz.descalificarPilotos();
        interfaz.fin();




    }


}
