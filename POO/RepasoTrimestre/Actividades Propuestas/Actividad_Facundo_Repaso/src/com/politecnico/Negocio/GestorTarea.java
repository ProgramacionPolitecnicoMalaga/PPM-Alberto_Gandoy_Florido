package com.politecnico.Negocio;

import com.politecnico.Modelo.ExceptionCategoria;
import com.politecnico.Modelo.ExceptionEstado;
import com.politecnico.Modelo.Tarea;

import java.util.ArrayList;
import java.util.Date;

public class GestorTarea {
    private Categorias categorias;

    public GestorTarea(Categorias categorias) {
        this.categorias = categorias;
    }

    public Categorias getCategorias() {
        return categorias;
    }

    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }

    public void addCategoria(Categoria categoria) {
        if (categorias.getCategorias().contains(categoria)) {
            try {
                throw new ExceptionCategoria("La categoría " + categoria.getNombre() + " ya existe.");
            } catch (ExceptionCategoria exceptionCategoria) {
                exceptionCategoria.printStackTrace();
            }
        } else {
            categorias.getCategorias().add(categoria);
        }
    }

    public void mostrarCategoriasExistentes() {
        for (Categoria categoria : categorias.getCategorias()) {
            System.out.println(categoria);
        }
    }

    public ArrayList<Tarea> consultarTareasDeUnCategoria(String id) {
        ArrayList<Tarea> res = new ArrayList<>();
        for (Categoria categoria : categorias.getCategorias()) {
            for(Tarea tarea : categoria.getPendientes()){
                if(tarea.getId().equals(id)){
                    res.add(tarea);
                }
            }
        }
        return res;
    }

    public void addTareaPendiente(Tarea tarea) {
        for (int i = 0; i < categorias.getCategorias().size(); i++)
        if (categorias.getCategorias().get(i).getPendientes().contains(tarea) && tarea.isEstado() == true) {
            try {
                throw new ExceptionEstado("La tarea que estás añadiendo ya está en estado pendiente");
            } catch (ExceptionEstado exceptionEstado) {
                exceptionEstado.printStackTrace();
            }
        } else if (tarea.isEstado() == false) {
            categorias.getCategorias().get(i).getPendientes().add(tarea);
        }
    }


  public ArrayList<Tarea> consultarTareaPendiente(String idTarea) {
        ArrayList<Tarea> res = new ArrayList<>();
      for (Categoria categoria : categorias.getCategorias()) {
          for (Tarea tarea : categoria.getPendientes()) {
              if (tarea.getId().equals(idTarea)) {
                  res.add(tarea);
              }
          }
      }
      return res;
  }

    public void addTareaEjecutada(Tarea tarea) {
        for (int i = 0; i < categorias.getCategorias().size(); i++)
            if (categorias.getCategorias().get(i).getEjecutadas().contains(tarea) && tarea.isEstado() == true) {
                try {
                    throw new ExceptionEstado("La tarea que estás añadiendo ya está en ejecución");
                } catch (ExceptionEstado exceptionEstado) {
                    exceptionEstado.printStackTrace();
                }
            } else if (tarea.isEstado() == false) {
                categorias.getCategorias().get(i).getEjecutadas().add(tarea);
            }
    }

    public void eliminarTareaFinaliza(Tarea tarea) {
        for (int i = 0; i < categorias.getCategorias().size(); i++)
            if (tarea.isEstado() == true) {
                categorias.getCategorias().get(i).getEjecutadas().remove(tarea);

            } else {
                try {
                    throw new ExceptionEstado("La tarea sigue en ejecución o está en pendientes.");
                } catch (ExceptionEstado exceptionEstado) {
                    exceptionEstado.printStackTrace();
                }
            }
    }


    public ArrayList<Tarea> consultarTareasEnEjecucion(String idTarea) {
        ArrayList<Tarea> res = new ArrayList<>();
        for (Categoria categoria : categorias.getCategorias()) {
            for (Tarea tarea : categoria.getEjecutadas()) {
                if (tarea.getId().equals(idTarea)) {
                    res.add(tarea);
                }
            }
        }
        return res;
    }

    public ArrayList<Tarea> consultarTareaPendientePorFecha(Date fechaTarea) {
        ArrayList<Tarea> res = new ArrayList<>();
        for (Categoria categoria : categorias.getCategorias()) {
            for (Tarea tarea : categoria.getPendientes()) {
                if (tarea.getFecha().equals(fechaTarea)) {
                    res.add(tarea);
                }
            }
        }
        return res;
    }
}
