package pkgInterface;

import java.util.Comparator;

import pkgCarte.Carte;

public class ComparatorCouleur implements Comparator<Carte>{

    public int compare(Carte uneCarte, Carte deuxCarte){
        return uneCarte.getCouleur().compareTo(deuxCarte.getCouleur());
        
    }
    
}
