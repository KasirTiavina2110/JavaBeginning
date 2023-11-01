import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class LAB2_6 {
    public static void main(String[] args) {
        final float VINGT = 20;
        final float CENT = 100;
        // Demander le nom de l'étudiant
        String nomEtudiant = JOptionPane.showInputDialog(null, "Entrez le nom de l'étudiant : ");

        // Demander la note obtenue à l'examen
        float noteExamen = Float.parseFloat(JOptionPane.showInputDialog(null, "Entrez la note obtenue à l'examen : "));

        // Demander la pondération totale de l'examen
        float ponderationExamen = Float.parseFloat(JOptionPane.showInputDialog(null, "Entrez la pondération totale de l'examen : "));

        // Calculer le résultat selon la pondération
        float resultat = (noteExamen * CENT  ) / ponderationExamen;

        // Calculer l'équivalent sur 20
        float equivalentSur20 = (resultat * VINGT) / CENT;

        // Formater les résultats
        DecimalFormat pourcentageFormat = new DecimalFormat("0.00");
        DecimalFormat equivalentSur20Format = new DecimalFormat("0.0");

        String resultatStr = nomEtudiant + " a eu " + noteExamen + " points sur un examen de " + ponderationExamen + " points.\n";
        resultatStr += nomEtudiant + " obtient donc " + pourcentageFormat.format(resultat) + "% pour son examen,\n";
        resultatStr += "ce qui équivaut à un résultat de " + equivalentSur20Format.format(equivalentSur20) + "/20.";

        // Afficher les résultats
        JOptionPane.showMessageDialog(null, resultatStr);

        // Fermer le programme
        System.exit(0);
    }
}
