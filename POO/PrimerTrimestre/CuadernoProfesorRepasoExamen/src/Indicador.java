public class Indicador {
    private String tipo, nombreIndicador, nota, descripcion;

    public Indicador(String tipo, String nombreIndicador, String nota, String descripcion) {
        this.tipo = tipo;
        this.nombreIndicador = nombreIndicador;
        this.nota = nota;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombreIndicador() {
        return nombreIndicador;
    }

    public void setNombreIndicador(String nombreIndicador) {
        this.nombreIndicador = nombreIndicador;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "INDICADOR DE LA ASINATURA" +
                "Tipo: " + tipo + '\'' +
                "Nombre: " + nombreIndicador + '\'' +
                "Nota: " + nota + '\'' +
                "Descripción: "+ descripcion + '\'' +
                '}';
    }
}
