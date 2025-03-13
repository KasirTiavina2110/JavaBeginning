package pkgPersonnage.ForceDeSecurite;

import java.util.Arrays;
import java.util.GregorianCalendar;

import pkgInterface.Tableau;

public class Armee extends ForceDeSecurite implements Tableau {
    protected int nombreDeSortie;
    protected int nombreDeVictime;
    protected static final int TAILLE_TAB_MATRICULE = 5;
    protected String[] tabMatricule = new String[TAILLE_TAB_MATRICULE];

    // Constructeur par défaut
public Armee() {
    super(); // Appel du constructeur par défaut de la classe parente
    this.nombreDeSortie = 0;
    this.nombreDeVictime = 0;
    this.tabMatricule = new String[TAILLE_TAB_MATRICULE]; // Initialisation du tableau de matricules
}

// Constructeur avec paramètres
public Armee(String matricule, String nom, String prenom, String sexe, GregorianCalendar dateDeNaissance,
             boolean vivant, String grade, String poste, String arme, int anneeDeService, int nombreDeSortie,
             int nombreDeVictime, String[] tabMatricule) {
    super(matricule, nom, prenom, sexe, dateDeNaissance, vivant, grade, poste, arme, anneeDeService);
    this.nombreDeSortie = nombreDeSortie;
    this.nombreDeVictime = nombreDeVictime;
    this.tabMatricule = tabMatricule; // Initialisation du tableau de matricules
}


    

    public int getNombreDeSortie() {
        return nombreDeSortie;
    }

    public void setNombreDeSortie(int nombreDeSortie) {
        this.nombreDeSortie = nombreDeSortie;
    }

    public int getNombreDeVictime() {
        return nombreDeVictime;
    }

    public void setNombreDeVictime(int nombreDeVictime) {
        this.nombreDeVictime = nombreDeVictime;
    }

    public String[] getTabMatricule() {
        return tabMatricule;
    }

    public void setTabMatricule(String[] tabMatricule) {
        this.tabMatricule = tabMatricule;
    }

    // Méthode pour comparer le nombre de victimes
    public boolean equals(Armee armee) {
        return this.nombreDeVictime == armee.getNombreDeVictime();
    }


    // Méthode pour générer le code de hachage basé sur le nombre de sorties
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + nombreDeSortie;
        result = prime * result + nombreDeVictime;
        result = prime * result + Arrays.hashCode(tabMatricule);
        return result;
    }
    
    // Méthode pour afficher les détails de l'armée
    @Override
    public String toString() {
        return "Armee :" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", dateDeNaissance=" + dateDeNaissance.getTime() + '\'' +
                ", vivant=" + vivant + '\n' +
                " grade='" + grade + '\'' +
                ", poste='" + poste + '\'' +
                ", arme='" + arme + '\'' +
                ", anneeDeService=" + anneeDeService + '\'' +
                ", nombreDeSortie=" + nombreDeSortie + '\'' +
                ", nombreDeVictime=" + nombreDeVictime + '\'' +
                ", tabMatricule=" + Arrays.toString(tabMatricule) 
                ;
    }


    // Implémentation de la méthode de l'interface Tableau pour vérifier l'état du tableau
    @Override
    public boolean checkEtatTableau() {
        // Vérifie si au moins un élément du tableau est non nul
        for (String matricule : tabMatricule) {
            if (matricule != null) {
                return true;
            }
        }
        return false;
    }
    

    // Implémentation de la méthode de l'interface Tableau pour obtenir la taille du tableau
    @Override
    public int sizeTableau() {
        int tailleReelle = 0;
        for (String matricule : tabMatricule) {
            if (matricule != null) {
                tailleReelle++;
            }
        }
        return tailleReelle;
    }
}
