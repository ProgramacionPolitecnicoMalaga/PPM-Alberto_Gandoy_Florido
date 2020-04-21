import java.util.ArrayList;
import java.util.List;

public class LogAcciones {
    private static LogAcciones instancia = null;

    private List<String> acciones;

    public LogAcciones(){
        acciones = new ArrayList<>();
    }

    public static LogAcciones getInstance(){
        if (instancia == null)
            instancia = new LogAcciones();
        return instancia;
    }

    public void anotar(String acción){
        acciones.add(acción);
    }

    public List<String> getAcciones(){
        return acciones;
    }
}
