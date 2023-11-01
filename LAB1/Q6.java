import javax.swing.JOptionPane;

public class Q6 {
    public static void main(String[] args) {
        double econoBilly = 120.0;
        double prixcokecoke = 4.0;
        double prixhamburger = 18.0;

        String nbrcoke = JOptionPane.showInputDialog(null, "Entrez le nombre de coke acheté ");
        String nbrhamburger = JOptionPane.showInputDialog(null, "Entrez le nombre de hamburger acheté");

        double prixfinalcoke = (Double.parseDouble(nbrcoke)) * prixcokecoke;
        double prixfinalhamburger = (Double.parseDouble(nbrhamburger)) * prixhamburger;

        JOptionPane.showMessageDialog(null,"L'argent restant de Billy  " + (econoBilly - ( prixfinalcoke + prixfinalhamburger )));

    }
}
