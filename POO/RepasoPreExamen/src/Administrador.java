public class Administrador extends Empleado{
    private int sueldoAdmin;

    public Administrador(String nombre, String apellido, String dni, String categoria) {
        super(nombre, apellido, dni, categoria);
        this.sueldoAdmin = sueldoAdmin;
    }

    public int getSueldoAdmin() {
        return sueldoAdmin;
    }

    public void setSueldoAdmin(int sueldoAdmin) {
        this.sueldoAdmin = sueldoAdmin;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "sueldoAdmin=" + sueldoAdmin +
                '}';
    }
}
