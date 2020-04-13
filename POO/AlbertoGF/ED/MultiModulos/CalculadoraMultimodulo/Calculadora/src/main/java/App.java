import org.apache.commons.math3.stat.descriptive.summary.Sum;

public class App {
    public static void main(String[] args) {
        Suma suma = new Suma();
        double[] x = {1.2,1.2};
        System.out.println(suma.sumar(x));

        Resta resta = new Resta();
        System.out.println(resta.restar(2.0, 3.1));

        Multiplicacion multiplicacion = new Multiplicacion();
        System.out.println(multiplicacion.multiplicar(2.0, 2.0));

        Division division = new Division();
        System.out.println(division.division(2.0, 4.0));
    }
}
