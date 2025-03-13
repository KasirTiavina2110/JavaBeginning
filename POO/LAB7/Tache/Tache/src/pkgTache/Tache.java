package pkgTache;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Tache {
    private String nomTache;
    private GregorianCalendar dateDebut;
    private GregorianCalendar dateFin;
    private int dureeNbreure;
    private double coutTache;
    private String remarques;

    public Tache() {
        nomTache = "indefinie";
        dateDebut = new GregorianCalendar();
        dateFin = new GregorianCalendar();
        dureeNbreure = 0;
        coutTache = 0.0;
        remarques = null;
    }

    public Tache(String nomTache, GregorianCalendar dateDebut, GregorianCalendar dateFin, int dureeNbreure,
            double coutTache, String remarques) {
        this.nomTache = nomTache;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.dureeNbreure = dureeNbreure;
        this.coutTache = coutTache;
        this.remarques = remarques;
    }

    public String getNomTache() {
        return nomTache;
    }

    public void setNomTache(String nomTache) {
        this.nomTache = nomTache;
    }

    public GregorianCalendar getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(GregorianCalendar dateDebut) {
        this.dateDebut = dateDebut;
    }

    public GregorianCalendar getDateFin() {
        return dateFin;
    }

    public void setDateFin(GregorianCalendar dateFin) {
        this.dateFin = dateFin;

    }

    public int getDureeNbreure() {
        return dureeNbreure;
    }

    public void setDureeNbreure(int dureeNbreure) {
        this.dureeNbreure = dureeNbreure;
    }

    public double getCoutTache() {
        return coutTache;
    }

    public void setCoutTache(double coutTache) {
        this.coutTache = coutTache;
    }

    public String getRemarques() {
        return remarques;
    }

    public void setRemarques(String remarques) {
        this.remarques = remarques;
    }

    public boolean equals(Tache obj) {
        return nomTache.equals(obj.getNomTache()) &&
                dateDebut.equals(obj.getDateDebut()) &&
                dateFin.equals(obj.getDateFin()) &&
                dureeNbreure == obj.getDureeNbreure() &&
                coutTache == obj.getCoutTache() &&
                remarques.equals(obj.getRemarques());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomTache == null) ? 0 : nomTache.hashCode());
        result = prime * result + ((dateDebut == null) ? 0 : dateDebut.hashCode());
        result = prime * result + ((dateFin == null) ? 0 : dateFin.hashCode());
        result = prime * result + dureeNbreure;
        long temp;
        temp = Double.doubleToLongBits(coutTache);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((remarques == null) ? 0 : remarques.hashCode());
        return result;
    }

    
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateDebutFormatted = dateFormat.format(dateDebut.getTime());
        String dateFinFormatted = dateFormat.format(dateFin.getTime());
        
        return "Tache [nomTache=" + nomTache + ", dateDebut=" + dateDebutFormatted + ", dateFin=" + dateFinFormatted 
                + ", dureeNbreure=" + dureeNbreure + ", coutTache=" + coutTache + ", remarques=" + remarques + "]";
    }
    

    // Méthode compareTo pour trier par date de début de tâche
    public int compareTo(Object obj) {
        int resultat;
        Tache tache = (Tache) obj;
        resultat = dateDebut.compareTo(tache.dateDebut);
        return resultat;
    }

    /*
     * // Méthode compareTo pour trier par date de début de tâche
     * public int compareTo(Tache tache) {
     * return this.dateDebut.compareTo(tache.getDateDebut());
     * }
     */
    /* Date Debut */
    public int compare(Object obj1, Object obj2) {
        Tache tache1 = (Tache) obj1;
        Tache tache2 = (Tache) obj2;
        return tache1.compareTo(tache2);
    }

}
