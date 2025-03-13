package pkgTryCatch;

public class GenerateurException {

    private String nom;
    private int age;

    public GenerateurException() {
        this.nom = "Inconnu";
        this.age = 0;
    }

    public GenerateurException(String nom, int age) {
        this.nom = nom;
        if(age >= 0)
            this.age = age;
        else
            throw new AgeIllegalException("L'âge doit être positif");
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // TODO : Modifier la méthode setAge pour qu'elle lance une exception si l'âge est négatif
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "GenerateurException [nom=" + nom + ", age=" + age + "]";
    }

    


}
