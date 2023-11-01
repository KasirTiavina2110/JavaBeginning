import javax.swing.JOptionPane;

public class LAB2_7 {
    public static void main(String[] args) {
        

        String tempsEnSecondes1 = JOptionPane.showInputDialog(null,"Entrez un temps en secondes : ");
        int tempsEnSecondes = Integer.parseInt(tempsEnSecondes1);

        int heures = tempsEnSecondes / 3600; // 1 heure = 3600 secondes
        int minutes = (tempsEnSecondes % 3600) / 60; // 1 minute = 60 secondes
        int secondes = tempsEnSecondes % 60;

        JOptionPane.showMessageDialog(null,"Pour " + tempsEnSecondes + " secondes, cela équivaut à " + heures + "\n heure(s), " + minutes + "\n minute(s) et " + secondes + "\n seconde(s).");

        System.exit(0);
    }
}
