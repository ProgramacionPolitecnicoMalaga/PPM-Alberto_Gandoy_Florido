package Proyecto;

import Modelo.Concesionario;

public class Venta extends Operacion {

    public Venta() {
    }

    public Venta(Cliente cliente, Vehiculo vehiculo, double precio) {
        super(cliente, vehiculo, precio);
    }

    @Override
    public void Operar(Object comprador, double cantidad) {
        ((Concesionario)comprador).recibirPago(cantidad);
        getCliente().pagar(cantidad);
    }
}
