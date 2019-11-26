public class InformativeScreen {
    public static void main(String[] args) {
        Internist internist = new Internist();

        internist.addPatient(new Patient("Pepe",1,32,2));
        internist.addPatient(new Patient("María",6,12,9));
        internist.addPatient(new Patient("Jorge",7,59,3));
        internist.addPatient(new Patient("Paco",12,48,12));
        internist.addPatient(new Patient("Pamela",8,38,8));
        internist.removePatient(new Patient("Pepe",1,32,2));
        internist.removePatient(new Patient("María",6,12,9));
        internist.removePatient(new Patient("Jorge",7,59,3));
        internist.removePatient(new Patient("Paco",12,48,12));
        internist.removePatient(new Patient("Pamela",8,38,8));

        System.out.println(internist.pq);
    }
}
