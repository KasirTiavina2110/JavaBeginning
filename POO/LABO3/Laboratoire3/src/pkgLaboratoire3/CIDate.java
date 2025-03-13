package pkgLaboratoire3;

/**
 * CIDate
 */
public class CIDate {
    private int annee;
    private int mois = 1;
    private int jour = 1;

    public CIDate() {
        setAnnee(2024);
        setMois(1);
        setJour(1);
    }

    public CIDate(int annee, int mois, int jour) {
        try {
            setAnnee(annee);
            setMois(mois);
            setJour(jour);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur lors de la création de la date parametre: " + e.getMessage());
        } finally {
            System.out.println("Création de la date terminée.");
        }
    }

    // Accesseurs (get/lecture), mutateurs (set / écriture)
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
        try {
            if (annee > 0) {
                this.annee = annee;
            } else {
                throw new IllegalArgumentException("Année invalide");
            }
            setMois(this.mois);
            setJour(this.jour);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur lors de la définition de l'année : " + e.getMessage());
        }
    }

    public void setMois(int mois) {
        try {
            if (mois >= 1 && mois <= 12) {
                this.mois = mois;
            } else if (mois > 12) {
                this.mois = 12;
            } else if (mois <= 0) {
                this.mois = 1;
            } else {
                throw new IllegalArgumentException("Mois invalide");
            }
            setJour(this.jour);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur lors de la définition du mois : " + e.getMessage());
        }
    }

    public void setJour(int jour) {
        try {
            switch (mois) {
                // Mois de 31 jours
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (jour >= 1 && jour <= 31) {
                        this.jour = jour;
                    } else if (jour > 31) {
                        this.jour = 31;
                    } else if (jour <= 1) {
                        this.jour = 1;
                    } else {
                        throw new IllegalArgumentException("Jour invalide");
                    }
                    break;
                // Mois de 30 jours
                case 4:
                case 6:
                case 9:
                case 11:
                    if (jour >= 1 && jour <= 30) {
                        this.jour = jour;
                    } else if (jour > 30) {
                        this.jour = 30;
                    } else if (jour <= 1) {
                        this.jour = 1;
                    } else {
                        throw new IllegalArgumentException("Jour invalide");
                    }
                    // Fevrier
                case 2:
                    int jourMax = 28;
                    if (estBissextile()) {
                        System.out.println("L'année est bissextile \n");
                        jourMax = 29;
                        if (jour >= 1 && jour <= jourMax) {
                            this.jour = jour;
                        } else {
                            throw new IllegalArgumentException("Jour invalide");
                        }
                        break;
                    }
                default:
                    this.jour = 1;
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur lors de la définition du jour : " + e.getMessage());
        }
    }

    public String formatDate() {
        return String.format("%04d/%02d/%02d", annee, mois, jour);
    }

    public boolean equals(CIDate date) {
        return annee == date.getAnnee() && mois == date.getMois() && jour == date.getJour();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + annee;
        result = prime * result + mois;
        result = prime * result + jour;
        return result;
    }

    // Méthode toString pour afficher l'état de l'objet
    @Override
    public String toString() {
        return "CIDate { " +
                "jour=" + jour +
                ", mois=" + mois +
                ", annee=" + annee +
                '}';
    }

    // Méthode privée pour vérifier si l'année est bissextile
    private boolean estBissextile() {
        return (annee % 400 == 0) || (annee % 4 == 0 && annee % 100 != 0);
    }

}
