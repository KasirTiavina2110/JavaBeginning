package src;

import java.util.Random;
import java.util.Scanner;

public class mini_Exercice {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int nombreAleatoire = random.nextInt(5) + 1; // Génère un nombre aléatoire entre 1 et 5
        
        System.out.println("Devinez le nombre entre 1 et 5 :");
        
        int reponseUtilisateur;
        boolean reponseCorrecte = false;
        
        while (!reponseCorrecte) {
            reponseUtilisateur = scanner.nextInt();
            
            if (reponseUtilisateur >= 1 && reponseUtilisateur <= 5) {
                if (reponseUtilisateur == nombreAleatoire) {
                    System.out.println("Bravo ! Vous avez deviné le bon nombre.");
                    reponseCorrecte = true;
                } else {
                    System.out.println("Désolé, ce n'est pas le bon nombre. Réessayez :");
                }
            } else {
                System.out.println("Veuillez entrer un nombre entre 1 et 5 :");
            }
        }
        
        scanner.close();
    }


}
