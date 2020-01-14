public class Nomina {
    private double sueldoTotal;

    public Nomina(double sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }

    public Nomina() {
    }

    @Override
    public String toString() {
        return "Nomina{" +
                "sueldoTotal=" + sueldoTotal +
                '}';
    }
}
