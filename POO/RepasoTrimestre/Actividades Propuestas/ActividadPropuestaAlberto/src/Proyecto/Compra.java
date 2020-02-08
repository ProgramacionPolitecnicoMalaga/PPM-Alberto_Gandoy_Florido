package Proyecto;

import Modelo.Concesionario;

public class Compra extends Operacion {

    public Compra() {
    }

    public Compra(Cliente cliente, Vehiculo vehiculo, double precio) {
        super(cliente, vehiculo, precio);
    }

    @Override
    public void Operar(Object comprador, double cantidad) {
        ((Concesionario)comprador).realizarPago(cantidad);
        getCliente().cobrar(cantidad);
    }
}
