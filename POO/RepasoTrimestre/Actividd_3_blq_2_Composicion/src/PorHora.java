public class PorHora extends Empleado implements CalcularNomina{
    private int hora;

    public PorHora(String nombre, String apellido, String nif, double sueldo, int hora) {
        super(nombre, apellido, nif, sueldo);
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public double calculo() {
        return getHora() * getSueldo();
    }
}
