package pkgRevision;

public class Robot {

    // Attributs
    private String nom;
    private ClDate dateDebut;
    private ClDate dateFin;

    public Robot(){
        nom = "";
        dateDebut = new ClDate();
        dateFin = new ClDate();
    }
    public Robot(String _nom, ClDate _datedebut, ClDate _datefin){
        nom = _nom;
        dateDebut = _datedebut;
        dateFin = _datefin;
    }
    public Robot(Robot robot){
        this.nom = robot.getNom();
        this.dateDebut = new ClDate(robot.getDateDebut().getAnnee(), robot.getDateDebut().getMois(), robot.getDateDebut().getJour());
        this.dateFin = new ClDate(robot.getDateFin().getAnnee(), robot.getDateFin().getMois(), robot.getDateFin().getJour());
    }

    public ClDate getDateDebut() {
        return dateDebut;
    }
    public ClDate getDateFin() {
        return dateFin;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setDateDebut(ClDate dateDebut) {
        this.dateDebut = dateDebut;
    }
    public void setDateFin(ClDate dateFin) {
        this.dateFin = dateFin;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + ((dateDebut == null) ? 0 : dateDebut.hashCode());
        result = prime * result + ((dateFin == null) ? 0 : dateFin.hashCode());
        return result;
    }
    
    public boolean equals(Robot obj) {
        
        return nom.equals(obj.getNom()) && 
        dateDebut.equals(obj.getDateDebut()) &&
        dateFin.equals(obj.getDateFin());
    }
    @Override
    public String toString() {
        return "Robot [nom=" + nom + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + "]";
    }

    public  void verifierAgeMontant(Personne pers){
        if(pers.getAge() >= 18 && pers.getMontantArgent() >= 100){
            System.out.println(this.nom + " souhaite la bienvenue a " + pers.getNom() + ", vous pouvez entrer et  bonne soireee!" );
        }else if(pers.getAge() < 18){
            System.out.println(this.nom + " se voit desole pour  " + pers.getNom() + "vous n'avez pas 18ans");
        }else{
            System.out.println(getNom() + "se voit desoler pour " + pers.getNom() + ", n'avez pas le montant requis");
        }
    }

}
