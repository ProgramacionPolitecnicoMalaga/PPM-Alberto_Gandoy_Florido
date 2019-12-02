public class JefeDeProyecto extends Empleado{
    private int sueldoProye;


    public JefeDeProyecto(String nombre, String apellido, String dni, String categoria) {
        super(nombre, apellido, dni, categoria);
        this.sueldoProye = sueldoProye;
    }

    public int getSueldoProye() {
        return sueldoProye;
    }

    public void setSueldoProye(int sueldoProye) {
        this.sueldoProye = sueldoProye;
    }

    @Override
    public String toString() {
        return "JefeDeProyecto{" +
                "sueldoProye=" + sueldoProye +
                '}';
    }
}
