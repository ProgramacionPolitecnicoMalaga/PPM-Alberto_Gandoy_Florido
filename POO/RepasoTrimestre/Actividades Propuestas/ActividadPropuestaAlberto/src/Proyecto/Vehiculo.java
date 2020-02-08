package Proyecto;

import java.util.Objects;

public class Vehiculo {
    private String modelo, marca, color, combustion, estado, matricula;

    public Vehiculo(String modelo, String marca, String color, String combustion, String estado, String matricula) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.combustion = combustion;
        this.estado = estado;
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombustion() {
        return combustion;
    }

    public void setCombustion(String combustion) {
        this.combustion = combustion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", combustion='" + combustion + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(matricula, vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
