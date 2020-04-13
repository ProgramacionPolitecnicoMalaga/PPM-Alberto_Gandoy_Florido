package Modelo;

public class Empadronado {
    private String anyo, nacionalidad, numeroDeEmpadronados;

    public Empadronado() {
    }

    public Empadronado(String anyo, String nacionalidad, String numeroDeEmpadronados) {
        this.anyo = anyo;
        this.nacionalidad = nacionalidad;
        this.numeroDeEmpadronados = numeroDeEmpadronados;
    }

    public String getAnyo() {
        return anyo;
    }

    public void setAnyo(String anyo) {
        this.anyo = anyo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNumeroDeEmpadronados() {
        return numeroDeEmpadronados;
    }

    public void setNumeroDeEmpadronados(String numeroDeEmpadronados) {
        this.numeroDeEmpadronados = numeroDeEmpadronados;
    }

    @Override
    public String toString() {
        return "Empadronado{" +
                "anyo='" + anyo + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", numeroDeEmpadronados='" + numeroDeEmpadronados + '\'' +
                '}';
    }
}