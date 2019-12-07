import javax.xml.parsers.ParserConfigurationException;
import java.util.List;

public interface XMLgenerable {
    void xmlGeneratorAsignaturasPorCursos(Curso curso, List<Asignatura> listaAsignatura) throws ParserConfigurationException;
    void xmlGeneratorIndicadorPorAlumnoPorCursos(String nombreArchivo,Asignatura asignatura, List<Alumno> listaAlumnado, List<Indicador> listaIndicadores);
}
