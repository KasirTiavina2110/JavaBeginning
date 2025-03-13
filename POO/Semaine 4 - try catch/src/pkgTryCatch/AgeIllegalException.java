package pkgTryCatch;

public class AgeIllegalException extends IllegalArgumentException {

    public AgeIllegalException() {
        super("L'âge est invalide. ");
    }

    public AgeIllegalException(String message) {
        super(message);
    }
}
