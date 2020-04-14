package Modelo.Obstaculo;

import java.util.Objects;

public abstract class Obstaculo {
    private String tipo;

    public Obstaculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Obstaculo{" +
                "tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obstaculo obstaculo = (Obstaculo) o;
        return Objects.equals(tipo, obstaculo.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo);
    }
}
