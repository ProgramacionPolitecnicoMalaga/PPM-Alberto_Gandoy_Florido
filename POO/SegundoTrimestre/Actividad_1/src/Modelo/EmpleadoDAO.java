package Modelo;

import java.util.ArrayList;

public interface EmpleadoDAO {
    public boolean addEmpleado(Empleado empleado);
    public ArrayList<Empleado> mostrarEmpleado();
    public boolean editarEmpleado(Empleado empleado, int idEmp);
    public boolean eliminarEmpleado(int idEmp);
    public Empleado buscarEmpleado(int idEmp);
}