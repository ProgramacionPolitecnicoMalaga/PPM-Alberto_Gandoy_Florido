package Modelo;

import java.util.Objects;

public class Mensaje {
    private int id, imdFK;
    private String titulo, texto, emisor, receptor, fecha;

    public Mensaje() {
    }

    public Mensaje(String titulo, String texto, String emisor, String receptor, String fecha, int imdFK) {
        this.titulo = titulo;
        this.texto = texto;
        this.emisor = emisor;
        this.receptor = receptor;
        this.fecha = fecha;
        this.imdFK = imdFK;
    }

    public Mensaje(int id, String titulo, String texto, String emisor, String receptor, String fecha) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
        this.emisor = emisor;
        this.receptor = receptor;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getImdFK() {
        return imdFK;
    }

    public void setImdFK(int imdFK) {
        this.imdFK = imdFK;
    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", texto='" + texto + '\'' +
                ", emisor='" + emisor + '\'' +
                ", receptor='" + receptor + '\'' +
                ", fecha=" + fecha + '\'' +
                ", idmfk=" + imdFK +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mensaje mensaje = (Mensaje) o;
        return id == mensaje.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
