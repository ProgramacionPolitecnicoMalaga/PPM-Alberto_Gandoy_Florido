public class Programador extends Empleado{
    private int sueldoProg;

    public Programador(String nombre, String apellido, String dni, String categoria) {
        super(nombre, apellido, dni, categoria);
        this.sueldoProg = 1800;
    }

    public int getSueldoProg() {
        return sueldoProg;
    }

    public void setSueldoProg(int sueldoProg) {
        this.sueldoProg = sueldoProg;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "sueldoProg=" + sueldoProg +
                '}';
    }
}
