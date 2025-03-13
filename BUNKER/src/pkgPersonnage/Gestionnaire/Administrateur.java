package pkgPersonnage.Gestionnaire;
import java.util.GregorianCalendar;

import pkgPersonnage.pkgAbstract.Personne;


public class Administrateur extends Gestionnaire {
    // Attributs spécifiques à Administrateur
    private String projetAffectation;
    private String titre;

    // Constructeur par défaut
    public Administrateur() {
        super(); // Appel du constructeur par défaut de la classe parente
        this.projetAffectation = "";
        this.titre = "";
    }

    // Constructeur avec paramètres
    public Administrateur(String matricule, String nom, String prenom, String sexe, GregorianCalendar dateDeNaissance,
                        boolean vivant, int nombreEmploye, String secteur, String projetAffectation, String titre) {
        super(matricule, nom, prenom, sexe, dateDeNaissance, vivant, nombreEmploye, secteur);
        this.projetAffectation = projetAffectation;
        this.titre = titre;
    }

    // Getters et Setters
    public String getProjetAffectation() {
        return projetAffectation;
    }

    public void setProjetAffectation(String projetAffectation) {
        this.projetAffectation = projetAffectation;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    // Méthode toString pour afficher les détails de l'administrateur
    @Override
    public String toString() {
        return "Administrateur :" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", nombreEmploye=" + nombreEmploye +
                ", secteur='" + secteur + '\'' +
                ", projetAffectation='" + projetAffectation + '\'' +
                ", titre='" + titre + '\'' ;
    }

    // Méthode equals pour comparer deux administrateurs
    
    public boolean equals(Administrateur administrateur) {
        return this.projetAffectation.equals(administrateur.getProjetAffectation()) && this.titre == administrateur.getTitre();
    }

    // Méthode hashCode pour générer le code de hachage
    @Override
    public int hashCode() {
        int prime = 31;
        int result = super.hashCode();
        result = prime * result + projetAffectation.hashCode();
        result = prime * result + titre.hashCode();
        return result;
    }

    // Les autres méthodes héritées de la classe Gestionnaire peuvent être utilisées telles quelles
    // Méthode compareTo
    @Override
    public int compareTo(Personne autrePersonne) {
        if (autrePersonne instanceof Administrateur) {
            Administrateur autreAdministrateur = (Administrateur) autrePersonne;
            if (!this.secteur.equals(autreAdministrateur.secteur)) {
                return this.secteur.compareTo(autreAdministrateur.secteur);
            }
        }
        return super.compareTo(autrePersonne);
    }


    // Méthodes héritées de Personne

    // Méthode pour afficher les détails de l'administrateur
    @Override
    public void afficherDetails() {
        System.out.println("Matricule : " + matricule);
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Sexe : " + sexe);
        System.out.println("Date de naissance : " + dateDeNaissance.getTime());
        System.out.println("Vivant : " + (vivant ? "Oui" : "Non"));
        System.out.println("Nombre d'employé : " + nombreEmploye);
        System.out.println("Secteur : " + secteur);
        System.out.println("Projet affectation : " + projetAffectation);
        System.out.println("Titre : " + titre);
    }

    // Méthode pour mettre à jour le statut vital de l'administrateur
    @Override
    public void mettreAjourStatutVital(boolean vivant) {
        this.vivant = vivant;
    }
}
