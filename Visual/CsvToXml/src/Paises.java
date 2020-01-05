import java.util.ArrayList;

public class Paises {
    private ArrayList<Pais> paises;

    public Paises() {
        paises = new ArrayList<>();
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    public void añadirPais(Pais pais) {
        paises.add(pais);
    }

    public void mostrarPaises() {
        for (Pais pais : paises) {
            System.out.println(pais);
        }
    }

    @Override
    public String toString() {
        return "Paises{" +
                "paises=" + paises +
                '}';
    }
}
