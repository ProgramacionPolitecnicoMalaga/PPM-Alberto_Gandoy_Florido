package com.politecnico.StrategyProducto;


import com.politecnico.Modelo.Producto;

import java.util.Arrays;

public class LoteProductos {
    public static Producto[] productos;

    public LoteProductos(Producto[] productos) {
        this.productos = productos;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public LoteProductos(int sizeProductos) {
        this.productos = new Producto[sizeProductos];
    }

    public void addProducto(Producto producto){
        if (productos[productos.length] == null)
            productos = Arrays.copyOf(productos,(productos.length * 2) - 1);

        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null )
                productos[i] = producto;
        }
    }

    public String imprimirProductos() {
        String imprimidos = null;
        for(int i = 0; i < productos.length;i++) {
            imprimidos = productos[i].toString();
        }
        return imprimidos;
    }

}
