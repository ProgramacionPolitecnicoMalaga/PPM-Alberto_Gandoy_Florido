package robotPolitecnico;

public class JuegoRobot {
    private static InterfazJuego interfazJuego;
    private static Tablero tablero;
    private static Robot robotGanador;

    public static void inicializarJuego(){
        robotGanador = null;
        interfazJuego  = new InterfazJuego();
        interfazJuego.cartelInicioJuego();
        interfazJuego.cartelRobotRepetido("");
        Coordenadas anchoAltoTablero = interfazJuego.pedirAnchoYAltoTablero();
        tablero = new Tablero(0,0);


    }

    public static void crearRobotsParaElJuego(){
        interfazJuego.cartelRobotRepetido(" ");
        String nombreNuevoRobot;
        Coordenadas coordenadas = new Coordenadas(0, 0);
        do {
            do {
            nombreNuevoRobot = interfazJuego.pedirNombreNuevoRobot();
            }  while (interfazJuego.pedirNombreNuevoRobot().equalsIgnoreCase(nombreNuevoRobot));

            if (!tablero.ExisteRobotEnTablero(nombreNuevoRobot)) {
                Robot nuevoRobot = new Robot(nombreNuevoRobot, coordenadas);
                tablero.anadirRobot(nuevoRobot);
            } else
                interfazJuego.cartelRobotRepetido(nombreNuevoRobot);

        } while (interfazJuego.usuarioDeseaCrearNuevoRobot());
    }


    public static void moverRobotEnTablero( int tipoDeMovimiento, Tablero tablero, String nombreRobot){
        Movimiento movimiento = new Movimiento();
        Robot robotAMover = tablero.getRobot(nombreRobot);
        if (robotAMover != null){
            movimiento.mover(robotAMover.getCoordenadas(),tipoDeMovimiento);
        }
    }

    public static void iniciarJuego(){
        do {
            for (int i = 0; i < tablero.getNumeroActualDeRobots(); i++) {
                Robot robotActual = tablero.getRobot(i);
                interfazJuego.mostrarTurnoRobot(robotActual);
                int movimiento = interfazJuego.pedirMovimientoParaRobot(robotActual.getNombre());
                moverRobotEnTablero(movimiento, tablero, robotActual.getNombre());
                if (tablero.estaRobotEnObjetivo(robotActual.getNombre()))
                    robotGanador = robotActual;
            }
        } while (!hayRobotGanador());
    }


    public static boolean hayRobotGanador(){
        return robotGanador != null;
    }

    public static void main(String[] args) {
        inicializarJuego();
        crearRobotsParaElJuego();
        iniciarJuego();

        interfazJuego.cartelRobotGanador(robotGanador.getNombre());
        interfazJuego.cartelRobotRepetido("LoPowerRangers");
    }
}