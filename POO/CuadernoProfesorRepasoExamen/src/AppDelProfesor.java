import org.w3c.dom.NodeList;
import org.w3c.dom.xpath.XPathEvaluator;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

public class AppDelProfesor {
    public static void main(String[] args) throws ParserConfigurationException {

        System.out.println("================");
        //1.Introducir un nuevo curso.
        ListaCursos cursos = new ListaCursos();
        Curso curso0 = new Curso("S11AW","1º Desarrollo de Aplicaciones Web");
        cursos.añadirCurso(curso0);
        cursos.mostrarCursos();

        System.out.println("================");
        //2.Introducir una nueva asignatura y asociarla a un curso.
        Asignatura asignatura0 = new Asignatura("ed","Entorno de desarrollo");
        Asignatura asignatura1 = new Asignatura("prog","Programación");
        Asignatura asignatura2 = new Asignatura("bsd","Base de datos");
        Asignatura asignatura3 = new Asignatura("sist","Sistemas Informáticos");
        Asignatura asignatura4 = new Asignatura("fol","Formación y orientación laboral");
        Asignatura asignatura5 = new Asignatura("lm","Lenguaje de marcas");
        curso0.añadirAsignatura(asignatura0);
        curso0.añadirAsignatura(asignatura1);
        curso0.añadirAsignatura(asignatura2);
        curso0.añadirAsignatura(asignatura3);
        curso0.añadirAsignatura(asignatura4);
        curso0.añadirAsignatura(asignatura5);
        curso0.mostrarAsignaturas();
        System.out.println("==========rgfdgf======");

        //3.Introducir un nuevo alumno y asignarlo a un curso.
        Alumno alumno0 = new Alumno("Alberto");
        Alumno alumno1 = new Alumno("Fernando");
        Alumno alumno2 = new Alumno("Celia");
        Alumno alumno3 = new Alumno("David");
        curso0.añadirAlumnos(alumno0);
        curso0.añadirAlumnos(alumno1);
        curso0.añadirAlumnos(alumno2);
        curso0.añadirAlumnos(alumno3);
        curso0.mostrarAlumnosMatriculados();
        System.out.println("================");

        //4.Matricular a un alumno en una asignatura de su curso.
        asignatura0.añadirAlumnoAasignatua(alumno0);
        asignatura1.añadirAlumnoAasignatua(alumno0);
        asignatura2.añadirAlumnoAasignatua(alumno0);
        asignatura0.mostrarAlumnos();
        asignatura1.mostrarAlumnos();
        asignatura2.mostrarAlumnos();

       /* 5.Definir un nuevo indicador para una asignatura, que puede ser un ejercicio, un examen o una nota de actitud.
        Un indicador se aplica a todos los alumnos de la asignatura.*/
       Indicador indicador0 = new Indicador("exámen","Tema 2 Git","10","puede mejorar");
       Indicador indicador1 = new Indicador("actividad","actividad 1 en clase","5","Está viendo su fruto");
       Indicador indicador2 = new Indicador("trabajo en clase","Crear bases de datos","7", "podría sacar más, si no se pusiese tan nerviso");
       alumno0.añadirIndicador(indicador0);
       alumno0.añadirIndicador(indicador1);
       alumno0.añadirIndicador(indicador2);

        System.out.println("=================================xml============================================");

       GenerarXML generarXML = new GenerarXML();
      // generarXML.xmlGeneratorAsignaturasPorCursos("curso.xml",cursos.getListaDeCursos());

        generarXML.xmlGeneratorAsignaturasPorCursos(curso0,curso0.getListaDeAsignaturas());
        generarXML.xmlGeneratorIndicadorPorAlumnoPorCursos(asignatura0.getAsignaturaId() +"_S11AW.xml" ,asignatura0,curso0.getListaDeAlumnos(),alumno0.getListaIndicadores());
        generarXML.xmlGeneratorIndicadorPorAlumnoPorCursos(asignatura1.getAsignaturaId() +"_S11AW.xml" ,asignatura0,curso0.getListaDeAlumnos(),alumno0.getListaIndicadores());
        generarXML.xmlGeneratorIndicadorPorAlumnoPorCursos(asignatura2.getAsignaturaId() +"_S11AW.xml" ,asignatura0,curso0.getListaDeAlumnos(),alumno0.getListaIndicadores());
        generarXML.xmlGeneratorIndicadorPorAlumnoPorCursos(asignatura3.getAsignaturaId() +"_S11AW.xml" ,asignatura0,curso0.getListaDeAlumnos(),alumno0.getListaIndicadores());
        generarXML.xmlGeneratorIndicadorPorAlumnoPorCursos(asignatura4.getAsignaturaId() +"_S11AW.xml" ,asignatura0,curso0.getListaDeAlumnos(),alumno0.getListaIndicadores());
        generarXML.xmlGeneratorIndicadorPorAlumnoPorCursos(asignatura5.getAsignaturaId() +"_S11AW.xml" ,asignatura5,curso0.getListaDeAlumnos(),alumno0.getListaIndicadores());


        Evaluator evaluator = new Evaluator();
 //      evaluator.mostrarCursoXML();
        evaluator.mostrarAsignaturaXML();



    }
}
