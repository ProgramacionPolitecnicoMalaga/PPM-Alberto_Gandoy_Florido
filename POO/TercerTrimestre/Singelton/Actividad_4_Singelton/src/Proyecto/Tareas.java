package Proyecto;

import java.util.ArrayList;
import java.util.List;

public class Tareas {
    private int ultimaTareaRealizada = 0;
    private static Tareas instancia = null;
    private List<String> tareas;

    private Tareas() {
        tareas = new ArrayList<>();
    }

    public static Tareas getInstance() {
        if (instancia == null)
            instancia = new Tareas();
        return instancia;
    }

    public void addTarea(String tarea) {
        tareas.add(tarea);
    }

    public String getUltimaTareaRealizada() {
        return tareas.get(ultimaTareaRealizada);
    }

    public void cambiarÚltimaTareaRealizada (int numeroTarea) {
     ultimaTareaRealizada  +=  numeroTarea;
    }

    public List<String> getTareas() {
        return tareas;
    }

    @Override
    public String toString() {
        return "Tareas{" +
                ", tareas=" + tareas +
                '}';
    }
}
