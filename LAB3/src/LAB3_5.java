 import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class LAB3_5 {
   
    public static void main(String[] args) {
        // Demande à l'utilisateur de saisir le nom du contribuable
        String nomContribuable = JOptionPane.showInputDialog("Entrez le nom du contribuable :");

        // Demande à l'utilisateur de saisir le revenu annuel
        String revenuStr = JOptionPane.showInputDialog("Entrez le revenu annuel du contribuable :");
        double revenu = Double.parseDouble(revenuStr);

        // Demande à l'utilisateur de saisir le nombre de personnes à charge
        String personnesAChargeStr = JOptionPane.showInputDialog("Entrez le nombre de personnes à charge :");
        int personnesACharge = Integer.parseInt(personnesAChargeStr);

        // Calcule l'impôt en fonction du revenu
        double impot;
        final double revenuPointdeDepart = 65000; 
        if (revenu <= revenuPointdeDepart) {
            impot = 0.10 * revenu;
        } else {
            impot = 0.15 * revenu;
        }

        // Déduit 500 $ pour chaque personne à charge
        impot -= 500 * personnesACharge;

        // Assure que l'impôt ne devient pas négatif
        if (impot < 0) {
            impot = 0;
        }
        DecimalFormat format = new DecimalFormat("0.00");
        // Affiche le montant de l'impôt à payer
        String message = "L'impôt à payer pour " + nomContribuable + " est de : $" + format.format(impot);
        JOptionPane.showMessageDialog(null, message);
    }
}

