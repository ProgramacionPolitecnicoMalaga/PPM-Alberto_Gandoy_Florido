import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Alumno {
    private String nombreAlumno, apellido, edad;
    private Indicador indicador;
    public ArrayList<Indicador> listaIndicadores;

    public Alumno(String nombreAlumno, String apellido, String edad) {
        this.nombreAlumno = nombreAlumno;
        this.apellido = apellido;
        this.edad = edad;
        listaIndicadores = new ArrayList<>();

    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setListaIndicadores(ArrayList<Indicador> listaIndicadores) {
        this.listaIndicadores = listaIndicadores;
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

    @Override
    public String toString() {
        return "Alumno{" +
                "nombreAlumno='" + nombreAlumno + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad='" + edad + '\'' +
                ", indicador=" + indicador +
                ", listaIndicadores=" + listaIndicadores +
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
