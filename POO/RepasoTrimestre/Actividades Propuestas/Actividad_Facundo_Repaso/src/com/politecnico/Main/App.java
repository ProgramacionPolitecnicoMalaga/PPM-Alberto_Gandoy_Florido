package com.politecnico.Main;

import com.politecnico.Negocio.Categoria;
import com.politecnico.Modelo.Tarea;
import com.politecnico.Negocio.Categorias;
import com.politecnico.Negocio.GestorTarea;

import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Date date = new Date();
        Categorias categorias = new Categorias();

        GestorTarea gT = new GestorTarea(categorias);

        //1.Crear una nueva categoría.
        Categoria cat_1 = new Categoria("c1", "Hogar");
        Categoria cat_2 = new Categoria("c2", "Trabajo");

        //2.Mostrar las categorías existentes.
        gT.addCategoria(cat_1);
        gT.addCategoria(cat_2);
        gT.mostrarCategoriasExistentes();

        //3.Crear una nueva tarea.
        Tarea tar_1 = new Tarea("t1", "Hacer lista de la compra",date,false);
        Tarea tar_2 = new Tarea("t2", "Realizar actividad 5",date,false);

        //4.Consultar las tareas pendientes.
        gT.addTareaPendiente(tar_1);
        gT.addTareaPendiente(tar_2);
        System.out.println("1.TAREA PENDIENTE: " + gT.consultarTareaPendiente(tar_1.getId()));
        System.out.println("2.TAREA PENDIENTE: " + gT.consultarTareaPendiente(tar_2.getId()));

        //5.Eliminar una tarea (completada).
        //Añado la tarea a ejecución.
        gT.addTareaEjecutada(tar_1);
        //La eliminar si está en dicha lista.
        gT.eliminarTareaFinaliza(tar_1);
        gT.mostrarCategoriasExistentes();

        //6.Consultar las tareas de una categoría.
        System.out.println("CONSULTAR TAREA DE UNA CATEGORÍA: " + gT.consultarTareasDeUnCategoria(tar_2.getId()));

        //7.Consultar las tareas en una fecha.
        System.out.println("CONSULTAR POR FECHA: " + gT.consultarTareaPendientePorFecha(date));

        //8.Consultar las tareas en tiempo.(SI ESTÁ DENTRO DE UN PLAZO)
        gT.addTareaEjecutada(tar_2);
        System.out.println("TAREAS EN TIEMPO: " + gT.consultarTareasEnEjecucion(tar_2.getId()));

        //9.Consultar tarea retrasada.
        System.out.println("CONSULTAR TAREA RETRASADA: " + gT.consultarTareaPendientePorFecha(new Date(128, Calendar.JANUARY, 15)));
    }
}