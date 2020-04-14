package Factory;

import Modelo.Partida.Partida;

public class FactoryEscenario {

    public static Partida escenarioFactory(String escenario) throws Exception {

        if (escenario.equalsIgnoreCase("Selva"))
            return GestorPartida.generarPartidaSelva();
        else if (escenario.equalsIgnoreCase("Desierto"))
            return GestorPartida.generarPartidaDesierto();
        else if (escenario.equalsIgnoreCase("Espacio"))
            return GestorPartida.generarPartidaEspacio();
        else throw new Exception("Tienes que elegir una de las tres opciones.");


    }
}
