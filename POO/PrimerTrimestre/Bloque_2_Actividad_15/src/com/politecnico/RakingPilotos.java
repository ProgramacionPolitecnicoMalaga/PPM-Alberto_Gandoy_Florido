package com.politecnico;

import java.io.*;
import java.util.*;

public class RakingPilotos {

    ArrayList listaPilotos = new ArrayList<Piloto>();
    BufferedReader bufferedReader = null;

    public RakingPilotos() throws IOException {

        try {
            bufferedReader = new BufferedReader(new FileReader("piloto.csv"));
            String linea = bufferedReader.readLine();

            while (null != linea) {
                String[] lineasCSV = linea.split(";");
                linea = bufferedReader.readLine();
                Piloto piloto = new Piloto(lineasCSV[1], lineasCSV[2], Integer.parseInt(lineasCSV[0]));
                añadirPiloto(piloto, piloto.getPosicionDeSalida());
            }
        } catch (FileNotFoundException | RankingException e) {
            e.printStackTrace();
        }
    }


    public void añadirPiloto(Piloto piloto, int posicion) throws RankingException {
        if(listaPilotos.contains(piloto)){
            throw new RankingException("Ya hay un piloto igual en la parrilla");
        }else{
            listaPilotos.add(piloto);
        }

    }

    public void adelantarPiloto(Piloto piloto) {
        listaPilotos.set(piloto.getPosicionDeSalida() - 2, piloto);
    }

    public void retrasarPiloto(Piloto piloto) {
        listaPilotos.set(piloto.getPosicionDeSalida() + 2, piloto);
    }

    public void eliminarPilotos(Piloto piloto) {
        if (piloto.isDescalificado() == true){
        listaPilotos.remove(piloto);
        }
    }

    public void ordenarPilotoPorNombre() {
        Collections.sort(listaPilotos);
        }


}

