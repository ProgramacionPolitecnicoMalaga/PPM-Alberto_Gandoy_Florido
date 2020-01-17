
public class Comisionado extends Empleado  implements CalcularNomina{
    private double sueldoExta;
    private Ventas ventas;

    public Comisionado(String nombre, String apellido, String nif, double sueldo, double sueldoExta, Ventas ventas) {
        super(nombre, apellido, nif, sueldo);
        this.sueldoExta = sueldoExta;
        this.ventas = ventas;
    }

    public double getSueldoExta() {
        return sueldoExta;
    }

    public void setSueldoExta(double sueldoExta) {
        this.sueldoExta = sueldoExta;
    }

    @Override
    public double calculo() {
        int sumaVenta = 0;
        for (int i = 0; i < ventas.getVentas().size(); i++) {
            sumaVenta += ventas.getVentas().get(i) * getSueldoExta();
        }
        return (sumaVenta * getSueldo()) + getSueldo();
    }
}
