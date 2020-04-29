package com.politecnico.Log;

import com.politecnico.Modelo.Suma;

import java.io.IOException;
import java.util.logging.*;

public class ControlLog {

    public static void getLog() throws IOException {
        Logger logger = Logger.getLogger("Modelo.suma");
            FileHandler handler = new FileHandler("/opt/tomcat/latest/webapps/Actividad_1_Logins/app.%u.%g.log");
            Formatter formatter = new SimpleFormatter(); // new XMLFormatter();
            handler.setFormatter(formatter);
            logger.addHandler(handler);
            logger.setLevel(Level.INFO);
    }
}


