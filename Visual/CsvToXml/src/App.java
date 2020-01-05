public class App {
    public static void main(String[] args) {


        //1 csv
        Pais p1 = new Pais();
        LecturaCSV l1 = new LecturaCSV();
        System.out.println(l1.aeropuertosCSV("airports.csv"));
        p1.mostrarAeropuerto();

        //2 csv
        Paises ps1 = new Paises();
        LecturaCSV l2 = new LecturaCSV();
        System.out.println(l2.paisesAirportCSV("airports.csv"));
        ps1.mostrarPaises();

        //3 csv
        Pais p2 = new Pais();
        LecturaCSV l3 = new LecturaCSV();
        System.out.println(l3.aeropuertosCSV("airline.csv"));
        p2.mostrarAeropuerto();

        //4 csv
        Paises ps2 = new Paises();
        LecturaCSV l4 = new LecturaCSV();
        System.out.println(l4.paisesAirportCSV("airline.csv"));
        ps2.mostrarPaises();


        //1 xml
        Paises ps3 = new Paises();
        Pais p3 = new Pais();
        GenerarXML g1 = new GenerarXML();
        g1.aeropuertoXML(ps3.getPaises(), p3.getAeropuertos());

        //2 xml
        Paises ps4 = new Paises();
        Pais p4 = new Pais();
        GenerarXML g2 = new GenerarXML();
        g2.aerolineaXML(ps4.getPaises(), p4.getAerolineas());

       CalcularTiempo calcularTiempo = new CalcularTiempo();
        System.out.println(calcularTiempo.calculoTotal());
        //1 xml a csv
        GenerarXML g3 = new GenerarXML();
        g3.xmlToCsvAeropuerto("aeropuertos.xml");

        //2 xml a csv
        GenerarXML g4 = new GenerarXML();
        g3.xmlToCsvAeropuerto("aerolineas.xml");





    }
}
