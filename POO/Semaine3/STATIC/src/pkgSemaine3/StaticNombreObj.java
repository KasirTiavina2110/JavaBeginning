package pkgSemaine3;

public class StaticNombreObj {
    static  private  int   nombreObj;
		
	static 
	{
		nombreObj  =  0;
	}
	
	public  StaticNombreObj  (   )
	{
	  System.out.print  (  "Création d'un objet "  );
	  nombreObj++;
	  System.out.println  ( "Il y a maintenant "   +   nombreObj   +   "objets"  );
	}
	
     	//  les méthodes de classe s’avèrent pratiques pour permettre à     
      	//  différents objets d’une classe de disposer d’informations collectives
             public  static  int  getNombreObj (  )
             {
               return  nombreObj;
	}

}
