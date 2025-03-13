import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import pkgTache.Tache;
import pkgInterface.ComparatorDateDebut;
import pkgInterface.ComparatorNom;
import pkgInterface.ComparatorCout;

public class Test2 {
    public static void main(String[] args) {
        // Création du tableau statique de tâches
        Tache[] taches = new Tache[5];
        
        // Initialisation des tâches de votre choix
        // Vous pouvez remplacer ces valeurs par celles de votre choix
        taches[0] = new Tache("Tâche 1", new GregorianCalendar(2024, 3, 1), new GregorianCalendar(2024, 3, 5), 10, 100.0, "Remarques 1");
        taches[1] = new Tache("Tâche 2", new GregorianCalendar(2024, 3, 3), new GregorianCalendar(2024, 3, 7), 15, 150.0, "Remarques 2");
        taches[2] = new Tache("Tâche 3", new GregorianCalendar(2024, 3, 6), new GregorianCalendar(2024, 3, 10), 20, 200.0, "Remarques 3");
        taches[3] = new Tache("Tâche 4", new GregorianCalendar(2024, 3, 9), new GregorianCalendar(2024, 3, 13), 25, 250.0, "Remarques 4");
        taches[4] = new Tache("Tâche 5", new GregorianCalendar(2024, 3, 12), new GregorianCalendar(2024, 3, 16), 30, 300.0, "Remarques 5");
        
        // Création de l'ArrayList pour stocker les tâches
        ArrayList<Object> listeTaches = new ArrayList<>();
        
        // Ajout des tâches du tableau statique à l'ArrayList
        for (Tache tache : taches) {
            listeTaches.add(tache);
        }
        
        int choix;
        do {
            // Affichage du menu
            String choixStr = JOptionPane.showInputDialog(null, "Menu:\n"
                    + "1) Ajouter une tâche\n"
                    + "2) Supprimer une tâche\n"
                    + "3) Modifier une tâche\n"
                    + "4) Rechercher une tâche\n"
                    + "5) Visualiser une tâche\n"
                    + "6) Trier par date de début\n"
                    + "7) Trier par nom\n"
                    + "8) Trier par coût\n"
                    + "9) Visualiser toutes les tâches\n"
                    + "10) Taille de l'ArrayList\n"
                    + "11) Quitter\n"
                    + "Choix:");
            
            choix = Integer.parseInt(choixStr);
            
            switch (choix) {
                case 1:
                    // Ajouter une tâche à l'ArrayList
                    ajouterTache(listeTaches);
                    break;
                case 2:
                    // Supprimer une tâche de l'ArrayList
                    supprimerTache(listeTaches);
                    break;
                case 3:
                    // Modifier une tâche de l'ArrayList
                    modifierTache(listeTaches);
                    break;
                case 4:
                    // Rechercher une tâche dans l'ArrayList
                    rechercherTache(listeTaches);
                    break;
                case 5:
                    // Visualiser une tâche dans l'ArrayList
                    visualiserTache(listeTaches);
                    break;
                case 6:
                    // Trier par date de début
                    Collections.sort(listeTaches, new ComparatorDateDebut());
                    JOptionPane.showMessageDialog(null, "Tâches triées par date de début.");
                    afficherTaches(listeTaches);
                    break;
                case 7:
                    // Trier par nom
                    // Cette opération n'est pas applicable car nous utilisons un ArrayList d'Objects
                    Collections.sort(listeTaches, new ComparatorNom());
                    JOptionPane.showMessageDialog(null, "Taches triees par nom.");
                    afficherTaches(listeTaches);
                    break;
                case 8:
                    // Trier par coût
                    Collections.sort(listeTaches, new ComparatorCout());
                    JOptionPane.showMessageDialog(null, "Tâches triées par coût.");
                    afficherTaches(listeTaches);
                    break;
                case 9:
                    // Visualiser toutes les tâches
                    afficherTaches(listeTaches);
                    break;
                case 10:
                    // Taille de l'ArrayList
                    JOptionPane.showMessageDialog(null, "Taille de l'ArrayList: " + listeTaches.size());
                    break;
                case 11:
                    // Quitter le programme
                    JOptionPane.showMessageDialog(null, "Au revoir !");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Choix invalide !");
            }
        } while (choix != 11);
    }
    
    // Méthode pour ajouter une tâche à l'ArrayList
    private static void ajouterTache(ArrayList<Object> listeTaches) {
        // Saisie des informations pour une nouvelle tâche
        String nomTache = JOptionPane.showInputDialog("Nom de la tâche:");
        String dateDebutStr = JOptionPane.showInputDialog("Date de début (AAAA-MM-JJ):");
        String dateFinStr = JOptionPane.showInputDialog("Date de fin (AAAA-MM-JJ):");
        String dureeNbreureStr = JOptionPane.showInputDialog("Durée (en nombre d'heures):");
        String coutTacheStr = JOptionPane.showInputDialog("Coût de la tâche:");
        String remarques = JOptionPane.showInputDialog("Remarques:");
        
        // Conversion des chaînes en types appropriés
        GregorianCalendar dateDebut = convertirDate(dateDebutStr);
        GregorianCalendar dateFin = convertirDate(dateFinStr);
        int dureeNbreure = Integer.parseInt(dureeNbreureStr);
        double coutTache = Double.parseDouble(coutTacheStr);
        
        // Création de la tâche
        Tache nouvelleTache = new Tache(nomTache, dateDebut, dateFin, dureeNbreure, coutTache, remarques);
        
        // Ajout de la tâche à l'ArrayList
        listeTaches.add(nouvelleTache);
        
        JOptionPane.showMessageDialog(null, "Tâche ajoutée avec succès !");
    }
    
