package pkgLaboratoire2;

public class FlipErreur extends IllegalArgumentException {
    public FlipErreur() {
        super("Face inexistant");
    }

    public FlipErreur(String messsage) {
        super(messsage);
    }
}
