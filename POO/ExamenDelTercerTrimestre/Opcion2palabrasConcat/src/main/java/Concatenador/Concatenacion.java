package Concatenador;

import java.util.ArrayList;
import java.util.List;

public class Concatenacion {

    public String concatenador (List<String> palabras) {
        String concatenada = "";
        for (int i = 0; i < palabras.size(); i++) {
            concatenada += palabras.get(i);
        }
        return concatenada;
    }


    public static void main(String[] args) {
        ArrayList<String> palabra = new ArrayList<>();
        palabra.add("fdfgdsf");
        palabra.add("HOLA");
        Concatenacion concatenacion = new Concatenacion();
        System.out.println(concatenacion.concatenador(palabra));

    }
}
