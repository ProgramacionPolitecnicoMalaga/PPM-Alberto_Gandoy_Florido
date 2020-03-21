package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Item {
    private int id;
    private String autor;
    private String fecha;
    private String descripcion;
    private String tema;

    public Item() {
    }

    public Item(String autor, String fecha, String descripcion, String tema) {
        this.autor = autor;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tema = tema;
    }

    public Item(int id, String tema, String descripcion) {
        this.tema = tema;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
                "id=" + id +
                ", autor='" + autor + '\'' +
                ", fecha=" + fecha +
                ", descripcion='" + descripcion + '\'' +
                ", tema='" + tema + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
