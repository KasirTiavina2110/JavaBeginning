package pkgLaboratoire3;

/**
 * Facture
 */
public class Facture {
    private final int numeroFacture;
    private String nomClient;
    private String nomItem;

    private double prixU;
    private int quantiteI;
    private CIDate dateFacture;

    // Variables de classe
    private static int compteurNumerosFacture = 1000;
    private static double TPS = 0.05f;
    private static double TVQ = 0.9975f;

    public Facture() {
        this.numeroFacture = compteurNumerosFacture++;
        try {
            this.dateFacture = new CIDate();
        } catch (Exception e) {
            System.out.println("Erreur lors de la création de la facture : " + e.getMessage());
        }

    }

    public Facture(String nomClient, String nomItem, double prixUnitaireItem, int quantiteItem, CIDate dateFacture) {
        this();

        try {
            this.nomClient = nomClient;
            this.nomItem = nomItem;
            this.prixU = prixUnitaireItem;
            this.quantiteI = quantiteItem;
            this.dateFacture = dateFacture;
        } catch (Exception e) {
            System.out.println("Erreur lors de la création de la facture parametre : " + e.getMessage());
        } finally {
            System.out.println("Création de la facture terminée.");
        }
    }

    // setter, getter
    public static int getcompteurNumerosFacture() {
        return compteurNumerosFacture;
    }

    public CIDate getDateFacture() {
        return dateFacture;
    }

    public String getNomClient() {
        return nomClient;
    }

    public int getNumeroFacture() {
        return numeroFacture;
    }

    public double getPrixU() {
        return prixU;
    }

    public int getQuantiteI() {
        return quantiteI;
    }

    public static double getTPS() {
        return TPS;
    }

    public static double getTVQ() {
        return TVQ;
    }

    public String getNomItem() {
        return nomItem;
    }

    public void setNomItem(String nomItem) {
        this.nomItem = nomItem;
    }

    

    public void setDateFacture(CIDate dateFacture) {
        this.dateFacture = dateFacture;
    }

    public void setNomClient(String nomClient) {
        if (nomClient != null) {
            this.nomClient = nomClient;
        } else {
            System.out.println("ajouter un nom de client valide");
        }

    }

   
    public void setPrixU(double prixU) {
        if (prixU >= 0) {
            this.prixU = prixU;
        } else {
            System.out.println("Inserer un prix positif");
        }

    }

    public void setQuantiteI(int quantiteI) {
        if (quantiteI >= 0) {
            this.quantiteI = quantiteI;
        } else {
            System.out.println("Eviter les quantites negatifs");
        }

    }

    public static void setTPS(double tPS) {
        TPS = tPS;
    }

    public static void setTVQ(double tVQ) {
        TVQ = tVQ;
    }

    // Methode publique
    public double montantTPS() {
        return getPrixU() * getQuantiteI() * TPS;
    }

    public double montantTVQ() {
        return getPrixU() * getQuantiteI() * TVQ;
    }

    public double TotalTaxes() {
        return montantTPS() + montantTVQ();
    }

    public double totaleAvecTAXES() {
        return sousTotalSansTaxes() + TotalTaxes();
    }

    public double sousTotalSansTaxes() {
        return getPrixU() * getQuantiteI();

    }

    /*
     * private int numeroFacture;
     * private String nomClient;
     * private String nomItem;
     * 
     * private double prixU;
     * private int quantiteI;
     * private CIDate dateFacture;
     */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numeroFacture;
        result = prime * result + ((nomClient == null) ? 0 : nomClient.hashCode());
        result = prime * result + ((nomItem == null) ? 0 : nomItem.hashCode());
        long temp;
        temp = Double.doubleToLongBits(prixU);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + quantiteI;
        result = prime * result + ((dateFacture == null) ? 0 : dateFacture.hashCode());
        return result;
    }

    public boolean equals(Facture obj) {
        return numeroFacture == obj.getNumeroFacture() && nomClient.equals(obj.getNomClient()) &&
                nomItem.equals(obj.getNomItem()) && Double.compare(obj.getPrixU(), prixU) == 0
                && quantiteI == obj.getQuantiteI() && dateFacture == obj.getDateFacture();
    }

    @Override
    public String toString() {
        return "Facture [numeroFacture=" + numeroFacture + ", nomClient=" + nomClient + ", nomItem=" + nomItem
                + ", prixU=" + prixU + ", quantiteI=" + quantiteI + ", dateFacture=" + dateFacture + "]";
    }

}
