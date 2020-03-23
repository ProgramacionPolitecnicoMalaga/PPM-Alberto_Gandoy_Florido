package Modelo;

import java.time.LocalDate;

public class Item {
    private String autor;
    private LocalDate fecha;
    private String texto;
    private String tema;

    public Item() {
    }

    public Item(String autor, LocalDate fecha, String texto, String tema) {
        this.autor = autor;
        this.fecha = fecha;
        this.texto = texto;
        this.tema = tema;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "Item{" +
                "autor='" + autor + '\'' +
                ", fecha=" + fecha +
                ", texto='" + texto + '\'' +
                ", tema='" + tema + '\'' +
                '}';
    }
}