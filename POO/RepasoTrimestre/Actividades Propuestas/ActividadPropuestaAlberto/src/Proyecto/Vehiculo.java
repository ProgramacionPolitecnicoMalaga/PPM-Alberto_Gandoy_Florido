package Proyecto;

import java.util.Date;

public class Vehiculo {
    private String modelo, marca, color, combustion, estado, matricula;
    private Date fechaFabricacion;
    private double precio;

    public Vehiculo(String modelo, String marca, String color, String combustion, String estado, String matricula ,Date fechaFabricacion, double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.combustion = combustion;
        this.estado = estado;
        this.matricula = matricula;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
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

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Proyecto.Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", combustion='" + combustion + '\'' +
                ", estado='" + estado + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", precio=" + precio +
                '}';
    }
}
