import javax.swing.JOptionPane;

public class LAB4_1 {
    public static void main(String[] args) throws Exception {
       // Demander à l'utilisateur de saisir le numéro du mois (de 1 à 12)
        int numeroMois = Integer.parseInt(JOptionPane.showInputDialog("Entrez le numéro du mois (de 1 à 12):"));

        // Demander à l'utilisateur de saisir l'année
        int annee = Integer.parseInt(JOptionPane.showInputDialog("Entrez l'année:"));

        // Déclarer une variable pour stocker le nombre de jours dans le mois
        int nombreJours = 0;

        // Déclarer une variable pour stocker le nom du mois
        String nomMois = "";

        // Utiliser un switch case pour déterminer le nombre de jours et le nom du mois
        switch (numeroMois) {
            case 1:
                nomMois = "Janvier";
                nombreJours = 31;
                break;
            case 2:
                nomMois = "Février";
                if ((annee % 4 == 0 ) || (annee % 400 == 0 && annee % 100 == 0)) {
                    nombreJours = 29; // Si l'année est bissextile
                } else {
                    nombreJours = 28; // Si l'année n'est pas bissextile
                }
                break;
            case 3:
                nomMois = "Mars";
                nombreJours = 31;
                break;
            case 4:
                nomMois = "Avril";
                nombreJours = 30;
                break;
            case 5:
                nomMois = "Mai";
                nombreJours = 31;
                break;
            case 6:
                nomMois = "Juin";
                nombreJours = 30;
                break;
            case 7:
                nomMois = "Juillet";
                nombreJours = 31;
                break;
            case 8:
                nomMois = "Août";
                nombreJours = 31;
                break;
            case 9:
                nomMois = "Septembre";
                nombreJours = 30;
                break;
            case 10:
                nomMois = "Octobre";
                nombreJours = 31;
                break;
            case 11:
                nomMois = "Novembre";
                nombreJours = 30;
                break;
            case 12:
                nomMois = "Décembre";
                nombreJours = 31;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Numéro de mois invalide.");
                System.exit(0);
        }

        // Afficher le résultat
        JOptionPane.showMessageDialog(null, "Le mois de " + nomMois + " en " + annee + " a " + nombreJours + " jours.");
    }
    }

