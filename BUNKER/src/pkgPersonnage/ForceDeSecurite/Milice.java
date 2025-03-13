package pkgPersonnage.ForceDeSecurite;
import java.util.GregorianCalendar;

import pkgPersonnage.pkgAbstract.*;

public class Milice extends ForceDeSecurite {
    protected int nombreDePlainte;

    // Constructeur par défaut
    public Milice() {
        super(); // Appel du constructeur par défaut de la classe parente
        this.nombreDePlainte = 0; // Initialisation par défaut
    }

    // Constructeur avec paramètres
    public Milice(String matricule, String nom, String prenom, String sexe, GregorianCalendar dateDeNaissance,
                  boolean vivant, String grade, String poste, String arme, int anneeDeService, int nombreDePlainte) {
        super(matricule, nom, prenom, sexe, dateDeNaissance, vivant, grade, poste, arme, anneeDeService);
        this.nombreDePlainte = nombreDePlainte;
    }

    // Méthode pour comparer deux milices par leur nombre de plaintes
    @Override
    public int compareTo(Personne autrePersonne) {
        if (autrePersonne instanceof Milice) {
            Milice autreMilice = (Milice) autrePersonne;
            return Integer.compare(this.nombreDePlainte, autreMilice.nombreDePlainte);
        }
        return super.compareTo(autrePersonne);
    }

    // Méthode pour afficher les détails de la milice
    @Override
    public String toString() {
        return "Milice :" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", dateDeNaissance=" + dateDeNaissance.getTime() +
                ", vivant=" + vivant +
                ", grade='" + grade + '\'' +
                ", poste='" + poste + '\'' +
                ", arme='" + arme + '\'' +
                ", anneeDeService=" + anneeDeService +
                ", nombreDePlainte=" + nombreDePlainte ;
    }

    // Méthode pour vérifier l'égalité basée sur le matricule et le nombre de plaintes
    
    public boolean equals(Milice milice) {
     return this.nombreDePlainte == (milice.getNombreDePlainte());
    }

    // Méthode pour générer le code de hachage basé sur le matricule et le nombre de plaintes
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + nombreDePlainte;
        return result;
    }

 

    // Getters et setters
    public int getNombreDePlainte() {
        return nombreDePlainte;
    }


    public void setNombreDePlainte(int nombreDePlainte) {
        this.nombreDePlainte = nombreDePlainte;
    }
}