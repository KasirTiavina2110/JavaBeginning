package src;

import java.util.Random;
import javax.swing.JOptionPane;

public class Jeu_De_Devinettes {
    public static void main(String[] args) {
        final int MIN1 = 1;
        final int MAX1 = 10;
        
        // Créez une instance de Random
        Random random = new Random();
        // Menu
        int iChoixMenu = 0;
        String[] strChoixMenu = { "Prédefini", "Personnalisé",
                "Supérieur", "Meilleur Score", "Terminer" };
                int nombreDeParties = 0;
                int meilleurScorePredefini = Integer.MAX_VALUE;
                int meilleurScorePersonnalise = Integer.MAX_VALUE;
                int meilleurScoreSuperieur = Integer.MAX_VALUE;
                int nombreDeGenerations = 0; 

        do {
            int compteur = 0;
            iChoixMenu = JOptionPane.showOptionDialog(
                null,
                "Choisissez le niveau que vous souhaitez jouer : ",
                "JEU DE DEVINETTES",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                strChoixMenu,
                strChoixMenu[0]);

            switch (iChoixMenu) {
                case 0:
                //Predefini
                int nombreSecret = 1 + random.nextInt(10); // Génère un nombre aléatoire entre 1 et 10.
                    // Génère un nombre aléatoire entre 1 et 10.
                    int reponse1 = 0;
                    reponse1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Le nombre généré est compris entre 1 et 10 inclusivement."));
                    while (reponse1 != nombreSecret) {
                        if (reponse1 < MIN1 || reponse1 > MAX1) {
                            JOptionPane.showMessageDialog(null, "Veuillez entre un nombre entre 1 et 10");
                            reponse1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie à nouveau avec un nombre dans l'intervalle donné : "));
                        } 
                        else if (nombreSecret < reponse1) { 
                            JOptionPane.showMessageDialog(null, "Pas encore");
                            reponse1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie avec un plus petit : "));
                        } else if (nombreSecret > reponse1) {
                            JOptionPane.showMessageDialog(null, "Pas encore");
                            reponse1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie avec un plus grand : "));
                        }
                        compteur++;
                    }
                    if (compteur < meilleurScorePredefini) {
                        meilleurScorePredefini = compteur;
                    }
                    JOptionPane.showMessageDialog(null, "Bravo ! Vous avez deviné le nombre secret : " + nombreSecret + "avec " +compteur+ " essaies");
                    nombreDeGenerations++;
                    break;

                case 1:
                //Personnalise
                int reponsePerso = 0;
                int limInf = Integer.parseInt(JOptionPane.showInputDialog(null, "Choisissez votre limite inferieur")); 
                int limMax = Integer.parseInt(JOptionPane.showInputDialog(null, "Choisissez votre limite superieur."));
                int nombreSecretPersonnalise = limInf + random.nextInt(limMax - limInf + 1);
                int nombreDereponsePersos = 0;
            
                // Vérifiez que les limites sont valides
        
            if (limInf >= limMax) {
            JOptionPane.showMessageDialog(null, "La limite inférieure doit être inférieure à la limite supérieure.");
            System.exit(0);
            }
                while(true){
                    reponsePerso = Integer.parseInt(JOptionPane.showInputDialog("Devinez le nombre entre " + limInf + " et " + limMax + " inclusivement:"));
                    //nombreDereponsePersos++;
                    if (reponsePerso < limInf || reponsePerso > limMax) {
                        JOptionPane.showMessageDialog(null, "Veuillez entrer un nombre entre  " + limInf + " et " + limMax + ".");
                    } else if (reponsePerso < nombreSecretPersonnalise) {
                        JOptionPane.showMessageDialog(null, "Le nombre généré est plus grand : soit entre  " + (reponsePerso + 1) + "  et  " + limMax);
                    }else if (reponsePerso > nombreSecretPersonnalise) {
                        JOptionPane.showMessageDialog(null, "Le nombre généré est plus petit : soit entre  " + limInf + "  et  " + (reponsePerso - 1));
                    } else {
                        JOptionPane.showMessageDialog(null, "Félicitations, vous avez trouvé le nombre généré   " + nombreDereponsePersos + " en reponse.");
                        break; // nombre d'essaie
                    }
                     nombreDereponsePersos++;
                }
                if (nombreDereponsePersos < meilleurScorePersonnalise) {
                    meilleurScorePersonnalise = nombreDereponsePersos;
                }
               JOptionPane.showMessageDialog(null, "Félicitations, vous avez trouvé le nombre généré   " + reponsePerso + " en " +nombreDereponsePersos+ " essaies ");
               nombreDeGenerations++; 
               break; //nombre d'essaie + valeur de ls resultat

                case 2 :
                //Superieur
            final    int LIMMIN = 1;
            final    int LIMMAX1 = 10;
            final    int LIMMAX2 = 20;
            final    int LIMMAX3 = 40;
                 int nbrMystereNiveau1 = 1 + random.nextInt(10); // Génère un nombre aléatoire entre 1 et 10.
                 int nbrlevel1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenue au level 1, Le nombre généré est compris entre 1 et 10 inclusivement à toi de jouer."));
             
                 while(nbrlevel1 != nbrMystereNiveau1){
                 if (nbrlevel1 < LIMMIN || nbrlevel1 > LIMMAX1) {
                            JOptionPane.showMessageDialog(null, "Veuillez entre un nombre entre 1 et 10");
                            nbrlevel1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie à nouveau avec un nombre dans l'intervalle donné : "));
                        } 
                        else if (nbrMystereNiveau1 < nbrlevel1) { 
                            JOptionPane.showMessageDialog(null, "Pas encore");
                            nbrlevel1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie avec un plus petit : "));
                        } else if (nbrMystereNiveau1 > nbrlevel1) {
                            JOptionPane.showMessageDialog(null, "Pas encore");
                            nbrlevel1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie avec un plus grand : "));
                        }
                        compteur++;
                    }
                    JOptionPane.showMessageDialog(null, "Bravo ! Vous avez deviné le nombre secret du level 1 : " + nbrMystereNiveau1 + "avec " +compteur+ " essaies");
                    int nbrMystereNiveau2 = 1 + random.nextInt(20); // Génère un nombre aléatoire entre 1 et 20.
                    int nbrlevel2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenue au level 2, Le nombre généré est compris entre 1 et 20 inclusivement à toi de jouer."));
                    int compteur2 = 0;
                    while(nbrlevel2 != nbrMystereNiveau2){
                 if (nbrlevel2 < LIMMIN || nbrlevel2 > LIMMAX2) {
                            JOptionPane.showMessageDialog(null, "Veuillez entre un nombre entre 1 et 20");
                            nbrlevel2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie à nouveau avec un nombre dans l'intervalle donné : "));
                        } 
                        else if (nbrMystereNiveau2 < nbrlevel2) { 
                            JOptionPane.showMessageDialog(null, "Pas encore");
                            nbrlevel2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie avec un plus petit : "));
                        } else if (nbrMystereNiveau2 > nbrlevel2) {
                            JOptionPane.showMessageDialog(null, "Pas encore");
                            nbrlevel2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie avec un plus grand : "));
                        }
                        compteur2++;
                    }
                    JOptionPane.showMessageDialog(null, "Bravo ! Vous avez deviné le nombre secret du level 3 : " + nbrMystereNiveau2 + "avec " +compteur2+ " essaies");
                    int nbrMystereNiveau3 = 1 + random.nextInt(20); // Génère un nombre aléatoire entre 1 et 20.
                    int nbrlevel3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenue au level 3, Le nombre généré est compris entre 1 et 40 inclusivement à toi de jouer."));
                    int compteur3 = 0;
                    while(nbrlevel3 != nbrMystereNiveau3){
                    if (nbrlevel3 < LIMMIN || nbrlevel3 > LIMMAX3) {
                            JOptionPane.showMessageDialog(null, "Veuillez entre un nombre entre 1 et 40");
                            nbrlevel3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie à nouveau avec un nombre dans l'intervalle donné : "));
                        } 
                        else if (nbrMystereNiveau3 < nbrlevel3) { 
                            JOptionPane.showMessageDialog(null, "Pas encore");
                            nbrlevel3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie avec un plus petit : "));
                        } else if (nbrMystereNiveau3 > nbrlevel3) {
                            JOptionPane.showMessageDialog(null, "Pas encore");
                            nbrlevel3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie avec un plus grand : "));
                        }
                        compteur3++;
                    }
                    
                    if (compteur3 < meilleurScoreSuperieur) {
                        meilleurScoreSuperieur = compteur3;
                    }
                    JOptionPane.showMessageDialog(null, "Bravo ! Vous avez deviné le nombre secret du level 2 : " + nbrMystereNiveau3 + "avec " +compteur3+ " essaies");
                    JOptionPane.showMessageDialog(null, "Bravo ! Vous avez terminé les 3 levels ");
                    break;

                case 3 :
                     // Meilleur Score
                    int bestScore3Niveau = Integer.MAX_VALUE;
                    if (meilleurScorePredefini < meilleurScorePersonnalise) {
                        bestScore3Niveau = meilleurScorePredefini;
                    } else {
                        bestScore3Niveau = meilleurScorePersonnalise;
                    }
                    if (meilleurScoreSuperieur < bestScore3Niveau) {
                        bestScore3Niveau = meilleurScoreSuperieur;
                    }
                     JOptionPane.showMessageDialog(null, "Meilleur Score (Prédefini) : " + meilleurScorePredefini);
                     JOptionPane.showMessageDialog(null, "Meilleur Score (Personnalisé) : " + meilleurScorePersonnalise);
                     JOptionPane.showMessageDialog(null, "Meilleur Score (Supérieur) : " + meilleurScoreSuperieur);
                     JOptionPane.showMessageDialog(null, "Meilleur Score des 3 niveaux : " + bestScore3Niveau);
                     JOptionPane.showMessageDialog(null, "Nombre total de parties jouées : " + nombreDeParties);
                     JOptionPane.showMessageDialog(null, "Nombre de fois qu'un nombre a été généré : " + nombreDeGenerations);
                     break;
                    
                }
                nombreDeParties++;
        } while (iChoixMenu != 4);
    }
}
