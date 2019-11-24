import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetIncidenceManager implements IncidenceManager {

    HashSet<Incidence> hS;

    public SetIncidenceManager() {
        this.hS = new HashSet<Incidence>();
    }

    public void addIncidence(Incidence incidence){
        hS.add(incidence);
    }

    @Override
    public void solveIncidence(Incidence incidence) {
        hS.remove(incidence);
    }

    public void print() {
        Iterator<Incidence> it = hS.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
