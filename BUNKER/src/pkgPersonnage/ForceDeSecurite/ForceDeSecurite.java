package pkgPersonnage.ForceDeSecurite;
import pkgPersonnage.pkgAbstract.*;
import java.util.GregorianCalendar;


public class ForceDeSecurite extends Personne {
    protected String grade;
    protected String poste;
    protected String arme;
    protected int anneeDeService;

    // Constructeur par défaut
    public ForceDeSecurite() {
        super("", "", "", "", new GregorianCalendar(), false);
        this.grade = "";
        this.poste = "";
        this.arme = "";
        this.anneeDeService = 0;
    }

    // Constructeur avec paramètres
    public ForceDeSecurite(String matricule, String nom, String prenom, String sexe, GregorianCalendar dateDeNaissance,
                        boolean vivant, String grade, String poste, String arme, int anneeDeService) {
        super(matricule, nom, prenom, sexe, dateDeNaissance, vivant);
        this.grade = grade;
        this.poste = poste;
        this.arme = arme;
        this.anneeDeService = anneeDeService;
    }

    // Méthodes getter et setter pour grade
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Méthodes getter et setter pour poste
    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    // Méthodes getter et setter pour arme
    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    // Méthodes getter et setter pour anneeDeService
    public int getAnneeDeService() {
        return anneeDeService;
    }

    public void setAnneeDeService(int anneeDeService) {
        this.anneeDeService = anneeDeService;
    }

    // Méthode equals
    
    public boolean equals(ForceDeSecurite forcedesecurite) {
       return this.grade.equals(forcedesecurite.getGrade());
    }

    // Méthode hashCode
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((grade == null) ? 0 : grade.hashCode());
        result = prime * result + ((poste == null) ? 0 : poste.hashCode());
        result = prime * result + ((arme == null) ? 0 : arme.hashCode());
        result = prime * result + anneeDeService;
        return result;
    }
    

    // Méthode compareTo
    @Override
    public int compareTo(Personne autrePersonne) {
        if (autrePersonne instanceof ForceDeSecurite) {
            ForceDeSecurite autreForce = (ForceDeSecurite) autrePersonne;
            return this.grade.compareTo(autreForce.grade);
        }
        return super.compareTo(autrePersonne);
    }

   
    // Méthode toString
    @Override
    public String toString() {
        return "Force de Sécurité {" +
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
                '}';
    }

    // Méthodes héritées de Personne

    // Méthode pour afficher les détails de force de sécurité
    @Override
    public void afficherDetails() {
        System.out.println("Matricule : " + matricule);
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Sexe : " + sexe);
        System.out.println("Date de naissance : " + dateDeNaissance.getTime());
        System.out.println("Vivant : " + (vivant ? "Oui" : "Non"));
        System.out.println("Grade : " + grade);
        System.out.println("Poste : " + poste);
        System.out.println("Arme : " + arme);
        System.out.println("Année de service : " + anneeDeService);
    }

    // Méthode pour mettre à jour le statut vital de force de sécurité
    @Override
    public void mettreAjourStatutVital(boolean vivant) {
        this.vivant = vivant;
    }
}
