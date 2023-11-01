import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class LAB2_1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenue sur notre programme de de calcul des couts de billett de l'Amphiteatre");
        // Définir des constantes pour les pourcentages et les taxes
        final double POURCENTAGE_PUBLICITE = 0.10;
        final double POURCENTAGE_ENTRETIEN = 0.02;
        final double POURCENTAGE_PROFIT = 0.15;
        final double TAXE_CULTURE = 2.00;
        final double TAXE_TPS = 0.05;
        final double TAXE_TVQ = 0.09975;

        // Utilisation de JOptionPane pour saisir le coût de base du billet
        String coutBaseStr = JOptionPane.showInputDialog("Veuillez saisir le coût de base du billet :");
        double coutBase = Double.parseDouble(coutBaseStr);

        // Calculez les différents éléments du coût total du billet
        double publicite = POURCENTAGE_PUBLICITE * coutBase;
        double entretien = POURCENTAGE_ENTRETIEN * coutBase;
        double profit = POURCENTAGE_PROFIT * coutBase;
        double taxeCulture = TAXE_CULTURE;
        //Calculez le coût  du billet avant taxe
        double sommePrecedente = coutBase + publicite + entretien + profit + taxeCulture;
        //valeur du taxe
        double tps = TAXE_TPS * sommePrecedente;
        double tvq = TAXE_TVQ * sommePrecedente;

        // Calculez le coût total du billet en ajoutant tous les éléments
        double coutTotal = sommePrecedente + tps + tvq;

        // Créez un objet DecimalFormat pour formater le résultat
        DecimalFormat format = new DecimalFormat("0.00");

        // Définissez le mode d'arrondi
        format.setRoundingMode(java.math.RoundingMode.HALF_UP);
        
        //Affichage de la valeur avant et apres taxe
        //JOptionPane.showMessageDialog(null, "Le cout avant taxe est de ; $" +format.format(sommePrecedente));
        //JOptionPane.showMessageDialog(null, "Le coût final du billet est de : $" + format.format(coutTotal));
String strResultat = " ";

strResultat += "\n Voici le prix detaillé " ;
strResultat += "\n Voici le prix avant taxe  $" + format.format(sommePrecedente) ;
strResultat += "\n Le cout final du billet est de : $" + format.format(coutTotal) ;

JOptionPane.showMessageDialog(null, strResultat + "$");

        // Fermez le programme
        System.exit(0);
    }
}

//Erreur de resultat non approximatif 