import java.util.ArrayList;

public interface OperacionesSobreXML {
    public void aeropuertoXML(ArrayList<Pais> paises, ArrayList<Aeropuerto> aeropuertos);
    public void aerolineaXML(ArrayList<Pais> paises, ArrayList<Aerolinea> aerolineas);
    public void xmlToCsvAeropuerto(String nombreFichero);
    public void xmlToCsvAerolinea(String nombreFichero);
}
