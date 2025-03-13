package pkgLaboratoire2;

public class ErreurDate extends IllegalArgumentException {

    public ErreurDate() {
        super("la valeur n'est pas correct");
    }

    public ErreurDate(String message) {
        super(message);

    }

}