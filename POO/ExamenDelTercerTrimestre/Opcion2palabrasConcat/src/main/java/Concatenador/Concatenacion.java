package Concatenador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Concatenacion {
    private List<String> palabras;

    public Concatenacion() {
        this.palabras = new ArrayList<>();
    }

    public List<String> getPalabras() {
        return palabras;
    }

    public void setPalabras(List<String> palabras) {
        this.palabras = palabras;
    }

    public void addPalabra(String palabra) {
        if (palabra == null)
            throw new IllegalArgumentException("La palabra es nula");
        else palabras.add(palabra);
    }

    public List<String> concatenar(List<String> palabras) {
        String cadena = "";
        for (int i = 0; i < palabras.size(); i++) {
            cadena += palabras.get(i);
        }
        this.palabras.add(cadena);
        return this.palabras;
    }

    @Override
    public String toString() {
        return "Concatenar{" +
                "palabras=" + palabras +
                '}';
    }

   /* public static void main(String[] args) {
        Concatenar concatenar =new Concatenar();
        ArrayList<String> palabra = new ArrayList<>();
        palabra.add("HOLA");
        palabra.add("DDDD");
        palabra.add("CCCCC");
        System.out.println(concatenar.concatenar(palabra));

    }*/
}
