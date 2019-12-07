import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Alumno {
    private String nombreAlumno;
    private Indicador indicador;
    public ArrayList<Indicador> listaIndicadores;

    public Alumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
        listaIndicadores = new ArrayList<>();
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Indicador getIndicador() {
        return indicador;
    }

    public void setIndicador(Indicador indicador) {
        this.indicador = indicador;
    }

    public ArrayList<Indicador> getListaIndicadores() {
        return listaIndicadores;
    }

    public void setListaIndicadores(ArrayList<Indicador> listaIndicadores) {
        this.listaIndicadores = listaIndicadores;
    }

    @Override
    public String toString() {
        return "ALUMNO{" +
                "Nombre: " + nombreAlumno + '\'' +
                '}';
    }

    public void añadirIndicador(Indicador indicador) {
        listaIndicadores.add(indicador);
    }

    public void mostrarIndicadoresAlumno() {
        Iterator<Indicador> it = listaIndicadores.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
