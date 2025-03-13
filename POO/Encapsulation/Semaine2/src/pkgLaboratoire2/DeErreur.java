package pkgLaboratoire2;

public class DeErreur extends IllegalArgumentException {
    public DeErreur() {
        super("Valeur erronee.");
    }

    public DeErreur(String message) {
        super(message);
    }
}
