package pkgLaboratoire2;

import java.util.Random;

import pkgErreur.Labo2Erreur;

public class De {
    // Attributs
    private final int VALEURMIN;
    private final int VALEURMAX;
    private int valeur;

    // Constructeurs
    public De() {
        this.VALEURMIN = 1;
        this.VALEURMAX = 6;
    }

    public De(int valeurMin, int valeurMax, int valeur) {
        this.VALEURMIN = valeurMin;
        this.VALEURMAX = valeurMax;
        setValeur(valeur);
    }

    public De(int valeur) {
        this.VALEURMIN = 1;
        this.VALEURMAX = 6;
        setValeur(valeur);
    }

    // Méthodes privées
    private boolean validerValeur(int valeur) {
        return valeur >= VALEURMIN && valeur <= VALEURMAX;
    }

    // Méthodes d'accès
    public int getVALEURMIN() {
        return VALEURMIN;
    }

    public int getVALEURMAX() {
        return VALEURMAX;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        if (validerValeur(valeur)) {
            this.valeur = valeur;
        } else {
            throw new Labo2Erreur("La valeur du dé doit être entre 1 et 6.");
        }
    }

    // Méthodes publiques
    public void lancerDe() {
        Random random = new Random();
        valeur = random.nextInt(VALEURMAX - VALEURMIN + 1) + VALEURMIN;
    }

    @Override
    public String toString() {
        return "Valeur du dé : " + valeur;
    }
}
