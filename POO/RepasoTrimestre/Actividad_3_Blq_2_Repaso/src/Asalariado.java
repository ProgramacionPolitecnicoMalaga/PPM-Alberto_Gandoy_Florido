public class Asalariado extends Empleado {
    private final double SUEDO_FIJO = 1000;

    public Asalariado(String nombre, String apellido, String nif, int sueldo, Nomina nomina) {
        super(nombre, apellido, nif, sueldo, nomina);
        super.setSueldo(SUEDO_FIJO);
    }

    public double getSUEDO_FIJO() {
        return SUEDO_FIJO;
    }
}
