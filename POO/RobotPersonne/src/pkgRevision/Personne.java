package pkgRevision;

public class Personne {

    // Attributs
    private String nom;
    private int age;
    private int montantArgent;

    public  Personne(){
        this.nom = "";
        this.age = 18;
        this.montantArgent = 100;

    }
    public Personne(String nom, int _age, int _montantArgent){
        this.nom = nom;
        this.age = _age;
        this.montantArgent = _montantArgent;
    }

    public Personne(Personne personne){ //constructeur copie
        this.nom = personne.getNom();
        this.age = personne.getAge();
        this.montantArgent = personne.getAge();
    }

    public int getAge() {
        return age;
    }
    public int getMontantArgent() {
        return montantArgent;
    }
    public String getNom() {
        return nom;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setMontantArgent(int montantArgent) {
        this.montantArgent = montantArgent;
    }
    public void setNom(String nom) {
        
        this.nom = nom;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + age;
        result = prime * result + montantArgent;
        return result;
    }
    
    public boolean equals(Personne pers) {
       return nom.equals(pers.getNom()) && age == pers.getAge() && montantArgent == pers.getMontantArgent();
    }
    @Override
    public String toString() {
        return "Personne [nom=" + nom + ", age=" + age + ", montantArgent=" + montantArgent + "]";
    }

        
    
}
