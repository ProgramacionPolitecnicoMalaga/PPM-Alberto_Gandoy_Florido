package Factory;

import Lector.LectorENV;

public class EnvFactory {
    private static LectorENV lectorENV;

    public static String EnvFactory(String env) {
        lectorENV = new LectorENV();

        if (env.equals("HTML"))
            return lectorENV.getViewerHTML();
        else
            return lectorENV.getViewerText();
    }
}
