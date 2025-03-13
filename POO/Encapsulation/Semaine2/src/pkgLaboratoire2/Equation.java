package pkgLaboratoire2;

import java.util.Random;

public class Equation {
    // Attributs
    private int nbrUn;
    private int nbrDeux;

    // Constructeurs
    public Equation() {
        // Par défaut, initialiser avec des valeurs valides aléatoires
        genererNombresAleatoires();
    }

    public Equation(int nombreUn, int nombreDeux) {
        setNbrUn(nombreUn);
        setNbrDeux(nombreDeux);
    }

    // Accesseurs
    public int getNbrUn() {
        return nbrUn;
    }

    public int getNbrDeux() {
        return nbrDeux;
    }

    // Mutateurs avec validation
    public void setNbrUn(int nbrUn) {
        if (nbrUn < 6 || nbrUn > 10) {
            throw new EquationErreur("Le nombre un doit être compris entre 6 et 10.");
        }
        this.nbrUn = nbrUn;
    }

    public void setNbrDeux(int nbrDeux) {
        if (nbrDeux < 1 || nbrDeux > 5) {
            throw new EquationErreur("Le nombre deux doit être compris entre 1 et 5.");
        }
        this.nbrDeux = nbrDeux;
    }

    // Méthodes publiques
    public void genererNombresAleatoires() {
        genererNombreAleatoirePourNbrUn();
        genererNombreAleatoirePourNbrDeux();
    }

    public int calculerFactorielle(int nombre) {
        if (nombre == 0 || nombre == 1) {
            return 1;
        } else {
            return nombre * calculerFactorielle(nombre - 1);
        }
    }

    public int calculerEquation() {
        int factorielleNbrUn = calculerFactorielle(nbrUn);
        int factorielleNbrDeux = (calculerFactorielle(nbrDeux) * calculerFactorielle(nbrUn - nbrDeux));
        return factorielleNbrUn / factorielleNbrDeux;
    }

    @Override
    public String toString() {
        return "NbrUn : " + nbrUn + ", NbrDeux : " + nbrDeux;
    }

    // Méthodes privées pour générer des nombres aléatoires non accessibles par les
    // utilisateurs
    private void genererNombreAleatoirePourNbrUn() {
        Random random = new Random();
        nbrUn = random.nextInt(10 - 6 + 1) + 6;
    }

    private void genererNombreAleatoirePourNbrDeux() {
        Random random = new Random();
        nbrDeux = random.nextInt(5 - 1 + 1) + 1;
    }
}
