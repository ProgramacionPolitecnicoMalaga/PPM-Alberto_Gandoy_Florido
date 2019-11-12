package FigurasGeometricas;

public abstract class  Figuras  {
    private String nombreFigura, colorFigura;
    private double areaFiguras;

    public Figuras(String nombreFigura, String colorFigura){
        this.nombreFigura = nombreFigura;
        this.colorFigura = colorFigura;
        this.areaFiguras = 0;//se declara a cero y después cuando se haga el cálculo sale el resultado del área.
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public String getColorFigura() {
        return colorFigura;
    }

    public void setColorFigura(String colorFigura) {
        this.colorFigura = colorFigura;
    }

    public double getAreaFiguras() {
        return areaFiguras;
    }

    public void setAreaFiguras(double areaFiguras) {
        this.areaFiguras = areaFiguras;
    }

    public abstract void calcularArea();

    @Override
    public String toString() {
        return "===============DATOS DE LA FIGURA=================\n" +
                "- Nombre: " + nombreFigura  + "\n" +
                "- Color: " + colorFigura + "\n" +
                "- Área: " + areaFiguras + "\n" +
                "==================================================";
    }
}
