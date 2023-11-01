/**
 * Pgcd
 */
import java.util.Scanner;

public class EXO8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer les deux nombres
        System.out.print("Entrez le premier nombre : ");
        int nombre1 = scanner.nextInt();

        System.out.print("Entrez le deuxième nombre : ");
        int nombre2 = scanner.nextInt();

        // Vérifier que les nombres sont strictement positifs
        if (nombre1 <= 0 || nombre2 <= 0) {
            System.out.println("Les nombres doivent être strictement positifs.");
        }else{
            
        // Trouver le plus grand commun diviseur (PGCD) avec une boucle for , jusqu'à ce que %i == 0 et %i soit conforme au deux nombres
        int pgcd = 1;
        for (int i = 1; i <= nombre1 && i <= nombre2; i++) {
            if (nombre1 % i == 0 && nombre2 % i == 0) {
                pgcd = i;
            }
            // Afficher le PGCD
             System.out.println("Le plus grand commun diviseur (PGCD) de " + nombre1 + " et " + nombre2 + " est : " + pgcd);
        }
        }
     scanner.close();
     System.exit(0);
    }
}
