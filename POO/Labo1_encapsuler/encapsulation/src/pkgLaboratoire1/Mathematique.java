package pkgLaboratoire1;

public class Mathematique {
    private double premierNombre;
    private double deuxiemeNombre;

    public Mathematique() {
        this.premierNombre = 0.0;
        this.deuxiemeNombre = 0.0;
    }

    public Mathematique(double premierNombre, double deuxiemeNombre) {
        this.premierNombre = premierNombre;
        this.deuxiemeNombre = deuxiemeNombre;
    }

    public double getPremierNombre() {
        return premierNombre;
    }

    public void setPremierNombre(double premierNombre) {
        this.premierNombre = premierNombre;
    }

    public double getDeuxiemeNombre() {
        return deuxiemeNombre;
    }

    public void setDeuxiemeNombre(double deuxiemeNombre) {
        this.deuxiemeNombre = deuxiemeNombre;
    }

    // Méthode pour retourner la valeur absolue d'un nombre
    public double valeurAbsolue(double nombre) {
        return Math.abs(nombre);
    }

    // Méthode pour retourner la valeur maximale entre les deux nombres (les
    // attributs)
    public double valeurMaximale() {
        return Math.max(premierNombre, deuxiemeNombre);
    }

    // Méthode pour retourner la valeur minimale entre les deux nombres (les
    // attributs)
    public double valeurMinimale() {
        return Math.min(premierNombre, deuxiemeNombre);
    }

    // Méthode pour retourner la valeur du premier attribut à la puissance du
    // deuxième attribut
    public double puissance() {
        return Math.pow(premierNombre, deuxiemeNombre);
    }

    // Méthode pour retourner la racine carrée d'un nombre (quelconque)
    public double racineCarree(double nombre) {
        return Math.sqrt(nombre);
    }

    // Méthode pour retourner la somme des deux nombres (les attributs)
    public double somme() {
        return premierNombre + deuxiemeNombre;
    }

    // Méthode pour retourner la moyenne des deux nombres (les attributs)
    public double moyenne() {
        return (premierNombre + deuxiemeNombre) / 2;
    }

    // Méthode pour retourner la valeur de tous les attributs de la classe
    public String toString() {
        return "Premier Nombre: " + premierNombre + ", Deuxième Nombre: " + deuxiemeNombre;
    }

}
