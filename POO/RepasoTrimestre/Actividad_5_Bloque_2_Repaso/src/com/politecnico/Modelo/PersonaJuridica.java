package com.politecnico.Modelo;

public class PersonaJuridica extends Persona {
    private String cif, razonSocial;

    public PersonaJuridica(String nombre, String apellido, String idSubasta) {
        super(nombre, apellido, idSubasta);
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
