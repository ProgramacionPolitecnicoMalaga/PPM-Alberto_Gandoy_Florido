public class Actividad {

    private Empleado empleado;
    private int horasDedicadas;
    private Proyecto proyecto;

    public Actividad(Empleado empleado, int horasDedicadas, Proyecto proyecto) {
        this.empleado = empleado;
        this.horasDedicadas = horasDedicadas;
        this.proyecto = proyecto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public int getHorasDedicadas() {
        return horasDedicadas;
    }

    public void setHorasDedicadas(int horasDedicadas) {
        this.horasDedicadas = horasDedicadas;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Actividad{" +
                "empleado=" + empleado +
                ", horasDedicadas=" + horasDedicadas +
                ", proyecto=" + proyecto +
                '}';
    }
}
