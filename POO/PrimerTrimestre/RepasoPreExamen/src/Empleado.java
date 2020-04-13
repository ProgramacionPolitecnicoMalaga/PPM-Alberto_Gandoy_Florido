import java.util.ArrayList;

public  abstract class Empleado {
    private String nombre, apellido,dni,categoria;
    private Nomina nomina;
    Proyecto proyecto;
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    ArrayList<Actividad> listaActividades = new ArrayList<>();

    public Empleado(String nombre, String apellido, String dni, String categoria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Actividad> getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(ArrayList<Actividad> listaActividades) {
        this.listaActividades = listaActividades;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    public void añadirActividades(Actividad actividad) {
        listaActividades.add(actividad);
    }
    public void añadirEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }
}
