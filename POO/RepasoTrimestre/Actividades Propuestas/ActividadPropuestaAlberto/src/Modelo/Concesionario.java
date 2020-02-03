package Modelo;

import Proyecto.Cliente;
import Proyecto.CompraVenta;
import Proyecto.ExceptionCliente;
import Proyecto.Vehiculo;

import java.util.ArrayList;

public class Concesionario {
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Cliente> clientes;
    private ArrayList<CompraVenta> compras;
    private ArrayList<CompraVenta> ventas;

    public Concesionario() {
        compras = new ArrayList<>();
        vehiculos = new ArrayList<>();
        clientes = new ArrayList<>();
        ventas = new ArrayList<>();
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

    public ArrayList<CompraVenta> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<CompraVenta> compras) {
        this.compras = compras;
    }

    public ArrayList<CompraVenta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<CompraVenta> ventas) {
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

    public ArrayList<CompraVenta> realizarUnaVenta(CompraVenta compraVenta) {
        if (compraVenta.getCliente().getCuentaBancaria().getSaldoContable() < compraVenta.getPrecio()) {
            try {
                throw new ExceptionCliente("El saldo de la cuenta es inferior al que cuesta el vehículo");
            } catch (ExceptionCliente exceptionCliente) {
                exceptionCliente.printStackTrace();
            }
        } else {
           double venta = compraVenta.getCliente().getCuentaBancaria().getSaldoContable() - compraVenta.getPrecio();
           compraVenta.getCliente().getCuentaBancaria().setSaldoContable(venta);
           ventas.add(compraVenta);
        }

        return ventas;
    }

    public ArrayList<CompraVenta> realizarUnaCompra(CompraVenta compraVenta) {
        double compra = compraVenta.getCliente().getCuentaBancaria().getSaldoContable() + compraVenta.getPrecio();
        compraVenta.getCliente().getCuentaBancaria().setSaldoContable(compra);
        compras.add(compraVenta);
        return compras;
    }

    public void elgirOperacion(CompraVenta compraVenta) {
     if (compraVenta.getTipo().equals("Venta"))
         System.out.println(realizarUnaVenta(compraVenta));
     else if (compraVenta.getTipo().equals("Compra"))
         System.out.println(realizarUnaCompra(compraVenta));
    }

    public void mostrarVentas() {
        for (CompraVenta compraVenta : ventas) {
            System.out.println(compraVenta);
        }
    }

    public void mostrarCompras() {
        for (CompraVenta compraVenta : compras) {
            System.out.println(compraVenta);
        }
    }

    public Vehiculo buscarVehiculo(String matricula) {
        Vehiculo vehiculo = null;
        boolean encontrado = false;
        int i = 0;
        while (i > vehiculos.size() && !encontrado) {
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
        while (i > clientes.size() && !encontrado) {
            if (clientes.get(i).getNif().equals(nif)) {
                cliente = clientes.get(i);
                encontrado = true;
            }
            i++;
        }
        return cliente;
    }
    @Override
    public String toString() {
        return "Concesionario{" +
                "vehiculos=" + vehiculos +
                ", clientes=" + clientes +
                ", compraVenta=" + compras +
                '}';
    }
}
