package Modelo;

public class Empadronado {
    private String annyo, nacionalidad, numeroempadronados;

    public Empadronado(String annyo, String nacionalidad, String numeroempadronados) {
        this.annyo = annyo;
        this.nacionalidad = nacionalidad;
        this.numeroempadronados = numeroempadronados;
    }

    public String getAnnyo() {
        return annyo;
    }

    public void setAnnyo(String annyo) {
        this.annyo = annyo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNumeroempadronados() {
        return numeroempadronados;
    }

    public void setNumeroempadronados(String numeroempadronados) {
        this.numeroempadronados = numeroempadronados;
    }

    @Override
    public String toString() {
        return "Empadronado{" +
                "annyo='" + annyo + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", numeroempadronados='" + numeroempadronados + '\'' +
                '}';
    }
}

