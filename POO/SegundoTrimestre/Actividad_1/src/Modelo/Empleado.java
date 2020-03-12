package Modelo;

/* Credenciales BD Mauri:
USUARIO: empleadosuser
SERVIDOR: vps791421.ovh.net
CONTRASEÑA: Perro20
BASE DE DATOS: Empleados
*/
public class Empleado {
    private int id;
    private String nombre;
    private int edad;

    public Empleado() {
    }

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return " ID " + id +
                " NOMBRE " + nombre +
                " EDAD " + edad + "\n";
    }
}