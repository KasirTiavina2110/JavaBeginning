package pkgPoly;

public class Boisson {
    protected String nom;
    protected double prix;

    public Boisson() {
        nom = "nil";
        prix = 0;
    }

    public Boisson(String n, double p) {
        nom = n;
        prix = p;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public String toString() {
        return "nom = " + nom + " prix = " + prix;
    }

}
