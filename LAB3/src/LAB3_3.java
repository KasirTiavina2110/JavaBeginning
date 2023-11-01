import javax.swing.JOptionPane;
public class LAB3_3 {
    

    public static void main(String[] args) {
        // Demande à l'utilisateur de saisir l'heure, les minutes et les secondes
        String heureStr = JOptionPane.showInputDialog("Entrez l'heure:");
        String minuteStr = JOptionPane.showInputDialog("Entrez les minutes:");
        String secondeStr = JOptionPane.showInputDialog("Entrez les secondes:");

        //Constant 
        final int MAXSECONDE, MAXMINUTE, MAXHEURE;
        MAXSECONDE = 59;
        MAXMINUTE = 59;
        MAXHEURE = 23;
        final int MIN = 0;
        final int MAX = 60;
        final int MINUIT = 24;

        // Convertit les entrées en entiers
        int heure = Integer.parseInt(heureStr);
        int minute = Integer.parseInt(minuteStr);
        int seconde = Integer.parseInt(secondeStr);


        // Vérifie si les valeurs sont valides
        if (heure >= MIN && heure <= MAXHEURE && minute >= MIN && minute <= MAXMINUTE && seconde >= MIN && seconde <= MAXSECONDE) {
            // Ajoute une seconde
            seconde++;

            // Gère le report des secondes
            if (seconde == MAX) {
                seconde = MIN;
                minute++;
                if (minute == MAX) {
                    minute = MIN;
                    heure++;
                    if (heure == MINUIT) {
                        heure = MIN;
                    }
                }
            }

            // Affiche le résultat
            String message = "Dans une seconde, il sera " + heure + " heure(s), " + minute + " minute(s) et " + seconde + " seconde(s).";
            JOptionPane.showMessageDialog(null, message);
        } else {
            // Si les valeurs ne sont pas valides, affiche un message d'erreur
            JOptionPane.showMessageDialog(null, "Veuillez entrer des valeurs valides pour l'heure, les minutes et les secondes.");
        }
    }
}


