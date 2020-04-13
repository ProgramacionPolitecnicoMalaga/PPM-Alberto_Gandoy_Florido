import org.apache.commons.math3.analysis.function.Divide;
import org.apache.commons.math3.analysis.function.Multiply;

public class Division {

    Divide divide = new Divide();
    public double division(double a, double b) {
        return divide.value(a,b);
    }
}
