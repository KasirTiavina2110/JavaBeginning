import javax.swing.JOptionPane;

public class Q5 {
    public static void main(String[] args) {
        double prixBike = 100;
        double prixroulette = 80;
        double prixfinalBike = 140;
        double prixfinalRoulette = 100;

        String nombreBike = JOptionPane.showInputDialog(null, "Veuillez entrer le nombre de Bicyclette ");
        String nombreRoulette = JOptionPane.showInputDialog(null, "Veuillez entrer le nombre de roulettes ");
        
        double nbrBike = Double.parseDouble(nombreBike);
        double beneficeBike = ((prixfinalBike - prixBike) * nbrBike);

        double  nbrRoulette = Double.parseDouble(nombreRoulette);
        double beneficeRoulette = ((prixfinalRoulette - prixroulette) * nbrRoulette);

        JOptionPane.showMessageDialog(null, "Benefice en Bike " + beneficeBike + "$\n");

        JOptionPane.showMessageDialog(null, "Benefice en roulette " + beneficeRoulette + "$\n");

      double benTotal = beneficeBike + beneficeRoulette;

      JOptionPane.showMessageDialog(null,"Benefice total est " + benTotal + "$\n");
      }
}
