package FigurasGeometricas;

public class Circulo extends Figuras {

    private double radioCirculo;

    public Circulo (String nombre, String color, double radio){
        super(nombre, color);
        this.radioCirculo = radio;
    }

    public double getRadioCirculo() {
        return radioCirculo;
    }

    public void setRadioCirculo(double radioCirculo) {
        this.radioCirculo = radioCirculo;
    }

    @Override
    public void calcularArea() {
        setAreaFiguras(Math.pow(radioCirculo,2) * (Math.PI));
    }
}

