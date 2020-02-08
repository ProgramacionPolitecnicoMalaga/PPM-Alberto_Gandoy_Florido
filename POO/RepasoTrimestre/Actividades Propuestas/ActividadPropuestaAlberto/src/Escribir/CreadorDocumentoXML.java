package Escribir;

import Modelo.Concesionario;

public interface CreadorDocumentoXML {
    void generarClientesXML(Concesionario concesionario, String documentoXML);
    void generarVehiculoXML(Concesionario concesionario, String documentoXML);
    void generarCompraXML(Concesionario concesionario, String documentoXML);
    void generarVentaXML(Concesionario concesionario, String documentoXML);
}

