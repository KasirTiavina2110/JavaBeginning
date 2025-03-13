package pkgPoly;

public class BoissonAlcoolisee extends Boisson {
    protected int degreAlcool;

    public BoissonAlcoolisee() {
        super();
        degreAlcool = 1;
    }

    public BoissonAlcoolisee(String n, double p, int d) {
        super(n, p);
        degreAlcool = d;
    }

    public void setDegreAlcool(int degre) {
        degreAlcool = degre;
    }

    public int getDegreAlcool() {
        return degreAlcool;
    }

    public double getPrix() {
        return super.getPrix() * 2;
    }

    public String toString() {
        return super.toString() + " degreAlcool = " + degreAlcool;
    }

}
