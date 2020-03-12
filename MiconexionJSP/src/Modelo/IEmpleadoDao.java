package Modelo;

import java.util.List;

public interface IEmpleadoDao {
    public boolean registrar(Empleado empleado);
    public List<Empleado> obtener();
    public boolean actualizar(Empleado empleado);
    public boolean eliminar(Empleado empleado);
}
