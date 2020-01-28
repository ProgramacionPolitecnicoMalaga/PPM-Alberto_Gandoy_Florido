package com.politecnico.Main;

import com.politecnico.Negocio.Categoria;
import com.politecnico.Modelo.Tarea;
import com.politecnico.Negocio.Categorias;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Date date = new Date();

        //1.Crear una nueva categoría.
        Categoria cat_1 = new Categoria("c1", "Hogar");
        Categoria cat_2 = new Categoria("c2", "Trabajo");

        //2.Mostrar las categorías existentes.
        Categorias categorias = new Categorias();
        categorias.addCategoria(cat_1);
        categorias.addCategoria(cat_2);
        categorias.mostrarCategoriasExistentes();

        //3.Crear una nueva tarea.
        Tarea tar_1 = new Tarea("t1", "Hacer lista de la compra",date,false);
        Tarea tar_2 = new Tarea("t2", "Realizar actividad 5",date,false);

        //4.Consultar las tareas pendientes.
        cat_1.addTareaPendiente(tar_1);
        cat_2.addTareaPendiente(tar_2);
        System.out.println("1.TAREA PENDIENTE: " + cat_1.consultarTareaPendiente(tar_1.getId()));
        System.out.println("2.TAREA PENDIENTE: " + cat_2.consultarTareaPendiente(tar_2.getId()));

        //5.Eliminar una tarea (completada).
        //Añado la tarea a ejecución.
        cat_1.addTareaEjecutada(tar_1);
        //La eliminar si está en dicha lista.
        cat_1.eliminarTareaFinaliza(tar_1);
        categorias.mostrarCategoriasExistentes();

        //6.Consultar las tareas de una categoría.
        System.out.println("CONSULTAR TAREA DE UNA CATEGORÍA: " + categorias.consultarTareasDeUnCategoria(tar_2.getId()));

        //7.Consultar las tareas en una fecha.
        System.out.println("CONSULTAR POR FECHA: " + cat_2.consultarTareaPendientePorFecha(date));

        //8.Consultar las tareas en tiempo.
        cat_2.addTareaEjecutada(tar_2);
        System.out.println("TAREAS EN TIEMPO: " + cat_2.consultarTareasEnEjecucion(tar_2.getId()));

        //9.Consultar tarea retrasada.
        System.out.println("CONSULTAR TAREA RETRASADA: " + cat_2.consultarTareaPendientePorFecha(date));
    }
}