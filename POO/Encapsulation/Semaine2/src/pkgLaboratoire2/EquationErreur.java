package pkgLaboratoire2;

public class EquationErreur extends IllegalArgumentException {
    public EquationErreur() {
        super("Erreur dans les valeurs de l'équation.");
    }

    public EquationErreur(String message) {
        super(message);
    }
}
