package DAO;

import MVC.Vista.Vista;
import MVC.VistaAgregar.VistaAgregar;
import Modelo.Item;
import Modelo.ItemDAO;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Consulta {
    private ItemDAO dao;
    private Vista vista;
    private VistaAgregar vistaAgregar;

    public Consulta(Vista vista, VistaAgregar vistaAgregar) {
        this.dao = new ItemImp();
        this.vista = vista;
        this.vistaAgregar = vistaAgregar;
    }

    public Vista getVista() {
        return vista;
    }

    public void insertarItem() {
        String autor = vistaAgregar.getTxtNombre();
        LocalDate fecha = LocalDate.parse(vistaAgregar.getTxtFecha());
        String texto = vistaAgregar.getTxtTexto();
        String tema = vistaAgregar.getBoxSelecionado();
        Item item = new Item(autor, fecha, texto, tema);
        dao.insertarItem(item);
        mostrarItems();
    }

    public void mostrarItems() {
        vista.cargarDatosItem(dao.mostrarItems());
    }

    public void eliminarItem() {
        String nombre =  JOptionPane.showInputDialog("¿Cual es el autor a eliminar?(Recuerda que tienes que selecionarlo antes)");
        dao.eliminarItem(nombre);
        int indexToremove = vista.getjList().getAnchorSelectionIndex();
        vista.getDefaultListModel().remove(indexToremove);
        mostrarItems();
    }
}
