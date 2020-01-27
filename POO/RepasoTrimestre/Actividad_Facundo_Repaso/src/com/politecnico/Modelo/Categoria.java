package com.politecnico.Modelo;

import com.politecnico.Negocio.Estado;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Categoria {
    private String id, nombre;
    private Estado estado;
    private ArrayList<Tarea> tareas;

    public Categoria(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        tareas = new ArrayList<>();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void addTarea(Tarea tarea) {
        if (tareas.contains(tarea)) {
            try {
                throw new ExceptionCategoria("La categoría " + tarea.getId() + " ya existe.");
            } catch (ExceptionCategoria exceptionCategoria) {
                exceptionCategoria.printStackTrace();
            }
        } else {
            tareas.add(tarea);
        }
    }

    public Tarea consultarTareaPorFecha(Date fechaTarea) {
        Tarea tareaAbuscar = null;
        boolean encontrado = false;
        int i = 0;
        while (tareas.size() > i && !encontrado) {
            if (tareas.get(i).getFecha().equals(fechaTarea)) {
                tareaAbuscar = tareas.get(i);
                encontrado = true;
            }
            i++;
        }
        return tareaAbuscar;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tareas=" + tareas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
