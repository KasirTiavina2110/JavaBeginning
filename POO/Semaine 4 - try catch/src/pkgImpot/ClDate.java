package pkgImpot;


public class ClDate {
    private int jour;
    private int mois;
    private int annee;
      
  public ClDate ( )
      {  jour  = 1;    mois  = 1;   annee = 2001;    }
      
  public ClDate ( int j, int m, int a) 
  {  jour  = j;   mois  = m;    annee = a;       }
      
 /*  private boolean verifie( )  
        {   return false;  }  */       //pour que la date soit erronée.
      
  public String toString()
      {return " jour= " + jour + " mois= " + mois + " annee= " + annee;}
}
  