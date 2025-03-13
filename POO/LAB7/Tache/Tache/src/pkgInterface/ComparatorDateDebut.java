package pkgInterface;
import java.util.Comparator;
import pkgTache.Tache;

public class ComparatorDateDebut implements Comparator<Object> {

    public int compare(Object o1, Object o2) {
        Tache tache1 = (Tache) o1; // Downcasting de Object à Tache
        Tache tache2 = (Tache) o2;
        return tache1.getDateDebut().compareTo(tache2.getDateDebut());
    }
}
