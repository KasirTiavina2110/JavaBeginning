import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class LAB2_2_5 {
    public static void main(String[] args) {
        final double SALAIREHEURE = 18.25;
        final double EXTRA100 = 12.30; //tout les 100 circulaires

       
     double horaire =Double.parseDouble(JOptionPane.showInputDialog(null, "Nombre d'heure cette semaine : ")); 
    
     double salaireBase = horaire * SALAIREHEURE ;
    double extra = ((Double.parseDouble(JOptionPane.showInputDialog(null,"Nombre de circulaires : ")) * EXTRA100 )/100);
    double salaireTotal = salaireBase + extra;
    // Créez un objet DecimalFormat pour formater le résultat
    DecimalFormat format = new DecimalFormat("0.00");
   
    String strResultat = " ";

       strResultat += "\n un salaire de base de " +format.format(salaireBase);
       strResultat += "\n un montant en extra de " + format.format(extra) ;
       strResultat += "\n pour un total de : " + format.format(salaireTotal) ;

       JOptionPane.showMessageDialog(null, strResultat + "$");

        // Fermez le programme
        System.exit(0);
    }
}

