import java.util.ArrayList;

public class Provincias {
    private ArrayList<Provincia> provincias;

    public Provincias() {
        provincias = new ArrayList<>();
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public void añadirProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    public void mostrarProvincias() {
        for (Provincia provincia: provincias) {
            System.out.println(provincia);
        }
    }

    //1
    public void obtenerProvinciaDeUnaEstacion(String nombreEstacion) {
        int k = 0;
        int i = 0;
        boolean encotrado = false;
        while (provincias.size() > i && !encotrado) {
            while (provincias.get(i).getEstaciones().size() > k && encotrado == false) {
                if (provincias.get(i).getEstaciones().get(k).getNombre().equals(nombreEstacion)) {
                    System.out.println("La estación: " + nombreEstacion + " pertenece a " + provincias.get(i).getNombre());
                    encotrado = true;
                }
                k++;
            }
            k = 0;
            i++;
        }
    }

    //2
    public void ciudadQueTienenEstaciones() {
        for (Provincia provincia : provincias) {
            for (Ciudad ciudad : provincia.getCiudades()) {
                System.out.println( "LA CIUDAD: " + ciudad.getNombre()+ " TIENE LA ESTACIÓN: " +  ciudad.getEstaciones());
            }
        }
    }

    public void obtenerTranporteDeUnaEstacion(String nombreEstacion) {
        int k = 0;
        int i = 0;
        boolean encotrado = false;
        while (provincias.size() > i && !encotrado) {
            while (provincias.get(i).getEstaciones().size() > k && !encotrado) {
                if (provincias.get(i).getEstaciones().get(k).getNombre().equals(nombreEstacion)) {
                    System.out.println("La estación: " + nombreEstacion + " tiene el método de transporte: " + provincias.get(i).getEstaciones().get(k).getTransporte().getTipoDeTransporte());
                    encotrado = true;
                }
                k++;
            }
            i++;
            k = 0;
        }
    }

    public void obtenerEstacionesMasCernas() {
        double menorDistancia = Double.MAX_VALUE;
        for (Provincia provincia : provincias){
            for (Estacion estacion : provincia.getEstaciones()) {
                    double theta = estacion.getUbicacion().getLongitud() + estacion.getUbicacion().getLongitud();
                    double dist = Math.sin(Math.toRadians(estacion.getUbicacion().getLatitud())) *
                            Math.sin(Math.toRadians(estacion.getUbicacion().getLatitud())) + Math.cos(Math.toRadians(estacion.getUbicacion().getLatitud())) *
                            Math.cos(Math.toRadians(estacion.getUbicacion().getLatitud())) * Math.cos(Math.toRadians(theta));
                    dist = Math.acos(dist);
                    dist = Math.toDegrees(dist);
                    dist = dist * 60 * 1.853159616;

                    if(dist < menorDistancia){//si la distancia de este establecimiento es menor actualizamos el más cercano
                        menorDistancia = dist;
                    }
                System.out.println("La estación más cercana es " + estacion.getNombre() + " y encuentra a una distancia de: " + menorDistancia);
            }
        }
    }

    @Override
    public String toString() {
        return "Provincias: " + provincias;
    }
}
