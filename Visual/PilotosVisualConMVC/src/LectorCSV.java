import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorCSV {
    private BufferedReader br = null;

    public LectorCSV() throws FileNotFoundException {
        br = new BufferedReader(new FileReader("piloto.csv"));
    }

    public void cargarCSV(ArrayList<Piloto> pilotos) throws IOException {
        String linea = br.readLine();

        while (null != linea) {
            String[] lineasCSV = linea.split(";");
            linea = br.readLine();
            pilotos.add(new Piloto(lineasCSV[1], lineasCSV[2], Integer.parseInt(lineasCSV[0])));
        }
    }


    /*public Pilotos findPilotos(String nombrePiloto) {
        Pilotos pilotos = new Pilotos();
        for (int i = 0; i < pilotos.getPilotos().size(); i++) {
            if (pilotos.getPilotos().get(i).getNombre().contains(nombrePiloto)) {
                pilotos.añadirPiloto(pilotos.getPilotos().get(i));
            }
        }
        return pilotos;
    }*/
}
