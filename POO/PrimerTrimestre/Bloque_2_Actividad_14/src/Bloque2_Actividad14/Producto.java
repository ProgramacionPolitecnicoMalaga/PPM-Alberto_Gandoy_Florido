package Bloque2_Actividad14;

public class Producto {

    private String nombre;
    private double valoracion;
    private double precio;

    public Producto(String nombre, double valoracion, double precio){
        this.nombre = nombre;
        this.valoracion = valoracion;
        this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    }

    public double getValoracion(){
        return valoracion;
    }

    public double getPrecio(){
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", valoracion=" + valoracion +
                ", precio=" + precio +
                '}';
    }
}
