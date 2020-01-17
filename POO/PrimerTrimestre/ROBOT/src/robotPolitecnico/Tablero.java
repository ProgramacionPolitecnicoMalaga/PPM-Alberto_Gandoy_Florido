package robotPolitecnico;

public class Tablero {
    public final static int MAX_ROBOTS = 3;
    private Coordenadas esquinaSuperiorDerecha;
    private Robot[] listaRobots;
    private Coordenadas casillaObjetivo;
    private int numeroActualDeRobots;

    public Tablero(int ancho, int alto){
        esquinaSuperiorDerecha = new Coordenadas(ancho,alto);
        numeroActualDeRobots = 0;
        listaRobots = new Robot[MAX_ROBOTS];
        casillaObjetivo = new Coordenadas(
                (int) (Math.random()*ancho + 1),
                (int) (Math.random()*alto + 1));

    }


    public boolean EstaEnTablero(Coordenadas punto){
        Coordenadas vectorDiferencia = this.esquinaSuperiorDerecha.CrearVectorDiferenciaRespectoA(punto);
        int difX = vectorDiferencia.getX();
        int difY = vectorDiferencia.getY();
        if ((difX <= 0)  && !(difX +esquinaSuperiorDerecha.getX() >=0) &&
                (difY <= 0) && (difY +esquinaSuperiorDerecha.getY()>=0)){
            return true;
        }

        return false;
    }


    public boolean ExisteRobotEnTablero(String nombreRobot){//no quiere decir que esté o no dentro del tablero, si no que existe con ese nombre
        boolean esta = false;
        for (int i = 0; i < numeroActualDeRobots; i++){
            Robot robotActual = listaRobots[i];
            if (robotActual.getNombre().equalsIgnoreCase(nombreRobot))
                esta = true;
        }
        return esta;
    }

    public void anadirRobot(Robot robot){
        if (numeroActualDeRobots < MAX_ROBOTS) {
            listaRobots[numeroActualDeRobots] = robot;
            numeroActualDeRobots++;
        }
    }

  public boolean estaRobotEnObjetivo(String nombreRobot){
        Robot robot = getRobot(nombreRobot);//buscar si el robot con ese nombre está en la lista de robots
        return robot.getCoordenadas().equals(casillaObjetivo);
  }
  public Robot getRobot(int numeroActualDeRobots){
        return listaRobots[numeroActualDeRobots];
     }


    public int getNumeroActualDeRobots(){

        return numeroActualDeRobots;
         }



    public Robot getRobot(String nombreRobot){
        Robot actual = null;

        for(int i=0;i<numeroActualDeRobots; i++){
            String nombre = listaRobots[i].getNombre();
            if (nombre.equals(nombreRobot)){
                return listaRobots[i];
            }
        }
        return null;
    }

}