import java.util.Objects;

public class Aeropuerto {
    private String field, pais, aeropuertoName, iata, ciudad, latitud, longitud;

    public Aeropuerto(String field, String pais, String aeropuertoName, String iata, String ciudad, String latitud, String longitud) {
        this.field = field;
        this.pais = pais;
        this.aeropuertoName = aeropuertoName;
        this.iata = iata;
        this.ciudad = ciudad;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAeropuertoName() {
        return aeropuertoName;
    }

    public void setAeropuertoName(String aeropuertoName) {
        this.aeropuertoName = aeropuertoName;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "pais='" + pais + '\'' +
                ", aeropuertoName='" + aeropuertoName + '\'' +
                ", iata='" + iata + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", latitud='" + latitud + '\'' +
                ", longitud='" + longitud + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aeropuerto that = (Aeropuerto) o;
        return Objects.equals(aeropuertoName, that.aeropuertoName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aeropuertoName);
    }
}
