package pkgPersonnage.EmploydeMaintenance;
import pkgPersonnage.pkgAbstract.*;
import java.util.GregorianCalendar;

public class EmployeDeMaintenance extends Personne {
    protected String secteur;

     // Constructeur par défaut
     public EmployeDeMaintenance() {
        super("", "", "", "", new GregorianCalendar(), false);
        this.secteur = "";
    }

    // Constructeur
    public EmployeDeMaintenance(String matricule, String nom, String prenom, String sexe, GregorianCalendar dateDeNaissance,
                              boolean vivant, String secteur) {
        super(matricule, nom, prenom, sexe, dateDeNaissance, vivant);
        this.secteur = secteur;
    }

        // Méthode pour obtenir le secteur
        public String getSecteur() {
            return secteur;
        }
    
        // Méthode pour définir le secteur
        public void setSecteur(String secteur) {
            this.secteur = secteur;
        }

    // Méthode pour comparer deux employés de maintenance
    
    public boolean equals(EmployeDeMaintenance emploie) {
        return this.secteur.equals(emploie.getSecteur());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((secteur == null) ? 0 : secteur.hashCode());
        return result;
    }


    // Méthode pour comparer deux employés de maintenance par leur matricule
    @Override
    public int compareTo(Personne autrePersonne) {
        if (autrePersonne instanceof EmployeDeMaintenance) {
            EmployeDeMaintenance autreEmploye = (EmployeDeMaintenance) autrePersonne;
            return this.matricule.compareTo(autreEmploye.matricule);
        }
        return super.compareTo(autrePersonne);
    }

    // Méthode pour afficher les détails de l'employé de maintenance
    @Override
    public String toString() {
        return "Employe de Maintenance {" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", dateDeNaissance=" + dateDeNaissance.getTime() +
                ", vivant=" + vivant +
                ", secteur='" + secteur + '\'' +
                '}';
    }

    // Méthode héritée pour afficher les détails de l'employé de maintenance
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

    

    @Override
    public void mettreAjourStatutVital(boolean vivant) {
        this.vivant = vivant;
    }
}
