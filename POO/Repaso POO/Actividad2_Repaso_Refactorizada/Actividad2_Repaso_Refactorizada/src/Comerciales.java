import java.util.ArrayList;

public class Comerciales {
    private ArrayList<Comercial> comerciales;

    public Comerciales() {
        comerciales = new ArrayList<>();
    }

    public ArrayList<Comercial> getComerciales() {
        return comerciales;
    }

    public void setComerciales(ArrayList<Comercial> comerciales) {
        this.comerciales = comerciales;
    }

    public void addComercial(Comercial comercial) throws ExceptionComercialExistente {
        if (comerciales.contains(comercial))
            throw new ExceptionComercialExistente(comercial.getNombre() + " ya existe");
        else comerciales.add(comercial);
    }

    public void mostrarComercial() {
        for (Comercial comercial : comerciales) {
            System.out.println(comercial);
        }
    }

    @Override
    public String toString() {
        return "Comerciales{" +
                "comerciales=" + comerciales +
                '}';
    }
}
