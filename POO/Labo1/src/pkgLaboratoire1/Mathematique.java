package pkgLaboratoire1;

public class Mathematique {
    // Attributs
    public double nbr1;
    public double nbr2;

    // Constructeur par d�faut
    public Mathematique() {
        nbr1 = nbr2 = 2;
    }

    // Méthode pour retourner la valeur absolue d'un nombre
    public double valeurAbsolue(double nombre) {
        return Math.abs(nombre);
    }

    // Méthode pour retourner la valeur maximale entre les deux nombres (les
    // attributs)
    public double valeurMaximale() {
        return Math.max(nbr1, nbr2);
    }

    // Méthode pour retourner la valeur minimale entre les deux nombres (les
    // attributs)
    public double valeurMinimale() {
        return Math.min(nbr1, nbr2);
    }

    // Méthode pour retourner la valeur du premier attribut à la puissance du
    // deuxième attribut
    public double puissance() {
        return Math.pow(nbr1, nbr2);
    }

    // Méthode pour retourner la racine carrée d'un nombre (quelconque)
    public double racineCarree(double nombre) {
        return Math.sqrt(nombre);
    }

    // Méthode pour retourner la somme des deux nombres (les attributs)
    public double somme() {
        return nbr1 + nbr2;
    }

    // Méthode pour retourner la moyenne des deux nombres (les attributs)
    public double moyenne() {
        return (nbr1 + nbr2) / 2;
    }

    // Méthode pour retourner la valeur de tous les attributs de la classe
    public String toString() {
        return "Premier Nombre: " + nbr1 + ", Deuxième Nombre: " + nbr2;
    }

}
