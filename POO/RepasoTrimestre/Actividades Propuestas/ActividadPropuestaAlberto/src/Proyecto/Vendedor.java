package Proyecto;

public interface Vendedor {
     void realizarPago(double cantidad);
     void recibirPago(double cantidad);
     void realizarCompra(Cliente cliente, Object objeto, double cantidad);
     void realizarVenta(Cliente cliente, Object objeto, double cantidad);
}
