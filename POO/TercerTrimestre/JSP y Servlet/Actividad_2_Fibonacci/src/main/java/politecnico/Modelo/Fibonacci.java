package politecnico.Modelo;


public class Fibonacci {

    public Fibonacci() {
    }

    public int fibonacciRecursivo(int numero) throws FibonacciException {
        if (numero > 1)
            return fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero - 2);
         else if (numero == 1)
            return 1;
         else if (numero == 0)
            return 0;
         else
            throw new FibonacciException("El número no puede ser inferior a 0.");
    }

    public String mostrarSerie(int tamanyo) throws FibonacciException {
        String res = "";
        for (int i = 0; i < tamanyo; i++) {
            res += fibonacciRecursivo(i) + "\n";
        }
        return res + "\n";
    }
}
