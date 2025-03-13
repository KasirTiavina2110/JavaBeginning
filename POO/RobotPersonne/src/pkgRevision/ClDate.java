package pkgRevision;

public class ClDate {
    private int annee;
    private int mois = 1;
    private int jour = 1;

    public ClDate() {
        setAnnee(2024);
        setMois(01);
        setJour(01);
    }

    public ClDate(int annee, int mois, int jour) {
        if (verifierDate(jour, mois, annee)) {
            setAnnee(annee);
            setMois(mois);
            setJour(jour);
        } else {
            throw new IllegalArgumentException("Date invalide");
        }
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
        if (annee <= 1) {
            this.annee = 1;
        } else {
            this.annee = annee; // this juste pour distinguer le nom de param et le nom de l'attribut
        }
        setMois(this.mois);
        setJour(this.jour);
    }

    public void setMois(int mois) {
        if (mois <= 1) {
            this.mois = 1; // same qu'annee
        } else if (mois >= 12) {
            this.mois = 12;
        } else {
            this.mois = mois;
        }
        setJour(this.jour);
    }

    public void setJour(int jour) {
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
                } else if(jour >= 31){
                    this.jour = 31;
                }else if( jour <= 1){
                    this.jour = 1;
                }else{
                    this.jour = jour;
                }
                break;
            // Mois de 30 jours
            case 4:
            case 6:
            case 9:
            case 11:
                if (jour >= 1 && jour <= 30) {
                    this.jour = jour;
                } else if(jour >= 30){
                    this.jour = 30;
                }else if( jour <= 1){
                    this.jour = 1;
                }else{
                    this.jour = jour;
                }
                // Fevrier
            case 2:
                int jourMax = 28;
                if (estBissextile()) {
                    System.out.println("L'annee est bissextile \n");
                    jourMax = 29;
                    if (jour >= 1 && jour <= jourMax) {
                        this.jour = jour;
                    } else {
                        this.jour = 1;
                    }
                    break;

                }
            default:
                this.jour = 1;
                break;
        }
        if (verifierDate(jour, this.mois, this.annee)) {
            this.jour = jour;
        } else {
            throw new IllegalArgumentException("Jour invalide");
        }
    }

    public String formatDate() {
        return String.format("%04d/%02d/%02d", annee, mois, jour);
    }

    // cette methode pour afficher jour, mois , annee
    @Override
    public String toString() {
        return "ClDate { " +
                "jour=" + jour +
                ", mois=" + mois +
                ", annee=" + annee +
                '}';
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

    
    public boolean equals(ClDate pers) {
        return  annee == pers.getAnnee() && mois == pers.getMois() && jour == pers.getJour();
     }

    // private methode pour cette classe , non accessible par tout le monde
    private boolean estBissextile() {
        return (annee % 400 == 0) || (annee % 4 == 0 && annee % 100 != 0);
    }

    private boolean verifierDate(int annee, int mois, int jour) {
        // Logique pour vérifier si la date est valide
        // Vous pouvez implémenter votre propre logique ici
        return true;
    }
}
