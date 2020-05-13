package com.politecnico;

import com.politecnico.EleccionFactoryProducto.EleccionFactory;
import com.politecnico.EleccionFactoryProducto.EleccionProducto;
import com.politecnico.Modelo.Producto;
import com.politecnico.StrategyProducto.LoteProductos;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public static void main( String[] args )
    {
        Producto producto = new Producto("Zapatos Gucci",1000,1.2);
        Producto producto1 = new Producto("Cartera Armani",100,3);
        Producto producto2 = new Producto("Camiseta Nike",50,2);
        Producto producto3 = new Producto("Sudadera Adidas",92,1);
        Producto producto4 = new Producto("Reloj Rolex",1001,0.1);
        Producto producto5 = new Producto("Pantalones Levis",71,4);
        Producto producto6 = new Producto("Gorra Polo",254,1);
        Producto producto7 = new Producto("Colonia One Million",70,8.3);
        Producto producto8 = new Producto("Monitor Asus",300,5);
        Producto producto9 = new Producto("Teclado MarsnGaming",20,8.3);
        Producto producto10 = new Producto("Huawei P8 Lite",200,4.1);
        Producto producto11 = new Producto("Bicicleta Orbea",353,9.5);
        Producto producto12 = new Producto("Boligrafo Bic",1,1);

        Producto[] añadirProducto = {producto,producto1,producto2,producto3,producto4,producto5,producto6,producto7,producto8,producto9,producto10,producto11,producto12};

        LoteProductos loteProductos = new LoteProductos(añadirProducto);

        System.out.println("ELIGE UNA OPCIÓN: " );
        System.out.print( "1. Mejor valorado. \n" +
                "2. Mejor precio. \n" +
                "3. Mejor ratio. \n");
        int opcion = sc.nextByte();

        EleccionProducto eleccionProducto = EleccionFactory.getRespuesta(opcion);
        eleccionProducto.soloLoMejor();

        System.out.println(loteProductos.imprimirProductos());
    }
}
