package Modelo;

import Negocio.Cuenta;
import Negocio.Mesa;
import Negocio.Producto;

import java.util.ArrayList;

public class Cafeteria {
    private ArrayList<Mesa> cerradas;
    private ArrayList<Mesa> abiertas;
    private Cuenta cuenta;

    public Cafeteria() {
        cerradas = new ArrayList<>();
        abiertas = new ArrayList<>();
    }

    public ArrayList<Mesa> getCerradas() {
        return cerradas;
    }

    public void setCerradas(ArrayList<Mesa> cerradas) {
        this.cerradas = cerradas;
    }

    public ArrayList<Mesa> getAbiertas() {
        return abiertas;
    }

    public void setAbiertas(ArrayList<Mesa> abiertas) {
        this.abiertas = abiertas;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void addAbiertas(Mesa mesa) {
            mesa.setEstado(true);
            abiertas.add(mesa);
    }

    public void addCerrdas(Mesa mesa) {
            mesa.setEstado(false);
            abiertas.add(mesa);
    }

    public ArrayList<Double> recuento(ArrayList<Mesa> mesas) {
        ArrayList<Double> res = new ArrayList<>();
        for (Mesa mesa : mesas) {
            double recuento = 0;
            for (Producto producto : mesa.getProductos()) {
                recuento += producto.getPrecio();
            }
            res.add(recuento);
        }
        return res;
    }

    public void eliminarAbierta(Mesa mesa) {
        abiertas.remove(mesa);
    }

    public void eliminarCerrada(Mesa mesa) {
        cerradas.remove(mesa);
    }

    public Double cerrarYcobrar(Mesa mesa) {
        eliminarAbierta(mesa);
        addCerrdas(mesa);
        double cobro = 0;
        for (Producto producto : mesa.getProductos()) {
            cobro += producto.getPrecio();
        }
        return cobro;
    }

    public Mesa buscarAbiertas(String id) {
        Mesa mesa = null;
        boolean encontrado = false;
        int i = 0;
        while (i < abiertas.size() && !encontrado) {
            if (abiertas.get(i).getId().equals(id)) {
                mesa = abiertas.get(i);
                encontrado = true;
            }
            i++;
        }
        return mesa;
    }

    @Override
    public String toString() {
        return "Cafeteria{" +
                "cerradas=" + cerradas +
                ", abiertas=" + abiertas +
                ", cuenta=" + cuenta +
                '}';
    }
}
