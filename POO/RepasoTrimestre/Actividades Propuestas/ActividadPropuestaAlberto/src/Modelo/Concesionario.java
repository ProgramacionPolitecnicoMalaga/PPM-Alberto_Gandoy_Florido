package Modelo;

import Proyecto.*;
import SwingUI.VistaCliente.Vista;

import java.util.ArrayList;

public class Concesionario implements Vendedor{
    private CuentaBancaria cBConcesionario;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Operacion> compras;
    private ArrayList<Operacion> ventas;

    public Concesionario() {
        compras = new ArrayList<>();
        vehiculos = new ArrayList<>();
        clientes = new ArrayList<>();
        ventas = new ArrayList<>();
        cBConcesionario = new CuentaBancaria("ES66-0019-0020-9612-3587-8524",50000);
    }

    public CuentaBancaria getcBConcesionario() {
        return cBConcesionario;
    }

    public void setcBConcesionario(CuentaBancaria cBConcesionario) {
        this.cBConcesionario = cBConcesionario;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Operacion> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Operacion> compras) {
        this.compras = compras;
    }

    public ArrayList<Operacion> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Operacion> ventas) {
        this.ventas = ventas;
    }

    public void introducirNuevoVehiculo(Vehiculo vehiculo) {
        if (vehiculos.contains(vehiculo)) {
            try {
                throw new Exception("El vehículo ya existe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            vehiculos.add(vehiculo);
        }
    }

    public boolean eliminarVehiculo(Vehiculo vehiculo) {
            return vehiculos.remove(vehiculo);
    }

    public void introducirNuevoCliente(Cliente cliente) {
        if (clientes.contains(cliente)) {
            try {
                throw new Exception("El cliente ya existe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            clientes.add(cliente);
        }
    }

    public void introducirNuevaCompra(Operacion compra)  {
        if (compras.contains(compra)) {
            try {
                throw new Exception("No se pudo realizar la operación.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            compras.add(compra);
        }
    }

    public void introducirNuevaVenta(Operacion venta)  {
        if (ventas.contains(venta)) {
            try {
                throw new Exception("No se pudo realizar la operación.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            ventas.add(venta);
        }
    }

    public Vehiculo buscarVehiculo(String matricula) {
        Vehiculo vehiculo = null;
        boolean encontrado = false;
        int i = 0;
        while (i < vehiculos.size() && !encontrado) {
            if (vehiculos.get(i).getMatricula().equals(matricula)) {
                vehiculo = vehiculos.get(i);
                encontrado = true;
            }
            i++;
        }
        return vehiculo;
    }

    public Cliente buscarCliente(String nif) {
        Cliente cliente = null;
        boolean encontrado = false;
        int i = 0;
        while (i < clientes.size() && !encontrado) {
            if (clientes.get(i).getNif().equals(nif)) {
                cliente = clientes.get(i);
                encontrado = true;
            }
            i++;
        }
        return cliente;
    }

    @Override
    public void realizarPago(double cantidad) {
        cBConcesionario.restarSaldo(cantidad);
    }

    @Override
    public void recibirPago(double cantidad) {
        cBConcesionario.sumarSaldo(cantidad);
    }

    @Override
    public void realizarCompra(Cliente cliente, Object objeto, double cantidad) {
        Vehiculo vehiculo = (Vehiculo)objeto;
        Operacion compra = new Compra(cliente,vehiculo,cantidad);
        System.out.println(compra.getCliente());
        compra.Operar(this,cantidad);
        introducirNuevaCompra(compra);
        introducirNuevoVehiculo(vehiculo);
    }

    @Override
    public void realizarVenta(Cliente cliente, Object objeto, double cantidad) {
        Vehiculo vehiculo = (Vehiculo)objeto;
        Operacion venta = new Venta(cliente,vehiculo,cantidad);
        venta.Operar(this,cantidad);
        introducirNuevaVenta(venta);
        eliminarVehiculo(vehiculo);
    }

    @Override
    public String toString() {
        return "Concesionario{" +
                "cBConcesionario=" + cBConcesionario +
                ", vehiculos=" + vehiculos +
                ", clientes=" + clientes +
                ", compras=" + compras +
                ", ventas=" + ventas +
                '}';
    }
}
