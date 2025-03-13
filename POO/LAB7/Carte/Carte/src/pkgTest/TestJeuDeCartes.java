package pkgTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pkgCarte.Carte;
import pkgInterface.ComparatorCouleur;

public class TestJeuDeCartes {
    public static void main(String[] args) {
        // Création d'un tableau de cartes pouvant contenir 52 cartes
        Carte[] jeuDeCartes = new Carte[52];

        // Remplissage du tableau de cartes avec toutes les cartes d'un jeu
        int index = 0;
        for (String couleur : Carte.COULEURS) {
            for (int valeur = 1; valeur <= 13; valeur++) {
                jeuDeCartes[index] = new Carte(couleur, valeur);
                index++;
            }
        }

        // Création d'un ArrayList en ajoutant toutes les données du tableau de cartes
        List<Carte> listeCartes = new ArrayList<>();
        Collections.addAll(listeCartes, jeuDeCartes);

        // 1) Afficher toutes les cartes du jeu de cartes
        System.out.println("Toutes les cartes du jeu de cartes :");
        afficherCartes(listeCartes);

        // 2) Brasser toutes les cartes du jeu
        System.out.println("\nBrassage des cartes...");
        Collections.shuffle(listeCartes);

        // 3) Afficher toutes les cartes du jeu de cartes après brassage
        System.out.println("\nAprès brassage :");
        afficherCartes(listeCartes);

        // 4) Interchanger les positions 2 et 4 des cartes
        System.out.println("\nInterchanger les positions 2 et 4 des cartes...");
        Collections.swap(listeCartes, 1, 3);

        // 5) Afficher toutes les cartes du jeu de cartes après l'échange
        System.out.println("\nAprès interchanger les positions 2 et 4 :");
        afficherCartes(listeCartes);

        // 6) Trier les cartes
        System.out.println("\nTri des cartes...");
        Collections.sort(listeCartes, new ComparatorCouleur());

        // 7) Afficher toutes les cartes du jeu de cartes après le tri
        System.out.println("\nAprès tri :");
        afficherCartes(listeCartes);

        // 8) Faire une rotation avant des cartes
        System.out.println("\nRotation avant des cartes...");
        Collections.rotate(listeCartes, 1);

        // 9) Afficher toutes les cartes du jeu de cartes après la rotation avant
        System.out.println("\nAprès rotation avant :");
        afficherCartes(listeCartes);

        // 10) Inverser l'ordre de toutes les cartes du jeu
        System.out.println("\nInversion de l'ordre des cartes...");
        Collections.reverse(listeCartes);

        // 11) Afficher toutes les cartes du jeu de cartes après l'inversion
        System.out.println("\nAprès inversion de l'ordre :");
        afficherCartes(listeCartes);

        // 12) Inverser l'ordre de toutes les cartes du jeu avec la commande de tri
        System.out.println("\nInversion de l'ordre des cartes avec la commande de tri...");
        Collections.sort(listeCartes, Collections.reverseOrder());

        // 13) Afficher toutes les cartes du jeu de cartes après l'inversion avec la commande de tri
        System.out.println("\nAprès inversion de l'ordre avec la commande de tri :");
        afficherCartes(listeCartes);
    }

    // Méthode pour afficher toutes les cartes du jeu de cartes
    private static void afficherCartes(List<Carte> cartes) {
        for (Carte carte : cartes) {
            System.out.println(carte);
        }
    }
}
