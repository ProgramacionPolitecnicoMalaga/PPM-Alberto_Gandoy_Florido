public class Tecnico extends Empleado{
    private int sueldoTec;

    public Tecnico(String nombre, String apellido, String dni, String categoria) {
        super(nombre, apellido, dni, categoria);
        this.sueldoTec = sueldoTec;
    }

    public int getSueldoTec() {
        return sueldoTec;
    }

    public void setSueldoTec(int sueldoTec) {
        this.sueldoTec = sueldoTec;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "sueldoTec=" + sueldoTec +
                '}';
    }
}
