package Concatenador;

import java.util.List;

public class Concatenacion {

    public String concatenador (List<String> palabras) {
        String concatenada = "";
        for (int i = 0; i < palabras.size(); i++) {
            concatenada += palabras.get(i);
        }
        return concatenada;
    }
}
