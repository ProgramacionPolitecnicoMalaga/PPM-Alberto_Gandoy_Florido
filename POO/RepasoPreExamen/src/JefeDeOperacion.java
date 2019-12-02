public class JefeDeOperacion extends Empleado{
    private int sueldoOpe = 2500;

    public JefeDeOperacion(String nombre, String apellido, String dni, String categoria) {
        super(nombre, apellido, dni, categoria);
        this.sueldoOpe = sueldoOpe;
    }

    public int getSueldoOpe() {
        return sueldoOpe;
    }

    public void setSueldoOpe(int sueldoOpe) {
        this.sueldoOpe = sueldoOpe;
    }

    @Override
    public String toString() {
        return "JefeDeOperacion{" +
                "sueldoOpe=" + sueldoOpe +
                '}';
    }
}
