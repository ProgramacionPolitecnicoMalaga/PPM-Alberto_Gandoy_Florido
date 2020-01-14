import java.util.Objects;

public abstract class Empleado {
    private String nombre, apellido, nif;
    private double sueldo;
    private Nomina nomina;

    public Empleado(String nombre, String apellido, String nif, double sueldo, Nomina nomina) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.sueldo = sueldo;
        this.nomina = nomina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nif='" + nif + '\'' +
                ", sueldo=" + sueldo +
                ", nomina=" + nomina +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(nif, empleado.nif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif);
    }
}
