package Actividad13;


public class Colas
{
    //Declaración de atributos
    private Cola inicio;
    private Cola fin;
    int dato;

    //Constructor sin parametros
    public Colas()
    {
        inicio=null; /*Que no apunta o a objetos válidos (null)*/
        fin =null;
    }

    //Metodo insertar
    public void insertar(int dato)
    {
        Cola i=new Cola(dato);
        i.setSiguiente(null);
        if(inicio==null & fin ==null)
        {
            inicio=i;
            fin =i;
        }
        fin.setSiguiente(i);
        fin = fin.getSiguiente();
    }

    //Metodo extraer dato
    public int extraer() throws MiExcepcion {

        if (inicio == inicio.getSiguiente()) {
            if (dato == inicio.getDato()) {
                throw new MiExcepcion("No se pueden extraer numeros de la cola");
            } else return dato;
        } else {
            return dato;
        }
    }


    //Metodo para comprobar que la cola no esta vacia
    public boolean estaVacia()
    {
        boolean cola=false;
        if(inicio==null & fin ==null)
        {
            cola=true;
            System.out.println("La cola esta vacia");
        }
        else
        {
            System.out.println("La cola no esta vacia");
            cola=false;
        }
        return cola;
    }

    //Metodo para contar los elementos de la cola
    public int contar()
    {
        int contador=0;
        Cola c=this.inicio;
        while(c!=null)
        {
            contador++;
            c=c.getSiguiente();
        }
        System.out.println("Numero de datos en la cola: "+contador);
        return contador;
    }

    //Metodo toString
    public String toString()
    {
        Cola c=this.inicio;
        String s="";
        while(c!=null)
        {
            s=s+c.toString();
            c=c.getSiguiente();
        }
        return s;
    }

}