import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class Aplicacion {


    public static void main(String[] args)throws TransformerException, ParserConfigurationException {

            Nomina nomina = new Nomina(); //String nombre, String apellido, String dni, String categoria, Nomina nomina

            Empleado tecnico = new Tecnico("Facundo","De-Nardo","24899042-R","Técnico");
            Empleado administrador = new Tecnico("Jorge","Rios","19236970-Z","Administrador");
            Empleado programador = new Tecnico("Alberto","Gandoy","10103389-P","Programador");
            Empleado jefeProyecto = new Tecnico("Fernando","Romero","24896970-L","Jefe de proyecto");
            Empleado jefeOperacion = new Tecnico("Celia","Romero","00002255-Q","Jefe de proyecto");

            Proyecto proyecto = new Proyecto("Aphasec","Seguridad","Esto es un proyecto realizado por seguridad");

            Actividad actividad = new Actividad(tecnico,200,proyecto);




            tecnico.añadirEmpleado(tecnico);
            tecnico.añadirEmpleado(administrador);
            tecnico.añadirEmpleado(programador);
            tecnico.añadirEmpleado(programador);
            tecnico.añadirEmpleado(jefeProyecto);
            tecnico.añadirEmpleado(jefeOperacion);

            proyecto.añadirProyecto(proyecto);
            XMLGenerator generarElementoXML = new XMLGeneratorAtr();
            generarElementoXML.generadorEmpleado("DatosEmpleados.xml",tecnico.listaEmpleados);
            generarElementoXML.generadorProyecto("DatosProyecto.xml", proyecto.listaProyectos);

        }
    }

