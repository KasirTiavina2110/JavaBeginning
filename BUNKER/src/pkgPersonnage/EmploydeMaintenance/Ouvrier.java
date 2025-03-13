package pkgPersonnage.EmploydeMaintenance;
import java.util.GregorianCalendar;
import pkgPersonnage.pkgAbstract.*;
public class Ouvrier extends EmployeDeMaintenance {
    // Attributs spécifiques à Ouvrier
    protected QuartDeTravail quartDeTravail;
    protected String genreDeTravail;
    protected int nombreDeSecteurValide;

    // Enum pour les quarts de travail
    public enum QuartDeTravail {
        MATIN, APRES_MIDI, SOIR
    }

    // Constructeur par défaut
    public Ouvrier() {
        super();
        this.quartDeTravail = null;
        this.genreDeTravail = "";
        this.nombreDeSecteurValide = 0;
    }

    // Constructeur avec paramètres
    public Ouvrier(String matricule, String nom, String prenom, String sexe, GregorianCalendar dateDeNaissance,
                   boolean vivant, String secteur, QuartDeTravail quartDeTravail, String genreDeTravail, int nombreDeSecteurValide) {
        super(matricule, nom, prenom, sexe, dateDeNaissance, vivant, secteur);
        this.quartDeTravail = quartDeTravail;
        this.genreDeTravail = genreDeTravail;
        this.nombreDeSecteurValide = nombreDeSecteurValide;
    }

    // Getters et Setters
    public QuartDeTravail getQuartDeTravail() {
        return quartDeTravail;
    }

    public void setQuartDeTravail(QuartDeTravail quartDeTravail) {
        this.quartDeTravail = quartDeTravail;
    }

    public String getGenreDeTravail() {
        return genreDeTravail;
    }

    public void setGenreDeTravail(String genreDeTravail) {
        this.genreDeTravail = genreDeTravail;
    }

    public int getNombreDeSecteurValide() {
        return nombreDeSecteurValide;
    }

    public void setNombreDeSecteurValide(int nombreDeSecteurValide) {
        this.nombreDeSecteurValide = nombreDeSecteurValide;
    }

    // Méthode toString pour afficher les détails de l'ouvrier
    @Override
    public String toString() {
        return "Ouvrier :" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", dateDeNaissance=" + dateDeNaissance.getTime() +
                ", vivant=" + vivant +
                ", secteur='" + secteur + '\'' +
                ", quartDeTravail=" + quartDeTravail +
                ", genreDeTravail='" + genreDeTravail + '\'' +
                ", nombreDeSecteurValide=" + nombreDeSecteurValide 
                ;
    }

    // Méthode equals pour comparer deux ouvriers
    
    public boolean equals(Ouvrier ouvrier) {
        return this.quartDeTravail.equals(ouvrier.getQuartDeTravail()) && 
        this.genreDeTravail.equals(ouvrier.getGenreDeTravail()) &&
        this.nombreDeSecteurValide == ouvrier.getNombreDeSecteurValide();
    }

    // Méthode hashCode pour générer le code de hachage
    @Override
    public int hashCode() {
        int prime = 31;
        int result = super.hashCode();
        result = prime * result + nombreDeSecteurValide;
        return result;
    }

    // Méthode compareTo pour comparer deux ouvriers par leur matricule
    @Override
    public int compareTo(Personne autrePersonne) {
        if (autrePersonne instanceof Ouvrier) {
            Ouvrier autreOuvrier = (Ouvrier) autrePersonne;
            return this.matricule.compareTo(autreOuvrier.matricule);
        }
        return super.compareTo(autrePersonne);
    }
}

