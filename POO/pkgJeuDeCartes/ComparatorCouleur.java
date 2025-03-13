// CLAUVICE MELANIE GUIMFACK
// LABORATOIRE 7
// 2024-04-05


package pkgJeuDeCartes;


import java.util.Comparator;

public class ComparatorCouleur implements Comparator<Carte>{

    public int compare(Carte uneCarte, Carte deuxCarte){
        return uneCarte.getCouleurCarte().compareTo(deuxCarte.getCouleurCarte());
    }
}
