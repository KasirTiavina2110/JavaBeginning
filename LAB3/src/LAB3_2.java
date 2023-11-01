import javax.swing.JOptionPane;

public class LAB3_2 {
    public static void main(String[] args) {
       //Constante 
       final int MAXHEURE = 23;
       final int MAXMINUTE = 59;
        final int MIN = 0;
        // Saisie de l'heure
        String heureStr = JOptionPane.showInputDialog("Entrez l'heure :");
        int heure = Integer.parseInt(heureStr);

        // Saisie des MINutes
        String MINuteStr = JOptionPane.showInputDialog("Entrez les MINutes :");
        int MINute = Integer.parseInt(MINuteStr);

        // Calcul de l'heure une MINute plus tard
        if (MINute >= MIN && MINute < MAXMINUTE) {
            MINute++;
        } else if (MINute == MAXMINUTE) {
            MINute = MIN;
            if (heure < MAXHEURE) {
                heure++;
            } else {
                heure = MIN;
            }
        }

        // Affichage du résultat
        String message = String.format("Dans une MINute, il sera %d heure(s), %d MINute(s).", heure, MINute);
        JOptionPane.showMessageDialog(null, message);
    }
}