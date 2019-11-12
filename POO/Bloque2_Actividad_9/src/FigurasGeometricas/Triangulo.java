package FigurasGeometricas;

public class Triangulo extends Figuras {

    private double baseTriangulo, alturaTriangulo;

    public Triangulo(String nombre, String color, double base, double altura){
        super(nombre,color);
        this.alturaTriangulo = altura;
        this.baseTriangulo = base;
    }

    public double getBaseTriangulo() {
        return baseTriangulo;
    }

    public void setBaseTriangulo(double baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public double getAlturaTriangulo() {
        return alturaTriangulo;
    }

    public void setAlturaTriangulo(double alturaTriangulo){
            this.alturaTriangulo = alturaTriangulo;
    }


    @Override
    public void calcularArea() {//Esto es lo mismo que hacer un método para que calculeBase*Altura y después haga return alculeBase*Altura;
        setAreaFiguras(baseTriangulo * alturaTriangulo /2);
    }
}

