package FigurasGeometricas;

import java.util.Scanner;

public class InterfazMainFiguras {
    final int TAMAÑO_MAXIMO =3;
    Scanner LectorTeclado = new Scanner(System.in);
    String nombre, color;
    byte figuraElegida;
    Figuras arrayFiguras[]; // 1.Creación array
    int numFiguras;


    public InterfazMainFiguras(){
        numFiguras = 0;
        arrayFiguras = new Figuras[TAMAÑO_MAXIMO]; // 2. Declaramos el array, y decimos que tiene 3 huecos con el TAMAÑO_MÁXIMO.
    }

    public void opciones(){
        while (figuraElegida!=4 && numFiguras< TAMAÑO_MAXIMO){// que el programa acaba con el 4 o cuando el array está lleno.
            System.out.println("¿De qué figura desea obtener el área?\n" +
                    "1. Círculo\n" +
                    "2. Triángulo\n" +
                    "3. Cuadrado\n" +
                    "4. Finalizar programa");
            figuraElegida = LectorTeclado.nextByte();
          if (figuraElegida == 1){
                double radio;
                System.out.println("⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪\n" +
                        "    Has elegido el círculo\n" +
                        "⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪⚪");
                System.out.println("Introduce el nombre: ");
                nombre = LectorTeclado.next();
                System.out.println("Introduce el color: ");
                color = LectorTeclado.next();
                System.out.println("Introduce el radio del círculo: ");
                radio = LectorTeclado.nextDouble();
                System.out.println(radio);
                arrayFiguras[numFiguras] = new Circulo(nombre, color, radio); //3. Como es un array tipo "Figura" entre los [] guardamos el número de figuras, y el = new... es para decir lo que quiere almacenar.
                arrayFiguras[numFiguras].calcularArea(); //4. Guarda el área del círculo.
                System.out.println(arrayFiguras[numFiguras].toString()); //5. Muestra lo que hemos guardado.
                numFiguras++; //6. Pasa a la siguiente posición del array.
            }if (figuraElegida == 2){
                double base,altura;
                System.out.println("<><><><><><><><><><><><><><><><><><><><><>\n" +
                        "        Has elegido el triángulo\n" +
                        "<><><><><><><><><><><><><><><><><><><><><>");
                System.out.println("Introduce el nombre: ");
                nombre = LectorTeclado.next();
                System.out.println("Introduce el color: " );
                color = LectorTeclado.next();
                System.out.println("Introduce la base y la altura: ");
                base = LectorTeclado.nextDouble();
                altura = LectorTeclado.nextDouble();
                arrayFiguras[numFiguras] = new Triangulo(nombre, color, base, altura);
                arrayFiguras[numFiguras].calcularArea();
                System.out.println(arrayFiguras[numFiguras].toString());
                numFiguras++;
            }else if(figuraElegida == 3){
                double lado;
                System.out.println("⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜\n" +
                        "    Has elegido el cuadrado\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜");
                System.out.println("Introduce el nombre: ");
                nombre = LectorTeclado.next();
                System.out.println("Introduce el color: " );
                color = LectorTeclado.next();
                System.out.println("Introduce el lado: ");
                lado = LectorTeclado.nextDouble();
                arrayFiguras[numFiguras] = new Cuadrado(nombre, color, lado);
                arrayFiguras[numFiguras].calcularArea();
                System.out.println(arrayFiguras[numFiguras].toString());//¿?
                numFiguras++;//para que pase a la siguiente posición del array
            }

        }

    }

    public void imprimir(){ // Método del array
        for(int i=0; i < numFiguras;i++){
            System.out.println(arrayFiguras[i].toString());
        }
    }

    public static void main(String[] args) {
        InterfazMainFiguras interfaz = new InterfazMainFiguras();
        interfaz.opciones();
        System.out.println("==============================================================\n"
                +"-----------------Programa Figuras Finalizado------------------"+"\n" +
                "==============================================================");
        interfaz.imprimir();
    }
}
