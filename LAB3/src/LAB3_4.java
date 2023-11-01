import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class LAB3_4 {
    public static void main(String[] args) {
        final double dixPremiers = 0.10;
        final double vingtPremiers = 0.09;
        final double autres = 0.08; // Plus de 20

        String photocopieString = JOptionPane.showInputDialog(null, "Combien de photocopies désirez-vous ?");
        // Parsing data
        int nbrPhotocopie = Integer.parseInt(photocopieString);
        DecimalFormat format = new DecimalFormat("0.00");
        double montantFacture;
        // Calcule le montant de la facture en fonction du nombre de photocopies
        if (nbrPhotocopie <= 10) {
            montantFacture = nbrPhotocopie * dixPremiers;
        } else if (nbrPhotocopie <= 30) {
            montantFacture = 10 * dixPremiers + (nbrPhotocopie - 10) * vingtPremiers; //peu importe le reste on le multiplie par la valeur de du 20 premiers
        } else {
            montantFacture = 10 * dixPremiers + 20 * vingtPremiers + (nbrPhotocopie - 30) * autres; // on prend un à un le cas 40 = (10*0.10) //10 premier + (20*0.09)//20 premier + (nbrPhotocopie - (20+10) * reste)
        }

        // Affiche le montant de la facture
        String message = "Le montant de la facture pour " + nbrPhotocopie + " photocopies est de : $" + format.format(montantFacture);
        JOptionPane.showMessageDialog(null, message);

    }
}
