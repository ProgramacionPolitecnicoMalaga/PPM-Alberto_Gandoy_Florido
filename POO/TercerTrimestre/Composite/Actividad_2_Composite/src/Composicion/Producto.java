package Composicion;

public class Producto implements Servicio {
    private String nombre;
    private int precioPr;

    public Producto(String nombre, int precioPr) {
        this.nombre = nombre;
        this.precioPr = precioPr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioPr() {
        return precioPr;
    }

    public void setPrecioPr(int precioPr) {
        this.precioPr = precioPr;
    }

    @Override
    public void asignarPrecio(int precio) {
        this.precioPr = precio;
    }

    @Override
    public int obtenerPrecio() {
        return this.precioPr;
    }

    @Override
    public boolean getTipo() {
        return Servicio.productoB;
    }

    @Override
    public String toString() {
        return  "\n" + "====================PRODUCTO====================" + "\n" +
                "Nombre: " + nombre   + "\n" +
                "Precio del paquete: " + precioPr + "€" + "\n" +
                "================================================" + "\n";
    }
}
