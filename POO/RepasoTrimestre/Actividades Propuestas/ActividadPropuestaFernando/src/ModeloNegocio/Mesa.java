package ModeloNegocio;

import java.util.ArrayList;
import java.util.Objects;

public class Mesa {
    private String id;
    private boolean estado;
    private ArrayList<Producto> productos;


    public Mesa(String id) {
        this.id = id;
        estado = false;
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

    public void printProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "id='" + id + '\'' +
                ", estado=" + estado +
                ", productos=" + productos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mesa mesa = (Mesa) o;
        return Objects.equals(id, mesa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
