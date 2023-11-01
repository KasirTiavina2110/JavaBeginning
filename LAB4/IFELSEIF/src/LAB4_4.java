import javax.swing.JOptionPane;

public class LAB4_4 {
    public static void main(String[] args) {
        //Originale && copie
        String nbrdeFeuilleOriginalString = JOptionPane.showInputDialog(null, "Nombre de feuille original :");
        int nbreFeuilleOriginale = Integer.parseInt(nbrdeFeuilleOriginalString) ;

        String nbreFeuilleCopiesString = JOptionPane.showInputDialog(null, "Nombre de  feuilles copies :");
        int nbreFeuillesCopies = Integer.parseInt(nbreFeuilleCopiesString);
        
        //boolean copie brochee, feuilles trouees, membre, delai rapide 
         // Saisie de l'option "COPIE BROCHÉE"
         String inputCopieBrochee = JOptionPane.showInputDialog("Voulez-vous une copie brochée (oui ou non) ?");
         boolean copieBrochee = inputCopieBrochee.equalsIgnoreCase("oui") || inputCopieBrochee.equalsIgnoreCase("o");
 
         // Saisie de l'option "FEUILLES TROUÉES"
         String inputFeuillesTrouees = JOptionPane.showInputDialog("Voulez-vous des feuilles trouées (oui ou non) ?");
         boolean feuillesTrouees = inputFeuillesTrouees.equalsIgnoreCase("oui") || inputFeuillesTrouees.equalsIgnoreCase("o");
 
         // Saisie de l'option "MEMBRE"
         String inputMembre = JOptionPane.showInputDialog("Êtes-vous membre (oui ou non) ?");
         boolean membre = inputMembre.equalsIgnoreCase("oui") || inputMembre.equalsIgnoreCase("o");
 
         // Saisie de l'option "DÉLAI RAPIDE"
         String inputDelaiRapide = JOptionPane.showInputDialog("Voulez-vous un délai rapide (oui ou non) ?");
         boolean delaiRapide = inputDelaiRapide.equalsIgnoreCase("oui")|| inputDelaiRapide.equalsIgnoreCase("o");

         //calcul
         double coutParFeuille;
         if( nbreFeuilleOriginale >= 0 && nbreFeuilleOriginale <= 249){
            coutParFeuille = 0.15;
        } else if (nbreFeuilleOriginale >= 250 && nbreFeuilleOriginale <= 499) {
            coutParFeuille = 0.12;
        } else {
            coutParFeuille = 0.08;
        }

        // Calcul du coût de la commande basique
        double coutTotal = nbreFeuilleOriginale * nbreFeuillesCopies * coutParFeuille;

        // Ajout du coût de l'option "COPIE BROCHÉE"
        if (copieBrochee) {
            coutTotal += 0.05 * nbreFeuilleOriginale;
        }

        // Ajout du coût de l'option "FEUILLES TROUÉES"
        if (feuillesTrouees) {
            coutTotal += 0.02 * nbreFeuillesCopies;
        }

        // Réduction du coût si le client est membre
        if (membre) {
            coutTotal -= 5.0;
            // Assurez-vous que le coût total ne devienne pas négatif
            if (coutTotal < 0) {
                coutTotal = 0;
            }
        }

        // Ajout du coût de l'option "DÉLAI RAPIDE"
        if (delaiRapide) {
            coutTotal += 8.0;
        }

        // Affichage du coût total
        String message = "Coût total de la facture (sans taxes) : $" + coutTotal;
        JOptionPane.showMessageDialog(null, message);
    }
        
    }

