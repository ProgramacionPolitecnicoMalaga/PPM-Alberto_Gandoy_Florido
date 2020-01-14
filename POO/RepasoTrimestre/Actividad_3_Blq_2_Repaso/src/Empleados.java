import java.util.ArrayList;

public class Empleados {
    private ArrayList<Empleado> empleados;

    public Empleados() {
        empleados = new ArrayList<>();
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void addEmpleado(Empleado empleado) throws ExceptionEmpleado {
            if (empleados.contains(empleado)) {
                throw new ExceptionEmpleado(empleado.getNombre() + " ya está añadido");
            } else {
                empleados.add(empleado);
            }
    }

    public void printEmpleado() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

 /*   public ArrayList<String> buscarEmpleado(String nombre, String apellido, String nif) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < empleados.size(); i++) {
            Empleado empleado = empleados.get(i);
            if (empleado.getNif().equals(nif)) {
                result.add(nombre);
                result.add(apellido);
                result.add(nombre);
            }
        }
        return result;
    }*/

    @Override
    public String toString() {
        return "Empleados{" +
                "empleados=" + empleados +
                '}';
    }
}
