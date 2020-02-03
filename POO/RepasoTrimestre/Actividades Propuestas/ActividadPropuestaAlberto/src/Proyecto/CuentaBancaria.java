package Proyecto;

import java.util.Objects;

public class CuentaBancaria {
    private String numeroDeCuenta;
    private double saldoContable;

    public CuentaBancaria(String numeroDeCuenta, double saldoContable) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldoContable = saldoContable;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getSaldoContable() {
        return saldoContable;
    }

    public void setSaldoContable(double saldoContable) {
        this.saldoContable = saldoContable;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroDeCuenta='" + numeroDeCuenta + '\'' +
                ", saldoContable=" + saldoContable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuentaBancaria that = (CuentaBancaria) o;
        return Objects.equals(numeroDeCuenta, that.numeroDeCuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDeCuenta);
    }
}
