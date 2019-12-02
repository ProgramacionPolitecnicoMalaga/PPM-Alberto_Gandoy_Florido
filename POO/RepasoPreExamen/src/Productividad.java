public class Productividad {

    Nomina actividad;
    Empleado empleado;

    public Productividad(Nomina actividad, Empleado empleado) {
        this.actividad = actividad;
        this.empleado = empleado;
    }

    public Nomina getActividad() {
        return actividad;
    }

    public void setActividad(Nomina actividad) {
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
        return "Productividad{" +
                "actividad=" + actividad +
                ", empleado=" + empleado +
                '}';
    }
}
