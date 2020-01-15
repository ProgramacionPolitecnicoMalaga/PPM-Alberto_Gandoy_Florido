public class Asalariado extends Empleado implements CalcularNomina{

    public Asalariado(String nombre, String apellido, String nif, double sueldo) {
        super(nombre, apellido, nif, 2000);
    }

    @Override
    public double calculo() {
        return getSueldo();
    }
}
