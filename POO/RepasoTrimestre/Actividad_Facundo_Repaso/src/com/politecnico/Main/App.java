package com.politecnico.Main;

import com.politecnico.Modelo.Categoria;
import com.politecnico.Modelo.Tarea;
import com.politecnico.Negocio.Categorias;
import com.politecnico.Negocio.Estado;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) {
        Date date = new Date();

        //1.Crear una nueva categoría.
        Categoria c1 = new Categoria("C1","Trabajo");

        System.out.println("===================================2==========================");
        //2.Mostrar las categorías existentes.
        Categorias categorias = new Categorias();
        categorias.addCategoria(c1);
        categorias.mostrarCategoriasExistentes();
        System.out.println("==============================================================");

        //3.Crear una nueva tarea.
        Tarea t1 = new Tarea("T1","Refactorizar este código",date);

        System.out.println("===================================4==========================");
        //4.Consultar las tareas pendientes.
        Estado estado = new Estado();
        estado.addTareaPendiente(t1);
        System.out.println(estado.consultarTareaPendiente(t1.getId()));
        System.out.println("==============================================================");

        System.out.println("===================================5==========================");
        //5.Eliminar una tarea (completada).
       // estado.addTareaEjecutada(t1); Lo he comentado por el apartado 8, que sino me salía la lista vacía.
        //estado.eliminarTareaFinaliza(t1);
        System.out.println("==============================================================");

        System.out.println("===================================6==========================");
        //6.Consultar las tareas de una categoría.
        c1.addTarea(t1);
        System.out.println(categorias.consultarTareasDeUnCategoria(t1.getId()));
        System.out.println("==============================================================");

        System.out.println("===================================7==========================");
        //7.Consultar las tareas en una fecha.
        System.out.println(c1.consultarTareaPorFecha(t1.getFecha()));
        System.out.println("==============================================================");


        System.out.println("===================================8==========================");
        //8.Consultar las tareas en tiempo.
        estado.addTareaEjecutada(t1);
        System.out.println(estado.consultarTareasEnEjecucion(t1.getId()));
        System.out.println("==============================================================");




        System.out.println("===================================9==========================");
        //9.Consultar las tareas retrasadas.
        estado.addTareaRetrasada(t1);
        System.out.println(estado.consultarTareaRetrasada(t1.getId()));
        System.out.println("==============================================================");
    }
}