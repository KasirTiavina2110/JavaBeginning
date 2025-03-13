package pkgTest;

import javax.swing.JOptionPane;

import java.io.IOException;
import java.text.ParseException;
import java.util.GregorianCalendar;

import pkgGestionnairePersonne.GestionnairePersonne;
import pkgPersonnage.EmploydeMaintenance.EmployeDeMaintenance;
import pkgPersonnage.ForceDeSecurite.ForceDeSecurite;
import pkgPersonnage.Gestionnaire.Gestionnaire;
import pkgPersonnage.pkgAbstract.Personne;

public class TestAffichage {

    public static void main(String[] args) throws IOException {
        GestionnairePersonne gestionnaire = new GestionnairePersonne();
        gestionnaire.chargerDonneesAutomatiquement();

        while (true) {
            // Afficher le menu principal
            String[] options = {"Ajouter un survivant", "Supprimer un survivant", "Modifier un survivant",
                    "Rechercher un survivant", "Afficher tous les survivants", "Afficher en mode console", "Quitter"};
            int choix = JOptionPane.showOptionDialog(null, "Que voulez-vous faire ?", "Menu principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            switch (choix) {
                case 0:
                ajouterSurvivant(gestionnaire);
                break;
            case 1:
                supprimerSurvivant(gestionnaire);
                break;
            case 2:
                modifierSurvivant(gestionnaire);
                break;
            case 3:
                rechercherSurvivant(gestionnaire);
                break;
            case 4:
                afficherTousLesSurvivants(gestionnaire);
                break;
            case 5:
                afficherEnModeConsole(gestionnaire);
                break;
            case 6:
                sauvegarderEtQuitter(gestionnaire);
                return; // Quitter le programme
                default:
                    JOptionPane.showMessageDialog(null, "Choix invalide.", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void afficherEnModeConsole(GestionnairePersonne gestionnaire) {
        try {
            gestionnaire.trierEtEcrireListesDansFichiers();
            System.out.println("Données écrites dans les fichiers.");
            System.out.println("Affichage des humains en mode console :");
            gestionnaire.afficherHumainsEnModeConsole();
        } catch (IOException | ParseException e) {
            System.err.println("Erreur lors de l'affichage en mode console : " + e.getMessage());
        }
    }

    public static void ajouterSurvivant(GestionnairePersonne gestionnaire) {
        String matricule = JOptionPane.showInputDialog("Matricule :");
        String nom = JOptionPane.showInputDialog("Nom :");
        String prenom = JOptionPane.showInputDialog("Prénom :");
        String sexe = JOptionPane.showInputDialog("Sexe :");

        int typePersonne = Integer.parseInt(JOptionPane.showInputDialog("Type de personne (1: Employé de maintenance, 2: Force de sécurité, 3: Gestionnaire) :"));

        switch (typePersonne) {
            case 1:
                String secteur = JOptionPane.showInputDialog("Secteur :");
                String dateNaissanceStr = JOptionPane.showInputDialog("Date de naissance (format : AAAA-MM-JJ) :");
                GregorianCalendar dateNaissance = convertirStringEnGregorianCalendar(dateNaissanceStr);
                gestionnaire.ajouterPersonne(new EmployeDeMaintenance(matricule, nom, prenom, sexe, dateNaissance, true, secteur));
                break;
            case 2:
                String grade = JOptionPane.showInputDialog("Grade :");
                String poste = JOptionPane.showInputDialog("Poste :");
                String arme = JOptionPane.showInputDialog("Arme :");
                int anneesExperience = Integer.parseInt(JOptionPane.showInputDialog("Nombre d'années d'expérience :"));
                String dateNaissanceStr2 = JOptionPane.showInputDialog("Date de naissance (format : AAAA-MM-JJ) :");
                GregorianCalendar dateNaissance2 = convertirStringEnGregorianCalendar(dateNaissanceStr2);
                gestionnaire.ajouterPersonne(new ForceDeSecurite(matricule, nom, prenom, sexe, dateNaissance2, true, grade, poste, arme, anneesExperience));
                break;
            case 3:
                int niveau = Integer.parseInt(JOptionPane.showInputDialog("Niveau :"));
                String secteurGestion = JOptionPane.showInputDialog("Secteur :");
                String dateNaissanceStr3 = JOptionPane.showInputDialog("Date de naissance (format : AAAA-MM-JJ) :");
                GregorianCalendar dateNaissance3 = convertirStringEnGregorianCalendar(dateNaissanceStr3);
                gestionnaire.ajouterPersonne(new Gestionnaire(matricule, nom, prenom, sexe, dateNaissance3, true, niveau, secteurGestion));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Type de personne non valide.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void supprimerSurvivant(GestionnairePersonne gestionnaire) {
        String recherche = JOptionPane.showInputDialog("Entrez le matricule ou le nom du survivant à supprimer :");
        boolean trouve = false;
        for (Personne personne : gestionnaire.getPersonnes()) {
            if (personne.getMatricule().equalsIgnoreCase(recherche) || personne.getNom().equalsIgnoreCase(recherche)) {
                gestionnaire.supprimerPersonne(personne);
                JOptionPane.showMessageDialog(null, "Le survivant a été supprimé avec succès.");
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            JOptionPane.showMessageDialog(null, "Aucun survivant trouvé avec ce matricule ou ce nom.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void modifierSurvivant(GestionnairePersonne gestionnaire) {
        String recherche = JOptionPane.showInputDialog("Entrez le matricule ou le nom du survivant à modifier :");
        boolean trouve = false;
        for (Personne personne : gestionnaire.getPersonnes()) {
            if (personne.getMatricule().equalsIgnoreCase(recherche) || personne.getNom().equalsIgnoreCase(recherche)) {
                String nouveauNom = JOptionPane.showInputDialog("Entrez le nouveau nom :");
                personne.setNom(nouveauNom);
                JOptionPane.showMessageDialog(null, "Le survivant a été modifié avec succès.");
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            JOptionPane.showMessageDialog(null, "Aucun survivant trouvé avec ce matricule ou ce nom.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void rechercherSurvivant(GestionnairePersonne gestionnaire) {
        String recherche = JOptionPane.showInputDialog("Entrez le matricule ou le nom du survivant à rechercher :");
        boolean trouve = false;
        for (Personne personne : gestionnaire.getPersonnes()) {
            if (personne.getMatricule().equalsIgnoreCase(recherche) || personne.getNom().equalsIgnoreCase(recherche)) {
                JOptionPane.showMessageDialog(null, "Informations sur le survivant :\n" + personne);
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            JOptionPane.showMessageDialog(null, "Aucun survivant trouvé avec ce matricule ou ce nom.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void afficherTousLesSurvivants(GestionnairePersonne gestionnaire) {
        StringBuilder message = new StringBuilder("Tous les survivants :\n");
        for (Personne personne : gestionnaire.getPersonnes()) {
            message.append(personne).append("\n");
        }
        JOptionPane.showMessageDialog(null, message.toString(), "Tous les survivants", JOptionPane.INFORMATION_MESSAGE);
    }

    private static GregorianCalendar convertirStringEnGregorianCalendar(String dateStr) {
        String[] elementsDate = dateStr.split("-");
        int annee = Integer.parseInt(elementsDate[0]);
        int mois = Integer.parseInt(elementsDate[1]) - 1; // Les mois commencent à 0
        int jour = Integer.parseInt(elementsDate[2]);
        return new GregorianCalendar(annee, mois, jour);
    }

    public static void sauvegarderEtQuitter(GestionnairePersonne gestionnaire) throws IOException {
        gestionnaire.sauvegarderDansFichier("bunker.ser");
        JOptionPane.showMessageDialog(null, "Les données ont été sauvegardées avec succès dans 'bunker.ser'.\nL'application va maintenant se fermer.", "Sauvegarde et Quitter", JOptionPane.INFORMATION_MESSAGE);
    }
}
