package Lector;

import io.github.cdimascio.dotenv.Dotenv;

public class LectorENV {
    private static Dotenv dotenv = Dotenv.configure().directory("./ENV").load();

    public static String getDotenv() {
        return dotenv.get("VIEWER");
    }
}
