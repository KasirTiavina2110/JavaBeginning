package pkgLaboratoire2;

public class TempsErreur extends IllegalArgumentException {
    public TempsErreur() {
        super("Temps inexact");
    }

    public TempsErreur(String messsage) {
        super(messsage);
    }
}
