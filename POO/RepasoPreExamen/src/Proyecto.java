import java.util.ArrayList;

public class Proyecto {
    private String nombreProyecto, departamento, descripcion;
    private double fprod = 2.0;
    private Empleado empleado;
    ArrayList<Proyecto> listaProyectos = new ArrayList<>();

    public Proyecto(String nombreProyecto, String departamento, String descripcion) {
        this.nombreProyecto = nombreProyecto;
        this.departamento = departamento;
        this.descripcion = descripcion;
        this.fprod = 2.5;
        this.empleado = empleado;
    }


    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getFprod() {
        return fprod;
    }

    public void setFprod(double fprod) {
        this.fprod = fprod;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombreProyecto='" + nombreProyecto + '\'' +
                ", departamento='" + departamento + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fprod=" + fprod +
                ", empleado=" + empleado +
                '}';
    }

    public void añadirProyecto(Proyecto proyecto) {
        listaProyectos.add(proyecto);
    }
}
