import org.apache.commons.math3.stat.descriptive.summary.Sum;

public class Suma {
    Sum sum = new Sum();
    public double sumar(double[] numeros) {
        return sum.evaluate(numeros,0,numeros.length);
    }
}
