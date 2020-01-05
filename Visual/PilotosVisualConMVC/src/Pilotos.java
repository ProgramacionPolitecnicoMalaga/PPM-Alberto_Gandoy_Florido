import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Pilotos {
    private ArrayList<Piloto> pilotos;
    private LectorCSV lectorCSV;

    public Pilotos() throws FileNotFoundException {
        pilotos = new ArrayList<>();
        this.lectorCSV = new LectorCSV();
    }

    public ArrayList<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(ArrayList<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public LectorCSV getLectorCSV() {
        return lectorCSV;
    }

    public void añadirPiloto(Piloto piloto) {
        pilotos.add(piloto);
    }

    public void mostrarPilotos() {
        for (Piloto piloto : pilotos) {
            System.out.println(piloto);
        }
    }

    public Piloto buscarPiloto(String nombrePiloto) {
        Piloto pilotoEncontrado = null;
        boolean encontrado = false;
        int i = 0;
        while (pilotos.size() > i && !encontrado) {
            if (pilotos.get(i).getNombre().equals(nombrePiloto)) {
                pilotoEncontrado = pilotos.get(i);
                encontrado = true;
            }
            i++;
        }
        return pilotoEncontrado;
    }

    @Override
    public String toString() {
        return "Pilotos{" +
                "pilotos=" + pilotos +
                '}';
    }

}
