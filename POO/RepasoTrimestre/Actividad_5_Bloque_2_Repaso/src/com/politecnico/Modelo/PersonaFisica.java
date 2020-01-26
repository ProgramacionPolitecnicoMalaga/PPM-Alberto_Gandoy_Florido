package com.politecnico.Modelo;

public class PersonaFisica extends Persona {
    private String dni, direccion;

    public PersonaFisica(String nombre, String apellido, String idSubasta) {
        super(nombre, apellido, idSubasta);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
