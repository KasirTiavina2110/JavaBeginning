package pkgLaboratoire1;

import javax.swing.JOptionPane;

public class TestLaboratoire {
        public static void main(String[] args) {
                // Test de la classe AgePersonne
                AgePersonne personne1 = new AgePersonne();
                personne1.setPrenom("John");
                personne1.setNom("Doe");
                personne1.setAge(25);

                AgePersonne personne2 = new AgePersonne();
                personne2.setPrenom("Jane");
                personne2.setNom("Smith");
                personne2.setAge(30);

                // Modifier les valeurs du deuxième objet
                personne2.setPrenom(JOptionPane.showInputDialog("Entrez le prénom de la personne :"));
                personne2.setNom(JOptionPane.showInputDialog("Entrez le nom de la personne :"));
                String ageInput = JOptionPane.showInputDialog("Entrez l'âge de la personne :");
                personne2.setAge(Integer.parseInt(ageInput));

                // Affichage des résultats pour la classe AgePersonne
                System.out.println("Tests pour la classe AgePersonne:");
                System.out.println("Age de " + personne1.nomComplet() + " dans 10 ans : "
                                + personne1.ageDansDixAns());
                System.out.println("Année de naissance de " + personne2.nomComplet() + " : "
                                + personne2.anneeDeNaissance());
                System.out.println("Nom complet de " + personne1.nomComplet());
                System.out.println("Attributs de " + personne2.nomComplet() + " : " + personne2.tousLesAttributs());

                System.out.println("\n----------------------------------------\n");

                // Test de la classe ChaineDeCaracteres
                ChaineDeCaractere chaine1 = new ChaineDeCaractere();
                chaine1.setChaine("Hello");

                ChaineDeCaractere chaine2 = new ChaineDeCaractere();
                chaine2.setChaine("World");

                // Modifier les valeurs du deuxième objet
                chaine2.setChaine(JOptionPane.showInputDialog("Entrez une chaîne de caractères :"));

                // Affichage des résultats pour la classe ChaineDeCaracteres
                System.out.println("Tests pour la classe ChaineDeCaracteres:");
                System.out.println("Longueur de la chaîne '" + chaine1.getChaine() + "' : " + chaine1.longueur());
                System.out.println("Comparaison de deux chaînes : " + chaine1.comparer(chaine2.getChaine()));
                System.out.println("Concaténation de deux chaînes : " + chaine1.concatenation(chaine2.getChaine()));
                System.out.println("Position de 'e' dans la chaîne '" + chaine2.getChaine() + "' : "
                                + chaine2.positionCaractere('e'));
                System.out.println("Sous-chaîne de caractères de la chaîne '" + chaine1.getChaine() + "' : "
                                + chaine1.sousChaine(1, 4));
                System.out.println("Remplacement des 'a' par 'e' dans la chaîne '" + chaine2.getChaine() + "' : "
                                + chaine2.remplacerAparE());
                System.out.println(
                                "Casse zig-zag de la chaîne '" + chaine1.getChaine() + "' : " + chaine1.casseZigZag());
                System.out.println(
                                "Attributs de la chaîne '" + chaine2.getChaine() + "' : " + chaine2.tousLesAttributs());

                System.out.println("\n----------------------------------------\n");

                // Test de la classe Mathematique
                Mathematique math1 = new Mathematique(); // Utilise le constructeur par défaut
                Mathematique math2 = new Mathematique(5.0, 3.0); // Utilise un constructeur avec des valeurs initiales

                // Modifier les valeurs du deuxième objet
                String premierNombreInput = JOptionPane.showInputDialog("Entrez le premier nombre réel :");
                String deuxiemeNombreInput = JOptionPane.showInputDialog("Entrez le deuxième nombre réel :");
                math2.setPremierNombre(Double.parseDouble(premierNombreInput));
                math2.setDeuxiemeNombre(Double.parseDouble(deuxiemeNombreInput));

                // Affichage des résultats pour la classe Mathematique
                System.out.println("Tests pour la classe Mathematique:");
                System.out.println("Valeur absolue de " + math1.getPremierNombre() + " : "
                                + math1.valeurAbsolue(math1.getPremierNombre()));
                System.out.println("Valeur maximale entre " + math2.getPremierNombre() + " et "
                                + math2.getDeuxiemeNombre() + " : " + math2.valeurMaximale());
                System.out.println("Valeur minimale entre " + math2.getPremierNombre() + " et "
                                + math2.getDeuxiemeNombre() + " : " + math2.valeurMinimale());
                System.out.println("Premier nombre à la puissance du deuxième nombre : " + math2.puissance());
                System.out.println("Racine carrée de " + math1.getPremierNombre() + " : "
                                + math1.racineCarree(math1.getPremierNombre()));
                System.out.println("Somme des deux nombres : " + math2.somme());
                System.out.println("Moyenne des deux nombres : " + math2.moyenne());
                System.out.println("Tous les attributs de la classe Mathematique : " + math2.toString());
        }
}
