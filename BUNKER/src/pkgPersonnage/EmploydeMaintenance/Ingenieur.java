package pkgPersonnage.EmploydeMaintenance;

import java.util.GregorianCalendar;


public class Ingenieur extends EmployeDeMaintenance {
    protected  String specialites;
    protected GregorianCalendar dateFinDetude;
    protected int niveauEtude;

    // Constructeur par défaut
    public Ingenieur() {
        super("", "", "", "", new GregorianCalendar(), false, "");
        this.specialites = "";
        this.dateFinDetude = new GregorianCalendar();
        this.niveauEtude = 0;
    }

    // Constructeur avec paramètres
    public Ingenieur(String matricule, String nom, String prenom, String sexe, GregorianCalendar dateDeNaissance,
                     boolean vivant, String secteur, String specialites, GregorianCalendar dateFinDetude, int niveauEtude) {
        super(matricule, nom, prenom, sexe, dateDeNaissance, vivant, secteur);
        this.specialites = specialites;
        this.dateFinDetude = dateFinDetude;
        this.niveauEtude = niveauEtude;
    }

    // Getters et setters
    public String getSpecialites() {
        return specialites;
    }

    public void setSpecialites(String specialites) {
        this.specialites = specialites;
    }

    public GregorianCalendar getDateFinDetude() {
        return dateFinDetude;
    }

    public void setDateFinDetude(GregorianCalendar dateFinDetude) {
        this.dateFinDetude = dateFinDetude;
    }

    public int getNiveauEtude() {
        return niveauEtude;
    }

    public void setNiveauEtude(int niveauEtude) {
        this.niveauEtude = niveauEtude;
    }

    // Méthode equals
    public boolean equals(Ingenieur ingenieur) {
            return this.specialites.equals(ingenieur.getSpecialites()) && this.dateFinDetude.equals(ingenieur.getDateFinDetude()) 
            && this.niveauEtude == ingenieur.getNiveauEtude();
    }

    // Méthode hashCode
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + specialites.hashCode();
        result = 31 * result + dateFinDetude.hashCode();
        result = 31 * result + niveauEtude;
        return result;
    }

   

    // Méthode compareTo
    
    @Override
    public String toString() {
        return "Ingenieur :" + "specialites=" + specialites + '\''+ 
        ", secteur=" + secteur + '\''+
        ", dateFinDetude=" + dateFinDetude.getTime() + '\''+
        ", niveauEtude=" + niveauEtude + '\''+
        ", matricule=" + matricule + '\''+
        ", nom=" + nom + '\''+
        ", prenom=" + prenom + '\''+
        ", sexe=" + sexe +  '\''+
        ", dateDeNaissance=" + dateDeNaissance.getTime() + '\''+
        ", vivant=" + vivant ;
    }

    public int compareTo(EmployeDeMaintenance autreEmploye) {
        if (autreEmploye instanceof Ingenieur) {
            Ingenieur autreIngenieur = (Ingenieur) autreEmploye;
            return this.specialites.compareTo(autreIngenieur.specialites);
        }
        return super.compareTo(autreEmploye);
    }


    // Autres méthodes héritées de EmployeDeMaintenance
    // Méthode pour afficher les détails de l'ingénieur
@Override
public void afficherDetails() {
    super.afficherDetails(); // Appel de la méthode de la classe parente
    System.out.println("Spécialités : " + specialites);
    System.out.println("Date de fin d'études : " + dateFinDetude.getTime());
    System.out.println("Niveau d'étude : " + niveauEtude);
}

// Méthode pour mettre à jour le statut vital de l'ingénieur
@Override
public void mettreAjourStatutVital(boolean vivant) {
    super.mettreAjourStatutVital(vivant); // Appel de la méthode de la classe parente
}

}
