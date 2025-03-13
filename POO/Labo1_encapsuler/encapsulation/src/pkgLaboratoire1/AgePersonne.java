package pkgLaboratoire1;

public class AgePersonne {
    private String prenom;
    private String nom;
    private int age;

    public AgePersonne() {
        this.prenom = "";
        this.nom = "";
        this.age = 0;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // ... Méthodes existantes ...
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
