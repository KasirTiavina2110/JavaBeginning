import java.util.Scanner;

public class EXO11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demandez à l'utilisateur de saisir les deux nombres
        System.out.print("Entrez le premier nombre entier : ");
        int premierNombre = scanner.nextInt();

        System.out.print("Entrez le deuxième nombre entier : ");
        int deuxiemeNombre = scanner.nextInt();

        // Vérifiez si l'un des nombres est négatif, l'opération de multiplication n'est pas définie
        if (premierNombre < 0 || deuxiemeNombre < 0) {
            System.out.println("La multiplication n'est pas définie pour des nombres négatifs.");
        } else {
            int resultat = 0;
            int plusPetitNombre = Math.min(premierNombre, deuxiemeNombre); // on check qui est le plus petit entre les deux
            int plusGrandNombre = Math.max(premierNombre, deuxiemeNombre); // on check celui qui est plus grand

            for (int i = 0; i < plusPetitNombre; i++) {
                resultat += plusGrandNombre;
            }
            System.out.print(premierNombre + " x " + deuxiemeNombre + " = ");
            for (int i = 0; i < plusPetitNombre - 1; i++) {
                System.out.print(plusGrandNombre + " + "); // on boucle l'affichage +
            }
            System.out.println(plusGrandNombre + " = " + premierNombre + " X " + deuxiemeNombre + " = " + resultat);
        }

        scanner.close();
        System.exit(0);
    }
}
