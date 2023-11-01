import javax.swing.JOptionPane;

public class LAB3_8 {
     public static void main(String[] args) {
        // Demande à l'utilisateur de saisir le nombre d'étudiants présents
        String nombreEtudiantsStr = JOptionPane.showInputDialog("Entrez le nombre d'étudiants présents :");
        int nombreEtudiants = Integer.parseInt(nombreEtudiantsStr);

        // Demande à l'utilisateur de saisir le prix du billet
        String prixBilletStr = JOptionPane.showInputDialog("Entrez le prix du billet par étudiant :");
        double prixBillet = Double.parseDouble(prixBilletStr);

        // Calcule le coût pour le traiteur en fonction du nombre d'étudiants
        double coutTraiteur;
        if (nombreEtudiants <= 50) {
            coutTraiteur = nombreEtudiants * 15;
        } else {
            coutTraiteur = 50 * 15 + (nombreEtudiants - 50) * 12;
        }

        // Calcule le total des ventes pour le souper
        double totalVentes = nombreEtudiants * prixBillet;

        // Calcule le profit ou la perte
        double profitOuPerte = totalVentes - coutTraiteur;

        // Affiche le résultat
        String message = "Concernant le souper de la rentrée pour les étudiants d'informatique\n"
                + "Merci pour les " + nombreEtudiants + " étudiants qui ont participé au souper.\n"
                + "Le prix du billet était de " + prixBillet + " par étudiant.\n"
                + "Le coût pour le traiteur était de " + coutTraiteur + ".\n"
                + "Le total des ventes pour le souper a été de " + totalVentes + ".\n";

        if (profitOuPerte > 0) {
            message += "Le comité a donc réalisé un profit de " + profitOuPerte + " pour cette belle activité. Félicitations.";
        } else if (profitOuPerte < 0) {
            message += "Le comité a réalisé une perte de " + Math.abs(profitOuPerte) + " pour le souper. On se reprend.";
        } else {
            message += "Le comité n'a ni profit ni perte pour le souper.";
        }

        JOptionPane.showMessageDialog(null, message);
    }
}
