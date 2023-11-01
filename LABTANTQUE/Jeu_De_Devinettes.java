import java.util.Random;
import javax.swing.JOptionPane;

public class Jeu_De_Devinettes {
    public static void main(String[] args) {
        final int min1 = 1;
        final int max1 = 10;
        Random random = new Random();
        int iChoixMenu = 0;
        String[] strChoixMenu = { "Prédefini", "Personnalisé", "Supérieur", "Meilleur Score", "Terminer" };
        int nombreDeParties = 0;
        int meilleurScorePredefini = Integer.MAX_VALUE;
        int meilleurScorePersonnalise = Integer.MAX_VALUE;
        int meilleurScoreSuperieur = Integer.MAX_VALUE;
        int nombreDeGenerations = 0;

        do {
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
                    // Prédefini
                    int nombreSecret = 1 + random.nextInt(10);
                    int reponse1 = 0;
                    reponse1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Le nombre généré est compris entre 1 et 10 inclusivement."));
                    int compteur1 = 0;

                    while (reponse1 != nombreSecret) {
                        if (reponse1 < min1 || reponse1 > max1) {
                            JOptionPane.showMessageDialog(null, "Veuillez entrer un nombre entre 1 et 10");
                            reponse1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie à nouveau avec un nombre dans l'intervalle donné : "));
                        } else if (nombreSecret < reponse1) {
                            JOptionPane.showMessageDialog(null, "Pas encore");
                            reponse1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie avec un plus petit : "));
                        } else if (nombreSecret > reponse1) {
                            JOptionPane.showMessageDialog(null, "Pas encore");
                            reponse1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie avec un plus grand : "));
                        }
                        compteur1++;
                    }

                    if (compteur1 < meilleurScorePredefini) {
                        meilleurScorePredefini = compteur1;
                    }

                    JOptionPane.showMessageDialog(null, "Bravo ! Vous avez deviné le nombre secret : " + nombreSecret + " avec " + compteur1 + " essaies");
                    nombreDeGenerations++;
                    break;

                case 1:
                    // Personnalisé
                    int reponsePerso = 0;
                    int limInf = Integer.parseInt(JOptionPane.showInputDialog(null, "Choisissez votre limite inférieur"));
                    int limMax = Integer.parseInt(JOptionPane.showInputDialog(null, "Choisissez votre limite supérieur."));
                    int nombreSecretPersonnalise = limInf + random.nextInt(limMax - limInf + 1);
                    int nombreDereponsePersos = 0;

                    if (limInf >= limMax) {
                        JOptionPane.showMessageDialog(null, "La limite inférieure doit être inférieure à la limite supérieure.");
                        continue;
                    }

                    while (true) {
                        reponsePerso = Integer.parseInt(JOptionPane.showInputDialog("Devinez le nombre entre " + limInf + " et " + limMax + " inclusivement:"));
                        nombreDereponsePersos++;
                        if (reponsePerso < limInf || reponsePerso > limMax) {
                            JOptionPane.showMessageDialog(null, "Veuillez entrer un nombre entre " + limInf + " et " + limMax + ".");
                        } else if (reponsePerso < nombreSecretPersonnalise) {
                            JOptionPane.showMessageDialog(null, "Le nombre généré est plus grand : soit entre " + (reponsePerso + 1) + " et " + limMax);
                        } else if (reponsePerso > nombreSecretPersonnalise) {
                            JOptionPane.showMessageDialog(null, "Le nombre généré est plus petit : soit entre " + limInf + " et " + (reponsePerso - 1));
                        } else {
                            JOptionPane.showMessageDialog(null, "Félicitations, vous avez trouvé le nombre généré " + nombreDereponsePersos + " en reponsePersos.");
                            break;
                        }
                    }

                    if (nombreDereponsePersos < meilleurScorePersonnalise) {
                        meilleurScorePersonnalise = nombreDereponsePersos;
                    }

                    JOptionPane.showMessageDialog(null, "Félicitations, vous avez trouvé le nombre généré " + reponsePerso + " en " + nombreDereponsePersos + " essaies");
                    nombreDeGenerations++;
                    break;

                case 2:
                    // Supérieur
                    final int LIMMIN = 1;
                    final int LIMMAX1 = 10;
                    final int LIMMAX2 = 20;
                    final int LIMMAX3 = 40;
                    int nbrMystereNiveau1 = 1 + random.nextInt(10);
                    int nbrlevel1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenue au level 1, Le nombre généré est compris entre 1 et 10 inclusivement à toi de jouer."));
                    int compteur1Superieur = 0;

                    while (nbrlevel1 != nbrMystereNiveau1) {
                        if (nbrlevel1 < LIMMIN || nbrlevel1 > LIMMAX1) {
                            JOptionPane.showMessageDialog(null, "Veuillez entrer un nombre entre 1 et 10");
                            nbrlevel1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie à nouveau avec un nombre dans l'intervalle donné : "));
                        } else if (nbrMystereNiveau1 < nbrlevel1) {
                            JOptionPane.showMessageDialog(null, "Pas encore");
                            nbrlevel1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie avec un plus petit : "));
                        } else if (nbrMystereNiveau1 > nbrlevel1) {
                            JOptionPane.showMessageDialog(null, "Pas encore");
                            nbrlevel1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie avec un plus grand : "));
                        }
                        compteur1Superieur++;
                    }

                    if (compteur1Superieur < meilleurScoreSuperieur) {
                        meilleurScoreSuperieur = compteur1Superieur;
                    }

                    JOptionPane.showMessageDialog(null, "Bravo ! Vous avez deviné le nombre secret du level 1 : " + nbrMystereNiveau1 + " avec " + compteur1Superieur + " essaies");

                    int nbrMystereNiveau2 = 1 + random.nextInt(20);
                    int nbrlevel2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenue au level 2, Le nombre généré est compris entre 1 et 20 inclusivement à toi de jouer."));
                    int compteur2Superieur = 0;

                    while (nbrlevel2 != nbrMystereNiveau2) {
                        if (nbrlevel2 < LIMMIN || nbrlevel2 > LIMMAX2) {
                            JOptionPane.showMessageDialog(null, "Veuillez entrer un nombre entre 1 et 20");
                            nbrlevel2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie à nouveau avec un nombre dans l'intervalle donné : "));
                        } else if (nbrMystereNiveau2 < nbrlevel2) {
                            JOptionPane.showMessageDialog(null, "Pas encore");
                            nbrlevel2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie avec un plus petit : "));
                        } else if (nbrMystereNiveau2 > nbrlevel2) {
                            JOptionPane.showMessageDialog(null, "Pas encore");
                            nbrlevel2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie avec un plus grand : "));
                        }
                        compteur2Superieur++;
                    }

                    if (compteur2Superieur < meilleurScoreSuperieur) {
                        meilleurScoreSuperieur = compteur2Superieur;
                    }

                    JOptionPane.showMessageDialog(null, "Bravo ! Vous avez deviné le nombre secret du level 2 : " + nbrMystereNiveau2 + " avec " + compteur2Superieur + " essaies");

                    int nbrMystereNiveau3 = 1 + random.nextInt(40);
                    int nbrlevel3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenue au level 3, Le nombre généré est compris entre 1 et 40 inclusivement à toi de jouer."));
                    int compteur3Superieur = 0;

                    while (nbrlevel3 != nbrMystereNiveau3) {
                        if (nbrlevel3 < LIMMIN || nbrlevel3 > LIMMAX3) {
                            JOptionPane.showMessageDialog(null, "Veuillez entrer un nombre entre 1 et 40");
                            nbrlevel3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie à nouveau avec un nombre dans l'intervalle donné : "));
                        } else if (nbrMystereNiveau3 < nbrlevel3) {
                            JOptionPane.showMessageDialog(null, "Pas encore");
                            nbrlevel3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie avec un plus petit : "));
                        } else if (nbrMystereNiveau3 > nbrlevel3) {
                            JOptionPane.showMessageDialog(null, "Pas encore");
                            nbrlevel3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Essaie avec un plus grand : "));
                        }
                        compteur3Superieur++;
                    }

                    if (compteur3Superieur < meilleurScoreSuperieur) {
                        meilleurScoreSuperieur = compteur3Superieur;
                    }

                    JOptionPane.showMessageDialog(null, "Bravo ! Vous avez deviné le nombre secret du level 3 : " + nbrMystereNiveau3 + " avec " + compteur3Superieur + " essaies");
                    nombreDeGenerations++;
                    break;

                case 3:
                    // Meilleur Score
                    JOptionPane.showMessageDialog(null, "Meilleur Score (Prédefini) : " + meilleurScorePredefini);
                    JOptionPane.showMessageDialog(null, "Meilleur Score (Personnalisé) : " + meilleurScorePersonnalise);
                    JOptionPane.showMessageDialog(null, "Meilleur Score (Supérieur) : " + meilleurScoreSuperieur);
                    JOptionPane.showMessageDialog(null, "Nombre total de parties jouées : " + nombreDeParties);
                    JOptionPane.showMessageDialog(null, "Nombre de fois qu'un nombre a été généré : " + nombreDeGenerations);
                    break;
            }
            nombreDeParties++;
        } while (iChoixMenu != 4);
    }
}

