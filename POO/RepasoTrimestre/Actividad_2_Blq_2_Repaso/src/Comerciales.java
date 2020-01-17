import java.util.ArrayList;

public class Comerciales {
    private ArrayList<Comercial> comerciales;

    public Comerciales() {
        comerciales = new ArrayList<>();
    }

    public void añadirComercial(Comercial comercial) throws ExceptionComercialExistente {
        if (comerciales.contains(comercial)) {
            throw new ExceptionComercialExistente(comercial.getNombre() + " ya existe");
        } else {
            comerciales.add(comercial);
        }
    }

    public void mostrarComerciales() {
        for (Comercial comercial : comerciales) {
            System.out.println("Los comerciales que tiene nuestra empresa son: " + "\n" + comercial);
        }
    }
}
