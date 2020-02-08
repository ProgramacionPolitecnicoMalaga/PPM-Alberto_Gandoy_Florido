package SwingUI;

import Modelo.Cafeteria;
import Negocio.Mesa;
import Negocio.Producto;

import java.util.ArrayList;

public class GestorControlador {
    private Vista vista;
    private Cafeteria cafeteria;

    public GestorControlador(Vista vista, Cafeteria cafeteria) {
        this.vista = vista;
        this.cafeteria = cafeteria;
    }

    public void addMesaAbierta() {
      String id = vista.getTxtIdMesa();
      Mesa mesa = new Mesa(id);
      cafeteria.addAbiertas(mesa);
      vista.addBoxAbiertas(mesa);
      vista.mostrarMensaje("Mesa " + mesa.getId() + " está abierta.");
    }

    public void addProducto() {
        String nombre = vista.getTxtNombreProducto();
        double precio = Double.parseDouble(vista.getTxtPrecioProducto());
        Producto producto = new Producto(nombre,precio);
        Mesa mesa = cafeteria.buscarAbiertas(vista.getBoxAbiertas());
        mesa.addProducto(producto);
        vista.mostrarMensaje("El producto se ha añadido correctamente a la mesa");
    }

    public void mostrarAbiertas() {
        Mesa mesa = cafeteria.buscarAbiertas(vista.getBoxAbiertas());
        vista.mostrarDatosSt(mesa);
    }

    public void recuentoMesas() {
        ArrayList<Double> re = cafeteria.recuento(cafeteria.getAbiertas());
        vista.mostrarMensaje("El recuento total de todas las mesas es de"+re+"€");
    }

    public void cobrar() {
        Mesa mesa = cafeteria.buscarAbiertas(vista.getBoxAbiertas());
        cafeteria.cerrarYcobrar(mesa);
        vista.removeBoxAbiertas(mesa);
        vista.mostrarMensaje("La mesa " + mesa.getId() + " cobrada y cerrada");
    }

}
