import java.util.ArrayList;
import java.util.Iterator;

public class Curso {
    private Asignatura asignatura;
    private String idCurso, nombreCurso;
    private ListaCursos listaCursos;
    private ArrayList<Asignatura> listaDeAsignaturas;
    private ArrayList<Alumno> listaDeAlumnos;

    public Curso(String idCurso, String nombreCurso) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        listaDeAsignaturas = new ArrayList<>();
        listaDeAlumnos = new ArrayList<>();
        listaCursos = new ListaCursos();
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public ArrayList<Asignatura> getListaDeAsignaturas() {
        return listaDeAsignaturas;
    }

    public void setListaDeAsignaturas(ArrayList<Asignatura> listaDeAsignaturas) {
        this.listaDeAsignaturas = listaDeAsignaturas;
    }

    public ArrayList<Alumno> getListaDeAlumnos() {
        return listaDeAlumnos;
    }

    public void setListaDeAlumnos(ArrayList<Alumno> listaDeAlumnos) {
        this.listaDeAlumnos = listaDeAlumnos;
    }

    public ListaCursos getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ListaCursos listaCursos) {
        this.listaCursos = listaCursos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idCurso='" + idCurso + '\'' +
                ", nombreCurso='" + nombreCurso + '\'' +
                '}';
    }

    public void añadirAsignatura(Asignatura asignatura) {
        listaDeAsignaturas.add(asignatura);
    }

    public void mostrarAsignaturas() {
        for (int i = 0; i < listaDeAsignaturas.size(); i++) {
            System.out.println(listaDeAsignaturas.get(i));
        }
    }

    public void añadirAlumnos(Alumno alumno) {
        listaDeAlumnos.add(alumno);
    }

    public void mostrarAlumnosMatriculados() {
        Iterator<Alumno> it = listaDeAlumnos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
