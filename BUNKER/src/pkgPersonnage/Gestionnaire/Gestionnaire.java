package pkgPersonnage.Gestionnaire;
import pkgPersonnage.pkgAbstract.*;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Gestionnaire extends Personne {
    protected int nombreEmploye;
    protected String secteur;

    // Constructeur par défaut
    public Gestionnaire() {
        super("", "", "", "", new GregorianCalendar(), false);
        this.nombreEmploye = 0;
        this.secteur = "";
    }

    // Constructeur avec paramètres
    public Gestionnaire(String matricule, String nom, String prenom, String sexe, GregorianCalendar dateDeNaissance,
                        boolean vivant, int nombreEmploye, String secteur) {
        super(matricule, nom, prenom, sexe, dateDeNaissance, vivant);
        this.nombreEmploye = nombreEmploye;
        this.secteur = secteur;
    }

    // Méthodes getter et setter pour nombreEmploye
    public int getNombreEmploye() {
        return nombreEmploye;
    }

    public void setNombreEmploye(int nombreEmploye) {
        this.nombreEmploye = nombreEmploye;
    }

    // Méthodes getter et setter pour secteur
    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    // Méthode equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Gestionnaire that = (Gestionnaire) obj;
        return nombreEmploye == that.nombreEmploye &&
                secteur.equals(that.secteur);
    }

    // Méthode hashCode
    @Override
    public int hashCode() {
        return Objects.hash(nombreEmploye, secteur);
    }

    // Méthode compareTo
    @Override
    public int compareTo(Personne autrePersonne) {
        if (autrePersonne instanceof Gestionnaire) {
            Gestionnaire autreGestionnaire = (Gestionnaire) autrePersonne;
            if (!this.secteur.equals(autreGestionnaire.secteur)) {
                return this.secteur.compareTo(autreGestionnaire.secteur);
            }
        }
        return super.compareTo(autrePersonne);
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Gestionnaire :" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", dateDeNaissance=" + dateDeNaissance.getTime() +
                ", vivant=" + vivant +
                ", nombreEmploye=" + nombreEmploye +
                ", secteur='" + secteur + '\'';
    }

    // Méthodes héritées de Personne

    // Méthode pour afficher les détails de gestionnaire
    @Override
    public void afficherDetails() {
        System.out.println("Matricule : " + matricule);
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Sexe : " + sexe);
        System.out.println("Date de naissance : " + dateDeNaissance.getTime());
        System.out.println("Vivant : " + (vivant ? "Oui" : "Non"));
        System.out.println("Secteur : " + secteur);
    }

    // Méthode pour mettre à jour le statut vital de gestionnaire
    @Override
    public void mettreAjourStatutVital(boolean vivant) {
        this.vivant = vivant;
    }
}
