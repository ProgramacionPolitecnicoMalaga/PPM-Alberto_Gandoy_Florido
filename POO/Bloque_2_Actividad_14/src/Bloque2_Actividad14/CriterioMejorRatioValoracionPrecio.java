package Bloque2_Actividad14;

import java.security.interfaces.DSAPublicKey;

public class CriterioMejorRatioValoracionPrecio implements SelectorDeMejorProducto {
    @Override
    public Producto elegirMejorProducto(LoteDeProductos lote) {
        double mejorRatio = Double.MIN_VALUE;
        Producto productoMejorRatio = null;
        for (int i = 0; i < lote.getTotalProductos(); i++){
            Producto productoActual = lote.getProductoEnPosicion(i);
            double precioActual = productoActual.getPrecio();
            double valoracionActual = productoActual.getValoracion();
            double ratioActual = valoracionActual/precioActual;
            if (ratioActual > mejorRatio){
                mejorRatio = ratioActual;
                productoMejorRatio = productoActual;
            }

        }return productoMejorRatio;
    }
}
