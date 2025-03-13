package pkgQuizInterfaceH2024;

public class Rectangle implements Forme{

    private double longueur;
    private double largeur;

    public Rectangle() {
        this.longueur = 2.0;
        this.largeur = 1.0;
    }

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
    public double Perimetre(double longueur, double largeur){
        return ((longueur+largeur)*2);
    }
    public double Aire(double longueur, double largeur){
        return ((longueur * largeur));
    }

    @Override
    public String toString() {
        return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
    }
    @Override
    public double getPerimetre(){
        return Perimetre(longueur, largeur);
    }
    @Override
    public double getAire(){
        return Aire(longueur,largeur);
    }
}
