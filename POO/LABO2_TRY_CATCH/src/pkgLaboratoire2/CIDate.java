package pkgLaboratoire2;

import pkgErreur.Labo2Erreur;

public class CIDate {
    private int annee;
    private int mois;
    private int jour;

    // constructeurs
    public CIDate() {
        setAnnee(2024);
        setMois(1);
        setJour(1);
    }

    public CIDate(int annee, int mois, int jour) {
        setAnnee(annee);
        setMois(mois);
        setJour(jour);
    }

    // Accesseurs (get/lecture) , mutateur (set / ecriture)
    public int getAnnee() {
        return annee;
    }

    public int getMois() {
        return mois;
    }

    public int getJour() {
        return jour;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setMois(int mois) {
        if (mois < 1 || mois > 12) {
            throw new Labo2Erreur("Le mois doit être compris entre 1 et 12.");
        }
        this.mois = mois;
    }

    public void setJour(int jour) {
        switch (mois) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (jour < 1 || jour > 31) {
                    throw new Labo2Erreur("Le jour doit être compris entre 1 et 31.");
                }
                break;

            // Mois de 30 jours
            case 4:
            case 6:
            case 9:
            case 11:
                if (jour < 1 || jour > 30) {
                    throw new Labo2Erreur("Le jour doit être compris entre 1 et 30.");
                }
                break;
            case 2:
                int jourMax = estBissextile() ? 29 : 28;
                if (jour < 1 || jour > jourMax) {
                    throw new Labo2Erreur(
                            "Le jour doit être compris entre 1 et " + jourMax + " pour le mois de février.");
                }
                break;
            default:
                throw new Labo2Erreur("Mois invalide.");
        }
        this.jour = jour;
    }

    private boolean estBissextile() {
        return (annee % 400 == 0) || (annee % 4 == 0 && annee % 100 != 0);
    }

    @Override
    public String toString() {
        return "CIDate [annee=" + annee + ", mois=" + mois + ", jour=" + jour + "]";
    }

}
