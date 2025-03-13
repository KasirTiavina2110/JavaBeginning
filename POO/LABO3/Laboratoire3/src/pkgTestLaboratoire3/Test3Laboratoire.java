package pkgTestLaboratoire3;

import javax.swing.JOptionPane;

import pkgLaboratoire3.CIDate;
import pkgLaboratoire3.Compte;
import pkgLaboratoire3.Etudiant;
//import pkgLaboratoire3.Etudiant;
import pkgLaboratoire3.Facture;

public class Test3Laboratoire {
    public static void main(String[] args) {

        /********************
         * Tests de la classe CIDate
         ********************/
        System.out.println("***** TESTS DE LA CLASSE CIDate *****");

        // Test avec le constructeur paramétré
        try {
            //correction
            CIDate date1 = new CIDate();
            System.out.println("Date 1 par defaut : " + date1.formatDate());

            CIDate date2 = new CIDate(2023, 13, 12);
            System.out.println("Date 2: " + date2.formatDate());

            // Modification des attributs via les méthodes set
            date2.setJour(10);
            date2.setMois(2);
            date2.setAnnee(2024);
            System.out.println("Date 2 modifiée: " + date2.formatDate());

            //date non valide
            CIDate nonValide = new CIDate(2024, 60, 85);
            System.out.println("Date non valide: " +nonValide.formatDate());

            // Vérification de la méthode equals
            System.out.println("Les dates sont-t-elles égales ? " + date2.equals(date2));

            CIDate date4 = new CIDate(2024, 2, 29); // Date valide pour une année bissextile
            System.out.println("La date est : " + date4);
            CIDate date5 = new CIDate(2024, 2, 10); // Date pour equals
            System.out.println("Les dates sont-t-elles égales pour date 2 et date 5 ? " + date2.equals(date5));

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur lors de la création d'une date : " + e.getMessage());
        }

        System.out.println("***** FIN DES TESTS DE LA CLASSE CIDate *****\n");

        // Test avec le constructeur par défaut
        Etudiant etudiant1 = new Etudiant();
        System.out.println("Constructeur par défaut - etudiant1: " + etudiant1.toString());

        /*********************
         * Test de la classe Etudiant
         ********************/
        System.out.println("***** DEBUT DES TESTS DE LA CLASSE Etudiant *****\n");
        // Test avec le constructeur paramétré
        CIDate dateDeNaissance = new CIDate(2000, 5, 15);
        int[] notes = { 80, 90, 70 };
        Etudiant etudiant2 = new Etudiant(12345, "Doe", "John", dateDeNaissance, notes, "POO");
        System.out.println("Constructeur paramétré - etudiant2: " + etudiant2.toString());

        // Test des setters
        try {
            etudiant1.setNumeroEtudiant(67890);
            etudiant1.setNom("Smith");
            etudiant1.setPrenom("Alice");
            CIDate autreDate = new CIDate(1998, 3, 20);
            etudiant1.setDateNaissance(autreDate);
            etudiant1.setNotes(new int[] { 95, 85, -1 });
            etudiant1.setCours("WEB2");
            Etudiant.setPonderations(new int[] { 25, 35, 4 });
            System.out.println("Setters - etudiant1: " + etudiant1.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur lors de la manipulation de l'étudiant : " + e.getMessage());
        }

        // Test de la méthode equals
        System.out.println("Méthode equals :");
        System.out.println("etudiant1 égale à etudiant2 : " + etudiant1.equals(etudiant2));

        // Test du calcul de la note finale
        try {
            System.out.println("Calcul de la note finale :");
            System.out.println("Note finale pour etudiant1 : " + etudiant1.calculerNoteFinale());
        } catch (Exception e) {
            System.out.println("Erreur lors du calcul de la note finale : " + e.getMessage());
        }

        // Test de la vérification des pondérations
        try {
            System.out.println("Vérification des pondérations :");
            System.out.println("Pondérations  pour etudiant1 : " + etudiant1.verifierPonderations());
        } catch (Exception e) {
            System.out.println("Erreur lors de la vérification des pondérations : " + e.getMessage());
        }

        /********************
         * Tests de la classe Compte
         ********************/
        System.out.println("***** TESTS DE LA CLASSE Compte *****");

        // Création du tableau de comptes
        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte();
        comptes[1] = new Compte("Jean", 2024, 12, 04);

        int choix;
        do {
            // Affichage du menu
            String menu = "Menu :\n"
                    + "1. Dépôt\n"
                    + "2. Retrait\n"
                    + "3. Intérêts\n"
                    + "4. Frais\n"
                    + "0. Quitter";

            // Demande à l'utilisateur de faire un choix
            String choixString = JOptionPane.showInputDialog(null, menu + "\n\nChoisissez une option :");
            choix = Integer.parseInt(choixString);

            switch (choix) {
                case 1:
                    effectuerOperation(comptes, 1);
                    break;
                case 2:
                    effectuerOperation(comptes, 2);
                    break;
                case 3:
                    effectuerOperation(comptes, 3);
                    break;
                case 4:
                    effectuerOperation(comptes, 4);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Au revoir !");

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Option invalide. Veuillez réessayer.");
            }

        } while (choix != 0);

        // Création du tableau de factures
        Facture[] factures = new Facture[1];

        // Saisie des informations pour chaque facture
        for (int i = 0; i < factures.length; i++) {
            JOptionPane.showMessageDialog(null, "Saisie des informations pour la facture " + (i + 1) + ":");

            // Déclaration des variables pour la saisie des informations
            String nomClient = JOptionPane.showInputDialog("Nom du client : ");
            String nomItem = JOptionPane.showInputDialog("Nom de l'item : ");
            double prixUnitaireItem = Double.parseDouble(JOptionPane.showInputDialog("Prix unitaire de l'item : "));
            int quantiteItem = Integer.parseInt(JOptionPane.showInputDialog("Quantité de l'item : "));
            int annee = Integer.parseInt(JOptionPane.showInputDialog("Année de la date de la facture : "));
            int mois = Integer.parseInt(JOptionPane.showInputDialog("Mois de la date de la facture : "));
            int jour = Integer.parseInt(JOptionPane.showInputDialog("Jour de la date de la facture : "));

            // Création de la date de la facture
            CIDate dateFacture = new CIDate(annee, mois, jour);

            // Création de l'objet Facture avec les informations saisies
            factures[i] = new Facture(nomClient, nomItem, prixUnitaireItem, quantiteItem, dateFacture);
        }

        // Appel de la méthode pour afficher le total de toutes les factures
        afficherTotalFactures(factures);

    }

    // Méthode pour effectuer une opération (dépôt, retrait, intérêts, frais)
    private static void effectuerOperation(Compte[] comptes, int option) {
        // Demande à l'utilisateur sur quel compte effectuer l'opération
        String numeroCompteString = JOptionPane.showInputDialog(null, "Sur quel compte (1 ou 2) :");
        int numeroCompte = Integer.parseInt(numeroCompteString);

        if (numeroCompte == 1 || numeroCompte == 2) {
            // Sélection du compte correspondant dans le tableau
            Compte compteSelectionne = comptes[numeroCompte - 1];

            switch (option) {
                case 1:
                    // Dépôt
                    String montantDepotString = JOptionPane.showInputDialog(null, "Montant à déposer :");
                    double montantDepot = Double.parseDouble(montantDepotString);
                    boolean depotReussi = compteSelectionne.depot(montantDepot);
                    JOptionPane.showMessageDialog(null, depotReussi ? "Dépôt réussi." : "Échec du dépôt.");
                    break;
                case 2:
                    // Retrait
                    String montantRetraitString = JOptionPane.showInputDialog(null, "Montant à retirer :");
                    double montantRetrait = Double.parseDouble(montantRetraitString);
                    boolean retraitReussi = compteSelectionne.retrait(montantRetrait);
                    JOptionPane.showMessageDialog(null, retraitReussi ? "Retrait réussi." : "Échec du retrait.");
                    break;
                case 3:
                    // Intérêts
                    compteSelectionne.interet();
                    JOptionPane.showMessageDialog(null, "Intérêts appliqués.");
                    break;
                case 4:
                    // Frais
                    compteSelectionne.frais();
                    JOptionPane.showMessageDialog(null, "Frais appliqués.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Option invalide.");
            }

            // Affichage du solde après l'opération
            JOptionPane.showMessageDialog(null,
                    "Solde du compte " + numeroCompte + " : " + compteSelectionne.getSolde() +
                            "\nappartenant a " + compteSelectionne.getNomProprietaire() +
                            "\nDate ouverture : " + compteSelectionne.getDateOuverture());
        } else {
            JOptionPane.showMessageDialog(null, "Numéro de compte invalide.");
        }

        System.out.println("***** FIN DES TESTS DE LA CLASSE Compte *****\n");

        /********************
         * Tests de la classe Facture
         ********************/
        System.out.println("***** TESTS DE LA CLASSE Facture *****");

        // Création du tableau de factures
        Facture[] factures = new Facture[5];

        // Saisie des informations pour chaque facture
        for (int i = 0; i < factures.length; i++) {
            JOptionPane.showMessageDialog(null, "Saisie des informations pour la facture " + (i + 1) + " :");

            try {
                JOptionPane.showMessageDialog(null, "Saisie des informations pour la facture " + (i + 1) + ":");

                // Déclaration des variables pour la saisie des informations
                String nomClient = JOptionPane.showInputDialog("Nom du client : ");
                String nomItem = JOptionPane.showInputDialog("Nom de l'item : ");
                double prixUnitaireItem = Double.parseDouble(JOptionPane.showInputDialog("Prix unitaire de l'item : "));
                int quantiteItem = Integer.parseInt(JOptionPane.showInputDialog("Quantité de l'item : "));
                int annee = Integer.parseInt(JOptionPane.showInputDialog("Année de la date de la facture : "));
                int mois = Integer.parseInt(JOptionPane.showInputDialog("Mois de la date de la facture : "));
                int jour = Integer.parseInt(JOptionPane.showInputDialog("Jour de la date de la facture : "));

                // Création de la date de la facture
                CIDate dateFacture = new CIDate(annee, mois, jour);

                // Création de l'objet Facture avec les informations saisies
                factures[i] = new Facture(nomClient, nomItem, prixUnitaireItem, quantiteItem, dateFacture);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Veuillez entrer un nombre valide.");
                i--; // Rejouer la saisie pour la facture actuelle
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Une erreur s'est produite : " + e.getMessage());
                i--; // Rejouer la saisie pour la facture actuelle
            }
        }

        // Appel de la méthode pour afficher le total de toutes les factures
        afficherTotalFactures(factures);
    }

    private static void afficherTotalFactures(Facture[] factures) {
        double totalSousTotal = 0;
        double totalMontantTPS = 0;
        double totalMontantTVQ = 0;
        double totalGrandTotal = 0;

        StringBuilder recapitulatif = new StringBuilder("Récapitulatif de toutes les factures :\n");
        for (Facture facture : factures) {
            try {
                recapitulatif.append(facture).append("\n");

                double sousTotal = facture.sousTotalSansTaxes();
                double montantTPS = facture.montantTPS();
                double montantTVQ = facture.montantTVQ();
                double grandTotal = facture.totaleAvecTAXES();

                recapitulatif.append("Sous-total : ").append(sousTotal).append("\n");
                recapitulatif.append("Montant de la TPS : ").append(montantTPS).append("\n");
                recapitulatif.append("Montant de la TVQ : ").append(montantTVQ).append("\n");
                recapitulatif.append("Grand total : ").append(grandTotal).append("\n");
                recapitulatif.append("------------------------------\n");

                totalSousTotal += sousTotal;
                totalMontantTPS += montantTPS;
                totalMontantTVQ += montantTVQ;
                totalGrandTotal += grandTotal;
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Une erreur s'est produite : " + e.getMessage());

            }

        }

        recapitulatif.append("Total de toutes les factures :\n");
        recapitulatif.append("Sous-total : ").append(totalSousTotal).append("\n");
        recapitulatif.append("Montant total de la TPS : ").append(totalMontantTPS).append("\n");
        recapitulatif.append("Montant total de la TVQ : ").append(totalMontantTVQ).append("\n");
        recapitulatif.append("Grand total : ").append(totalGrandTotal).append("\n");

        JOptionPane.showMessageDialog(null, recapitulatif.toString());

        System.out.println("***** FIN DES TESTS DE LA CLASSE Facture *****\n");
    }
}
