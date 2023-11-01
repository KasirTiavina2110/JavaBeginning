import java.util.Scanner;

public class Pluspetit {
    public static void main(String[] args) {
        int[] nombres = new int[5]; // Tableau pour stocker les 5 nombres

        // Demander à l'utilisateur de saisir les 5 nombres
        for (int i = 0; i < 5; i++) {
            nombres[i] = lireEntier("Entrez un nombre positif : ");
            if (nombres[i] <= 0) {
                System.out.println("Le nombre doit être positif. Veuillez réessayer.");
                i--; // Répéter la saisie du nombre
            }
        }

        // Trouver le plus petit nombre
        int plusPetit = nombres[0];
        for (int i = 1; i < 5; i++) {
            if (nombres[i] < plusPetit) {
                plusPetit = nombres[i];
            }
        }

        System.out.println("Le plus petit nombre parmi les 5 est : " + plusPetit);
    }

    // Fonction pour lire un entier depuis l'entrée standard
    public static int lireEntier(String message) {
        System.out.print(message);
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        }
    }
}
