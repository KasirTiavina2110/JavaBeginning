import javax.swing.JOptionPane;

public class Q4 {
    public static void main(String[] args) {
        double prixBike = 100;
        double prixroulette = 80;
        String nombreBike = JOptionPane.showInputDialog(null, "Veuillez entrer le nombre de Bicyclette ");
        String nombreroulette = JOptionPane.showInputDialog(null, "Veuillez entrer le nombre de roulettes ");
        
        double montantTotal = ((Double.parseDouble(nombreBike)*prixBike) +(Double.parseDouble(nombreroulette)*prixroulette));
        JOptionPane.showMessageDialog(null, "Le montant total dont il doit payer est  " +montantTotal);
    }
}
