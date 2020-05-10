package Main;

import FactoryBuilder.*;
import PackBuilder.*;

public class App {
    public static void main(String[] args) {
        PackBuilder packBuilder = new PackBuilder();
        EscogerPack escogerPack = new EscogerPack(packBuilder);
        System.out.println(escogerPack.selectorPack(TipoDePack.DELUXE));
    }
}
