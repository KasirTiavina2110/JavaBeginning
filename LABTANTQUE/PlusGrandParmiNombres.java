package src;

import java.util.Scanner;

public class PlusGrandParmiNombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plusGrandNombre = Integer.MIN_VALUE;
        int position = 0;

        System.out.println("Entrez des nombres entiers (0 pour arrêter la saisie) :");

        int nombre = scanner.nextInt();

        while (nombre != 0) {
            position++;

            if (nombre > plusGrandNombre) {
                plusGrandNombre = nombre;
            }

            System.out.println("Nombre #" + position + ": " + nombre);
            nombre = scanner.nextInt();
        }

        if (position > 0) {
            System.out.println("Le plus grand nombre parmi les nombres saisis est : " + plusGrandNombre);
        } else {
            System.out.println("Aucun nombre saisi.");
        }

        scanner.close();
    }
}





