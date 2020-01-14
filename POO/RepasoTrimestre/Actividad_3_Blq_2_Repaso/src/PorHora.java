public class PorHora extends Empleado {
    private double hora;

    public PorHora(String nombre, String apellido, String nif, double sueldo, Nomina nomina, double hora) {
        super(nombre, apellido, nif, sueldo, nomina);
        this.hora = hora;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }
}
