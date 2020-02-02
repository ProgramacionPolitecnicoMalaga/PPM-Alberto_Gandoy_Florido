package LeerEscribir;

import proyecto.Comercial;
import proyecto.Comerciales;
import proyecto.Venta;
import proyecto.VentaMensual;

import java.util.ArrayList;

public interface ExportadorArchivo {
    void generarComercialByVentaXml(Comerciales comerciales, String documentoXML);
    void generarVentaByVentaMensualXml(VentaMensual ventaMensual, String documentoXML);
    void generarComercialByVentaCsv(String file, ArrayList<Comercial> comerciales);
    void generarVentaByVentaMensualCsv(String file, ArrayList<Venta> ventas);
}
