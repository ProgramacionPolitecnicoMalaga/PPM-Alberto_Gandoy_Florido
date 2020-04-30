package Composicion;

import java.util.ArrayList;
import java.util.List;

public class Paquete implements Servicio {
    private List<Servicio> servicios;
    private String nombre;
    private int precioP;

    public Paquete(String nombre, int precioP) {
        this.servicios = new ArrayList<Servicio>();
        this.nombre = nombre;
        this.precioP = precioP;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioP() {
        return precioP;
    }

    public void setPrecioP(int precioP) {
        this.precioP = precioP;
    }

    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    @Override
    public void asignarPrecio(int precio) {
        this.precioP = precio;
    }

    @Override
    public int obtenerPrecio() {
        int precioObtenido = precioP;
        for (Servicio servicio : servicios) {
            precioObtenido = precioObtenido + servicio.obtenerPrecio();
        }
        return precioObtenido;
    }

    @Override
    public boolean getTipo() {
        return Servicio.paqueteB;
    }

    @Override
    public String toString() {
        return  "\n" + "====================PAQUETE====================" + "\n" +
                "Listado de servicios: " + servicios  + "\n" +
                "Nombre: " + nombre   + "\n" +
                "Precio del paquete: " + precioP + "€" + "\n" +
                "================================================" + "\n";
    }
}
