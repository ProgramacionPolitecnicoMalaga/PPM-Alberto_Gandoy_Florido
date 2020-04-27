package Main;


import Proyecto.AvanceTarea;
import Proyecto.RetrocesoTarea;
import Proyecto.Tareas;
import Proyecto.TareasException;

public class Aplicacion {
    public static void main(String[] args) {

        Tareas.getInstance().addTarea("Limpiar cocina");
        Tareas.getInstance().addTarea("Fregar cocina");
        Tareas.getInstance().addTarea("Sacar basura");
        Tareas.getInstance().addTarea("Bajar farmacia");
        Tareas.getInstance().addTarea("Ir a la compra");
        Tareas.getInstance().addTarea("Hacer comida");
        Tareas.getInstance().addTarea("Meter colada");
        Tareas.getInstance().addTarea("Sacar colada");

        AvanceTarea avanceTarea = new AvanceTarea();
        try {
            avanceTarea.avanzar(4);
        } catch (TareasException e) {
            e.printStackTrace();
        }
        System.out.println(avanceTarea.mostrarUltimaTareaRealizada());


        RetrocesoTarea retrocesoTarea = new RetrocesoTarea();
        try {
            retrocesoTarea.retroceder(2);
        } catch (TareasException e) {
            e.printStackTrace();
        }
        System.out.println(retrocesoTarea.mostrarUltimaTareaRealizada());
    }
}
