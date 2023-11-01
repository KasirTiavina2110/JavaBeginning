import javax.swing.JOptionPane;

/**
 * ANDRIANANTENAINA TIAVINA 2305462
 * LAB3_1
 */
public class LAB3_1 {

    public static void main(String[] args) {
        final String NOM = "Lipton";
        final int HANDICAP_NORMAL = 9;

        //Saisi de chaque partie 
    String premiere =   JOptionPane.showInputDialog(null, "Saisir la premiere partie de " + NOM );
    String deuxieme =    JOptionPane.showInputDialog(null, "Saisir la deuxieme partie de " + NOM );
    String troisieme =    JOptionPane.showInputDialog(null, "Saisir la troisieme partie de " + NOM );
    String quatrieme =    JOptionPane.showInputDialog(null, "Saisir la quatrieme partie de " + NOM );
    String cinquieme =    JOptionPane.showInputDialog(null, "Saisir la cinquieme partie de " + NOM );
        
    //Parsing
    int prem = Integer.parseInt(premiere);
    int deux = Integer.parseInt(deuxieme);
    int trois = Integer.parseInt(troisieme);
    int quatre = Integer.parseInt(quatrieme);
    int cinq = Integer.parseInt(cinquieme);

    float calcul = Math.round((prem + deux + trois + quatre + cinq)/5) - 72;

    if(calcul > HANDICAP_NORMAL ){
        JOptionPane.showMessageDialog(null, "La valeur de son handicap est de :" + calcul + "elle s'est amelioree");
    }else{
         JOptionPane.showMessageDialog(null, "La valeur de son handicap est de :" + calcul + "elle peut encore mieux faire");
    }
 System.exit(0);
}
}