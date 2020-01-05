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
import java.util.ArrayList;
import java.util.Iterator;

public class GenerarXML {

    public void agendaContactos(ArrayList<Contacto> contactos) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element rootAgenda = doc.createElement("agenda");
            doc.appendChild(rootAgenda);

            Iterator<Contacto> it = contactos.iterator();
            while (it.hasNext()) {
                Contacto contacto = it.next();

                Element nodoContacto = doc.createElement("contacto");

                Attr nombre = doc.createAttribute("nombre");
                nombre.setValue(contacto.getNombre());
                nodoContacto.setAttributeNode(nombre);

                Attr telefono = doc.createAttribute("telefono");
                telefono.setValue(contacto.getTelefono());
                nodoContacto.setAttributeNode(telefono);

                rootAgenda.appendChild(nodoContacto);
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("agenda.xml"));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);


    } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
