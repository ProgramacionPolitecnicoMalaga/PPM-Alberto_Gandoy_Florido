package Main;

import HotelBuilder.PackBuilder;
import HotelBuilder.ServicePack;
import Modelo.Pack;

import java.util.Scanner;

public class App {
    public static Pack pack;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Elija el pack que quiere: \n" +
                "1. Pack básico (habitación simple y desayuno)\n" +
                "2. Pack romance (habitación doble y cena)\n" +
                "3. Pack familiar (habitación doble, cama adicional, desayuno, almuerzo, cena, parque de atracciones, actividades infantiles y cine en la playa)\n" +
                "4. Pack padres relajados (habitación doble, cama adicional, desayuno, almuerzo, cena, actividades infantiles, curso de kite surf y cine en la playa)\n" +
                "5. Pack deluxe (suite, desayuno, almuerzo y cena, curso de kite surf y cine en la playa)\n" +
                "6. Pack deluxe familiar(suite, cama adicional, desayuno, almuerzo, cena, parque de atracciones, curso de kite surf, actividades infantiles y cine en la playa)");

        byte eleccion = sc.nextByte();

        PackBuilder.HotelBuider packBuilder = new PackBuilder.HotelBuider();
        ServicePack servicePack = new ServicePack(packBuilder);

        if (eleccion == 1) {
            pack = servicePack.packBasico();
        } else if (eleccion == 2) {
            pack = servicePack.packRomantico();
        } else if (eleccion == 3) {
            pack = servicePack.packFamiliar();
        } else if (eleccion == 4) {
            pack = servicePack.packPadresRelajados();
        } else if (eleccion == 5) {
            pack = servicePack.packDeluxe();
        } else if (eleccion == 6) {
            pack = servicePack.packDeluxeFamiliar();
        }

        System.out.println(pack.toString());
    }
}
