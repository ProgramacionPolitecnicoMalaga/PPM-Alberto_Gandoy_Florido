import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LecturaCSV {

    public ArrayList<Aeropuerto> aeropuertosCSV(String airportscsv) {

        Pais pais = new Pais();

        try {
            BufferedReader br = new BufferedReader(new FileReader(airportscsv));
            String line = br.readLine();
            while (null!= line){
                String[] fields = line.split(",");
                Aeropuerto aeropuerto = new Aeropuerto(fields[3], fields[1], fields[4], fields[4], fields[2], fields[6], fields[7]);
                pais.añadirAeropuerto(aeropuerto);
        }
    } catch (IOException e) {
            e.printStackTrace();
        }
        return pais.getAeropuertos();
    }

    public ArrayList<Pais> paisesAirportCSV(String airportscsv) {

        Paises paises = new Paises();

        try {
            BufferedReader br = new BufferedReader(new FileReader(airportscsv));
            String line = br.readLine();
            while (null != line) {
                String[] fields = line.split(",");
                Pais pais = new Pais(fields[3]);
                paises.añadirPais(pais);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return paises.getPaises();
    }


    public ArrayList<Aerolinea> aerolineasCSV(String airlinescsv) {
        Pais pais = new Pais();

        try{
            BufferedReader br = new BufferedReader(new FileReader(airlinescsv));
            String line = br.readLine();
            while (null!= line){
                String[] fields = line.split(",");
                Aerolinea aerolinea = new Aerolinea(fields[0], fields[1], fields[4], fields[5], fields[6]);
                pais.añadirAerolinea(aerolinea);
    }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pais.getAerolineas();
    }


        public ArrayList<Pais> paisesAirlineCSV(String airlinescsv) {

        Paises paises = new Paises();

        try {
            BufferedReader br = new BufferedReader(new FileReader(airlinescsv));
            String line = br.readLine();
            while (null != line) {
                String[] fields = line.split(",");
                Pais pais = new Pais(fields[3]);
                paises.añadirPais(pais);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return paises.getPaises();
    }
}