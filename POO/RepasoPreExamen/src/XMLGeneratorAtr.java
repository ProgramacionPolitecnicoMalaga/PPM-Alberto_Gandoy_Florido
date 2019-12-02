import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public class  XMLGeneratorAtr extends XMLGenerator {
    @Override
    public void generadorEmpleado(String nombreArchivo, List<Empleado> empleados) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element root = doc.createElement ("empleados");
            doc.appendChild(root);


            Iterator<Empleado> it = empleados.iterator();
            while (it.hasNext()){
                Empleado empleado = it.next();
                Element Nodoempleado = doc.createElement("empleado");

                Attr Nodonombreempleado = doc.createAttribute("nombre");
                Nodonombreempleado.setValue(empleado.getNombre());

                Attr NodoempleadoApellido = doc.createAttribute("apellido");
                NodoempleadoApellido.setValue(empleado.getApellido());

                Attr NodoemepleadoDNI = doc.createAttribute("dni");
                NodoemepleadoDNI.setValue(empleado.getDni());

                Attr NodoempleadoCategoria = doc.createAttribute("categoria");
                NodoempleadoCategoria.setValue(empleado.getCategoria());


                Nodoempleado.setAttributeNode(Nodonombreempleado);
                Nodoempleado.setAttributeNode(NodoempleadoApellido);
                Nodoempleado.setAttributeNode(NodoemepleadoDNI);
                Nodoempleado.setAttributeNode(NodoempleadoCategoria);

                root.appendChild(Nodoempleado);
            }


            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(nombreArchivo));
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            transformer.transform(source,result);

        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void generadorProyecto(String nombreArchivo, List<Proyecto> proyectos) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element root = doc.createElement ("empleados");
            doc.appendChild(root);

            //String nombreProyecto, String departamento, String descripcion, double fprod, Empleado empleado

            Iterator<Proyecto> it = proyectos.iterator();
            while (it.hasNext()){
                Proyecto proyecto = it.next();
                Element NodoProyecto = doc.createElement("proyecto");

                Attr NodoproyectoNombre = doc.createAttribute("nombre");
                NodoproyectoNombre.setValue(proyecto.getNombreProyecto());

                Attr NodoproyectoDepartamento = doc.createAttribute("departamento");
                NodoproyectoDepartamento.setValue(proyecto.getDepartamento());

                Attr NodoproyectoDescripcion = doc.createAttribute("descripcion");
                NodoproyectoDescripcion.setValue(proyecto.getDescripcion());

                Attr NodoproyectoFprod = doc.createAttribute("fprod");
                String fprod_ValueOf = String.valueOf(proyecto.getFprod());
                NodoproyectoFprod.setValue(fprod_ValueOf);


                NodoProyecto.setAttributeNode(NodoproyectoNombre);
                NodoProyecto.setAttributeNode(NodoproyectoDepartamento);
                NodoProyecto.setAttributeNode(NodoproyectoDescripcion);
                NodoProyecto.setAttributeNode(NodoproyectoFprod);

                root.appendChild(NodoProyecto);
            }


            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(nombreArchivo));
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            transformer.transform(source,result);

        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

    }
}
