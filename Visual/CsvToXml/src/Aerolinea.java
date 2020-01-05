import java.util.Objects;

public class Aerolinea {
    private String pais ,id, nombre, iata, codigoLlamada;

    public Aerolinea(String pais, String id, String nombre, String iata, String codigoLlamada) {
        this.pais = pais;
        this.id = id;
        this.nombre = nombre;
        this.iata = iata;
        this.codigoLlamada = codigoLlamada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getCodigoLlamada() {
        return codigoLlamada;
    }

    public void setCodigoLlamada(String codigoLlamada) {
        this.codigoLlamada = codigoLlamada;
    }

    @Override
    public String toString() {
        return "Aerolinea{" +
                "pais='" + pais + '\'' +
                ", id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", iata='" + iata + '\'' +
                ", codigoLlamada='" + codigoLlamada + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aerolinea aerolinea = (Aerolinea) o;
        return Objects.equals(id, aerolinea.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
