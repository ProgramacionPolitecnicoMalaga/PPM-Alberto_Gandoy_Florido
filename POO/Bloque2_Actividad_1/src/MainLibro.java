import java.util.Scanner;

public class MainLibro {
    public static void main(String[] args) {

        Scanner LectorTeclado = new Scanner(System.in);
        String tituloPedido;
        String autorPedido;

        System.out.println("Dame un título: ");
        tituloPedido = LectorTeclado.nextLine();
        System.out.println(" Dame un autor: ");
        autorPedido = LectorTeclado.nextLine();
        Libro libro = new Libro(autorPedido,tituloPedido);
        System.out.println("Título: " + libro.getTitulo() + " Autor: " + libro.getAutor());



        System.out.println("Dame un título: ");
        tituloPedido = LectorTeclado.nextLine();
        System.out.println(" Dame un autor: ");
        autorPedido = LectorTeclado.nextLine();
        Libro libro1 = new Libro(autorPedido,tituloPedido);
        System.out.println("Título: " + libro1.getTitulo() + " Autor: " + libro1.getAutor());



        System.out.println("Dame un título: ");
        tituloPedido = LectorTeclado.nextLine();
        System.out.println(" Dame un autor: ");
        autorPedido = LectorTeclado.nextLine();
        Libro libro2 = new Libro(autorPedido,tituloPedido);
        System.out.println("Título: " + libro2.getTitulo() + " Autor: " + libro2.getAutor());




        System.out.println("Dame un título: ");
        tituloPedido = LectorTeclado.nextLine();
        System.out.println(" Dame un autor: ");
        autorPedido = LectorTeclado.nextLine();
        Libro libro3 = new Libro(autorPedido,tituloPedido);
        System.out.println("Título: " + libro3.getTitulo() + " Autor: " + libro3.getAutor());


    }
}

