package SwingUI.VistaVehiculo;

import Escribir.CreadorDocumentoXML;
import Escribir.GeneradorDocumentoXML;
import Modelo.Concesionario;
import Proyecto.*;

public class GestorControladorVehiculo {
    private VistaVehiculo vistaVehiculo;
    private Concesionario concesionario;
    private Cliente cliente;
    private CreadorDocumentoXML creadorXML;


    public GestorControladorVehiculo(VistaVehiculo vistaVehiculo, Concesionario concesionario, Cliente cliente) {
        this.vistaVehiculo = vistaVehiculo;
        this.concesionario = concesionario;
        this.cliente = cliente;
        creadorXML = new GeneradorDocumentoXML();
    }

    public void vender() {
        String modelo = vistaVehiculo.getTxtModelo();
        String marca = vistaVehiculo.getTxtMarca();
        String color = vistaVehiculo.getTxtcolor();
        String combustion = vistaVehiculo.getTxtCombustion();
        String estado = vistaVehiculo.getTxtEstado();
        String matricula = vistaVehiculo.getxtMatricula();
        Vehiculo vehiculo = new Vehiculo(modelo,marca,color,combustion,estado,matricula);
        concesionario.realizarCompra(cliente,vehiculo,Double.parseDouble(vistaVehiculo.getTxtPrecio()));
        vistaVehiculo.addBoxVehiculo(vehiculo);
        vistaVehiculo.mostrarMensaje("El " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " se ha vendido correctamente.");
        vistaVehiculo.limpiarV();
        creadorXML.generarVehiculoXML(concesionario,vehiculo.getMatricula());
        creadorXML.generarVentaXML(concesionario,"Venta");
    }

    public void comprar() {
        Vehiculo vehiculo = concesionario.buscarVehiculo(vistaVehiculo.getComboxVehiculo());
        concesionario.realizarVenta(cliente,vehiculo,Double.parseDouble(vistaVehiculo.getTxtPrecio()));
        vistaVehiculo.mostrarMensaje("La compra se ha realizado correctamente.");
        vistaVehiculo.removeComboBox(vehiculo);
        vistaVehiculo.limpiarV();
        creadorXML.generarCompraXML(concesionario,"Compra");
    }
}

