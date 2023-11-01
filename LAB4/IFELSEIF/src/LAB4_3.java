import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class LAB4_3 {
    public static void main(String[] args) {
        final float COMISSION1= 0.05f; // inferieur
        final float COMISSION2= 0.1f; // superieur ou egale
        final double MONTANT_DES_VENTES_FIXE = 5000;
        final float MOINS_DE_5ANS = 0.04f;// majoration pour les employe -5ANS

        String numero = JOptionPane.showInputDialog(null, "Entrer le numero du vendeur :");
        String montantDesVentes = JOptionPane.showInputDialog(null, "Entrer le montant de la vente :");
        String ancienneteString = JOptionPane.showInputDialog(null, "Entrer l'annee d'ancienete :");

        //Parsing
        double montantVentes = Double.parseDouble(montantDesVentes);
        int anciennete = Integer.parseInt(ancienneteString);
        double comissionFinale = 0;
        DecimalFormat format = new DecimalFormat("0.00");
        //Calcul 
        
        if (montantVentes < MONTANT_DES_VENTES_FIXE){
            comissionFinale = montantVentes * COMISSION1;
        }else if(montantVentes >= MONTANT_DES_VENTES_FIXE && anciennete > 5){
            comissionFinale = montantVentes * COMISSION2;
        }else if (anciennete < 5 && montantVentes >= MONTANT_DES_VENTES_FIXE){
            comissionFinale =  ((montantVentes * COMISSION2) + (montantVentes * MOINS_DE_5ANS));
        }else {
            JOptionPane.showInputDialog(null, "Information Invalide veuillez regardez votre programme");
        }

        //Affichage 
        JOptionPane.showMessageDialog(null, "Le vendeur numero " +numero+ " a droit à une comission de " +format.format(comissionFinale)+ "$");
    }
}
