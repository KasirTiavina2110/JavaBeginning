package pkgInterface;

import java.util.Comparator;

import pkgTache.Tache;

public class ComparatorNom implements Comparator<Object>{
   
    public int compare(Object o1, Object o2){
        Tache nomTache1 = (Tache) o1;
        Tache nomTache2 = (Tache) o2;
    
    return nomTache1.getNomTache().compareTo(nomTache2.getNomTache());
}

   
}
