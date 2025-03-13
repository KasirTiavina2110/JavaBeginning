package pkgTestLaboratoire2;

import pkgLaboratoire2.*; // pour accéder aux classe principales : De, Equation, FlipMonnaie, Temps, ClDate
import javax.swing.*;

import pkgErreur.Labo2Erreur;

public class TestLaboratoire2 {

    public static void main(String[] args) {

        /********************
         * Tests de la classe De
         ********************/
        System.out.println("***** TESTS DE LA CLASSE De *****");
        String[] options = {
                "Lancer un dé",
                "Afficher la valeur des deux dés",
                "Affecter une valeur à un dé",
                "Afficher la somme des 2 dés",
                "Quitter l'application" };

        int choix = 1; // choix du menu principal
        int choixDe; // quand il faut choisir un dé
        int valeurDe; // pour affecter une valeur à un dé
        De unDe = new De();
        De deuxDe = new De(5);

        while (choix != 4) {
            choix = JOptionPane.showOptionDialog(null,
                    "Sélectionnez votre choix parmi les options suivantes:",
                    "Menu principal - Gestion des dés",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            try {
                switch (choix) {
                    case 0: // Lancer un dé
                        choixDe = Integer.parseInt(JOptionPane.showInputDialog("Quel dé voulez-vous lancer? 1 ou 2"));
                        if (choixDe == 1)
                            unDe.lancerDe(); // une valeur random sera donne au De 1
                        else if (choixDe == 2)
                            deuxDe.lancerDe(); // de meme si on ne choisi pas le numero 1
                        else
                            throw new Labo2Erreur("Choix de dé invalide");
                        break;
                    case 1: // Afficher la valeur des deux dés
                        System.out.println("Valeur du dé 1 : " + unDe.getValeur());
                        System.out.println("Valeur du dé 2 : " + deuxDe.getValeur());
                        break;
                    case 2: // Affecter une valeur à un dé
                        choixDe = Integer.parseInt(JOptionPane.showInputDialog("Quel dé voulez-vous affecter? 1 ou 2"));
                        valeurDe = Integer
                                .parseInt(JOptionPane.showInputDialog("Entrez la nouvelle valeur pour le dé : "));
                        if (choixDe == 1)
                            unDe.setValeur(valeurDe); // changement de la valeur du De if 1 = valeurDe
                        else if (choixDe == 2)
                            deuxDe.setValeur(valeurDe); // changement de la valeur du De else 2 = valeurDe
                        else
                            throw new Labo2Erreur("Choix de dé invalide");
                        break;
                    case 3: // Afficher la somme des 2 dés
                        int sommeDes = unDe.getValeur() + deuxDe.getValeur();
                        System.out.println("Somme des deux dés : " + sommeDes);
                        break;
                    case 4: // Quitter l'application
                        System.out.println("Fin de l'application.");
                        break;
                    default:
                        throw new Labo2Erreur("Choix invalide");
                }
            } catch (NumberFormatException e) {
                System.err.println("De Erreur de format : " + e.getMessage());
            } catch (Labo2Erreur e) {
                System.err.println("De Erreur : " + e.getMessage());
            }
        }

        System.out.println("***** FIN DES TESTS DE LA CLASSE De *****\n");

        /**************************
         * Tests de la classe Equation
         **************************/
        System.out.println("***** TESTS DE LA CLASSE Equation *****");

        try {
            // Test avec le constructeur par défaut
            Equation equationParDefaut = new Equation();

            // Test avec le constructeur paramétré
            Equation equationParametre = new Equation(8, 3);

            // Affichage des objets créés
            System.out.println("Équation par défaut : " + equationParDefaut);
            System.out.println("Équation avec paramètres : " + equationParametre);

            // Test des méthodes publiques
            equationParDefaut.genererNombresAleatoires();
            System.out.println("Nouveau nombre pour nbrUn (par défaut) : " + equationParDefaut.getNbrUn());
            System.out.println("Nouveau nombre pour nbrDeux (par défaut) : " + equationParDefaut.getNbrDeux());

            // Test des exceptions lors de la validation des nombres
            // Ces lignes vont lancer des exceptions
            Equation equationErreur = new Equation(11, 0);
            System.out.println("Équation Erreur : " + equationErreur);

            // Test des méthodes publiques
            equationErreur.genererNombresAleatoires();
            System.out.println("Nouveau nombre pour nbrUn (par défaut) : " + equationErreur.getNbrUn());
            System.out.println("Nouveau nombre pour nbrDeux (par défaut) : " + equationErreur.getNbrDeux());

        } catch (Labo2Erreur e) {
            System.out.println("Labo2Erreur lors de la création de l'équation : " + e.getMessage());
        }

        System.out.println("***** FIN DES TESTS DE LA CLASSE Equation *****");

        /*****************************
         * Tests de la classe FlipMonnaie
         *****************************/
        System.out.println("***** TESTS DE LA CLASSE FlipMonnaie *****");

        try {
            // Instanciation d'un objet avec le constructeur par défaut
            FlipMonnaie piece1 = new FlipMonnaie();

            // Affichage des informations initiales
            afficherInformationsPiece(piece1);

            // Lancer la pièce
            piece1.lancer();

            // Affichage des informations après le lancer
            afficherInformationsPiece(piece1);

            // Instanciation d'un autre objet avec le constructeur paramétré
            String userInput = JOptionPane.showInputDialog("Entrez une valeur 0 ou 1 :");
            int userValue;
            try {
                userValue = Integer.parseInt(userInput);
                // Vérifier si la valeur entrée est valide
                if (userValue != 0 && userValue != 1) {
                    throw new Labo2Erreur("La valeur doit être soit 0 (PILE) ou 1 (FACE).");
                }
            } catch (NumberFormatException e) {
                // Si la valeur entrée n'est pas un entier
                throw new Labo2Erreur("Veuillez entrer un entier valide (0 pour PILE, 1 pour FACE).");
            }

            FlipMonnaie piece2 = new FlipMonnaie(userValue);

            // Affichage des informations initiales
            afficherInformationsPiece(piece2);

            // Affichage du résultat du lancer pour gagner()
            afficherResultatGagner(piece2);
        } catch (Labo2Erreur e) {
            System.out.println("Flip Erreur : " + e.getMessage());
        }

        System.out.println("***** FIN DES TESTS DE LA CLASSE FlipMonnaie *****\n");

        /***********************
         * Tests de la classe Temps
         ***********************/
        System.out.println("***** TESTS DE LA CLASSE Temps *****");

        try {
            // Test du constructeur par défaut
            Temps temps1 = new Temps();
            afficherInformationsTemps(temps1);

            // Test du constructeur paramétré
            Temps temps2 = new Temps(15, 45, 30);
            afficherInformationsTemps(temps2);

            // Test avec des valeurs incorrectes
            // Ces lignes vont lancer des exceptions
            Temps tempsIncorrect = new Temps(25, 70, 90);
            afficherInformationsTemps(tempsIncorrect);
        } catch (Labo2Erreur e) {
            System.out.println("Temps Erreur lors de la création du temps : " + e.getMessage());
        }

        System.out.println("***** FIN DES TESTS DE LA CLASSE Temps *****\n");

        /************************
         * Tests de la classe CLDate
         ************************/
        CIDate dateParDefaut = null;
        System.out.println("***** TESTS DE LA CLASSE ClDate *****");
        try {
            // À IMPLÉMENTER // Test avec le constructeur par défaut
            dateParDefaut = new CIDate();

            // Test avec une année bissextile
            CIDate dateBissextile = new CIDate(2024, 10, 21);

            // Test avec une date incorrecte (mois > 12)
            CIDate dateIncorrecte = new CIDate(2022, 13, 10);

            afficherInformationsDate(dateParDefaut, dateBissextile, dateIncorrecte);

            System.out.println("***** FIN DES TESTS DE LA CLASSE CIDate *****");

        } catch (Labo2Erreur e) {
        
            System.out.println("Date Erreur lors de la creation de la date : " + e.getMessage());
        } finally {
            System.out.println(dateParDefaut);
        }
    }
    // fin main()
    // Méthode pour afficher les informations de la pièce

    private static void afficherInformationsPiece(FlipMonnaie piece) {
        System.out.println("Affichage des informations de la pièce :");
        System.out.println(piece.toString());
        JOptionPane.showMessageDialog(null, piece.toString(), "Informations de la pièce",
                JOptionPane.INFORMATION_MESSAGE);
    }

    // Méthode pour afficher le résultat du lancer pour gagner()
    private static void afficherResultatGagner(FlipMonnaie piece) {
        System.out.println("Affichage du résultat du lancer pour gagner() :");
        String message = piece.afficherMessageGagner();
        System.out.println(message);
        JOptionPane.showMessageDialog(null, message, "Résultat du lancer pour gagner()",
                JOptionPane.INFORMATION_MESSAGE);
    }

    // Méthode pour afficher les informations du temps
    private static void afficherInformationsTemps(Temps temps) {
        System.out.println("***** Informations du temps *****");
        System.out.println("Heure universelle : " + temps.afficherHeureUniverselle());
        System.out.println("Heure au format 12H : " + temps.afficherHeure12H());
        System.out.println("********************************\n");
    }

    private static void afficherInformationsDate(CIDate dateParDefaut, CIDate dateBissextile, CIDate dateIncorrecte) {
        System.out.println("***** Informations de la date par defaut  *****");
        System.out.println("Année : " + dateParDefaut.getAnnee());
        System.out.println("Mois : " + dateParDefaut.getMois());
        System.out.println("Jour : " + dateParDefaut.getJour());
        System.out.println("********************************\n");

        System.out.println("***** Informations de la date Bissextile *****");
        System.out.println("Année : " + dateBissextile.getAnnee());
        System.out.println("Mois : " + dateBissextile.getMois());
        System.out.println("Jour : " + dateBissextile.getJour());
        System.out.println("********************************\n");

        System.out.println("***** Informations de la date Incorrecte*****");
        System.out.println("Année : " + dateIncorrecte.getAnnee());
        System.out.println("Mois : " + dateIncorrecte.getMois());
        System.out.println("Jour : " + dateIncorrecte.getJour());
        System.out.println("********************************\n");
    }

}

/*APRES AJOUT TRY CATCH
 * ***** FIN DES TESTS DE LA CLASSE De *****

***** TESTS DE LA CLASSE Equation *****
Équation par défaut : NbrUn : 8, NbrDeux : 4
Équation avec paramètres : NbrUn : 8, NbrDeux : 3
Nouveau nombre pour nbrUn (par défaut) : 6
Nouveau nombre pour nbrDeux (par défaut) : 1
Labo2Erreur lors de la création de l'équation : Le nombre un doit être compris entre 6 et 10.
***** FIN DES TESTS DE LA CLASSE Equation *****
***** TESTS DE LA CLASSE FlipMonnaie *****
Affichage des informations de la pièce :
Côté de la pièce : PILE
Affichage des informations de la pièce :
Côté de la pièce : PILE
Affichage des informations de la pièce :
Côté de la pièce : FACE
Affichage du résultat du lancer pour gagner() :
Meilleure chance la prochaine fois.
***** FIN DES TESTS DE LA CLASSE FlipMonnaie *****

***** TESTS DE LA CLASSE Temps *****
***** Informations du temps *****
Heure universelle : 00:00:00
Heure au format 12H : 12:00:00 AM
********************************

***** Informations du temps *****
Heure universelle : 15:45:30
Heure au format 12H : 03:45:30 PM
********************************

Temps Erreur lors de la création du temps : L'heure doit être comprise entre 0 et 24.
***** FIN DES TESTS DE LA CLASSE Temps *****

***** TESTS DE LA CLASSE ClDate *****
Date Erreur lors de la creation de la date : Le mois doit être compris entre 1 et 12.
CIDate [annee=2024, mois=1, jour=1]
 */


/*
 * COPIER VOS AFFICHAGE CONSOLE ICI
 ***** 
 * TESTS DE LA CLASSE De *****
 * Valeur du dé 1 : 0
 * Valeur du dé 2 : 6
 * Somme des deux dés : 7
 * Valeur du dé 1 : 1
 * Valeur du dé 2 : 6
 * Fin de l'application.
 * 
 * 
 * ***** TESTS DE LA CLASSE Equation *****
 * Équation par défaut : NbrUn : 10, NbrDeux : 4
 * Équation avec paramètres : NbrUn : 8, NbrDeux : 3
 * Nouveau nombre pour nbrUn (par défaut) : 6
 * Nouveau nombre pour nbrDeux (par défaut) : 5
 * Nombre pour nbrUn (paramètre) après validation : 8
 * Nombre pour nbrDeux (paramètre) après validation : 3
 * Factorielle de 5 : 120
 * Résultat de l'équation : 56
 ***** FIN DES TESTS DE LA CLASSE Equation *****
 ***** 
 * 
 ***** TESTS DE LA CLASSE FlipMonnaie *****
 * Affichage des informations de la pièce :
 * Côté de la pièce : PILE
 * Affichage des informations de la pièce :
 * Côté de la pièce : FACE
 * Affichage des informations de la pièce :
 * Côté de la pièce : PILE
 * Affichage du résultat du lancer pour gagner() :
 * Vous êtes gagnant !
 ***** FIN DES TESTS DE LA CLASSE FlipMonnaie *****
 * 
 * ***** TESTS DE LA CLASSE Temps *****
 ***** Informations du temps *****
 * Heure universelle : 00:00:00
 * Heure au format 12H : 12:00:00 AM
 ********************************
 ***** 
 * Informations du temps *****
 * Heure universelle : 15:45:30
 * Heure au format 12H : 03:45:30 PM
 ********************************
 ***** 
 * Informations du temps *****
 * Heure universelle : 18:55:10
 * Heure au format 12H : 06:55:10 PM
 ********************************
 * 
 * 
 * ***** TESTS DE LA CLASSE ClDate *****
 ***** Informations de la date par defaut *****
 * Année : 2024
 * Mois : 1
 * Jour : 1
 ********************************
 ***** 
 * Informations de la date Bissextile *****
 * Année : 2024
 * Mois : 10
 * Jour : 21
 ********************************
 ***** 
 * Informations de la date Incorrecte*****
 * Année : 2022
 * Mois : 12
 * Jour : 10
 ********************************
 * 
 */
