package Negocio;

import java.util.ArrayList;

public class Mesa {
    private String id;
    private boolean estado;
    private ArrayList<Producto> productos;


    public Mesa(String id) {
        this.id = id;
        productos = new ArrayList<>();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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

    @Override
    public String toString() {
        return "Mesa{" +
                "id='" + id + "\n" +
                ", estado=" + estado + "\n" +
                ", productos=" + productos +
                '}';
    }
}
