package Gestores;

import Modelo.Concesionario;
import Proyecto.Cliente;
import Proyecto.CompraVenta;
import Proyecto.Vehiculo;
import VC.Vista;
import VC.VistaVehiculo;

import java.util.Date;

public class GestorControladorVehiculo {
    private VistaVehiculo vistaVehiculo;
    private Cliente cliente;
    private Concesionario concesionario;

    public GestorControladorVehiculo(VistaVehiculo vistaVehiculo, Cliente cliente, Concesionario concesionario) {
        this.vistaVehiculo = vistaVehiculo;
        this.cliente = cliente;
        this.concesionario = concesionario;

    }

    public void añadirVehiculo() {
        Date date = new Date();
        Concesionario concesionario = new Concesionario();
        String modelo = vistaVehiculo.getTxtModelo();
        String marca = vistaVehiculo.getTxtMarca();
        String color = vistaVehiculo.getTxtColor();
        String combustion = vistaVehiculo.getTxtCombustion();
        String estado = vistaVehiculo.getTxtEstado();
        String matricula = vistaVehiculo.getTxtMatricula();
        double precio = Double.parseDouble(vistaVehiculo.getTxtPrecio());
        Vehiculo vehiculo = new Vehiculo(modelo,marca,color,combustion,estado,matricula,date,precio);
        concesionario.introducirNuevoVehiculo(vehiculo);
        vistaVehiculo.añadirVehiculoBox(vehiculo);
        vistaVehiculo.mostrarMensaje("El vehículo se ha añadido correctamente");

    }

    public void venderVehiculo() {
            Vehiculo vehiculo = concesionario.buscarVehiculo(vistaVehiculo.getBoxVehiculo());
            String operacio = vistaVehiculo.getTxtOperacion();
            double precioDesdeTXT = Double.parseDouble(vistaVehiculo.getTxtPrecio());
            CompraVenta compraVenta = new CompraVenta(cliente,vehiculo,precioDesdeTXT,operacio);
            concesionario.elgirOperacion(compraVenta);
            vistaVehiculo.mostrarMensaje("La venta se ha realizado correctamente");
            vistaVehiculo.borrarBox(vehiculo);
    }

    public void comprarVehículo() {
        Vehiculo vehiculo = concesionario.buscarVehiculo(vistaVehiculo.getBoxVehiculo());
        String operacio = vistaVehiculo.getTxtOperacion();
        double precioDesdeTXT = Double.parseDouble(vistaVehiculo.getTxtPrecio());
        CompraVenta compraVenta = new CompraVenta(cliente,vehiculo,precioDesdeTXT,operacio);
        concesionario.elgirOperacion(compraVenta);
        vistaVehiculo.mostrarMensaje("La compra se ha realizado correctamente");
        vistaVehiculo.borrarBox(vehiculo);
    }
}
