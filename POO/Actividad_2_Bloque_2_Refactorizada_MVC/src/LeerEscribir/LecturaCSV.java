package LeerEscribir;

import proyecto.Comerciales;
import proyecto.VentaMensual;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class LecturaCSV  implements Lector {

    BufferedReader bufferedReader = null;

    public LecturaCSV() throws IOException {
       // bufferedReader = new BufferedReader(new FileReader(archivo));
    }

    @Override
    public Comerciales lecturaComerciales(Comerciales comerciales) {
        return null;
    }

    @Override
    public VentaMensual lecturaVentas(VentaMensual ventaMensual) {
        return null;
    }
/*
    public void leer(Ciudades listaCiudades){
        String linea = null;
        try {
            linea = bufferedReader.readLine();
            while (null != linea) {
                String[] lineasCSV = linea.split(";");
                Plato p = new Plato(lineasCSV[0], lineasCSV[1]);
                Ciudad c = new Ciudad(lineasCSV[2]);

                if(listaCiudades.listaCiudades.contains(c)){
                    int pos = listaCiudades.listaCiudades.indexOf(c);
                    listaCiudades.listaCiudades.get(pos).añadirPlatos(p);
                }else{
                    c.añadirPlatos(p);
                    listaCiudades.añadirCiudad(c);
                }

                linea = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }*/



}
