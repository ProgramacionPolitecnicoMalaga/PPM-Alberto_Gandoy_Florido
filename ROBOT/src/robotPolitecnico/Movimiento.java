package robotPolitecnico;
public class Movimiento {
    final static int HACIA_ARRIBA = 1;
    final static int HACIA_DERECHA = 2;
    final static int HACIA_ABAJO = 3;
    final static int HACIA_IZQUIERDA = 4;
    final static int HACIA_DIAGONAL_ARRIBA_DERECHA = 5;
    final static int  HACIA_DIAGONAL_ARRIBA_IZQUIERDA= 6;
    final static int HACIA_DIAGONAL_ABAJO_DERECHA = 7;
    final static int  HACIA_DIAGONAL_ABAJO_IZQUIERDA= 8;
    final static int NUMERO_MAXIMO_DE_MOVIMIENTOS =9;
    int[] movimientosValidos;


    public Movimiento(){
        movimientosValidos = new int[NUMERO_MAXIMO_DE_MOVIMIENTOS];
        movimientosValidos[0] = HACIA_ARRIBA;
        movimientosValidos[1] = HACIA_DERECHA;
        movimientosValidos[2] = HACIA_IZQUIERDA;
        movimientosValidos[3] = HACIA_ABAJO;
        movimientosValidos[4] = HACIA_DIAGONAL_ARRIBA_DERECHA;
        movimientosValidos[5] = HACIA_DIAGONAL_ARRIBA_IZQUIERDA;
        movimientosValidos[6] = HACIA_DIAGONAL_ABAJO_DERECHA;
        movimientosValidos[7] = HACIA_DIAGONAL_ABAJO_IZQUIERDA;

    }

    public Coordenadas mover(Coordenadas punto, int movimiento){
        switch(movimiento){
            case HACIA_ARRIBA:
                punto.setY(punto.getY()+1);
                break;
            case HACIA_DERECHA:
                punto.setX(punto.getX()+1);
                break;
            case HACIA_ABAJO:
                punto.setY(punto.getY()-1);
                break;
            case HACIA_IZQUIERDA:
                punto.setX(punto.getX()-1);
                break;
            case HACIA_DIAGONAL_ARRIBA_DERECHA:
                punto.setY(punto.getY()+1);
                punto.setX(punto.getX()+1);
                break;
            case HACIA_DIAGONAL_ARRIBA_IZQUIERDA:
                punto.setY(punto.getY()+1);
                punto.setX(punto.getX()+1);
                break;
            case HACIA_DIAGONAL_ABAJO_DERECHA:
                punto.setY(punto.getY()+1);
                punto.setX(punto.getX()+1);
                break;
             case HACIA_DIAGONAL_ABAJO_IZQUIERDA:
               punto.setY(punto.getY()+1);
               punto.setX(punto.getX()+1);
               break;
        }
        return punto;
    }

        public boolean verificarMovimientos (int movimiento){
            for (int i = 0; i < NUMERO_MAXIMO_DE_MOVIMIENTOS; i++){
                if (movimiento==movimientosValidos[i])
                    return true;
            }
            return false;
    }


    public void deshacerMovimiento(Coordenadas coordenadas, int tipoDeMovimiento) {
        switch(tipoDeMovimiento){
            case HACIA_ABAJO:
                mover(coordenadas,HACIA_ARRIBA);
                break;
            case HACIA_ARRIBA:
                mover(coordenadas,HACIA_ABAJO);
                break;
            case HACIA_IZQUIERDA:
                mover(coordenadas,HACIA_DERECHA);
                break;
            case HACIA_DERECHA:
                mover(coordenadas,HACIA_DIAGONAL_ARRIBA_DERECHA);
            case HACIA_DIAGONAL_ARRIBA_IZQUIERDA:
                mover(coordenadas, HACIA_DIAGONAL_ARRIBA_IZQUIERDA);
                break;
            case HACIA_DIAGONAL_ABAJO_DERECHA:
                mover(coordenadas, HACIA_DIAGONAL_ABAJO_DERECHA);
                break;
            case HACIA_DIAGONAL_ABAJO_IZQUIERDA:
                mover(coordenadas, HACIA_DIAGONAL_ABAJO_IZQUIERDA);
        }
    }






}