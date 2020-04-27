package Proyecto;

public class RetrocesoTarea {
    private Tareas tareas =  Tareas.getInstance();

    public void retroceder(int numeroDeTarea) throws TareasException {
        if (numeroDeTarea < -numeroDeTarea)
            throw new TareasException("El valor introducido no puede ser menor al valor establecido");
        else
        tareas.cambiarÚltimaTareaRealizada(-numeroDeTarea);

    }

    public String mostrarUltimaTareaRealizada() {
        return tareas.getUltimaTareaRealizada();
    }
}
