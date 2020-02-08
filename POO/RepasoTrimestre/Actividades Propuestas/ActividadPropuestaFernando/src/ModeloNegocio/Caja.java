package ModeloNegocio;

import Listas.Mesas;

import java.util.ArrayList;


public class Caja {
    private Cuenta cuenta;
    private Mesas mesas;
    private ArrayList<Cuenta> cuentas;
    private ArrayList<Double> recuento;

    public Caja() {
        recuento = new ArrayList<>();
    }

    public Caja(Cuenta cuenta, Mesas mesas) {
        this.cuenta = cuenta;
        this.mesas = mesas;
        recuento = new ArrayList<>();
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Mesas getMesas() {
        return mesas;
    }

    public void setMesas(Mesas mesas) {
        this.mesas = mesas;
    }

    public ArrayList<Double> getRecuento() {
        return recuento;
    }

    public void setRecuento(ArrayList<Double> recuento) {
        this.recuento = recuento;
    }

    public Mesa buscarMesasAbierta(String idMesa) {
        Mesa mesaEncontrada = null;
        boolean encontrado = false;
        int i = 0;
        while (mesas.getAbiertas().size() < i   && !encontrado) {
            if (mesas.getAbiertas().get(i).getId().equals(idMesa)) {
                mesaEncontrada = mesas.getAbiertas().get(i);
                encontrado = true;
            }
            i++;
        }
        return mesaEncontrada;
    }

    public Mesa buscarMesasCerradas(String idMesa) {
        Mesa mesaEncontrada = null;
        boolean encontrado = false;
        int i = 0;
        while (mesas.getCerradas().size() > i   && !encontrado) {
            if (mesas.getCerradas().get(i).getId().equals(idMesa)) {
                mesaEncontrada = mesas.getCerradas().get(i);
                encontrado = true;
            }
            i++;
        }
        return mesaEncontrada;
    }


    public void getMesasCerradasOabiertas(ArrayList<Mesa> mesas) {
        for (Mesa mesa : mesas) {
            System.out.println(mesa);
        }
    }

    public ArrayList<Double> consultarRecuentoActual() {
        ArrayList<Double> res = new ArrayList<>();
        for (Mesa mesa : mesas.getCerradas()) {
            double promedio = 0;
            for (Producto producto : mesa.getProductos()) {
                promedio += producto.getPrecio();
            }
            res.add(promedio);
        }
        return res;
    }

    public Double cerrarYcobrar(Mesa mesa) {
        mesas.cerrarMesa(mesa);
        double promedio = 0;
        for (Producto producto : mesa.getProductos()) {
                promedio += producto.getPrecio();
            }
        return promedio;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "cuenta=" + cuenta +
                ", mesas=" + mesas +
                '}';
    }
}
