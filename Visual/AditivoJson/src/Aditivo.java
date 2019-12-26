public class Aditivo {
    private String peligrosidad, nombre, descripcion;

    public Aditivo(String peligrosidad, String nombre, String descripcion) {
        this.peligrosidad = peligrosidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(String peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Aditivo{" +
                "peligrosidad='" + peligrosidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
