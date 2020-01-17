import java.util.PriorityQueue;

public class Internist {

    PriorityQueue<Patient> pq = new PriorityQueue<>(Patient.COMPARATOR_INCIDENCE);

    public Internist() {}


    public void addPatient(Patient patient) {
        pq.add(patient);
    }

    public void removePatient (Patient patient) {
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }

}
