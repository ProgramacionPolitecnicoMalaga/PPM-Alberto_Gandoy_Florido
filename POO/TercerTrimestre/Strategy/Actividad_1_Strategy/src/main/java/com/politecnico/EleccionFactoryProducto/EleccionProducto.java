package com.politecnico.EleccionFactoryProducto;

import com.politecnico.StrategyProducto.LoteProductos;

public interface EleccionProducto {
    public final static int MEJOR_VALORADO = 1;
    public final static int MEJOR_PRECIO = 2;
    public final static int MEJOR_RATIO = 3;
    public final static int TAMAÑO_OPCIONES = 1;

    public LoteProductos soloLoMejor();
}
