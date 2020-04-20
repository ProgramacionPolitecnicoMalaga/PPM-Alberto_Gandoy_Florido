import java.util.Scanner;

public class EjemploBilder {
        public static Hamburguesa hamburguesa;
        public static void main(String[] args) {
            Scanner lectorTeclado = new Scanner(System.in).useDelimiter("\n");
            System.out.print("Elija el tipo Hamburguesa\n" +
                    "1. Hamburguesa normal (sólo hamburguesa)\n" +
                    "2. Hamburguesa con queso\n" +
                    "3. Hamburguesa completa (con queso, lechuga y tomate)\n" +
                    "4. Hamburguesa doble\n" +
                    "5. Hamburguesa doble completa (con queso, lechuga y tomate)\n" +
                    "6. Hamburguesa cheese bacon (con queso y bacon)\n" +
                    "7. Hamburguesa Hércules (doble, con queso, tomate, bacon, huevo y salsa chile)\n" +
                    "8. Hamburguesa Godzilla (doble, con tomate, lechuga, cebolla, pepinillo, bacon y salsa chile)\n" +
                    "Elija: ");

            int tipoHamburguesa = lectorTeclado.nextInt();

            HambuergesaBuilder.HamburguesaBuilder hamburguesaBuilder = new HambuergesaBuilder.HamburguesaBuilder();
            HamburguesaDirector hamburguesaDirector = new HamburguesaDirector(hamburguesaBuilder);


            switch (tipoHamburguesa){
                case 1:
                    hamburguesa = hamburguesaDirector.servirHamburguesaNormal();
                    break;
                case 2:
                    hamburguesa = hamburguesaDirector.servirHamburguesaConQueso();
                    break;
                case 3:
                    hamburguesa = hamburguesaDirector.servirHamburquesaCompleta();
                    break;
                case 4:
                    hamburguesa = hamburguesaDirector.servirHamburguesaDoble();
                    break;
                case 5:
                    hamburguesa = hamburguesaDirector.servirHamburguesaDobleCompleta();
                    break;
                case 6:
                    hamburguesa = hamburguesaDirector.servirHamburguesaCheeseBacon();
                    break;
                case 7:
                    hamburguesa = hamburguesaDirector.servirHamburguesaHercules();
                    break;
                case 8:
                    hamburguesa = hamburguesaDirector.servirHamburguesaGodzilla();
                    break;
            }

            System.out.println(hamburguesa);
        }

    }
