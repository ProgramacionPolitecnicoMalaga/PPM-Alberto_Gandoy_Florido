package Actividad13;

public class Cola {
    //Declaracion de atributos
    private int dato;
    private Cola siguiente;

    //Constructor
    public Cola(int dato) {

        this.dato = dato;
    }

    //Metodos getter and setters
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Cola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cola siguiente) {
        this.siguiente = siguiente;
    }

    public String toString() {
        String s = " " + dato + " ";
        return s;
    }
}