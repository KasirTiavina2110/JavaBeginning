package pkgExamen1;

public class Equipe {
  //attributs
    private  String nom;
  private int nombreChampionnats;
  private Capitaine capitaineInfo;
    private int annee;
    private  static  String TROPHEE_DU_CHAMPIONNAT = "CHAMPIONS";
    private int nombreEquipe ;


    private static int compteurEquipe =+ 1;


  public Equipe(){
    this.nom = "indefini";
    this.nombreChampionnats = 0; 
    this.capitaineInfo = new Capitaine();
    this.annee = 2024;
    getTropheeDuChampionnat();
    this.nombreEquipe = compteurEquipe;

}

  public Equipe(String nom, int nombreChampionnats, Capitaine capitaineInfo,String TROPHEE_DU_CHAMPIONNAT, int annee, int nombreEquipe){
    this();
    this.nom = nom;
    this.nombreChampionnats = nombreChampionnats;
    this.capitaineInfo = capitaineInfo;
    Equipe.TROPHEE_DU_CHAMPIONNAT = getTropheeDuChampionnat();
    this.annee = annee;
   this.nombreEquipe = nombreEquipe;
}


//getter && setter
public String getNom() {
    return nom;
}
public int getNombreChampionnats() {
    return nombreChampionnats;
}
public void setNom(String nom) {
    this.nom = nom;
}

public Capitaine getCapitaineInfo() {
    return capitaineInfo;
}

public int getAnnee() {
    return annee;
}

public static String getTropheeDuChampionnat() {
    return TROPHEE_DU_CHAMPIONNAT;
}

public int getNombreEquipe() {
    return compteurEquipe; //utilisation du compteur pour incrementer automatiquement de 1 le nombre d'equipe
}

public static int getCompteurEquipe() {
    return compteurEquipe;
}



public void setNombreChampionnats(int nombreChampionnats) {
    if(nombreChampValide(nombreChampionnats)){
        nombreChampionnats = 0;
    }else{
        this.nombreChampionnats = nombreChampionnats;
    }
    
}
public void setCapitaine(Capitaine capitaineInfo) {
    this.capitaineInfo = capitaineInfo;
}
public void setAnnee(int annee) {
    this.annee = annee;
}
public static void setTROPHEE_DU_CHAMPIONNAT(String tROPHEE_DU_CHAMPIONNAT) {
    TROPHEE_DU_CHAMPIONNAT = tROPHEE_DU_CHAMPIONNAT;
}
public void setNombreEquipe(int nombreEquipe) {
    if(nombreEquipe >= 1){
        this.nombreEquipe = nombreEquipe;
    }else{
        System.out.println("Nombre d'equipe non valable");
    }
    
}
public static void setCompteurEquipe(int compteurEquipe) {
    Equipe.compteurEquipe = compteurEquipe;
}

//Methode  prive de verification
private boolean nombreChampValide(int nbrChamp){
        return  nbrChamp < 0;   // si le nombre de championnat est inferieur a 0 retourne moi true 
}

public int ajoutChamps(int nbrChamps){
    return nbrChamps + 1 ;
}

//toString && hash && equals
@Override
public String toString() {
    return "Equipe [nom=" + nom + ", nombreChampionnats=" + nombreChampionnats + ", capitaineInfo=" + capitaineInfo
            + ", annee=" + annee + ", nombreEquipe=" + nombreEquipe + "]";
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nom == null) ? 0 : nom.hashCode());
    result = prime * result + nombreChampionnats;
    result = prime * result + ((capitaineInfo == null) ? 0 : capitaineInfo.hashCode());
    result = prime * result + annee;
    result = prime * result + nombreEquipe;
    return result;
}


public boolean equals(Equipe obj) {
    
    return nom.equals(obj.getNom()) &&
    nombreChampionnats ==  obj.getNombreChampionnats() &&
    capitaineInfo == obj.getCapitaineInfo() &&
    annee == obj.getAnnee() &&
    nombreEquipe == obj.getNombreEquipe();   
}




}
