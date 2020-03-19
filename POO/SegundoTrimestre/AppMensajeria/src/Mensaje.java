public class Mensaje {
    private int tipoMensaje;
    private String descripcion;
    private Persona persona;

    public Mensaje(int tipoMensaje, String descripcion,Persona persona) {
        this.tipoMensaje = tipoMensaje;
        this.descripcion = descripcion;
        this.persona = persona;
    }

    public int getTipoMensaje() {
        return tipoMensaje;
    }

    public void setTipoMensaje(int tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "tipoMensaje=" + tipoMensaje +
                ", descripcion='" + descripcion + '\'' +
                ", persona='" + persona + '\'' +
                '}';
    }
}
