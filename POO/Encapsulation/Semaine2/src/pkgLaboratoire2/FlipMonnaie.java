package pkgLaboratoire2;

import java.util.Random;

public class FlipMonnaie {

    // Constantes
    private static final int PILE = 0;
    private static final int FACE = 1;

    // Variable d'instance
    private int cotePiece;

    // Constructeurs
    public FlipMonnaie() {
        lancer();
    }

    public FlipMonnaie(int cotePiece) {
        setCotePiece(cotePiece);
        getCotePiece();
    }

    // Méthodes d'accès
    public int getCotePiece() {
        return cotePiece;
    }

    private void setCotePiece(int cotePiece) {
        if (cotePiece == PILE || cotePiece == FACE) {
            this.cotePiece = cotePiece;
        } else {
            throw new FlipErreur("La valeur de cotePiece doit être soit 0 (PILE) ou 1 (FACE).");
        }
    }

    // Opérations - Services ou méthodes publiques

    // Méthode pour lancer la pièce de monnaie
    public void lancer() {
        Random random = new Random();
        cotePiece = random.nextInt(2); // Génère un nombre aléatoire entre 0 et 1
    }

    // Méthode pour savoir si la pièce de monnaie s'est retrouvée du côté PILE
    public boolean gagner() {
        return cotePiece == PILE;
    }

    // Méthode pour afficher le terme "PILE" ou "FACE" selon le résultat du lancer
    public String afficherTerme() {
        return (cotePiece == PILE) ? "La pièce s’est retournée du côté PILE" : "La pièce s’est retournée du côté FACE";
    }

    // Méthode toString pour afficher tous les attributs
    @Override
    public String toString() {
        return "Côté de la pièce : " + (cotePiece == PILE ? "PILE" : "FACE");
    }

    // Méthode pour afficher le message en fonction du résultat du lancer
    public String afficherMessageLancer() {
        return (cotePiece == PILE) ? "Le hasard a fait que la pièce est tombée du côté PILE"
                : "Le hasard a fait que la pièce est tombée du côté FACE";
    }

    // Méthode pour afficher le message en fonction du résultat du lancer pour
    // gagner()
    public String afficherMessageGagner() {
        return (cotePiece == PILE) ? "Vous êtes gagnant !" : "Meilleure chance la prochaine fois.";
    }
}
