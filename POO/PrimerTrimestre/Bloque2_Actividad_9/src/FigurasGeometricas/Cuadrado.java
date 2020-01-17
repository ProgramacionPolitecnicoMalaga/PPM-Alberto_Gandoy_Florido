package FigurasGeometricas;

public class Cuadrado extends Figuras {
   double ladoCuadrado;

    public Cuadrado(String nombre, String color, double lado){
        super(nombre, color);
        this.ladoCuadrado = lado;
    }

    public double getLadoCuadrado() {
        return ladoCuadrado;
    }

    public void setLadoCuadrado(double ladoCuadrado) {
        this.ladoCuadrado = ladoCuadrado;
    }


    @Override
    public void calcularArea() {
        setAreaFiguras(Math.pow(ladoCuadrado,2));
    }
}
