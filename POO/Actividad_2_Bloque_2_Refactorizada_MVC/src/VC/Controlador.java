package VC;

import proyecto.Comercial;
import proyecto.Comerciales;
import proyecto.Venta;
import proyecto.VentaMensual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Controlador implements ActionListener {
    private Vista vista;
    private Comerciales comerciales;

    public Controlador(Vista vista, Comerciales comerciales) {
        this.vista = vista;
        this.comerciales = comerciales;
        vista.mostrarComerciales(comerciales.getComerciales());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("AñadirComercial")) {
            String nombre = vista.getTxtComercial();
            Comercial comercial = new Comercial(nombre);
            comerciales.addComercial(comercial);
            vista.añadirComercialBox(comercial);
            vista.mostrarMensaje("Se ha añadido correctamente el comercial: " + comercial.getNombre());
        }else if (e.getActionCommand().equals("AñadirVenta")) {
            String descripcion = vista.getTxtVenta();
            Calendar calendario = vista.getFecha();
            Comercial comercial = comerciales.buscarComercial(vista.getComboxComercial());
            VentaMensual ventaMensual = comercial.buscarVentaMensual(calendario);
            if(ventaMensual == null){
                ventaMensual = new VentaMensual();
                ventaMensual.setFecha(calendario);
                Venta venta = new Venta(ventaMensual.getVentas().size()+1,calendario,descripcion);
                ventaMensual.addVenta(venta);
                comercial.addVentaMensual(ventaMensual);
                vista.mostrarMensaje("Se ha añadido una venta al comercial: " + comercial.getNombre() + " con la descripción: " +descripcion+ " y fecha:" + venta.imprimirFecha());
            } else{
                Venta venta = new Venta(ventaMensual.getVentas().size()+1);
                ventaMensual.addVenta(venta);
                vista.mostrarMensaje("Se ha añadido una venta al comercial: " + comercial.getNombre() + " con la descripción: " +descripcion+ " y fecha:" + venta.imprimirFecha());
            }
        }else if (e.getActionCommand().equals("Mostrar")) {
               Comercial comercial = comerciales.buscarComercial(vista.getComboxComercial());
               Calendar calendario = vista.getFecha();
              // String desciption = vista.getTxtVenta();
               VentaMensual ventaMensual = comercial.buscarVentaMensual(calendario);
            if(ventaMensual == null){
                vista.mostrarMensaje("El comercial: " + comercial.getNombre() + " no tiene ninguna venta en el mes de: " + calendario.get(Calendar.MONTH+1));
            } else{
                vista.mostrarDatosVentas(ventaMensual.getVentas());
            }
        }else if (e.getActionCommand().equals("Limpiar")) {
            vista.limpiarTexto();
        } else if (e.getActionCommand().equals("Buscar")) {
            String nombre = vista.getTxtBuscar();
            Comercial comercial = comerciales.buscarComercial(nombre);
            vista.buscarComercial(comercial);
        } else if (e.getActionCommand().equals("Nuevodocumento")) {
            //generadorArchivo.generarComercialByVentaXml(comerciales, vista.getTxtGenerateFile() + "_FileMvc");
        } else if (e.getActionCommand().equals("Eliminar")) {}
    }
}
