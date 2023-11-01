package src;

import java.util.Scanner;

public class PlusGrandParmi20Nombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plusGrandNombre = Integer.MIN_VALUE;

        System.out.println("Entrez 20 nombres entiers :");

        for (int i = 1; i <= 20; i++) {
            System.out.print("Nombre #" + i + ": ");
            int nombre = scanner.nextInt();

            if (nombre > plusGrandNombre) {
                plusGrandNombre = nombre;
            }
        }

        System.out.println("Le plus grand nombre parmi les 20 nombres est : " + plusGrandNombre);

        scanner.close();
    }
}






