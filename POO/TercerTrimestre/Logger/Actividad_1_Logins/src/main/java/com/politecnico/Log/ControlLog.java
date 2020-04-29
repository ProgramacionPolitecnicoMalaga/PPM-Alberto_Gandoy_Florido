package com.politecnico.Log;

import com.politecnico.Modelo.Suma;

import java.io.IOException;
import java.util.logging.*;

public class ControlLog {
    private final static Logger LOGGER = Logger.getLogger("com.politecnico");

    public static void getLog() throws IOException {
        FileHandler handler = new FileHandler("/opt/tomcat/latest/webapps/Actividad_1_Logins/app.%u.%g.log",true);//true agrega,  false sobrescirbe
        Formatter formatter = new SimpleFormatter(); // new XMLFormatter();
        handler.setFormatter(formatter);
        LOGGER.addHandler(handler);
        LOGGER.log(Level.INFO, "Falló");
    }
}



