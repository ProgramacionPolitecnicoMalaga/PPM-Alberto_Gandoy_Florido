package Proyecto;

import Modelo.Concesionario;

import java.util.Objects;

public class CompraVenta {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private double precio;
    private String tipo;

    public CompraVenta(Cliente cliente, Vehiculo vehiculo, double precio, String tipo) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.precio = precio;
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "OperacionCorporativa{" +
                "clientes=" + cliente +
                ", vehiculos=" + vehiculo +
                ", precio=" + precio +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompraVenta that = (CompraVenta) o;
        return Objects.equals(tipo, that.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo);
    }
}
