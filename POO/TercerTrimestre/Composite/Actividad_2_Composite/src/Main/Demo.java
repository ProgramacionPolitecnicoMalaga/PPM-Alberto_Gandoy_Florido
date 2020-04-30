package Main;

import Builder.PaquetePorductoServicioBuilder;
import Composicion.Paquete;
import Composicion.Servicio;

public class Demo {
    public static void main(String[] args) {
        PaquetePorductoServicioBuilder pqsBuilder =
                new PaquetePorductoServicioBuilder(new Paquete("vps", Servicio.vps));

                pqsBuilder.crearBuilder("vps", Servicio.vps).
                crearBuilder("servidor", Servicio.servidor).
                addBuilder("cloudSolution", Servicio.cloudSolution).
                        getBuilderProductoPaqueteServicio();


    Servicio servicio = pqsBuilder.getPaquete();
    System.out.println(servicio.toString());
    }
}
