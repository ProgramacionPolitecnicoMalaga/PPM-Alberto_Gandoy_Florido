package Proyecto;

public class AvanceTarea {
    private Tareas tareas = Tareas.getInstance();


    public void avanzar(int numeroDeTarea) throws TareasException {
        if (tareas.getTareas().size() < numeroDeTarea)
            throw new TareasException("El valor no puede ser mayor al tamaño de la lista");
        else
        tareas.cambiarÚltimaTareaRealizada(numeroDeTarea);
    }

    public String mostrarUltimaTareaRealizada() {
        return tareas.getUltimaTareaRealizada();
    }
}
