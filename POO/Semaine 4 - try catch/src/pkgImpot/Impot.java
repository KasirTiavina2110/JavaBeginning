package pkgImpot;


public class Impot {
	
    private String nom;
    private int revenuAnnuel;
    private ClDate laDate;
        
    public Impot ( )
        {
        nom = "nil";
        revenuAnnuel = 100000;
        laDate  = new ClDate();
        }
        
    public Impot ( String n, int revenu, ClDate uneDate)
        {
        nom          = n;
        revenuAnnuel = revenu;
        laDate       = uneDate;
        }
    
    public void setDate(ClDate uneDate)
        {  laDate = uneDate;   }
        
    public ClDate getDate( )
        {   return laDate;     }
}
    