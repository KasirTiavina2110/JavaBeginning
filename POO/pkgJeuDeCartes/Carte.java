// CLAUVICE MELANIE GUIMFACK
// LABORATOIRE 7
// 2024-04-05

package pkgJeuDeCartes;

public class Carte implements Comparable<Carte> {


    // Attributs

    private String couleurCarte;
    private String faceCarte;
    private int valeur;
    static public final String[] tabCouleurs = {"Pique", "Trefle", "Carreau", "Coeur"};
    static public final String[] tabFaces = {"As", "deux", "trois", "quatre", "cinq", "six", "sep", "huit", "neuf", "dix", "Valet", "Dame", "Roi"};
    
    // Constructeurs

    public Carte() {
        couleurCarte = "Pique";
        faceCarte = "As";
        valeur = 1;
    }

    public Carte(String couleurCarte, int valeur){
        setCouleurCarte(couleurCarte);
        setValeur(valeur);
        this.faceCarte = tabFaces[this.valeur - 1]; // La valeur de face depend de la valeur de carte
    }


    // Accesseurs

    public String getCouleurCarte() {
        return couleurCarte;
    }

    public String getFaceCarte() {
        return faceCarte;
    }

    public int getValeur() {
        return valeur;
    }


    // Mutateurs

    public void setCouleurCarte(String couleurCarte) {
        if (!validerCouleur(couleurCarte)) {
            this.couleurCarte = "Pique";
        } else {
            this.couleurCarte = couleurCarte;
        }
    }

    public void setFaceCarte(String faceCarte) {
       for(int i =0; i<tabFaces.length; i++ ){
        if (faceCarte != tabFaces[i]) {
            this.faceCarte = "As";
        } else {
            this.faceCarte = faceCarte;
        }
       }
    }

    public void setValeur(int valeur) {
        if (valeur < 1 || valeur > 13) {
           this.valeur = 1; // assigner la valeur initiale a 1
        } else {
            this.valeur = valeur;
        }
    }

    // Methode pour valider la couleur des cartes
    private boolean validerCouleur(String couleurCarte) {
        for (String couleur : tabCouleurs) {
            if (couleur.equalsIgnoreCase(couleurCarte)) {
                return true;
            }
        }
        return false;
    }



   // Méthode pour créer un paquet de cartes
    public static Carte[] paquetDeCartes() {
        Carte[] paquet = new Carte[52]; // initialisation du tableau des cartes vide
        int i = 0;

        for (String couleur : tabCouleurs) { // Parcourir les tableaux pour créer toutes les combinaisons de cartes
            for (int valeur = 1; valeur <= 13; valeur++) {
                paquet[i] = new Carte(couleur, valeur);
                i++;
            }
        }
        return paquet;
    }

    // Méthode pour obtenir l'indice de la couleur dans le tableau tabCouleurs
      private int getCouleurIndex(String couleur) {
        for (int i = 0; i < tabCouleurs.length; i++) {
            if (tabCouleurs[i].equalsIgnoreCase(couleur)) {
                return i;
            }
        }
        return -1;
    }


    // Methode compareTo

    public int compareTo(Carte uneCarte) { // Les attributs de comparaison sont : valeur et couleur de la carte
      
        if (this.valeur > uneCarte.getValeur()) {
            return -1;
        }    
        else if(this.valeur < uneCarte.getValeur()){
            return 1;
        }
        else {
            return Integer.compare(getCouleurIndex(this.couleurCarte), getCouleurIndex(uneCarte.getCouleurCarte()));
        }

    }

    // hashcode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((couleurCarte == null) ? 0 : couleurCarte.hashCode());
        result = prime * result + ((faceCarte == null) ? 0 : faceCarte.hashCode());
        result = prime * result + valeur;
        return result;
    }

    // equals
    public boolean equals(Carte uneCarte) {
        return this.faceCarte.equals(uneCarte.getFaceCarte()) &&
                this.couleurCarte.equals(uneCarte.getCouleurCarte());
    }

    // toString
    public String toString() {
        return faceCarte + " de " + couleurCarte ;
    }

}
