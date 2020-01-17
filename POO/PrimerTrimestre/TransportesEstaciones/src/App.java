import org.w3c.dom.NodeList;

import javax.xml.xpath.XPathExpressionException;

public class App {
    public static void main(String[] args) throws XPathExpressionException {

        LectorXML lectorXML = new LectorXML("estacion.xml");
        NodeList nodeList = lectorXML.evaluateXPath("/rows/row");

      System.out.println("========================================================================");
        System.out.println("                      MOSTRAMOS EL XML ENTERO                         ");
        System.out.println("========================================================================");
        Provincias provincias = new Provincias();
        lectorXML.cargarXML(nodeList, provincias);
        provincias.mostrarProvincias();


        System.out.println("========================================================================");
        System.out.println("EJERCIICO 1");
        System.out.println("========================================================================");

        provincias.obtenerProvinciaDeUnaEstacion("Estación Zazpikaleak - Casco Viejo. EuskoTren");

        System.out.println("========================================================================");
        System.out.println("EJERCIICO 2");
        System.out.println("========================================================================");
        provincias.ciudadQueTienenEstaciones();

        System.out.println("========================================================================");
        System.out.println("EJERCICIO 3");
        System.out.println("========================================================================");
            provincias.obtenerTranporteDeUnaEstacion("Estación de Ametzola. RENFE");


        System.out.println("========================================================================");
        System.out.println("EJERCICIO 4");
        System.out.println("========================================================================");
        provincias.obtenerEstacionesMasCernas();
    }
}
