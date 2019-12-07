
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
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

public class GenerarXML implements XMLgenerable {


    @Override
    public void xmlGeneratorAsignaturasPorCursos(Curso curso, List<Asignatura> listaAsignatura) throws ParserConfigurationException {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element rootCurso = doc.createElement("curso");
            doc.appendChild(rootCurso);

            Attr nodoIdCurso = doc.createAttribute("id");
            nodoIdCurso.setValue(curso.getIdCurso());
            rootCurso.setAttributeNode(nodoIdCurso);

            Attr nodoNombreCurso = doc.createAttribute("nombre");
            nodoNombreCurso.setValue(curso.getNombreCurso());
            rootCurso.setAttributeNode(nodoNombreCurso);

            Iterator<Asignatura> it = listaAsignatura.iterator();
            while (it.hasNext()) {
                Asignatura asignatura = it.next();
              //  if (asignatura.getCurso().getIdCurso().equals(curso.getIdCurso())) {

                    Element nodoAsignatura = doc.createElement("asignatura");

                    Attr nodoIdAsignatura = doc.createAttribute("id");
                    nodoIdAsignatura.setValue(asignatura.getAsignaturaId());
                    nodoAsignatura.setAttributeNode(nodoIdAsignatura);

                    Attr nodoNombreAsignatura = doc.createAttribute("nombre");
                    nodoNombreAsignatura.setValue(asignatura.getNombreAsignatura());
                    nodoAsignatura.setAttributeNode(nodoNombreAsignatura);

                 // nodoAsignatura.appendChild(doc.createTextNode(actividad.getDescripcion()));
                  rootCurso.appendChild(nodoAsignatura);
                }
           // }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("curso.xml"));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);

        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void xmlGeneratorIndicadorPorAlumnoPorCursos(String nombreArchivo, Asignatura asignatura,List<Alumno> listaAlumnado, List<Indicador> listaIndicadores) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

                Element rootAsignatura = doc.createElement("asignatura");
                doc.appendChild(rootAsignatura);

                Attr nodoIdAsignatura = doc.createAttribute("id");
                nodoIdAsignatura.setValue(asignatura.getAsignaturaId());
                rootAsignatura.setAttributeNode(nodoIdAsignatura);

                Attr ndooNombreAsignatura = doc.createAttribute("nombre");
                ndooNombreAsignatura.setValue(asignatura.getNombreAsignatura());
                rootAsignatura.setAttributeNode(ndooNombreAsignatura);

            Iterator<Alumno> it0 = listaAlumnado.iterator();
            while (it0.hasNext()) {
                Alumno alumno = it0.next();
                //  if (asignatura.getCurso().getIdCurso().equals(curso.getIdCurso())) {

                Element nodoAlumno = doc.createElement("alumno");

                Attr nodoNombreAlumno = doc.createAttribute("nombre");
                nodoNombreAlumno.setValue(alumno.getNombreAlumno());
                nodoAlumno.setAttributeNode(nodoNombreAlumno);


                rootAsignatura.appendChild(nodoAlumno);

                Iterator<Indicador> iterator = listaIndicadores.iterator();
                while (iterator.hasNext()) {
                    Indicador indicador1 = iterator.next();
                    Element nodoIndicador = doc.createElement("indicador");

                    Attr nodoTipoIndicador = doc.createAttribute("tipo");
                    nodoTipoIndicador.setValue(indicador1.getTipo());
                    nodoIndicador.setAttributeNode(nodoTipoIndicador);

                    Attr nodoNombreIndicador = doc.createAttribute("nombre");
                    nodoNombreIndicador.setValue(indicador1.getNombreIndicador());
                    nodoIndicador.setAttributeNode(nodoNombreIndicador);

                    Attr nodoNotaIndicador = doc.createAttribute("nota");
                    nodoNotaIndicador.setValue(indicador1.getNota());
                    nodoIndicador.setAttributeNode(nodoNotaIndicador);

                    Attr nodoDescripIndicador = doc.createAttribute("descripcion");
                    nodoDescripIndicador.setValue(indicador1.getDescripcion());
                    nodoIndicador.setAttributeNode(nodoDescripIndicador);

                // rootAsignatura.appendChild(doc.createTextNode(indicador1.getDescripcion()));

                    nodoAlumno.appendChild(nodoIndicador);
                }
                }

            // }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(nombreArchivo));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);

        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
