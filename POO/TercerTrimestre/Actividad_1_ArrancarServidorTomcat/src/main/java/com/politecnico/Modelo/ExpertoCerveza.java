package com.politecnico.Modelo;

import java.util.ArrayList;
import java.util.List;

public class ExpertoCerveza {
     private List<String> cervezas = new ArrayList<>();

    public List getMarcas(String color){

        if (color.equals("clara")) {
                cervezas.add("San Miguel - Fresca");
                cervezas.add("Estrea Damm - Saaz");
                return cervezas;
        } else if (color.equals("ambar")) {
            cervezas.add("Ambar - Especial");
            cervezas.add("Alhambra - Especial");
            cervezas.add("Estrella Damm - Original");
            return cervezas;
        } else if (color.equals("marron")) {
            cervezas.add("Estrella Damm - Bock-Damm");
            cervezas.add("Mahou - Maestra");
            return cervezas;
        } else if (color.equals("negra")) {
            cervezas.add("Estrella Galicia - 1906 Black Coupage");
            cervezas.add("Alhambra - Baltic Porter");
        } else {
            cervezas.add("No hay cervezas elegidas");
            return cervezas;
        }
        return cervezas;
    }

    @Override
    public String toString() {
        return "ExpertoCerveza{" +
                "cervezas=" + cervezas +
                '}';
    }
}
