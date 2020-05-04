package com.politecnico.StrategyProducto;

import com.politecnico.EleccionFactoryProducto.EleccionProducto;
import com.politecnico.Modelo.Producto;

import java.util.Arrays;

public class MejorPrecio implements EleccionProducto {
    @Override
    public LoteProductos soloLoMejor() {
        Producto[] mejorOpcion = new Producto[TAMAÑO_OPCIONES];
        mejorOpcion[0] = LoteProductos.productos[0];; // esto es para que no se compare con el mismo
        for (int i = 1; i < LoteProductos.productos.length; i++){

            if (LoteProductos.productos[i].getPrecio() > mejorOpcion[0].getPrecio()){
                if (mejorOpcion.length > 1){// esto ocurre antes había 2 mejores valorados y ahora solo hay 1, por lo que el tamaño vuelve a ser 1.
                    mejorOpcion = new Producto[TAMAÑO_OPCIONES];
                }
                mejorOpcion[0] =LoteProductos.productos[i];

            }else if(LoteProductos.productos[i].getPrecio() == mejorOpcion[0].getPrecio()){
                mejorOpcion = Arrays.copyOf(mejorOpcion,mejorOpcion.length + 1);//nuevo producto con la misma valoracion, añadimos un nuevo hueco
                mejorOpcion[mejorOpcion.length-1] = LoteProductos.productos[i];
            }
        }
        return new LoteProductos(mejorOpcion);
    }
}
