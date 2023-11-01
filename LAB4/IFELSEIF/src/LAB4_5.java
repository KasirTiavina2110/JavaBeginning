import javax.swing.JOptionPane;

public class LAB4_5 {
    public static void main(String[] args) {
        // Saisie du numéro d'abonné, de la catégorie, du nombre de volumes en possession et du nombre de volumes à emprunter
        String abonneNumero = JOptionPane.showInputDialog("Entrez le numéro d'abonné :");
        String categorie = JOptionPane.showInputDialog("Entrez la catégorie (A, I ou E) :");
        int volumesEnPossession = Integer.parseInt(JOptionPane.showInputDialog("Entrez le nombre de volumes en possession :"));
        int volumesAEmprunter = Integer.parseInt(JOptionPane.showInputDialog("Entrez le nombre de volumes à emprunter :"));

        // Vérification de la catégorie et calcul de la durée d'emprunt
        int dureeEmprunt = 0;
        if (categorie.equalsIgnoreCase("A")) {
            if (volumesAEmprunter <= 10) {
                dureeEmprunt = 20;
            }
        } else if (categorie.equalsIgnoreCase("I")) {
            if (volumesAEmprunter <= 5) {
                dureeEmprunt = 30;
            }
        } else if (categorie.equalsIgnoreCase("E")) {
            if (volumesAEmprunter <= 15) {
                dureeEmprunt = 45;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Categorie non valide");
        }

        // Vérification de la possibilité d'emprunt
      
            if(categorie.equalsIgnoreCase("A") && (dureeEmprunt > 0 && (volumesEnPossession + volumesAEmprunter) <= 10)){
                JOptionPane.showMessageDialog(null, "L'abonne " +abonneNumero+ "peut emprunter de nouveaux volumes pour une duree " + dureeEmprunt + " jours.");
            }
            else if(categorie.equalsIgnoreCase("I") && (dureeEmprunt > 0 && (volumesEnPossession + volumesAEmprunter) <= 5)){
                 JOptionPane.showMessageDialog(null, "L'abonne " +abonneNumero+ "peut emprunter de nouveaux volumes pour une duree " + dureeEmprunt + " jours.");
            }
            else if(categorie.equalsIgnoreCase("I") && (dureeEmprunt > 0 && (volumesEnPossession + volumesAEmprunter) <= 15)){
                 JOptionPane.showMessageDialog(null, "L'abonne " +abonneNumero+ "peut emprunter de nouveaux volumes pour une duree " + dureeEmprunt + " jours.");
            }
         
        else {
            JOptionPane.showMessageDialog(null, "L'abonne " +abonneNumero+" ne peut pas emprunter de nouveaux volumes pour l'instant.");
        }
            System.exit(0);
    }
}

