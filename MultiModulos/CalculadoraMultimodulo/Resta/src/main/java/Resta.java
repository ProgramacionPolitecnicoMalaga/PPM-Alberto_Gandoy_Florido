import org.apache.commons.math3.analysis.function.Subtract;
import org.apache.commons.math3.stat.descriptive.summary.Sum;

public class Resta {

    Subtract subtract = new Subtract();
    public double restar(double a, double b) {
        return subtract.value(a,b);
    }
}
