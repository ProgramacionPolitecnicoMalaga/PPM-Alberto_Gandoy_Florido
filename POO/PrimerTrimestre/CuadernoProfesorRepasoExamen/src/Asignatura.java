import java.util.ArrayList;
import java.util.Comparator;

public class Asignatura {
    private String asignaturaId,nombreAsignatura;
    private Alumno alumno;
    ArrayList<Alumno> listaAlumnosAsignatura;

   // HashMap<Integer, Alumno> alumnosMatriculados;

    public Asignatura(String asignaturaId,String nombreAsignatura) {
        this.asignaturaId = asignaturaId;
        this.nombreAsignatura = nombreAsignatura;
        listaAlumnosAsignatura = new ArrayList<Alumno>();
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getAsignaturaId() {
        return asignaturaId;
    }

    public void setAsignaturaId(String asignaturaId) {
        this.asignaturaId = asignaturaId;
    }

    public ArrayList<Alumno> getListaAlumnosAsignatura() {
        return listaAlumnosAsignatura;
    }

    public void setListaAlumnosAsignatura(ArrayList<Alumno> listaAlumnosAsignatura) {
        this.listaAlumnosAsignatura = listaAlumnosAsignatura;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "ASIGNATURA{" +
                "Id: " + asignaturaId + '\'' +
                "Nombre: " + nombreAsignatura + '\'' +
                "Alumnado: " + listaAlumnosAsignatura +
                '}';
    }

    public void añadirAlumnoAasignatua (Alumno alumno) {
        listaAlumnosAsignatura.add(alumno);
    }

    public void mostrarAlumnos() {
        for (Alumno alumno : listaAlumnosAsignatura ) {
            System.out.println(alumno);
        }
    }

 /*   public void matricularAlumnoEnAsignatura(Asignatura asignatura, Alumno alumno){
        alumnosMatriculados.put(asignatura.getAsignaturaId(),alumno);
    }
    public void mostrarAlumnosMatriculados() {
       if (alumnosMatriculados != null) {
                for (Map.Entry<Integer, Alumno> entry : alumnosMatriculados.entrySet()) {
                    System.out.println("ID " + entry.getKey().toString() + " " + entry.getValue());
               }
        }
    }*/

    @Override
    public int hashCode() {
        return asignaturaId.hashCode();
    }

}
