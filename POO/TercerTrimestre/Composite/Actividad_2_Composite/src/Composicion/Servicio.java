package Composicion;

public interface Servicio {
    int ilink = 30;
    int rack = 20;
    int servidor = 25;
    int cloudSolution = 15;
    int vps = 20;
    boolean productoB = false;
    boolean paqueteB = true;

    void asignarPrecio(int precio);
    int obtenerPrecio();
    boolean getTipo();
}