    // Méthode pour convertir une chaîne en une date GregorianCalendar
    private static GregorianCalendar convertirDate(String dateStr) {
        String[] dateParts = dateStr.split("-");
        int annee = Integer.parseInt(dateParts[0]);
        int mois = Integer.parseInt(dateParts[1]);
        int jour = Integer.parseInt(dateParts[2]);
        return new GregorianCalendar(annee, mois - 1, jour);
    }
    
    // Méthode pour supprimer une tâche de l'ArrayList
    private static void supprimerTache(ArrayList<Object> listeTaches) {
        String nomTache = JOptionPane.showInputDialog("Entrez le nom de la tâche à supprimer:");
        boolean removed = false;
        
        for (int i = 0; i < listeTaches.size(); i++) {
            Tache tache = (Tache) listeTaches.get(i);
            if (tache.getNomTache().equals(nomTache)) {
                listeTaches.remove(i);
                removed = true;
                JOptionPane.showMessageDialog(null, "Tâche supprimée avec succès !");
                System.out.println("Tâche supprimée avec succès : " + tache);
                break;
            }
        }
        
        if (!removed) {
            JOptionPane.showMessageDialog(null, "Tâche non trouvée !");
            System.out.println("Tâche non trouvée !");
        }
    }
    
    // Méthode pour modifier une tâche de l'ArrayList
    private static void modifierTache(ArrayList<Object> listeTaches) {
        String nomTache = JOptionPane.showInputDialog("Entrez le nom de la tâche à modifier:");
        boolean found = false;
        
        for (int i = 0; i < listeTaches.size(); i++) {
            Tache tache = (Tache) listeTaches.get(i);
            if (tache.getNomTache().equals(nomTache)) {
                // Saisie des nouvelles informations
                ajouterTache(listeTaches);
                
                // Suppression de l'ancienne tâche
                listeTaches.remove(i);
                found = true;
                JOptionPane.showMessageDialog(null, "Tâche modifiée avec succès !");
                System.out.println("Tâche modifiée avec succès !");
                break;
            }
        }
        
        if (!found) {
            JOptionPane.showMessageDialog(null, "Tâche non trouvée !");
            System.out.println("Tâche non trouvée !");
        }
    }
    
    // Méthode pour rechercher une tâche dans l'ArrayList
    private static void rechercherTache(ArrayList<Object> listeTaches) {
        String nomTache = JOptionPane.showInputDialog("Entrez le nom de la tâche à rechercher:");
        boolean found = false;
        
        for (Object obj : listeTaches) {
            if (obj instanceof Tache) { // Vérifier si l'objet est une instance de Tache
                Tache tache = (Tache) obj;
                if (tache.getNomTache().equals(nomTache)) {
                    found = true;
                    JOptionPane.showMessageDialog(null, tache.toString());
                    System.out.println(tache.toString());
                    break;
                }
            }
        }
        
        if (!found) {
            JOptionPane.showMessageDialog(null, "La tâche n'est pas trouvée !");
            System.out.println("La tâche n'est pas trouvée !");
        }
    }
    
    // Méthode pour visualiser une tâche dans l'ArrayList
    private static void visualiserTache(ArrayList<Object> listeTaches) {
        String nomTache = JOptionPane.showInputDialog("Entrez le nom de la tâche à visualiser:");
        boolean found = false;
        
        for (Object obj : listeTaches) {
            Tache tache = (Tache) obj;
            if (tache.getNomTache().equals(nomTache)) {
                found = true;
                // Affichage de tous les attributs de la tâche
                JOptionPane.showMessageDialog(null, tache.toString());
                System.out.println("Tâche visualisée : " + tache);
                break;
            }
        }
        
        if (!found) {
            JOptionPane.showMessageDialog(null, "Tâche non trouvée !");
            System.out.println("Tâche non trouvée !");
        }
    }

    // Méthode pour afficher les tâches de l'ArrayList
    private static void afficherTaches(ArrayList<Object> listeTaches) {
        StringBuilder message = new StringBuilder("Liste des tâches:\n");
        for (Object obj : listeTaches) {
            Tache tache = (Tache) obj;
            // Conversion de la date de début en format "AAAA-MM-JJ"
            String dateDebutFormatted = convertirDateToString(tache.getDateDebut());
            message.append("Nom : ").append(tache.getNomTache()).append(", Date de début : ").append(dateDebutFormatted)
            .append("Cout : ").append(tache.getCoutTache()).append("\n");
            System.out.println("Nom : " + tache.getNomTache() + ", Date de début : " + dateDebutFormatted + ", Cout : " + tache.getCoutTache());
        }
        JOptionPane.showMessageDialog(null, message.toString());
    }

    // Méthode pour convertir une date GregorianCalendar en chaîne "AAAA-MM-JJ"
    private static String convertirDateToString(GregorianCalendar date) {
        return String.format("%d-%02d-%02d",
                date.get(Calendar.YEAR),
                date.get(Calendar.MONTH) + 1,
                date.get(Calendar.DAY_OF_MONTH));
    }
}
