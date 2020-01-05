import org.w3c.dom.NodeList;

import javax.xml.xpath.XPathExpressionException;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) throws ExceptionAgenda, XPathExpressionException {

        Agenda agenda = new Agenda();
        Vista vista = new Vista();
        ActionListener controladorActL = new Controlador(vista, agenda);
        vista.setControlador(controladorActL);
        vista.iniciarVista();





        System.out.println("===================MÉTODOS FUNCIONANDO========================");

        Contacto pedro0 = new Contacto("Pedro", "5453454");
        Contacto marta = new Contacto("Marta", "342423423");
        Contacto pedro1 = new Contacto("Pedro", "5453454");
        Contacto alberto = new Contacto("Alberto", "435345");
        Contacto pablo = new Contacto("pablo", "00000");
        Contacto juan = new Contacto("juan", "111111");
        Contacto mercedes = new Contacto("mercedes", "222222");
        Contacto luna = new Contacto("Luna", "33333333");
        Contacto carlos = new Contacto("carlos", "44444444");


        //AÑADIR CONTACTOS.

        agenda.agregarNuevoContacto(pedro1);
        agenda.agregarNuevoContacto(marta);
        agenda.agregarNuevoContacto(pedro0);

        agenda.agregarNuevoContacto(alberto);
        agenda.agregarNuevoContacto(pablo);
        agenda.agregarNuevoContacto(juan);
        agenda.agregarNuevoContacto(luna);
        agenda.agregarNuevoContacto(mercedes);
        agenda.agregarNuevoContacto(carlos);

        agenda.mostrarContactos();


        System.out.println("==============================================================");

        //COMPROBAR SI LOS CONTACTOS EXISTEN
        agenda.comprobarContactoExistente(pedro1);
        agenda.comprobarContactoExistente(pedro1);
        agenda.comprobarContactoExistente(alberto);

        agenda.mostrarContactos();

        System.out.println("==============================================================");
        //BUSCAR CONTACTO
        System.out.println(agenda.buscarContacto("Alberto"));

        System.out.println("==============================================================");
        //ELIMINAR CONTACTO
        System.out.println(agenda.contactoEliminado(marta));

        //AFOTO DE LA AGENDA.
        agenda.aforoAgenda();

        //Generar XML
        GenerarXML generarXML = new GenerarXML();
        generarXML.agendaContactos(agenda.getContactos());

        System.out.println("=========================================================");
        //Leer XML
        LectorXML lectorXML = new LectorXML("agenda.xml");
        lectorXML.abrirDocumento();
        lectorXML.obtenerContactos(agenda.getContactos());
    }
}
