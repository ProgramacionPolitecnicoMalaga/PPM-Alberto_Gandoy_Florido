package Negocio;

import java.util.ArrayList;

public class Cuenta {
    private ArrayList<ArrayList<Double>> cuentas;

    public Cuenta() {
        cuentas = new ArrayList<>();
    }

    public ArrayList<ArrayList<Double>> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<ArrayList<Double>> cuentas) {
        this.cuentas = cuentas;
    }

    public void addCuentas(ArrayList<Double> c) {
        cuentas.add(c);
    }

    public void mostrarCuentas() {
        for (ArrayList<Double> c : cuentas) {
            System.out.println(c);
        }
    }
}
