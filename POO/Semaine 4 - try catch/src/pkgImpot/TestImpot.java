package pkgImpot;

/* 
Voici une mini application d’une classe Impot avec une composition sur la date.
Inscrire les instructions manquantes pour que le gestionnaire d’erreurs soit appliqué 
correctement au niveau du constructeur paramétré de la classe ClDate.

Il manque plusieurs méthodes, seules les méthodes principales ont été implémentées.
Fais en sorte que le programme puisse fonctionner correctement avec une date valide 
( indique la date 1-1-2001  suite à une erreur de celle-ci ).

*/


public class TestImpot {

	public static void main(String[] args) {

        Impot unRapport = new Impot();
        
        unRapport.setDate(new ClDate(26,2,2004));
    }	
    

}
