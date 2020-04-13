package Factory;

public class Factory {

    public static void methodFactory(String accion, String nombreDocumento) {
        if (accion.equals("HTML")) {
            String env = EnvFactory.EnvFactory("HTML");
            GeneradorFactory.generarFactory(nombreDocumento,env);
        } else if (accion.equals("TEXT")){
            String env = EnvFactory.EnvFactory("TEXT");
            GeneradorFactory.generarFactory(nombreDocumento,env);
        }
    }
}
