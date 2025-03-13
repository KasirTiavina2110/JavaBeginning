package pkgPoly;

public class BoissonEnergisante extends Boisson {
    protected int kCal;

    public BoissonEnergisante() {
        super();
        kCal = 0;
    }

    public BoissonEnergisante(String nom, double prix, int kCalorie) {
        super(nom, prix);
        kCalorie = kCal;
    }

    public int getkCal() {
        return kCal;
    }

    public void setkCal(int kCal) {
        this.kCal = kCal;
    }

    public double getPrix() {
        return (super.getPrix() * 1.5);
    }

    @Override
    public String toString() {
        return super.toString() + "BoissonEnergisante [kCal=" + kCal + "]";
    }

}
