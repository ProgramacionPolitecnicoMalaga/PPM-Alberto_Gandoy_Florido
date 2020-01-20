package LeerEscribir;
import proyecto.Comerciales;
import proyecto.VentaMensual;

import java.util.ArrayList;

public interface Lector {
    Comerciales lecturaComerciales(Comerciales comerciales);
    VentaMensual lecturaVentas(VentaMensual ventaMensual);
}
