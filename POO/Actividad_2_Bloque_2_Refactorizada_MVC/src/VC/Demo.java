package VC;
import LeerEscribir.ExportadorXML;
import LeerEscribir.LectorFactory;
import proyecto.Comercial;
import proyecto.Comerciales;
import proyecto.VentaMensual;

import java.awt.event.ActionListener;

public class Demo {
    public static void main(String[] args) {
     Vista vista = new Vista();
     VentaMensual vMes = new VentaMensual();
     ExportadorXML exportadorXML = new ExportadorXML();
     Comerciales comerciales = new Comerciales(LectorFactory.crearLectorXML());
     Comercial comercial = new Comercial();
     ActionListener controlador = new Controlador(vista, comerciales);
     vista.setControlador(controlador);
     vista.init();



    }
}
