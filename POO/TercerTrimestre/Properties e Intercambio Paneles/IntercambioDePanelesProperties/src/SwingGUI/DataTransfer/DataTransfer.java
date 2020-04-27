package SwingGUI.DataTransfer;

import java.util.Map;
import java.util.TreeMap;

public class DataTransfer {
    private Map<String, Object> datos;

    public DataTransfer(){
        datos = new TreeMap<String,Object>();
    }

    public Object getDato(String clave){
        return datos.get(clave);
    }

    public void setDato(String clave, Object valor){
        datos.put(clave,valor);
    }
}