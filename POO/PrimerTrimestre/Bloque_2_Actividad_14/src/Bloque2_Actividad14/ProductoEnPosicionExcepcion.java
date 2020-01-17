package Bloque2_Actividad14;

public class ProductoEnPosicionExcepcion  extends ArrayIndexOutOfBoundsException{
    public ProductoEnPosicionExcepcion(int i, int limiteMax){
        super("El índice " + i + " supera el máximo permitido: " + limiteMax);
    }


}
