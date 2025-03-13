package pkgPersonnage.Gestionnaire;

import java.util.Arrays;
import java.util.GregorianCalendar;

import pkgInterface.Tableau;

public class Scientifique extends Gestionnaire implements Tableau {
    protected int nombreDeProjet;
    protected String[] tableauDeProjet;
    private static final int TAILLE_MAX_TABLEAU = 3;

    // Constructeur par défaut
    public Scientifique() {
        super();
        this.nombreDeProjet = 0;
        this.tableauDeProjet = new String[TAILLE_MAX_TABLEAU];
    }

    // Constructeur avec paramètres
    public Scientifique(String matricule, String nom, String prenom, String sexe, GregorianCalendar dateDeNaissance,
                        boolean vivant, String secteur, int nombreEmploye,
                        int nombreDeProjet, String[] tableauDeProjet) {
        super(matricule, nom, prenom, sexe, dateDeNaissance, vivant, nombreEmploye, secteur);
        this.nombreDeProjet = nombreDeProjet;
        this.tableauDeProjet = tableauDeProjet;
    }

    // Méthode héritée pour afficher les détails du scientifique
    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Nombre de projet : " + nombreDeProjet);
        System.out.println("Tableau de projet : ");
        for (String projet : tableauDeProjet) {
            if (projet != null) {
                System.out.println(projet);
            }
        }
    }

    // Méthode héritée pour mettre à jour le statut vital du scientifique
    @Override
    public void mettreAjourStatutVital(boolean vivant) {
        super.mettreAjourStatutVital(vivant);
    }

    // Méthodes de l'interface Tableau

    // Méthode pour vérifier l'état du tableau de projet
    @Override
    public boolean checkEtatTableau() {
        for (String projet : tableauDeProjet) {
            if (projet == null) {
                return false;
            }
        }
        return true;
    }

    // Méthode pour obtenir la taille du tableau de projet
    @Override
    public int sizeTableau() {
        int tailleReelle = 0;
        for (String projet : tableauDeProjet) {
            if (projet != null) {
                tailleReelle++;
            }
        }
        return tailleReelle;
    }

    // Getters et setters
    public int getNombreDeProjet() {
        return nombreDeProjet;
    }

    public void setNombreDeProjet(int nombreDeProjet) {
        this.nombreDeProjet = nombreDeProjet;
    }

    public String[] getTableauDeProjet() {
        return tableauDeProjet;
    }

    public void setTableauDeProjet(String[] tableauDeProjet) {
        this.tableauDeProjet = tableauDeProjet;
    }

    @Override
    public String toString() {
        return "Scientifique :"
        + "nombreDeProjet= " + nombreDeProjet + '\'' +
        ", nombreEmploye=" + nombreEmploye+ '\'' +
        ", tableauDeProjet= " + Arrays.toString(tableauDeProjet) + '\'' +
        ", secteur=" + secteur + '\'' +
        ", matricule=" + matricule + '\'' +
        ", nom= " + nom + '\'' +
        ", prenom=" + prenom + '\'' +
        ", sexe=" + sexe + '\'' +
        ", dateDeNaissance=" + dateDeNaissance.getTime() + '\'' +
        ", vivant=" + vivant ;
    }


    
}
