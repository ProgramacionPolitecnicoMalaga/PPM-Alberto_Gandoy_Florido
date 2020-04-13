package Main;

import Factory.LectorFactory;
import Lector.*;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws Exception {
        //Factory.methodFactory("HTML","DEMO_HTLM");
       // Factory.methodFactory("TEXT","DEMO_TXT");

        System.out.println(LectorFactory.lecturaFactory("FactoryTEXT.txt"));

    }
}
