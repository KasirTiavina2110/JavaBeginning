

package pkgJeuDeCartes;
import java.util.ArrayList;
import java.util.Collections;

public class TestJeuDeCarte {

    	public static void main(String[] args) {
            
            System.out.println("***** TESTS DE LA CLASSE Carte *****");
         
           
            // Creer un paquet de carte
            Carte[] paquetDeCartes = Carte.paquetDeCartes();

            // Remplir le tableau de cartes en y inserant toutes les cartes d'un jeu
            ArrayList<Carte> listeDeCartes = new ArrayList<Carte>();
            Collections.addAll(listeDeCartes, paquetDeCartes); // Ajour de toutes les cartes dans la liste

            System.out.println("\n......................................................................................................................................");
            System.out.println("1- Afficher toutes les cartes du jeux");
            for(int i=0; i<listeDeCartes.size(); i++){  // Afficher toutes les cartes
                System.out.println(listeDeCartes.get(i).getFaceCarte() + " de " + listeDeCartes.get(i).getCouleurCarte());
            }

            System.out.println("\n......................................................................................................................................");
            System.out.println("2- Brasser tous les cartes du jeu");
            Collections.shuffle(listeDeCartes);

            System.out.println("\n......................................................................................................................................");
            System.out.println("3- Afficher toutes les cartes du jeux");
            for(int i=0; i<listeDeCartes.size(); i++){
                System.out.println(listeDeCartes.get(i).getFaceCarte() + " de " + listeDeCartes.get(i).getCouleurCarte());
            }


            System.out.println("\n......................................................................................................................................");
            System.out.println("4- interchanger les positions 2 et 4 des cartes");
            if (listeDeCartes.size() >= 5) { // pour interchanger les elements 2 et 4, il faut qu'il y'ait au moins 5 elements dans la liste
                Collections.swap(listeDeCartes, 1, 3); // comme l'indice commence a 0, l'indice 1 correspond a la position 2 et l'indice 3 a la position 4
            } else{
                System.out.println("Il n'ya pas suffisament de cartes pour effectuer l'echange");
            }

            System.out.println("\n......................................................................................................................................");
            System.out.println("5- Afficher toutes les cartes du jeux");
            for(int i=0; i<listeDeCartes.size(); i++){
                System.out.println(listeDeCartes.get(i).getFaceCarte() + " de " + listeDeCartes.get(i).getCouleurCarte());
            }


            System.out.println("\n......................................................................................................................................");
            System.out.println("6- Trie les cartes par couleur");
            Collections.sort(listeDeCartes, new ComparatorCouleur()); // Trie par couleurs

            System.out.println("\n......................................................................................................................................");
            System.out.println("7- Afficher toutes les cartes du jeux");
            for(int i=0; i<listeDeCartes.size(); i++){
                System.out.println(listeDeCartes.get(i).getFaceCarte() + " de " + listeDeCartes.get(i).getCouleurCarte());
            }

            System.out.println("\n......................................................................................................................................");
            System.out.println("8- Faites une rotation avant des cartes");
            Collections.rotate(listeDeCartes, 1); // 0 c'est dire  qu'on commence par la premiere carte

            System.out.println("\n......................................................................................................................................");
            System.out.println("9- Afficher toutes les cartes du jeux");
            for(int i=0; i<listeDeCartes.size(); i++){
                System.out.println(listeDeCartes.get(i).getFaceCarte() + " de " + listeDeCartes.get(i).getCouleurCarte());
            }


            System.out.println("\n......................................................................................................................................");
            System.out.println("10- Inverser l'ordre de toutes les cartes du jeux");
            Collections.reverse(listeDeCartes);


            System.out.println("\n......................................................................................................................................");
            System.out.println("11- Afficher toutes les cartes du jeux");
            for(int i=0; i<listeDeCartes.size(); i++){
                System.out.println(listeDeCartes.get(i).getFaceCarte() + " de " + listeDeCartes.get(i).getCouleurCarte());
            }

            System.out.println("\n......................................................................................................................................");
            System.out.println("12- Inverser l'ordre de toutes les cartes du jeu en se servant de la commande tri");
            Collections.sort(listeDeCartes, Collections.reverseOrder(new ComparatorCouleur()));


            System.out.println("\n......................................................................................................................................");
            System.out.println("13- Afficher toutes les cartes du jeux");
            for(int i=0; i<listeDeCartes.size(); i++){
                System.out.println(listeDeCartes.get(i).getFaceCarte() + " de " + listeDeCartes.get(i).getCouleurCarte());
            }


            System.out.println("\n********Fin classeTest Cartes********");


        }


}
