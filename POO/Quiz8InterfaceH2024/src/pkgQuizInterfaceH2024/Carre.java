package pkgQuizInterfaceH2024;

public class Carre implements Forme{

    private double cote;

    public Carre() {
        this.cote = 4.0;
    }

    public Carre(double cote) {
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public String toString() {
        return "Carre [cote=" + cote + "]";
    }

    public double getPerimetre(){
        return (cote*4);
    }
    public double getAire(){
        return (cote * cote);
    }
}
