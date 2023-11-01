import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class LAB4_2 {
    public static void main(String[] args) {
        
        String nom = JOptionPane.showInputDialog(null,"Saisir le nom du vendeur :");
        String salaireAnnuelString = JOptionPane.showInputDialog(null, "Saisir salaire annuel : ");
        String niveauPerformanceString = JOptionPane.showInputDialog(null, "Saisir niveau de performance :");

        //Parsing
        float salaireAnnuel = Float.parseFloat(salaireAnnuelString);
        int niveauPerformance = Integer.parseInt(niveauPerformanceString);
        float valeurPrime = 0;
        DecimalFormat format = new DecimalFormat("0.00");
        //Calcul par cas
        switch(niveauPerformance){
            case 1: 
            valeurPrime = salaireAnnuel * 0.06f;
            break;

            case 2: 
            valeurPrime = salaireAnnuel * 0.04f;
            break;

            case 3: 
            valeurPrime = salaireAnnuel * 0.02f;
            break;

            case 4: 
            valeurPrime = 0;
            break;
            default:
                JOptionPane.showMessageDialog(null, "Niveau non repertorier.");
                System.exit(0);
        }
        
        // Afficher le résultat
        JOptionPane.showMessageDialog(null,  nom + " ( " + niveauPerformance + " ) touchera une prime de  " + format.format(valeurPrime) + "$");
    }
}
