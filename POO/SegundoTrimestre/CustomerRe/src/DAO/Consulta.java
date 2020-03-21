package DAO;

import MVC.VistaAgregar;
import MVC.VistaPrincipal;
import Modelo.Item;
import Modelo.ItemDAO;

public class Consulta {
    private ItemDAO dao;
    private VistaPrincipal vistaPrincipal;
    private VistaAgregar vistaAgregar;

    public Consulta(VistaPrincipal vistaPrincipal, VistaAgregar vistaAgregar) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaAgregar = vistaAgregar;
        this.dao = new ItemImple();
    }

    public VistaPrincipal getVistaPrincipal() {
        return vistaPrincipal;
    }

    public void insertarItem() {
        String autor = vistaAgregar.getTxtNombre();
        String fecha = vistaAgregar.getTxtFecha();
        String descripcion = vistaAgregar.getTxtDescripcion();
        String tema = vistaAgregar.getBox();
        Item item = new Item(autor,fecha,descripcion,tema);
        dao.insertarItem(item);
    }
}
