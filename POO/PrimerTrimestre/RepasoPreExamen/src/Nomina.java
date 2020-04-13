public class Nomina {

    Actividad actividad;
    Empleado empleado;

    public Nomina() {}
    public Nomina(Actividad actividad, Empleado empleado) {
        this.actividad = actividad;
        this.empleado = empleado;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Nomina{" +
                "actividad=" + actividad +
                ", empleado=" + empleado +
                '}';
    }
}
