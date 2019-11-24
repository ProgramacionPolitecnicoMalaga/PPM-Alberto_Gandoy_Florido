public class ViewIncidents {
    SetIncidenceManager setIncidenceManager = new SetIncidenceManager();

    Incidence incidence1 = new Incidence(4,"No se reconoce la red","Ubuntu");
    Incidence incidence2 = new Incidence(4,"El comando introduccido es incorrecto","Ubuntu");
    Incidence incidence3 = new Incidence(4,"Usuario no identificado","Ubuntu");
    Incidence incidence4 = new Incidence(4,"Controlador incompatible","Ubuntu");
    Incidence incidence5 = new Incidence(2,"Archivos del sistema corruptos","Windows");
    Incidence incidence6 = new Incidence(2,"No se pudo iniciar el programa","Windows");
    Incidence incidence7 = new Incidence(2,"No se encuentra la página solicitada","Windows");
    Incidence incidence8 = new Incidence(2,"Dentro de poco acaba su licencia","Windows");
    Incidence incidence9 = new Incidence(3,"Error crítico en el sistema","OS");
    Incidence incidence10 = new Incidence(3,"Programa incompatible","OS");
    Incidence incidence11 = new Incidence(3,"No se puede abrir el fichero","OS");
    Incidence incidence12 = new Incidence(3,"No se puede arrancar el modo recuperación","OS");

    public void showIncidence(){
        setIncidenceManager.addIncidence(incidence1);
        setIncidenceManager.addIncidence(incidence2);
        setIncidenceManager.addIncidence(incidence3);
        setIncidenceManager.addIncidence(incidence4);
        setIncidenceManager.addIncidence(incidence5);
        setIncidenceManager.addIncidence(incidence6);
        setIncidenceManager.addIncidence(incidence7);
        setIncidenceManager.addIncidence(incidence8);
        setIncidenceManager.addIncidence(incidence9);
        setIncidenceManager.addIncidence(incidence10);
        setIncidenceManager.addIncidence(incidence11);
        setIncidenceManager.addIncidence(incidence12);

        System.out.println(setIncidenceManager.hS);
    }

}
