import java.util.Scanner;

public class PedirPorPantalla {
   private Scanner sc = new Scanner(System.in);
   private int pregunta;
   private int c1;
   private int c2;
   private int hipotenusa;
   private int eleccionUnidad;
   
    public void elegirUnidad() {
        System.out.println("¿Qué unidad desea utilizar?");
        System.out.println("1. mm\n" +
                "2. cm\n" +
                "3. m\n" +
                "Introduzca una opción:");
        eleccionUnidad = sc.nextInt();
    }

    public void elegirOperacion() throws ExceptionCalculos {

         if (pregunta > 4) {
            throw new ExceptionCalculos("Solo puedes elegir del 1 al 4");
        } else {
             System.out.println("¿Qué operación desea realizar?");
             System.out.println("1. Calcular la hipotenusa de un triángulo a aprtir de sus catetos.\n" +
                     "2. Calcular un cateto de un triángulo a partir de el otro cateto y la hipotenusa\n" +
                     "3. Calcular el área de un triángulo a partir un cateto y la hipotenusa\n" +
                     "4. Caluclar el área de un triángulo a partir de dos catetos.\n" +
                     "Elige una opción:");
             pregunta = sc.nextByte();
         }
    }

    public void pedirNumeros() throws ExceptionCalculos {
      if (pregunta == 1) {
          System.out.println("Introduce un cateto:\n" +
                  "Introduce el otro cateto:");
          c1 = sc.nextInt();
          c2 = sc.nextInt();
      } else if (pregunta == 2) {
          System.out.println("Introduce cateto \n" +
                  "Introduce hipotenusa");
          c1 = sc.nextInt();
          hipotenusa = sc.nextInt();

      } else if (pregunta == 3) {
          System.out.println("Introduce cateto \n" +
                  "Introduce hipotenusa");
          c1 = sc.nextInt();
          hipotenusa = sc.nextInt();
      } else if (pregunta == 4) {
          System.out.println("Introduce un cateto:\n" +
                  "Introduce el otro cateto:");
          c1 = sc.nextInt();
          c2 = sc.nextInt();
      } else if (pregunta > 4) {
          throw new ExceptionCalculos("Solo puedes elegir del 1 al 4");
      }

    }

    public String setEleccionUnidadString() throws ExceptionCalculos {
        if (eleccionUnidad == 1) {
            return "mm";
        } else if (eleccionUnidad == 2) {
            return "cm";
        }else if (eleccionUnidad == 3) {
            return "m";
        }else { throw new ExceptionCalculos("Solo puedes elegir del 1 al 4");}

    }

    public void realizarCalculos() throws ExceptionCalculos {
        if (pregunta == 1) {
            int calculo1 = (int) (Math.sqrt(Math.pow(c1, 2)) + (Math.sqrt(Math.pow(c2, 2))));
            System.out.println("El resultado es: " + calculo1 + setEleccionUnidadString());
        } else if (pregunta == 2) {
            int calculo2 = (int) (Math.sqrt(Math.pow(hipotenusa, 2)) - (Math.sqrt(Math.pow(c2, 2))));
            System.out.println("El resultado es: " + calculo2 + setEleccionUnidadString());
        } else if (pregunta == 3) {
            int calculo3 = (c1 * c2) / 2;
            System.out.println("El resultado es: " + calculo3 + setEleccionUnidadString());
        } else if (pregunta == 4) {
            int c = (int) (Math.sqrt(Math.pow(hipotenusa, 2)) - (Math.sqrt(Math.pow(c2, 2))));
            int calculo4 = (c * hipotenusa) / 2;
            System.out.println("El resultado es: " + calculo4 + setEleccionUnidadString());
        }
    }

}
