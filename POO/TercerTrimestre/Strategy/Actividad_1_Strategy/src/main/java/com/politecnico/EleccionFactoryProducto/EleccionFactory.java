package com.politecnico.EleccionFactoryProducto;

import com.politecnico.StrategyProducto.MejorPrecio;
import com.politecnico.StrategyProducto.MejorRatio;
import com.politecnico.StrategyProducto.MejorValorado;

public class EleccionFactory {
    public static EleccionProducto getRespuesta(int respuesta) {
        switch (respuesta) {
            case EleccionProducto.MEJOR_VALORADO:
                return new MejorValorado();
            case EleccionProducto.MEJOR_PRECIO:
                return new MejorPrecio();
            case EleccionProducto.MEJOR_RATIO:
                return new MejorRatio();
            default:
                return new MejorValorado();
        }
    }
}
