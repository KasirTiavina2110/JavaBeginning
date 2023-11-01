import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class EXO3 {
    public static void main(String[] args) {
        // Déclaration de variables
        float noteMax = 0f;
        String nomNoteMax = "";
        float moyenne = 0f;
        int nombreEtudiants = 5;
        //on boucle l'affichage et aussi qu'à chaque tour de boucle on reaffecte la valeur de noteMax et le nom de la personne qui possede la note la plus élevée 
        for (int i = 0; i < nombreEtudiants; i++) {
            String nom = JOptionPane.showInputDialog(null, "Entrez le nom de l'étudiant :");
            float note = Float.parseFloat(JOptionPane.showInputDialog(null, "Entrez la note de l'étudiant"));

            if (note >= 0) {
                if (note > noteMax) {
                    noteMax = note;
                    nomNoteMax = nom;
                }
                moyenne += note;
            } else {
                System.out.println("La valeur de la note est invalide ou négative.");
            }
        }
        //Calcul de la moyenne
        float moyenneFinale = moyenne / nombreEtudiants;
        //Affichage finale
        DecimalFormat format = new DecimalFormat("0.0");
        System.out.println("La moyenne des 5 notes est égale à : " + format.format(moyenneFinale));
        System.out.println(nomNoteMax + " a obtenu la meilleure note avec : " + noteMax);
        System.exit(0);
    }
}
