package pkgInterface;
import java.util.Comparator;
import pkgTache.Tache;

public class ComparatorCout implements Comparator<Object> {

    public int compare(Object o1, Object o2) {
        Tache tache1 = (Tache) o1; 
        Tache tache2 = (Tache) o2;

        if(tache1.getCoutTache() > tache2.getCoutTache()){
            return 1;
        }
        else if(tache1.getCoutTache() < tache2.getCoutTache()){
            return -1;
        }
        else{
            return 0;
        }
      
    }

}
