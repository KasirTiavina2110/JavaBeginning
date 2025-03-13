package pkgLaboratoire3;

import java.util.Objects;

/**
 * Compte
 */
public class Compte {
    private double solde;
    private final int numeroCompte ;
    private String nomProprietaire;
    private CIDate dateOuverture;

    // Variables de classe
    private static  int compteurNumerosCompte = 0;
    private static double tauxInteretAnnuel = 10;
    private static double fraisMensuels = 0.08;

    // Constructeurs
    public Compte() {
        
            this.numeroCompte = ++compteurNumerosCompte; // Utiliser l'opérateur préfixe ++ pour incrémenter avant utilisation
            try {
            this.dateOuverture = new CIDate(); // Utilisation du constructeur par défaut de CIDate
            this.solde = 0.0;
        } catch (Exception e) {
            System.out.println("Erreur lors de la création du compte : " + e.getMessage());
        } finally {
            System.out.println("Création du compte terminée.");
        }

    }

    /**
     * @param nomProprietaire
     * @param annee
     * @param mois
     * @param jour
     */
    public Compte(String nomProprietaire, int annee, int mois, int jour) {
        this();
        try {
            this.nomProprietaire = nomProprietaire;
            this.dateOuverture = new CIDate(annee, mois, jour);
        } catch (Exception e) {
            System.out.println("Erreur lors de la création du compte parametre: " + e.getMessage());
        } finally {
            System.out.println("Création du compte terminée.");
        }
    }

    // Méthodes d'accès pour les variables d'instance de classe
    public static double getTauxInteretAnnuel() {
        return tauxInteretAnnuel;
    }

    public static void setTauxInteretAnnuel(double taux) {
        tauxInteretAnnuel = taux;
    }

    public static double getFraisMensuels() {
        return fraisMensuels;
    }

    public static void setFraisMensuels(double frais) {
        fraisMensuels = frais;
    }

    // Méthodes d'accès pour les variables d'instance
    public int getNumeroCompte() {
        return numeroCompte;
    }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public double getSolde() {
        return solde;
    }

    public CIDate getDateOuverture() {
        return dateOuverture;
    }
    public static int getCompteurNumerosCompte() {
        return compteurNumerosCompte;
    }

    // Méthode de service - Retrait
    public boolean retrait(double montant) {
        if (montant > 0 && solde - montant >= 0) {
            solde -= montant;
            return true;
        } else {
            return false;
        }
    }

    // Méthode de service - Dépôt
    public boolean depot(double montant) {
        if (montant > 0) {
            solde += montant;
            return true;
        } else {
            return false;
        }
    }

    // Méthode de service - Intérêt mensuel
    public double interet() {
        double interet = solde * (tauxInteretAnnuel / 12 / 100);
       return solde += interet;
    }

    // Méthode de service - Frais mensuels
    public double frais() {
       return solde -= (solde * fraisMensuels);
    }

    // Méthode equals

    public boolean equals(Compte obj) {
        return Double.compare(solde, obj.getSolde()) == 0 &&
                numeroCompte == obj.getNumeroCompte() &&
                nomProprietaire.equals(obj.getNomProprietaire()) &&
                dateOuverture.equals(obj.getDateOuverture());
    }

    // Méthode hashCode
    @Override
    public int hashCode() {
        return Objects.hash(solde, numeroCompte, nomProprietaire, dateOuverture);
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Compte{" +
                "solde=" + solde +
                ", numeroCompte=" + numeroCompte +
                ", nomProprietaire='" + nomProprietaire + '\'' +
                ", dateOuverture=" + dateOuverture +
                '}';
    }

}