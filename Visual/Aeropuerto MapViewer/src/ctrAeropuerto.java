import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ctrAeropuerto implements ActionListener {

    XPathEvaluator xpath;
    VistaAeropuerto vistaAir;

    public ctrAeropuerto(XPathEvaluator xpath, VistaAeropuerto vistaAir) {
        this.xpath = xpath;
        this.vistaAir = vistaAir;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Buscar")){
            ArrayList<String> res = xpath.buscarAeropuertos(vistaAir.obtenerNomAeropuertos());
            vistaAir.anadirAeropuertos(res);
        }else if(e.getActionCommand().equals("Seleccionar")){
            String aeropuerto = vistaAir.obtenerNomAeropuertoBox();
            ArrayList<String> res = xpath.datosAeropuertoSeleccionado(aeropuerto);
            vistaAir.mostrarDatos(res);
        }

    }
}
