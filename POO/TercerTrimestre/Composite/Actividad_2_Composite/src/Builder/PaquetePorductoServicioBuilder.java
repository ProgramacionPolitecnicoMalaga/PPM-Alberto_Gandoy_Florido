package Builder;

import Composicion.Paquete;
import Composicion.Producto;

public class PaquetePorductoServicioBuilder {
    private Paquete paquete;
    private PaquetePorductoServicioBuilder bPPs;

    public PaquetePorductoServicioBuilder(Paquete paquete) {
        this.paquete = paquete;
    }

    public PaquetePorductoServicioBuilder(Paquete paquete, PaquetePorductoServicioBuilder bPPs){
        this.paquete = paquete;
        this.bPPs = bPPs;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public PaquetePorductoServicioBuilder getBuilderProductoPaqueteServicio() {
        return bPPs;
    }

    public void setBuilderProductoPaqueteServicio(PaquetePorductoServicioBuilder bPPs) {
        this.bPPs = bPPs;
    }

    public PaquetePorductoServicioBuilder crearBuilder(String nombre, int precio) {
        paquete.agregarServicio(new Paquete(nombre, precio));
        bPPs = new PaquetePorductoServicioBuilder(paquete, bPPs);
        return bPPs;
    }

    public PaquetePorductoServicioBuilder addBuilder(String nombre, int precio) {
        paquete.agregarServicio(new Producto(nombre, precio));
        return this;
    }
}
