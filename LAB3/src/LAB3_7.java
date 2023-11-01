import javax.swing.JOptionPane;

public class LAB3_7 {
    public static void main(String[] args) {
        // Demande à l'utilisateur de saisir le numéro de client
        String numeroClientStr = JOptionPane.showInputDialog("Entrez le numéro de client :");
        int numeroClient = Integer.parseInt(numeroClientStr);

        // Demande à l'utilisateur de saisir le nombre d'accidents
        String accidentsStr = JOptionPane.showInputDialog("Entrez le nombre d'accidents enregistrés :");
        int nombreAccidents = Integer.parseInt(accidentsStr);

        // Demande à l'utilisateur de saisir la prime actuelle
        String primeActuelleStr = JOptionPane.showInputDialog("Entrez la prime actuelle :");
        double primeActuelle = Double.parseDouble(primeActuelleStr);

        // Calcule la nouvelle prime en fonction du nombre d'accidents
        double nouvellePrime = primeActuelle; // Initialise avec la prime actuelle

        if (nombreAccidents == 0) {
            nouvellePrime *= 1.05; // Augmentation de 5%
        } else if (nombreAccidents == 1) {
            nouvellePrime *= 1.08; // Augmentation de 8%
        } else if (nombreAccidents == 2) {
            nouvellePrime *= 1.15; // Augmentation de 15%
        } else if (nombreAccidents == 3) {
            nouvellePrime *= 1.40; // Augmentation de 40%
        } else if (nombreAccidents >= 4) {
            JOptionPane.showMessageDialog(null, "Suppression de la police. Vous n'avez plus de couverture.");
            System.exit(0); // Termine le programme
        }

        // Affiche le montant de la nouvelle prime
        String message = "La nouvelle prime d'assurance pour le client " + numeroClient + " est de : $" + nouvellePrime;
        JOptionPane.showMessageDialog(null, message);
    }
}
