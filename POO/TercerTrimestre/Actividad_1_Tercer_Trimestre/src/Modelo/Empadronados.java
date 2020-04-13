package Modelo;

import java.util.ArrayList;

public class Empadronados {
    private ArrayList<Empadronado> empadronados;

    public Empadronados() {
        this.empadronados = new ArrayList<>();
    }

    public ArrayList<Empadronado> getEmpadronados() {
        return empadronados;
    }

    public void setEmpadronados(ArrayList<Empadronado> empadronados) {
        this.empadronados = empadronados;
    }

    public void agregarEmpadronado(Empadronado empadronado) {
        empadronados.add(empadronado);
    }

    public void mostrarEmpadronados() {
        for (Empadronado empadronado : empadronados)
            System.out.println(empadronado);
    }

    @Override
    public String toString() {
        return "Empadronados{" +
                "empadronados=" + empadronados +
                '}';
    }
}
