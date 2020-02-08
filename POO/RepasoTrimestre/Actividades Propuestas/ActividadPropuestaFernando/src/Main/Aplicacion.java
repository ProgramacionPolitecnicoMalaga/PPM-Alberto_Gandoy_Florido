package Main;

import Listas.Carta;
import Listas.Mesas;
import ModeloNegocio.Mesa;
import ModeloNegocio.Producto;
import ModeloNegocio.Caja;
import ModeloNegocio.Cuenta;
import Swing.Controlador;
import Swing.Gestores.GestorControlador;
import Swing.Vista;

import java.awt.event.ActionListener;

public class Aplicacion {
    public static void main(String[] args) {
//SoC
        Vista vista = new Vista();
        Caja cj = new Caja();
        Mesas listaMesas = new Mesas();
        GestorControlador gestorControlador = new GestorControlador(vista,cj,listaMesas);
        ActionListener controlador = new Controlador(gestorControlador);
        vista.setControlador(controlador);
        vista.init();

        System.out.println("===============================================================");
        System.out.println(" Añadir productos a la lista de productos(Crear nuevo producto).");
        System.out.println("===============================================================");
        Producto cafe = new Producto("Café",1.20);
        Producto tostada = new Producto("Tostada con aceite",2.50);
        Producto refresco = new Producto("Coca-Cola",1.50);
        Producto tapa = new Producto("Tortilla",1.20);
        Producto batido = new Producto("Batido de fresa con plátano",3.50);
        Producto fruta = new Producto("Manzana",0.50);
        Carta carta = new Carta();
        carta.addProducto(cafe);
        carta.addProducto(tostada);
        carta.addProducto(tapa);
        carta.addProducto(refresco);
        carta.addProducto(batido);
        carta.addProducto(fruta);
        carta.printProductos();


        System.out.println("===============================================================");
        System.out.println("               Añadir producto a una mesa.                     ");
        System.out.println("===============================================================");
        Mesa mesa_1 = new Mesa("1");
        mesa_1.addProducto(cafe);
        mesa_1.addProducto(tostada);

        Mesa mesa_2 = new Mesa("2");
        mesa_2.addProducto(refresco);
        mesa_2.addProducto(tapa);


        Mesa mesa_3 = new Mesa("3");
        mesa_3.addProducto(batido);
        mesa_3.addProducto(fruta);

        mesa_1.printProductos();
        mesa_2.printProductos();
        mesa_3.printProductos();

        Mesas mesas = new Mesas();
        mesas.abrirMesa(mesa_1);
        mesas.abrirMesa(mesa_2);
        mesas.cerrarMesa(mesa_3);

        System.out.println("===============================================================");
        System.out.println("              Consultar mesas abiertas.                        ");
        System.out.println("===============================================================");
       Cuenta cuenta = new Cuenta(mesa_1);
        Caja caja = new Caja(cuenta,mesas);
        System.out.println(caja.buscarMesasAbierta("2"));
        System.out.println("=========TODAS LAS ABIERTAS========");
        caja.getMesasCerradasOabiertas(mesas.getAbiertas());

        System.out.println("===============================================================");
        System.out.println("              Consultar mesas cerradas.                        ");
        System.out.println("===============================================================");
        Cuenta cuenta_cerrada = new Cuenta(mesa_3);
        Caja caja_cerrada = new Caja(cuenta_cerrada,mesas);
        System.out.println(caja_cerrada.buscarMesasCerradas("3"));
        System.out.println("=========TODAS LAS CERRADAS========");
        caja_cerrada.getMesasCerradasOabiertas(mesas.getCerradas());

        System.out.println("===============================================================");
        System.out.println("              Consultar el recuento de caja actual.            ");
        System.out.println("===============================================================");
        System.out.println(caja.consultarRecuentoActual());

        System.out.println("===============================================================");
        System.out.println("                Cerrar mesa (Cobrarla).                        ");
        System.out.println("===============================================================");
        System.out.println(caja.cerrarYcobrar(mesa_1));
    }
}
