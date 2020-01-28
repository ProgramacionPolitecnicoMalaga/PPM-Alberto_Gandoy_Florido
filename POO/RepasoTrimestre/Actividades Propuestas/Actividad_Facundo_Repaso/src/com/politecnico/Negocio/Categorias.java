package com.politecnico.Negocio;

import com.politecnico.Modelo.ExceptionCategoria;
import com.politecnico.Modelo.Tarea;

import java.util.ArrayList;

public class Categorias {
    private ArrayList<Categoria> categorias;

    public Categorias() {
        categorias = new ArrayList<>();
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void addCategoria(Categoria categoria) {
        if (categorias.contains(categoria)) {
            try {
                throw new ExceptionCategoria("La categoría " + categoria.getNombre() + " ya existe.");
            } catch (ExceptionCategoria exceptionCategoria) {
                exceptionCategoria.printStackTrace();
            }
        } else {
            categorias.add(categoria);
        }
    }

    public void mostrarCategoriasExistentes() {
        for (Categoria categoria : categorias) {
            System.out.println(categoria);
        }
    }

    public ArrayList<Tarea> consultarTareasDeUnCategoria(String id) {
        ArrayList<Tarea> res = new ArrayList<>();
        for (Categoria categoria : categorias) {
            for(Tarea tarea : categoria.getPendientes()){
                if(tarea.getId().equals(id)){
                    res.add(tarea);
                }
            }
        }
        return res;
    }
}