package pkgPersonnage.pkgAbstract;
import java.io.Serializable;
import java.util.GregorianCalendar;
import pkgInterface.ActionPersonne;

public abstract class Personne implements Comparable<Personne>, Serializable, ActionPersonne {
    protected String matricule;
    protected String nom;
    protected String prenom;
    protected String sexe;
    protected GregorianCalendar dateDeNaissance;
    protected boolean vivant;

    // Constructeur par défaut
    public Personne() {
        this.matricule = "";
        this.nom = "";
        this.prenom = "";
        this.sexe = "";
        this.dateDeNaissance = new GregorianCalendar();
        this.vivant = false;
    }
    // Constructeur
    public Personne(String matricule, String nom, String prenom, String sexe, GregorianCalendar dateDeNaissance, boolean vivant) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.dateDeNaissance = dateDeNaissance;
        this.vivant = vivant;
    }

      // Méthodes getter et setter pour matricule
      public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    // Méthodes getter et setter pour nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthodes getter et setter pour prenom
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Méthodes getter et setter pour sexe
    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    // Méthodes getter et setter pour dateDeNaissance
    public GregorianCalendar getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(GregorianCalendar dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    // Méthodes getter et setter pour vivant
    public boolean isVivant() {
        return vivant;
    }

    public void setVivant(boolean vivant) {
        this.vivant = vivant;
    }

    // Méthode pour afficher les détails de la personne
    public void afficherDetails() {
        System.out.println("Matricule : " + matricule);
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Sexe : " + sexe);
        System.out.println("Date de naissance : " + dateDeNaissance.getTime());
        System.out.println("Vivant : " + (vivant ? "Oui" : "Non"));
    }

    // Méthode pour mettre à jour le statut vital de la personne
    
    public void mettreAJourStatutVital(boolean vivant) {
        this.vivant = vivant;
    }

    // Implémentation de la méthode compareTo() pour la comparaison par défaut
    @Override
    public int compareTo(Personne autrePersonne) {
        // Comparaison basée sur la date de naissance et le nom par défaut
        int comparaisonDate = this.dateDeNaissance.compareTo(autrePersonne.dateDeNaissance);
        if (comparaisonDate == 0) {
            return this.nom.compareTo(autrePersonne.nom);
        }
        return comparaisonDate;
    }

    
}
