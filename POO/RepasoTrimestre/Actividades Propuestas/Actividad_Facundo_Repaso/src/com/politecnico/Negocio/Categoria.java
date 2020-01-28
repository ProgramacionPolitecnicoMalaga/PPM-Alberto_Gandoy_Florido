package com.politecnico.Negocio;

import com.politecnico.Modelo.ExceptionCategoria;
import com.politecnico.Modelo.ExceptionEstado;
import com.politecnico.Modelo.Tarea;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Categoria {
    private String id, nombre;
    private ArrayList<Tarea> pendientes;
    private ArrayList<Tarea> ejecutadas;

    public Categoria(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        pendientes = new ArrayList<>();
        ejecutadas = new ArrayList<>();

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

    public ArrayList<Tarea> getPendientes() {
        return pendientes;
    }

    public void setPendientes(ArrayList<Tarea> pendientes) {
        this.pendientes = pendientes;
    }

    public ArrayList<Tarea> getEjecutadas() {
        return ejecutadas;
    }

    public void setEjecutadas(ArrayList<Tarea> ejecutadas) {
        this.ejecutadas = ejecutadas;
    }

    public void addTareaPendiente(Tarea tarea) {
        if (pendientes.contains(tarea) && tarea.isEstado() == true) {
            try {
                throw new ExceptionEstado("La tarea que estás añadiendo ya está en estado pendiente");
            } catch (ExceptionEstado exceptionEstado) {
                exceptionEstado.printStackTrace();
            }
        } else if (tarea.isEstado() == false){ pendientes.add(tarea); }
    }

    public Tarea consultarTareaPendiente(String idTarea) {
        Tarea tareaPendiente = null;
        boolean encontrado = false;
        int i = 0;
        while (pendientes.size() > i && !encontrado) {
            if (pendientes.get(i).getId().equals(idTarea)) {
                tareaPendiente = pendientes.get(i);
                encontrado = true;
            }
            i++;
        }
        return tareaPendiente;
    }

    public void addTareaEjecutada(Tarea tarea) {
        if (pendientes.contains(tarea)) {
            pendientes.remove(tarea);
            tarea.setEstado(true);
            ejecutadas.add(tarea);
        } else if (ejecutadas.contains(tarea)) {
            try {
                throw new ExceptionEstado("La tarea que estás añadiendo ya está en ejecución");
            } catch (ExceptionEstado exceptionEstado) {
                exceptionEstado.printStackTrace();
            }
        }
    }

    public void eliminarTareaFinaliza(Tarea tarea) {
      if (tarea.isEstado() == true) {
          ejecutadas.remove(tarea);
      } else {
          try {
              throw new ExceptionEstado("La tarea sigue en ejecución o está en pendientes.");
          } catch (ExceptionEstado exceptionEstado) {
              exceptionEstado.printStackTrace();
          }
      }
    }

    public Tarea consultarTareasEnEjecucion(String idTarea) {
        Tarea tareaPendiente = null;
        boolean encontrado = false;
        int i = 0;
        while (ejecutadas.size() > i && !encontrado) {
            if (ejecutadas.get(i).getId().equals(idTarea)) {
                tareaPendiente = ejecutadas.get(i);
                encontrado = true;
            }
            i++;
        }
        return tareaPendiente;
    }

    public Tarea consultarTareaPendientePorFecha(Date fechaTarea) {
        Tarea tareaAbuscar = null;
        boolean encontrado = false;
        int i = 0;
        while (pendientes.size() > i && !encontrado) {
            if (pendientes.get(i).getFecha().equals(fechaTarea)) {
                tareaAbuscar = pendientes.get(i);
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
                ", pendientes=" + pendientes +
                ", ejecutadas=" + ejecutadas +
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
