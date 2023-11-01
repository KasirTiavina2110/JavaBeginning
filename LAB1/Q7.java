import javax.swing.JOptionPane;

public class Q7 {
    public static void main(String[] args) {
        double budgetAnnuel = 200.0;

        double cinema = 60.0;
        double restaurant = 50.0;
        double divers = 70.0;

        JOptionPane.showMessageDialog(null, "pourcentage en cinema " + ((cinema * 100)/ budgetAnnuel) + "\n%");

         JOptionPane.showMessageDialog(null, "pourcentage en restaurant " + ((restaurant * 100)/ budgetAnnuel) + "\n%");

          JOptionPane.showMessageDialog(null, "pourcentage en divers " + ((divers * 100)/ budgetAnnuel) + "\n%");
    }
}
