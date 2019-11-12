package robotPolitecnico;
import robotPolitecnico.Coordenadas;
public class Robot {
    Coordenadas coordenadas;
    public String nombre;

    public Robot(String nombre, Coordenadas posicionInicial){
        this.nombre = nombre;
        this.coordenadas = posicionInicial;
    }

    public Robot(){

    }

    public void setNombre(String nombre){

        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setCoordenadas(Coordenadas coordenadas){
        this.coordenadas = coordenadas;
    }

    public Coordenadas getCoordenadas(){
        return coordenadas;
    }
}
