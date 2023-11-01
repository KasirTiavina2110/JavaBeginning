package src;

import java.util.Random;
import java.util.Scanner;

public class mini_Exercice2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int nombreSecret = random.nextInt(11) + 10; // Génère un nombre aléatoire entre 10 et 20.
        int reponse = 0;

        System.out.println("Devinez un nombre entre 10 et 20.");

        while (reponse != nombreSecret) {
            System.out.print("Entrez un nombre : ");
            reponse = scanner.nextInt();

            if (reponse < 10) {
                System.out.println("Plus grand.");
            } else if (reponse > 20) {
                System.out.println("Plus petit.");
            } else if (reponse < nombreSecret) {
                System.out.println("Nombre secret est plus grand.");
            } else if (reponse > nombreSecret) {
                System.out.println("Nombre secret est plus petit.");
            }
        }

        System.out.println("Bravo ! Vous avez deviné le nombre secret : " + nombreSecret);
        scanner.close();
    }

}
