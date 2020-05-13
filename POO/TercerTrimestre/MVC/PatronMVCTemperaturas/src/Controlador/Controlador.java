package Controlador;

import Modelo.Temperaturas;
import Vistas.Vista;
import Vistas.VistaCritica;
import Vistas.VistaPromedio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Vista vistaPrincipal;
    private VistaPromedio vistaPromedio;
    private VistaCritica vistaCritica;
    private Temperaturas temperaturas;


    public Controlador(Temperaturas temperaturas) {
        this.temperaturas = new Temperaturas();

        this.vistaPrincipal = new Vista(this, temperaturas);
        this.vistaPrincipal.setActionListenerControlador(this::actionPerformed);

        this.vistaPromedio = new VistaPromedio(this, temperaturas);

        this.vistaCritica = new VistaCritica(this);
    }

    public void agregarTemperaturasAlaLista(double grados) {
        temperaturas.addTemperatura(grados);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("agregar")) {
            vistaPrincipal.getGradosToAdd();
        } else if (e.getActionCommand().equals("promedio")) {
            this.vistaPromedio.iniciarVistaPromedio();
            this.vistaPromedio.setListadoTemperaturas(temperaturas.getListaDeTemperaturas());
        } else if (e.getActionCommand().equals("criticas")) {
            this.vistaCritica.iniciarVistaCritica();
            this.vistaCritica.setListadoTemperaturas(temperaturas.getListaDeTemperaturas());
        }
    }
}
