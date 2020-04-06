package Modelo;

import java.util.ArrayList;

public interface Iempleado {
     Empleado insertar(String nombre, int edad);
     Empleado editar(String nombre, int edad, int id);
     boolean eliminar(int id);
     Empleado buscar(int id);
     ArrayList<Empleado> mostrar();


}
