package Bloque2_Actividad14;

public class NullProductoExcepcion extends IllegalArgumentException {

    public NullProductoExcepcion(String mensaje){
        super(mensaje);
    }

    @Override
    public String toString() {
        return "Producto not null";
    }
}
