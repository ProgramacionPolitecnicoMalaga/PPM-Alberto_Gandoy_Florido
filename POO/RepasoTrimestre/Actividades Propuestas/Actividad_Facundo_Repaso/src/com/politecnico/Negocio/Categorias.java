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


}