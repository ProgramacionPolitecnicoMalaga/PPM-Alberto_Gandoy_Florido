package Gestores;

import Modelo.Concesionario;
import Proyecto.Cliente;
import Proyecto.CuentaBancaria;
import Proyecto.Vehiculo;
import VC.Controlador;
import VC.ControladorVehiculo;
import VC.Vista;
import VC.VistaVehiculo;

import javax.swing.*;

public class GestorControlador {
    private Vista vista;
    private Concesionario concesionario;

    public GestorControlador(Vista vista, Concesionario concesionario) {
        this.vista = vista;
        this.concesionario = concesionario;
    }

    public void abrirNuevoMenu() {
        Cliente cliente = concesionario.buscarCliente(vista.getBoxCliente());
        mostrarMenuVehiculo(cliente);
    }
    public void mostrarMenuVehiculo(Cliente cliente) {
        JFrame ventana = new JFrame("Gestión Vehículos");
        VistaVehiculo vistaVehiculo = new VistaVehiculo(cliente);
        ControladorVehiculo controladorVehiculo = new ControladorVehiculo(new GestorControladorVehiculo(vistaVehiculo,cliente, concesionario));
        vistaVehiculo.setControlador(controladorVehiculo);

        ventana.setDefaultCloseOperation(2);
        ventana.setContentPane(vistaVehiculo);


        ventana.pack();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }

    public void añadirCliente() {
        String nombre = vista.getNombre();
        String apellido = vista.getApellido();
        String nif = vista.getNif();
        String iban = vista.getIban();
        double saldo = Double.parseDouble(vista.getTxtSaldo());
        CuentaBancaria cB = new CuentaBancaria(iban,saldo);
        Cliente cliente = new Cliente(nombre,apellido,nif,cB);
        concesionario.introducirNuevoCliente(cliente);
        System.out.println(concesionario.getClientes());
        vista.añadirClienteBox(cliente);
        vista.mostrarMensaje("El cliente " + cliente.getNombre() + " " + cliente.getApellido() + " se ha añadido correctamente.");
    }
}
