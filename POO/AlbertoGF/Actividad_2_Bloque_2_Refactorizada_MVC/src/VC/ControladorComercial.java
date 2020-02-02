package VC;

import proyecto.Comercial;
import proyecto.Venta;
import proyecto.VentaMensual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ControladorComercial implements ActionListener {
    private VistaComercial vistaComercial;
    private Comercial comercial;

    public ControladorComercial(Comercial comercial, VistaComercial vistaComercial){
        this.comercial = comercial;
        this.vistaComercial = vistaComercial;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("AñadirVenta")) {
            String descripcion = vistaComercial.getTxtVenta();
            Calendar calendario = vistaComercial.getFecha();
            VentaMensual ventaMensual = comercial.buscarVentaMensual(calendario);
            System.out.println("LLLLLL" + ventaMensual);
            if(ventaMensual == null){
                System.out.println("entra al null");
                ventaMensual = new VentaMensual();
                ventaMensual.setFecha(calendario);
                Venta venta = new Venta(ventaMensual.getVentas().size()+1,calendario,descripcion);
                ventaMensual.addVenta(venta);
                comercial.addVentaMensual(ventaMensual);
                System.out.println(comercial.toString());
                vistaComercial.mostrarMensaje("Se ha añadido una venta al comercial: " + comercial.getNombre() + " con la descripción: " +descripcion+ " y fecha:" + venta.imprimirFecha());
            } else{
                System.out.println("entra al otro");
                Venta venta = new Venta(ventaMensual.getVentas().size()+1,calendario,descripcion);
                ventaMensual.addVenta(venta);
                System.out.println(comercial.toString());
                vistaComercial.mostrarMensaje("Se ha añadido una venta al comercial: " + comercial.getNombre() + " con la descripción: " +descripcion+ " y fecha:" + venta.imprimirFecha());
            }
        }else if (e.getActionCommand().equals("Mostrar")) {
               Calendar calendario = vistaComercial.getFecha();
               ArrayList<VentaMensual> ventasMensuales = comercial.buscarVentasAnuales(calendario);
            System.out.println(ventasMensuales.size());
               vistaComercial.mostrarVentasAnuales(ventasMensuales, calendario);
        }
    }
}
