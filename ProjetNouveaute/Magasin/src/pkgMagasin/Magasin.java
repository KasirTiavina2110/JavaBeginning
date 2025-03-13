package pkgMagasin;

import java.text.DateFormat;
import java.util.GregorianCalendar;

public class Magasin implements Comparable<Magasin> {
    private String nom;
    private int quantite;
    private double prix;
    private GregorianCalendar dateEntree;
    private GregorianCalendar datedePeremption;
   
    // Constructeur par défaut
    public Magasin() {
        this.nom = "";
        this.quantite = 0;
        this.prix = 0.0;
        this.dateEntree = new GregorianCalendar();
        this.datedePeremption = new GregorianCalendar();
        
    }

    // Constructeur avec paramètres
    public Magasin(String nom, int quantite, double prix, GregorianCalendar dateEntree, GregorianCalendar datedePeremption) {
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
        this.dateEntree = dateEntree;
        this.datedePeremption = datedePeremption;
       
    }

    // Méthodes get/set
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public GregorianCalendar getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(GregorianCalendar dateEntree) {
        this.dateEntree = dateEntree;
    }

    public GregorianCalendar getDatedePeremption() {
        return datedePeremption;
    }

    public void setDatedePeremption(GregorianCalendar datedePeremption) {
        this.datedePeremption = datedePeremption;
    }

    

   

    // Méthodes equals et hashCode
    
    public boolean equals(Magasin obj) {
     return nom.equals(obj.getNom()) && quantite == obj.getQuantite() && prix == obj.getPrix() &&
    dateEntree.equals(obj.getDateEntree()) && datedePeremption.equals(obj.getDatedePeremption()) 
   ; 
    
     }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nom.hashCode();
        result = 31 * result + quantite;
        temp = Double.doubleToLongBits(prix);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + dateEntree.hashCode();
        result = 31 * result + datedePeremption.hashCode();
       
        return result;
    }

    // Méthode toString
    @Override
    public String toString() {

        DateFormat uneDate = DateFormat.getDateInstance(DateFormat.MEDIUM);
        return 
                "\nnom='" + nom +
                ",\nquantite=" + quantite +
                ",\nprix=" + prix +
                ",\ndate Entree=" + uneDate.format(dateEntree.getTime())+
                ",\ndate de Peremption=" + uneDate.format(datedePeremption.getTime()) +
                "\n\n" ;
    }
    

    // Méthode de comparaison de dates entre dateEntree et datedePeremption
    public int compareDates() {
        if (dateEntree.after(datedePeremption)) {
            throw new IllegalArgumentException("La date d'entrée ne peut pas être après la date de péremption.");
        } else if (dateEntree.equals(datedePeremption)) {
            System.out.println("Attention : La date de péremption est proche !");
            return 0;
        } else {
            return dateEntree.compareTo(datedePeremption);
        }
    }

    // Méthode de comparaison pour le tri par date d'entrée
    @Override
    public int compareTo(Magasin produitMagasin) {
        return this.dateEntree.compareTo(produitMagasin.dateEntree);
    }
}
