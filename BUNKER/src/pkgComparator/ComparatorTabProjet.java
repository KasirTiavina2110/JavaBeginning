package pkgComparator;
import java.util.Comparator;

import pkgPersonnage.Gestionnaire.Scientifique;


public class ComparatorTabProjet implements Comparator<Scientifique> {
    

    @Override
    public int compare(Scientifique o1, Scientifique o2) {
        if(o1.getNombreDeProjet()>(o2.getNombreDeProjet())){
            return 1;
        }else if(o1.getNombreDeProjet()<(o2.getNombreDeProjet())){
            return -1;
        }else{
            return 0;
        }
            
        
    }
}
