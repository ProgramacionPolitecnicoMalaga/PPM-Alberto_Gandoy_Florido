import java.util.Comparator;

public class Patient {
    private String name;
    private int severityIncidence, age, specialtyId;

    public Patient(String name, int severityIncidence, int age, int specialtyId) {
        this.name = name;
        this.severityIncidence = severityIncidence;
        this.age = age;
        this.specialtyId = specialtyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeverityIncidence() {
        return severityIncidence;
    }

    public void setSeverityIncidence(int severityIncidence) {
        this.severityIncidence = severityIncidence;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(int specialtyId) {
        this.specialtyId = specialtyId;
    }

    @Override
    public String toString() {
        return "==PATIENT==" + "\n" +
                "Name: " + name + "\n" +
                "Severity incidence: " + severityIncidence + "\n" +
                "Age: " + age + "\n" +
                "Specialty ID: " + specialtyId + " ";
    }

    public static final Comparator<Patient> COMPARATOR_INCIDENCE = new Comparator<Patient>() {
        @Override
        public int compare(Patient p1, Patient p2) {
            return p1.getSeverityIncidence() - p2.getSeverityIncidence();
        }
    };

    public static final Comparator<Patient> COMPARATOR_ID = new Comparator<Patient>() {
        @Override
        public int compare(Patient p1, Patient p2) {
            return p1.getSpecialtyId() - p2.getSpecialtyId();
        }
    };
}
