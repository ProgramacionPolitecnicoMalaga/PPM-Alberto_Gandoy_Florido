package Modelo;

public class Temperatura {
    private double grado;
    private String hora;

    public Temperatura() {
    }

    public Temperatura(double grado, String hora) {
        this.grado = grado;
        this.hora = hora;
    }

    public double getGrado() {
        return grado;
    }

    public void setGrado(double grado) {
        this.grado = grado;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return grado  + "ºC " + hora;
    }
}
