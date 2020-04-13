package GenerarDocumento;

import Lector.LectorXML;
import Modelo.Empadronados;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GenerarHTML implements Generador {

    private LectorXML lectorXML;

    public GenerarHTML(String fichero) {
        lectorXML = new LectorXML("Nacionalidades.xml");
        try {
            generarDocumentos(fichero);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void generarDocumentos(String fichero) throws IOException {
        FileWriter fw = null;
        PrintWriter pw = null;

        fw = new FileWriter("./ArchivosGenerados/"+fichero+".html");
        pw = new PrintWriter(fw);

        pw.print("<head><title>Documento HTML</title></head>");
        pw.print("<table>");
        pw.print("<tr>"+"<th>"+lectorXML.leerXML(new Empadronados())+"</th>"+"/<tr>");
        pw.print("</table>"+"\n"+"</body>"+"\n"+"</html>");
        pw.close();

    }
}
