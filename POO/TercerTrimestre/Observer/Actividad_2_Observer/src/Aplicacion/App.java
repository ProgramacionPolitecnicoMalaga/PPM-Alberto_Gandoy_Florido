package Aplicacion;

import ControlConsumidorTemperaturas.Diario;
import ControlConsumidorTemperaturas.Promedio;
import ControlConsumidorTemperaturas.Registro;
import FuenteTemperatura.SensorTemperatura;
import Modelo.Temperatura;

public class App {
    public static void main(String[] args) {

        Diario diario = new Diario();
        Promedio promedio = new Promedio();
        Registro registro = new Registro();

        Temperatura temperatura = new Temperatura(20.32,"11:24");
        SensorTemperatura sensorTemperatura = new SensorTemperatura(new Temperatura());
        sensorTemperatura.registrarConsumidor(diario);
        sensorTemperatura.registrarConsumidor(promedio);
        sensorTemperatura.registrarConsumidor(registro);

        temperatura.setGrado(30.01);
        temperatura.setHora("11:27");
        sensorTemperatura.setTemperatura(temperatura);
        sensorTemperatura.informarAConsumidores();

        temperatura.setGrado(10.50);
        temperatura.setHora("11:28");
        sensorTemperatura.setTemperatura(temperatura);
        sensorTemperatura.informarAConsumidores();

        System.out.println("DIARIO: " + diario.toString());
        System.out.println("REGISTRO: " + registro.toString());
        System.out.println("PROMEDIO: " + promedio.toString());

    }
}
