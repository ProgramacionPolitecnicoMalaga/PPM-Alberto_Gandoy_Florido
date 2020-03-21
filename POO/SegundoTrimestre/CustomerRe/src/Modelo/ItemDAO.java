package Modelo;

import java.util.ArrayList;

public interface ItemDAO {
    boolean insertarItem(Item item);
    ArrayList<Item> mostrarItems();
}
