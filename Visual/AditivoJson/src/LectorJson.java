import com.google.gson.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class LectorJson {
    private String archivo;

    public LectorJson(String archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Aditivo> generarJson() throws FileNotFoundException {

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(archivo));
            JsonParser jsonParser = new JsonParser();
            JsonArray jsonArray = jsonParser.parse(bufferedReader).getAsJsonArray();
            ArrayList<Aditivo> adictivos = new ArrayList<>();
            for (JsonElement jsonElement :  jsonArray) {
                JsonObject jsonObject = jsonElement.getAsJsonObject();
                String peligrosidad = jsonObject.get("peligrosidad").getAsString();
                String nombre = jsonObject.get("name").getAsString();
                String descripcion = jsonObject.get("comentario").getAsString();

                Aditivo aditivo = new Aditivo(peligrosidad,nombre,descripcion);
                adictivos.add(aditivo);
            }
            return adictivos;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonIOException e) {
            e.printStackTrace();
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }
}
