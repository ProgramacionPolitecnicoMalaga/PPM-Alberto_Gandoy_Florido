package SwingUI.VistaCliente;
import Escribir.CreadorDocumentoXML;
import Escribir.GeneradorDocumentoXML;
import Modelo.Concesionario;
import Proyecto.Cliente;
import Proyecto.CuentaBancaria;
import SwingUI.VistaVehiculo.ControladorVehiculo;
import SwingUI.VistaVehiculo.GestorControladorVehiculo;
import SwingUI.VistaVehiculo.VistaVehiculo;

import javax.swing.*;

public class GestorControlador {
    private Vista vista;
    private Concesionario concesionario;
    private CreadorDocumentoXML creadorXML;

    public GestorControlador(Vista vista, Concesionario concesionario) {
        this.vista = vista;
        this.concesionario = concesionario;
        creadorXML = new GeneradorDocumentoXML();
    }

    public void addCliente() {
        String nombre = vista.getTxtNombre();
        String apellido = vista.getTxtApellido();
        String nif = vista.getTxtNIF();
        String iban = vista.getTxtIBAN();
        double saldo = Double.parseDouble(vista.getTxtSaldo());
        Cliente cliente = new Cliente(nombre, apellido, nif, new CuentaBancaria(iban, saldo));
        concesionario.introducirNuevoCliente(cliente);
        vista.addBoxCliente(cliente);
        vista.mostrarMensaje(cliente.getNombre() + " " + cliente.getApellido() + " se ha añadido correctamente.");
        vista.limpiar();
        creadorXML.generarClientesXML(concesionario,cliente.getNif());
    }

    public void crearVentanaVehiculo(Concesionario concesionario, Cliente cliente) {
            String name = vista.getBoxCliente();
            JFrame ventana = new JFrame(name);
            VistaVehiculo vistaVehiculo = new VistaVehiculo();
            ControladorVehiculo gCv = new ControladorVehiculo(new GestorControladorVehiculo(vistaVehiculo,concesionario,cliente));
            vistaVehiculo.setControlador(gCv);

            ventana.setDefaultCloseOperation(2);
            ventana.setContentPane(vistaVehiculo);

            ventana.pack();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
        }

    public void abrirGestionVehiculo() {
        Cliente cliente = concesionario.buscarCliente(vista.getBoxCliente());
        Concesionario concesionario = new Concesionario();
        crearVentanaVehiculo(concesionario,cliente);
    }
}
