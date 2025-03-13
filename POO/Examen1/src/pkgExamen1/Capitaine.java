package pkgExamen1;

public class Capitaine {
    //attributs
    private String nom;
    private String position;
    private int numeroJoueur;

    //constructeur
    public Capitaine(){
        this.nom = "indefini";
        this.position = "indefini";
        this.numeroJoueur = 0;
    }

    public Capitaine(String nom, String position , int numeroJoueur){
        this.nom = nom;
        this.position = position;
        this.numeroJoueur = numeroJoueur;
    }


    //getter & setter
    public String getNom() {
        return nom;
    }
    public int getNumeroJoueur() {
        return numeroJoueur;
    }
    public String getPosition() {
        return position;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setNumeroJoueur(int numeroJoueur) {
        if(numeroValide(numeroJoueur)){
            this.numeroJoueur = numeroJoueur;
        }else{
            System.out.println("Le numero saisi n'est pas comprise entre 0 et 99");
        }
        
    }
    public void setPosition(String position) {
        if(position == "attaquant" || position == "defenseur" || position == "gardien"){
            this.position = position;
        }else{
            System.out.println("Votre position est inexistante nous mettrons par defaut indefini a la place");
            this.position = "indefini";
        }
        
    }

  

    //hash && equals && toString
    @Override
    public String toString() {
        return "Capitaine [nom=" + nom + ", position=" + position + ", numeroJoueur=" + numeroJoueur + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + ((position == null) ? 0 : position.hashCode());
        result = prime * result + numeroJoueur;
        return result;
    }

    
    public boolean equals(Capitaine cap) {
        return nom.equals(cap.getNom()) && 
        position.equals(cap.getPosition()) &&
        numeroJoueur == cap.getNumeroJoueur();
    }


    //methode prive de verification
    private boolean numeroValide(int numeroChecker){
        if ((numeroChecker>=0 && numeroChecker<=99)) {
            return true ;
        }else{
           
            return false;
        }
       
    }

    

}
