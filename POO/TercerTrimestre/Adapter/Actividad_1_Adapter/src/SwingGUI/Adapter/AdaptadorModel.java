package SwingGUI.Adapter;

import Modelo.Persona;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class AdaptadorModel extends AbstractTableModel {
    private final static int COLUMNA_NOMBRE = 0;
    private final static int COLUMNA_APELLIDOS = 1;
    private final static int COLUMNA_EDAD = 2;
    private String[] columnas = {"NOMBRE","APELLIDOS","EDAD"};
    private List<Persona> personas;


    public AdaptadorModel(List<Persona> listaPersonas){
        this.personas = listaPersonas;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    @Override
    public int getRowCount() {
        return personas.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        if ((fila > -1) && (fila < personas.size())) {
            switch (columna) {
                case COLUMNA_NOMBRE:
                    return personas.get(fila).getNombre();
                case COLUMNA_APELLIDOS:
                    return personas.get(fila).getApellidos();
                case COLUMNA_EDAD:
                    return personas.get(fila).getEdad();
            }
        }
        return null;
    }

    @Override
    public String getColumnName(int posicion) {
        return columnas[posicion];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case COLUMNA_NOMBRE:
            case COLUMNA_APELLIDOS: return String.class;
            case COLUMNA_EDAD: return Integer.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        if ((rowIndex > -1) && (rowIndex < personas.size())){
            if (columnIndex == COLUMNA_NOMBRE) personas.get(rowIndex).setNombre((String) aValue);
            else if (columnIndex == COLUMNA_APELLIDOS) personas.get(rowIndex).setApellidos((String) aValue);
            else if (columnIndex == COLUMNA_EDAD) personas.get(rowIndex).setEdad((Integer) aValue);
        }
        fireTableCellUpdated(rowIndex,columnIndex);
    }

    public void removeRow(int row){
        if ((row > -1) && (row < personas.size())){
            int confirmacionBorrar = JOptionPane.showConfirmDialog(null,"¿Desea borrar la fila?","Borrado",JOptionPane.WARNING_MESSAGE);
            if (confirmacionBorrar == JOptionPane.OK_OPTION) {
                personas.remove(row);
                fireTableRowsDeleted(row,row);
            }
        }
    }

    public void addRow(){
        personas.add(new Persona("","",0));
        fireTableDataChanged();
    }
}
