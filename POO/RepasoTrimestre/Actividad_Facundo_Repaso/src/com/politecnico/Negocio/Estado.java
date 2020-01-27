package com.politecnico.Negocio;

import com.politecnico.Modelo.ExceptionEstado;
import com.politecnico.Modelo.Tarea;

import java.util.ArrayList;

public class Estado {
    private ArrayList<Tarea> pendientes;
    private ArrayList<Tarea> ejecutadas;
    private ArrayList<Tarea> finalizadas;
    private ArrayList<Tarea> retrasadas;

    public Estado() {
        pendientes = new ArrayList<>();
        ejecutadas = new ArrayList<>();
        finalizadas = new ArrayList<>();
        retrasadas = new ArrayList<>();
    }

    public ArrayList<Tarea> getPendientes() {
        return pendientes;
    }

    public ArrayList<Tarea> getEjecutadas() {
        return ejecutadas;
    }

    public ArrayList<Tarea> getFinalizadas() {
        return finalizadas;
    }

    public ArrayList<Tarea> getRetrasadas() {
        return retrasadas;
    }

    public void addTareaPendiente(Tarea tarea) {
        if (pendientes.contains(tarea)) {
            try {
                throw new ExceptionEstado("La tarea que estás añadiendo ya está en estado pendiente");
            } catch (ExceptionEstado exceptionEstado) {
                exceptionEstado.printStackTrace();
            }
        } else { pendientes.add(tarea); }
    }

    public Tarea consultarTareaPendiente(String idTarea) {
        Tarea tareaPendiente = null;
        boolean encontrado = false;
        int i = 0;
        while (pendientes.size() > i && !encontrado) {
            if (pendientes.get(i).getId().equals(idTarea)) {
                tareaPendiente = pendientes.get(i);
                encontrado = true;
            }
            i++;
        }
        return tareaPendiente;
    }

    public void addTareaEjecutada(Tarea tarea) {
        if (pendientes.contains(tarea)) {
            pendientes.remove(tarea);
            ejecutadas.add(tarea);
        } else if (ejecutadas.contains(tarea)) {
            try {
                throw new ExceptionEstado("La tarea que estás añadiendo ya está en ejecución");
            } catch (ExceptionEstado exceptionEstado) {
                exceptionEstado.printStackTrace();
            }
        }
    }

    public Tarea consultarTareasEnEjecucion(String idTarea) {
        Tarea tareaPendiente = null;
        boolean encontrado = false;
        int i = 0;
        while (ejecutadas.size() > i && !encontrado) {
            if (ejecutadas.get(i).getId().equals(idTarea)) {
                tareaPendiente = ejecutadas.get(i);
                encontrado = true;
            }
            i++;
        }
        return tareaPendiente;
    }

    public void eliminarTareaFinaliza(Tarea tarea) {
        if (ejecutadas.contains(tarea)) {
            ejecutadas.remove(tarea);
            finalizadas.add(tarea);
            finalizadas.remove(tarea);
            System.out.println("La tarea " + tarea.getId() + " ha finalizado.");
        } else if (finalizadas.contains(tarea)) {
            try {
                throw new ExceptionEstado("La tarea que está finalizada");
            } catch (ExceptionEstado exceptionEstado) {
                exceptionEstado.printStackTrace();
            }
        }
    }

    public void addTareaRetrasada(Tarea tarea) {
       retrasadas.add(tarea);
    }

    public Tarea consultarTareaRetrasada(String idTarea) {
        Tarea tareaAbuscar = null;
        boolean encontrado = false;
        int i = 0;
        while (retrasadas.size() > i && !encontrado) {
            if (retrasadas.get(i).getId().equals(idTarea)) {
                tareaAbuscar = retrasadas.get(i);
                encontrado = true;
            }
            i++;
        }
        return tareaAbuscar;
    }
    @Override
    public String toString() {
        return "Estado{" +
                "pendientes=" + pendientes +
                ", ejecutadas=" + ejecutadas +
                ", finalizadas=" + finalizadas +
                ", retrasadas=" + retrasadas +
                '}';
    }
}
