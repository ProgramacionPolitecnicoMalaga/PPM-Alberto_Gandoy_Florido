package Actividad6;

public  class Comisionados extends Empleados{




    public int getSalarioBase() {
        return salarioBaseComisionado;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBaseComisionado = salarioBase;
    }

    public int getEurosPorVentas() {
        return eurosPorVentasComisionado;
    }

    public void setEurosPorVentas(int eurosPorVentas) {
        eurosPorVentasComisionado = eurosPorVentas;
    }

    public Comisionados(String nombre, String primerApellido, String segundoApellido, int dni, int numVentas) {
        super();
        this.salarioBaseComisionado = salarioBaseComisionado;
        this.eurosPorVentasComisionado = eurosPorVentasComisionado;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.dni = dni;

    }



}

