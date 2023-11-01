import java.util.Scanner;

public class EXO9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Entrez 5 nombres valides (entre 1 et 500, exclusivement les multiples de 10) :");

        for (int i = 0; i < 5; ) {
            int nombre = scanner.nextInt();
            //nombre compris entre 1-500, et non multiple de 10
            if (nombre >= 1 && nombre <= 500 && nombre % 10 != 0) {
                // Le nombre est valide
                int carre = nombre * nombre;
                int cube = nombre * nombre * nombre;
                i++; // Incrémenter le compteur de nombres valides
                System.out.println(i + " Le carré de : "  + nombre + " est " + carre+ " et son cube est " + cube);
               

                
            }
        }

        scanner.close();
        System.exit(0);
    }
}
