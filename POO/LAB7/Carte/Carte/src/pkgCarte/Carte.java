package pkgCarte;

import java.util.Arrays;

public class Carte implements Comparable<Carte>{
      // Variables d'instances de la classe
      private String couleur;
      private int valeur;
      private String face;
  
      // Tableaux de String pour les couleurs et les faces
      public static final String[] COULEURS = {"Pique", "Trèfle", "Carreau", "Cœur"};
      public static final String[] FACES = {"As", "Deux", "Trois", "Quatre", "Cinq", "Six", "Sept", "Huit", "Neuf", "Dix", "Valet", "Dame", "Roi"};
  
      // Constructeur par défaut
      public Carte() {
          this.couleur = COULEURS[0]; // Par défaut, Pique
          this.valeur = 1; // Par défaut, As
          this.face = FACES[0]; // Par défaut, As
      }

      public Carte(String couleur, int valeur){
        // Vérification et assignation de la couleur
        if (Arrays.asList(COULEURS).contains(couleur)) {
            this.couleur = couleur;
        } else {
            this.couleur = COULEURS[0]; // Par défaut, Pique
        }
        // Vérification et assignation de la valeur et de la face
        if (valeur >= 1 && valeur <= 13) {
            this.valeur = valeur;
            this.face = FACES[valeur - 1]; // -1 car les indices commencent à 0
        } else {
            this.valeur = 1; // Par défaut, As
            this.face = FACES[0]; // Par défaut, As
        }
      }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        if (Arrays.asList(COULEURS).contains(couleur)) {
            this.couleur = couleur;
        } else {
            System.out.println("Couleur invalide, aucune modification effectuée.");
        }
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        if (valeur >= 1 && valeur <= 13) {
            this.valeur = valeur;
            this.face = FACES[valeur - 1]; // Mise à jour de la face
        } else {
            System.out.println("Valeur invalide, aucune modification effectuée.");
        }
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

      // equals
      public boolean equals(Carte uneCarte) {
        return this.face.equals(uneCarte.getFace()) &&
                this.couleur.equals(uneCarte.getCouleur());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((couleur == null) ? 0 : couleur.hashCode());
        result = prime * result + valeur;
        result = prime * result + ((face == null) ? 0 : face.hashCode());
        return result;
    }

    @Override
    public int compareTo(Carte autreCarte) {
        // Comparaison basée sur la valeur de la carte
        int resultat = Integer.compare(this.valeur, autreCarte.valeur);
        if (resultat == 0) {
            // Si les valeurs sont égales, comparez les couleurs
            resultat = this.couleur.compareTo(autreCarte.couleur);
        }
        return resultat;
    }

    @Override
    public String toString() {
        return "Carte [couleur=" + couleur + ", valeur=" + valeur + ", face=" + face + "]";
    }
      
}
