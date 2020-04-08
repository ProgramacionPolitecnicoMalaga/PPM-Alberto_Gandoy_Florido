import org.apache.commons.math3.analysis.function.Multiply;
import org.apache.commons.math3.analysis.function.Subtract;

public class Multiplicacion {

    Multiply multiply = new Multiply();
    public double multiplicar(double a, double b) {
        return multiply.value(a,b);
    }
}
