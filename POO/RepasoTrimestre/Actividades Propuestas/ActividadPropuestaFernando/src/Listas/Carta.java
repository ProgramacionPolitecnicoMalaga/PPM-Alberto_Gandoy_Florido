package Listas;

import ModeloNegocio.Producto;

import java.util.ArrayList;

public class Carta {
    private ArrayList<Producto> productos;

    public Carta() {
        productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void addProducto(Producto producto) {
        productos.add(producto);
    }

    public void printProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    @Override
    public String toString() {
        return "Carta{" +
                "productos=" + productos +
                '}';
    }
}
