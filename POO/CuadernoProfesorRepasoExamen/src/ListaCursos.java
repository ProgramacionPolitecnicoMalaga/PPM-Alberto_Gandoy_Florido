import java.util.ArrayList;
import java.util.Iterator;

public class ListaCursos {
    private Curso curso;
    public ArrayList<Curso> listaDeCursos;

    public ListaCursos() {
        listaDeCursos = new ArrayList<>();
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Curso> getListaDeCursos() {
        return listaDeCursos;
    }

    public void setListaDeCursos(ArrayList<Curso> listaDeCursos) {
        this.listaDeCursos = listaDeCursos;
    }

    public void añadirCurso(Curso curso) {
        listaDeCursos.add(curso);
    }

    public void mostrarCursos() {
        Iterator<Curso> it = listaDeCursos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
