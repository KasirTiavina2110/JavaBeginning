import java.util.Random;

import javax.swing.JOptionPane;

public class EXO12 {
    public static void main(String[] args) {
     Random random = new Random();
        int bonnesReponses = 0;
        int mauvaisesReponses = 0;
        int choixInvalides = 0;

        for (int partie = 1; partie <= 5; partie++) {
            //Evite le camel case
            String choix = JOptionPane.showInputDialog("Partie " + partie + "\nChoisissez une option :\nA : Addition\nS : Soustraction").toUpperCase();
            //Check si l'operation n'est pas A ou S, avec une incrementation des erreurs de choix
            if (!choix.equals("A") && !choix.equals("S")) {
                choixInvalides++;
                if (choixInvalides == 3) {
                    JOptionPane.showMessageDialog(null, "L'application va quitter pour 24h! ;-)");
                    System.exit(0);
                }
                partie--;
                continue;
            }

            int nombre1 = random.nextInt(100) + 1;
            int nombre2 = random.nextInt(100) + 1;
           /* Equivalence en IF/ELSE
            String expression;
            if (choix.equals("A")) {
            expression = nombre1 + " + " + nombre2;
            } else {
            expression = nombre1 + " - " + nombre2;
            } */
            String expression = (choix.equals("A")) ? nombre1 + " + " + nombre2 : nombre1 + " - " + nombre2;
            //on calcule en avance le resultat pour le comparer avec celui que l'utilisateur tapera après
            int resultatAttendu = (choix.equals("A")) ? nombre1 + nombre2 : nombre1 - nombre2;

            //Meme principe que le jeu de la pendue
            int reponseUtilisateur = Integer.parseInt(JOptionPane.showInputDialog("Calculez : " + expression));
            //Comparaison des resultats
            if (reponseUtilisateur == resultatAttendu) {
                JOptionPane.showMessageDialog(null, "Bonne réponse!");
                bonnesReponses++;
            } else {
                JOptionPane.showMessageDialog(null, "Désolé, la réponse était " + resultatAttendu + ".");
                mauvaisesReponses++;
            }
        }

        JOptionPane.showMessageDialog(null, "Bilan :\nVous avez obtenu " + bonnesReponses + " bonne(s) réponse(s) et " + mauvaisesReponses + " mauvaise(s) réponse(s).");
        System.exit(0);
    }
}
