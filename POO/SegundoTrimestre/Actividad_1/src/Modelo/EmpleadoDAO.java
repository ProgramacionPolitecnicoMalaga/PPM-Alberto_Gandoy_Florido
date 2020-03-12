package Modelo;

import java.util.ArrayList;

public interface EmpleadoDAO {
    public boolean insertarEmpleado(Empleado empleado);
    public ArrayList<Empleado> mostrarEmpleado();
    public boolean editarEmpleado(Empleado empleado, int idEmpleado);
    public boolean eliminarEmpleado(int idEmpleado);
    public Empleado buscarEmpleado(int idEmpleado);
}