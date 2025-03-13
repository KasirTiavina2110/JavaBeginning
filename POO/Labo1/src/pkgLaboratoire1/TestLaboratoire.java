package pkgLaboratoire1;

import javax.swing.JOptionPane;

public class TestLaboratoire {

    public static void main(String[] args) {
        // Test de la classe Mathematique
        Mathematique mathObj1 = new Mathematique();
        Mathematique mathObj2 = new Mathematique();

        // Saisie des données pour la classe Mathematique
        mathObj1.nbr1 = Double.parseDouble(JOptionPane.showInputDialog("Entrez le premier nombre pour mathObj1 : "));
        mathObj1.nbr2 = Double.parseDouble(JOptionPane.showInputDialog("Entrez le deuxième nombre pour mathObj1 : "));
        mathObj2.nbr1 = Double.parseDouble(JOptionPane.showInputDialog("Entrez le premier nombre pour mathObj2 : "));
        mathObj2.nbr2 = Double.parseDouble(JOptionPane.showInputDialog("Entrez le deuxième nombre pour mathObj2 : "));

        // Affichage des résultats pour la classe Mathematique
        System.out.println("Test de la classe Mathematique:");
        System.out.println("Valeur absolue de -5.5: " + mathObj1.valeurAbsolue(-5.5));
        System.out.println(
                "Valeur maximale entre " + mathObj1.nbr1 + " et " + mathObj1.nbr2 + ": " + mathObj1.valeurMaximale());
        System.out.println(
                "Valeur minimale entre " + mathObj2.nbr1 + " et " + mathObj2.nbr2 + ": " + mathObj2.valeurMinimale());
        System.out.println(
                "Puissance de " + mathObj1.nbr1 + " à la puissance de " + mathObj1.nbr2 + ": " + mathObj1.puissance());
        System.out.println("Racine carrée de 25: " + mathObj2.racineCarree(25));
        System.out.println("Somme de " + mathObj1.nbr1 + " et " + mathObj1.nbr2 + ": " + mathObj1.somme());
        System.out.println("Moyenne de " + mathObj2.nbr1 + " et " + mathObj2.nbr2 + ": " + mathObj2.moyenne());
        System.out.println("Attributs de mathObj1: " + mathObj1.toString());

        // Test de la classe AgePersonne
        AgePersonne personne1 = new AgePersonne();
        AgePersonne personne2 = new AgePersonne();

        // Saisie des données pour la classe AgePersonne
        personne1.prenom = JOptionPane.showInputDialog("Entrez le prénom pour personne1 : ");
        personne1.nom = JOptionPane.showInputDialog("Entrez le nom pour personne1 : ");
        personne1.age = Integer.parseInt(JOptionPane.showInputDialog("Entrez l'âge pour personne1 : "));
        personne2.prenom = JOptionPane.showInputDialog("Entrez le prénom pour personne2 : ");
        personne2.nom = JOptionPane.showInputDialog("Entrez le nom pour personne2 : ");
        personne2.age = Integer.parseInt(JOptionPane.showInputDialog("Entrez l'âge pour personne2 : "));

        // Affichage des résultats pour la classe AgePersonne
        System.out.println("\nTest de la classe AgePersonne:");
        System.out.println("Âge dans 10 ans pour " + personne1.nomComplet() + ": " + personne1.ageDansDixAns());
        System.out.println("Année de naissance pour " + personne2.nomComplet() + ": " + personne2.anneeDeNaissance());
        System.out.println("Nom complet pour personne1: " + personne1.nomComplet());
        System.out.println("Attributs de personne2: " + personne2.tousLesAttributs());

        // Test de la classe ChaineDeCaractere
        ChaineDeCaractere chaineObj1 = new ChaineDeCaractere();
        ChaineDeCaractere chaineObj2 = new ChaineDeCaractere();

        // Saisie des données pour la classe ChaineDeCaractere
        chaineObj1.chaine = JOptionPane.showInputDialog("Entrez une chaîne pour chaineObj1 : ");
        chaineObj2.chaine = JOptionPane.showInputDialog("Entrez une chaîne pour chaineObj2 : ");

        // Affichage des résultats pour la classe ChaineDeCaractere
        System.out.println("\nTest de la classe ChaineDeCaractere:");
        System.out.println("Longueur de la chaîne de caractères " + chaineObj1.chaine + ": " + chaineObj1.longueur());
        System.out.println("Comparer les chaînes " + chaineObj1.chaine + " et " + chaineObj2.chaine + ": "
                + chaineObj1.comparer(chaineObj2.chaine));
        System.out.println("Concaténation de " + chaineObj1.chaine + " et " + chaineObj2.chaine + ": "
                + chaineObj1.concatenation(chaineObj2.chaine));
        System.out.println(
                "Position du caractère 'a' dans " + chaineObj1.chaine + ": " + chaineObj1.positionCaractere('a'));
        System.out.println(
                "Sous-chaîne de " + chaineObj2.chaine + " entre les positions 1 et 3: " + chaineObj2.sousChaine(1, 3));
        System.out.println("Remplacement des 'a' par des 'e' dans la chaîne " + chaineObj1.chaine + ": "
                + chaineObj1.remplacerAparE());
        System.out.println("Casse zig-zag de la chaîne " + chaineObj2.chaine + ": " + chaineObj2.casseZigZag());
        System.out.println("Attributs de chaineObj1: " + chaineObj1.tousLesAttributs());
    }
}
