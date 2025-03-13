package pkgLaboratoire1;

public class AgePersonne {
    // Variables d'instances de la classe
    public String prenom;
    public String nom;
    public int age;

    // Constructeur par défaut
    public AgePersonne() {
        prenom = "";
        nom = "";
        age = 0;
    }

    // Méthode pour retourner l'âge de la personne dans 10 ans
    public int ageDansDixAns() {
        return age + 10;
    }

    // Méthode pour retourner l'année de naissance de la personne
    public int anneeDeNaissance() {
        return java.time.Year.now().getValue() - age;
    }

    // Méthode pour retourner le nom complet de la personne
    public String nomComplet() {
        return prenom + " " + nom;
    }

    // Méthode pour retourner tous les attributs de la classe
    public String tousLesAttributs() {
        return "Prénom: " + prenom + ", Nom: " + nom + ", Âge: " + age;
    }
}
