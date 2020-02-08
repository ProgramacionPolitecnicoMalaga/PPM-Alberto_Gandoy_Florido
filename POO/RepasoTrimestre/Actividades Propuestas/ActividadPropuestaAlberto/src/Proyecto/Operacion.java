package Proyecto;

public abstract class Operacion {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private double precio;

    public Operacion() {
    }

    public Operacion(Cliente cliente, Vehiculo vehiculo, double precio) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.precio = precio;
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

    public abstract void Operar(Object comprador, double cantidad);

    @Override
    public String toString() {
        return "Operacion{" +
                "cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                ", precio=" + precio +
                '}';
    }
}
