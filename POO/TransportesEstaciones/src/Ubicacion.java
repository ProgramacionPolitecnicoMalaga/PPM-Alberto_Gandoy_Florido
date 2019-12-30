public class Ubicacion {
    private double latitud, longitud;

    public Ubicacion(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    @Override
    public String toString() {
        return
                "\n" + "Latitud: " + latitud + "\n" +
                "Longitud: " + longitud;
    }
}
