package pkgLaboratoire1;

public class ChaineDeCaractere {
    // Variable d'instance de la classe
    public String chaine;

    // Constructeur par défaut
    public ChaineDeCaractere() {
        chaine = "KASIR";
    }

    // Méthode pour retourner la longueur de la chaîne de caractères
    public int longueur() {
        return chaine.length();
    }

    // Méthode pour comparer deux chaînes de caractères
    public boolean comparer(String autreChaine) {
        return chaine.equals(autreChaine);
    }

    // Méthode pour concaténer une chaîne donnée à la fin de la chaîne de caractères
    public String concatenation(String autreChaine) {
        return chaine + autreChaine;
    }

    // Méthode pour retourner la position d'un caractère donné dans la chaîne de
    // caractères
    public int positionCaractere(char caractere) {
        return chaine.indexOf(caractere);
    }

    // Méthode pour retourner la sous-chaîne de caractères entre deux positions
    public String sousChaine(int debut, int fin) {
        return chaine.substring(debut, fin);
    }

    // Méthode pour remplacer les caractères 'a' par des 'e'
    public String remplacerAparE() {
        return chaine.replace('a', 'e');
    }

    // Méthode pour convertir en casse zig-zag
    public String casseZigZag() {
        char[] charArray = chaine.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 0) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            } else {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }
        return new String(charArray);
    }

    // Méthode pour retourner tous les attributs de la classe
    public String tousLesAttributs() {
        return "Chaine: " + chaine;
    }
}
