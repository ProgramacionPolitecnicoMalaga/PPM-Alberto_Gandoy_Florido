package ListaDeProductos;

public class Producto {

    private  String nombreProducto;
    private int precioProducto;
    private double valoracionProducto;


    public Producto (String nombreProducto, int precioProducto, double valoracionProducto){

        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.valoracionProducto = valoracionProducto;

    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public double getValoracionProducto() {
        return valoracionProducto;
    }

    public void setValoracionProducto(double valoracionProducto) {
        this.valoracionProducto = valoracionProducto;
    }

    @Override
    public String toString() {
        return "============PRODUCTOS============\n"+
                "Nombre del producto: " + nombreProducto + "\n" +
                "Precio del producto: "  + precioProducto + "\n" +
                "Valoración del producto: " + valoracionProducto;
    }
}
