package pkgErreur;

public class Labo2Erreur extends IllegalArgumentException {
    public Labo2Erreur() {
        super("Erreur de valeur.");
    }

    public Labo2Erreur(String message) {
        super(message);
    }
}
