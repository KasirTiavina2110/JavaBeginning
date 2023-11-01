import javax.swing.JOptionPane;

public class Q3 {
     public static void main(String[] args) {
        JOptionPane.showMessageDialog (null, "Bienvenue au \nQ3 de Billy");
        //Saisie de l'heure 
        String heureSemaine = JOptionPane.showInputDialog("saisir le nombre d'heure ");
         String nom = "Billy";    
        //int heureSemaine = 35;
        double salaireH = 35.5;
        double heureSup = 10.0;
        double tauxHoraireSupplementaire = salaireH * 1.5;
         int intheureSemaine = Integer.parseInt(heureSemaine);
        // Calcul des salaires
         double salaireBase = intheureSemaine * salaireH;
         double salaireSupplementaire = heureSup * tauxHoraireSupplementaire;
         double salaireTotal = salaireBase + salaireSupplementaire;
 
         //Affichage de resultat en console 
        System.out.println("La paie de base de "+ nom + " est de " + salaireBase + "$" );
        System.out.println("La paie de base + supp de "+ nom + " est de " + salaireSupplementaire + "$" );
        System.out.println("La paie  Total de "+ nom + " est de " + salaireTotal + "$" );

        //Affichage des resultats en fenetre
        JOptionPane.showMessageDialog(null, "La paie de base de "+ nom + " est de " + salaireBase + "$\n" );
        JOptionPane.showMessageDialog(null, "La paie de base + supp de "+ nom + " est de " + salaireSupplementaire + "$\n" );
        JOptionPane.showMessageDialog(null, "La paie Total de "+ nom + " est de " + salaireTotal + "$\n" );
        System.exit (0) ;
    }
}
