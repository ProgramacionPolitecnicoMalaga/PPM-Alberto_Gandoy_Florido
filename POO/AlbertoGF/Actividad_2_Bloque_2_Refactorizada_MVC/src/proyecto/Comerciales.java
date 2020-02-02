package proyecto;

import LeerEscribir.Lector;

import java.util.ArrayList;

public class Comerciales {
    private ArrayList<Comercial> comerciales;
    private Lector lector;

    public Comerciales(Lector lector) {
        comerciales = new ArrayList<>();
        this.lector = lector;
    }

    public ArrayList<Comercial> getComerciales() {
        return comerciales;
    }

    public void setComerciales(ArrayList<Comercial> comerciales) {
        this.comerciales = comerciales;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public void addComercial(Comercial comercial)  {
        try {

            if (comerciales.contains(comercial))
                throw new ComercialException(comercial.getNombre() + " ya está añadido en la lista");
            else
                comerciales.add(comercial);

        } catch (ComercialException e) {
            e.printStackTrace();
        }

    }

    //Apartado 1: recorre comerciales y si tienen esa venta la añaden.
    public ArrayList<Comercial> buscarByVentas(int ventaSemanal) {
        ArrayList<Comercial> res = new ArrayList<>();

        for (Comercial comercial : comerciales) {
            for(VentaMensual venta: comercial.getVentasMensuales()){
                if(venta.getVentas().size() == ventaSemanal){
                    res.add(comercial);
                }
            }

        }
        return res;
    }

    //Apartado 2: obtener el promedio
    public ArrayList<Double> getPromedioPorEmpleado() {
        ArrayList<Double> res = new ArrayList<>();
        for (Comercial comercial : comerciales) {
            double promedio = 0;
            for (VentaMensual venta : comercial.getVentasMensuales()) {
                promedio += venta.getVentas().size();
            }
            promedio /= comercial.getVentasMensuales().size();
            res.add(promedio);
        }
        return res;
    }

    public Comercial buscarBestVenta() {//El mejor va a ser el primero, hasta recorrar la lista y encuentre el mejor.
        try {

       if (comerciales.size() <= 0) {
               throw new Exception("No puedes buscar la mejor venta en una lista vacía.");
           }
       }catch (Exception e) {
            e.printStackTrace();
        }

        Comercial mejorComercial = comerciales.get(0);
        for (int i = 1; i < comerciales.size(); i++ ) {
            if (comerciales.get(i).getRecordVenta().getVentas().size()> mejorComercial.getRecordVenta().getVentas().size())
                mejorComercial = comerciales.get(i);
        }
        return mejorComercial;
    }

    public Comercial buscarComercial(String nombre) {
        Comercial comercialEncontrado = null;
        boolean encontrado = false;
        int i = 0;
        while (comerciales.size() > i && !encontrado) {
            if (comerciales.get(i).getNombre().equals(nombre)) {
                comercialEncontrado = comerciales.get(i);
                encontrado = true;
            }
            i++;
        }
        return comercialEncontrado;
    }

    @Override
    public String toString() {
        return "proyecto.Comerciales{" +
                "comerciales=" + comerciales +
                '}';
    }
}
