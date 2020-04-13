package Lector;

import io.github.cdimascio.dotenv.Dotenv;

public class LectorENV {
    private Dotenv dotenv;

    public LectorENV() {
       this.dotenv = Dotenv.configure().directory("./FicheroENV").load();
    }

    public String getViewerText() {
        return dotenv.get("VIEWER_TEXT");
    }

    public String getViewerHTML() {
        return dotenv.get("VIEWER_HTML");
    }
}
