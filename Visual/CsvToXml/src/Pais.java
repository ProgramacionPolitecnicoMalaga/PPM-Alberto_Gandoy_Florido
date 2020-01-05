import java.util.ArrayList;

public class Pais {
    private String name;
    private ArrayList<Aeropuerto> aeropuertos;
    private ArrayList<Aerolinea> aerolineas;

    public Pais(String name) {
        this.name = name;
        aeropuertos = new ArrayList<>();
        aerolineas = new ArrayList<>();
    }

    public Pais() {
        aeropuertos = new ArrayList<>();
        aerolineas = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Aeropuerto> getAeropuertos() {
        return aeropuertos;
    }


    public ArrayList<Aerolinea> getAerolineas() {
        return aerolineas;
    }

    public void añadirAeropuerto(Aeropuerto aeropuerto) {
        aeropuertos.add(aeropuerto);
    }

    public void mostrarAeropuerto() {
        for (Aeropuerto aeropuerto : aeropuertos) {
            System.out.println(aeropuerto);
        }
    }

    public void añadirAerolinea(Aerolinea aerolinea) {
        aerolineas.add(aerolinea);
    }

    public void mostrarAerolinea() {
        for (Aerolinea aerolinea : aerolineas) {
            System.out.println(aerolinea);
        }
    }
    @Override
    public String toString() {
        return "Pais{" +
                "name='" + name + '\'' +
                ", aeropuertos=" + aeropuertos +
                ", aerolineas=" + aerolineas +
                '}';
    }
}
