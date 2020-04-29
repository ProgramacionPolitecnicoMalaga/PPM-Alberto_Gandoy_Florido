package com.politecnico.Modelo;

import com.politecnico.Log.ControlLog;

import java.io.IOException;

public class Suma {

    public int sumar(int a, int b) throws IOException {
        ControlLog.getLog();
        return a +b;
    }
}
