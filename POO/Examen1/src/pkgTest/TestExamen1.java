package pkgTest;


import pkgExamen1.*;

/**
 * TestExamen1
 */
public class TestExamen1 {

    public static void main(String[] args) {
        // 1- CrÃ©ez un nouvel objet du nom "jeanBeliveau" (type Capitaine).
        //	  nom : Jean BÃ©liveau, position : attaquant, numero : 4
        Capitaine cap1 = new Capitaine("Jean Beliveau" , "attaquant", 4);
        System.out.println("Voici :  " + cap1.toString());

        System.out.println("1------------------------------------------------------------------------");

        // 2- CrÃ©ez un nouvel objet du nom "canadiensMontreal" (type Equipe) en te servant du constructeur par dÃ©faut.
        Equipe equ1 = new Equipe();
        equ1.setNom("canadiensMontreal");
        equ1.setNombreChampionnats(1);
        equ1.getAnnee();
        Equipe.getTropheeDuChampionnat();
        equ1.getNombreEquipe();

        System.out.println("Voici : " +equ1.toString());
        System.out.println("2------------------------------------------------------------------------");

        // 3- Affectez jeanBeliveau Ã  canadiensMontreal.
        System.out.println("3------------------------------------------------------------------------");
        
       
    
        equ1.setNom("canadiensMontreal");
        equ1.setNombreChampionnats(1);
        Capitaine capSet = new Capitaine(cap1.getNom(), cap1.getPosition(), cap1.getNumeroJoueur());
        equ1.getAnnee();
        Equipe.getTropheeDuChampionnat();
        equ1.getNombreEquipe();
        Equipe equ2 = new Equipe(equ1.getNom(), equ1.getNombreChampionnats(), capSet, Equipe.getTropheeDuChampionnat(), equ1.getAnnee(), equ1.getNombreEquipe());
        
        System.out.println("Voici : " + equ2.toString());
        // 4- Utiliser les mÃ©thodes appropriÃ©es pour assigner les valeurs suivantes Ã  l'objet canadiensMontreal :
        //    nom : Canadiens de MontrÃ©al, nombreChampionnats : 24, anneeFondation : 1909   
        
        Equipe equ3 = new Equipe();
        equ3.setNom("canadiens de Montreal");
        equ3.setNombreChampionnats(24);
        equ3.setAnnee(1909);
        equ3.getNombreEquipe();
       

        System.out.println("4------------------------------------------------------------------------");

        // 5-	Affichez le contenu de l'objet de type Equipe : canadiens.

        System.out.println("Voici l'equipe canadien : " +equ3 + "\n");
        System.out.println("Voici l'equipe canadien : " +equ2);
        System.out.println("5------------------------------------------------------------------------");

        // 6- Ã€ l'aide d'une seule instruction, crÃ©ez un objet Equipe, du nom de "penguinsPittsburgh", 
        //    avec les informations suivantes : 
        //		nom d'Ã©quipe : Penguins de Pittsburgh, nombreChampionnats : 5, anneeFondation : 1967, 
        //		nouveau capitaine avec les caractÃ©ristiques suivantes :
        //			nom du capitaine : Mario Lemieux, position : attaquant, numero : 66

        Capitaine mario = new Capitaine("Mario Lemineux", "attaquant", 66);
        Capitaine capSet2 = new Capitaine(mario.getNom(), mario.getPosition(), mario.getNumeroJoueur());
        Equipe pittsburgh = new Equipe("Penguins de Pittsburgh", 5, capSet2,Equipe.getTropheeDuChampionnat(), 1967, 2);
        
        System.out.println("6------------------------------------------------------------------------");

        // 7- Affichez les informations de l'Ã©quipe penguinsPittsburgh
        System.out.println("Voici :" +pittsburgh + "\n") ;
        System.out.println("7------------------------------------------------------------------------");

        // 8- CrÃ©er un autre objet Capitaine qui s'appelle "wayneGretzky". Ses caractÃ©ristiques sont :
        //				nom : Wayne Gretzky, position : attaquant, numero : 99

        Capitaine wayneGretzky = new Capitaine("wayne Gretzky", "attaquant", 99);
        System.out.println("8------------------------------------------------------------------------");

        // 9- En une seule instruction, crÃ©er un troisiÃ¨me objet Equipe du nom de "oilersEdmonton". Il aura comme attributs :
        //	  nom : Oilers d'Edmonton, nombreChampionnats : 5, anneeFondation : 1971, le capitaine sera crÃ©Ã© en utilisant 
        //    le constructeur par dÃ©faut.
        Capitaine parDefaut = new Capitaine();
        Equipe oilersEdmonton = new Equipe("Oilers d'Edmonton", 5, parDefaut ,Equipe.getTropheeDuChampionnat(),1971,1);
        System.out.println("9------------------------------------------------------------------------");

        // 10- Affichez seulement le nombre de championnats de l'objet oilersEdmonton de la classe Equipe
        System.out.println("Voici nombres de championnats: " +oilersEdmonton.getNombreChampionnats()+ "\n");
        System.out.println("10------------------------------------------------------------------------");

        // 11- On vient de remporter un championnat chez les Canadiens de MontrÃ©al!
        //	   Ajouter un championnat Ã  l'objet canadiensMontreal en utilisant la mÃ©thode appropriÃ©e et afficher le nombre de championnats.
       
       int totalTrophy = equ1.ajoutChamps(equ1.getNombreChampionnats());

       System.out.println("nombres de champs Canadien de Montreal sont:" +totalTrophy);
       
        System.out.println("11------------------------------------------------------------------------");

        // 12- Changez le capitaine de l'objet penguinsPittsburgh. Son capitaine sera maintenant wayneGretzky.
        pittsburgh.setCapitaine(wayneGretzky);
        System.out.println("Nouveau capitaine :" +pittsburgh.getCapitaineInfo());
        System.out.println("12------------------------------------------------------------------------");

        // 13- Affichez seulement le nom du capitaine de l'objet canadiensMontreal. 
        //     Vous devez l'invoquer en vous servant de cet objet (canadiensMontreal).

        System.out.println("Le nom du capitaine de Montreal : " +cap1.getNom()+ "\n"); 
        System.out.println("Le nom du capitaine de Montreal : " + equ1.getCapitaineInfo().getNom());
        System.out.println("13------------------------------------------------------------------------");

        // 14-	Instanciez Ã  l'aide du constructeur paramÃ©trÃ© un nouvel objet Equipe nommÃ© "rangersNewYork" ayant les propriÃ©tÃ©s suivantes :
        //				nom : Rangers de New York, nombreChampionnats : 4, anneeFondation : 1926, capitaine : nouveau Capitaine par dÃ©faut.
        //				Affichez l'objet rangersNewYork
        
        Equipe rangersNewYork = new Equipe("Rangers de New York", 4, parDefaut, Equipe.getTropheeDuChampionnat(), 1926, 1);
        System.out.println("Voici Rangers de New York :" +rangersNewYork.toString());
        System.out.println("14------------------------------------------------------------------------");

        // 15- Assignez -2 comme nombre de championnats Ã  rangersNewYork.
        //	   Affichez l'objet rangersNewYork

        rangersNewYork.setNombreChampionnats(-2);
        System.out.println("Voici Rangers de New York :" +rangersNewYork.toString());
        System.out.println("15------------------------------------------------------------------------");

        // 16- CrÃ©ez un nouvel objet du nom de "markMessier" de type Capitaine (avec le constructeur par dÃ©faut).
        //	   Assignez-lui les attributs suivants :
        //			nom : Mark Messier, position : centre, numero : 11
        //	   Affichez ces informations.
        Capitaine markMessier = new Capitaine("Mark Messier", "centre", 11);
        System.out.println("Capitaine : "+markMessier.toString());
        System.out.println("16------------------------------------------------------------------------");

        // 17- Ajouter un championnat Ã  l'objet oilersEdmonton en utilisant la mÃ©thode appropriÃ©e.
        //	   Affichez seulement leur annÃ©e de fondation et leur nombre de championnats en complÃ©tant la sortie suivante

        int totalTrophy2 = oilersEdmonton.ajoutChamps(oilersEdmonton.getNombreChampionnats());
        System.out.println("Annee de fondation" +oilersEdmonton.getAnnee()+ "\n Nombre de championnat" +totalTrophy2);
        System.out.println("17------------------------------------------------------------------------");

        // 18- Modifier la position de jeanBeliveau pour la valeur "dÃ©fenseur".
        //	   Afficher seulement sa position
        cap1.setPosition("defenseur");
        System.out.println("Nouveau position de Jean :" +cap1.getPosition());
        System.out.println("18------------------------------------------------------------------------");
                    
        // 19- Changez le numÃ©ro de markMessier pour la valeur 100. Affichez seulement le numÃ©ro de markMessier 
        markMessier.setNumeroJoueur(100);
        System.out.println(+markMessier.getNumeroJoueur());
        System.out.println("19------------------------------------------------------------------------");

        // 20- Creez 2 objets Equipe en utilisant le constructeur par dÃ©faut qui seront appelÃ©s senateursOttawa et bruinsBoston.

        Equipe senateursOttawa = new Equipe();
        Equipe bruinsBoston = new Equipe();
        System.out.println("20------------------------------------------------------------------------");

        // 21- Inscrivez la commande qui vÃ©rifie si les 2 objets, senateursOttawa et bruinsBoston sont Ã©gaux.
        System.out.println("senateurOttawa égale à bruinsBoston : " + senateursOttawa.equals(bruinsBoston)+ "\n");
        System.out.println("21------------------------------------------------------------------------");

        // 22- CrÃ©ez 2 objets Capitaine en utilisant le constructeur par dÃ©faut qui seront appelÃ©s raymondBourque et martinBrodeur.
        //	   Inscrivez la commande qui vÃ©rifie si les 2 objets, raymondBourque et martinBrodeur sont Ã©gaux.
        Capitaine raymondBourque = new Capitaine();
        Capitaine martinBrodeur = new Capitaine();
        System.out.println(" égale raymondBourque à martinBrodeur : " + raymondBourque.equals(martinBrodeur)+ "\n");
        System.out.println("22------------------------------------------------------------------------");

        // 23- Inscrivez la commande qui permet d'afficher le nom du capitaine de l'objet canadiensMontreal.
        //	   Vous devez obligatoirement utiliser l'objet canadiensMontreal.
        System.out.println("Le nom du capitaine de Montreal : " + equ1.getCapitaineInfo());
        System.out.println("23------------------------------------------------------------------------");

        // 24- Affectez Ã  TROPHEE_DU_CHAMPIONNAT la valeur la valeur "Coupe Stanley", vous devez le faire directement dans la classe Equipe. Affichez ensuite cette valeur.
        Equipe.setTROPHEE_DU_CHAMPIONNAT("Coupe Stanley");
        System.out.println("24------------------------------------------------------------------------");

        // 25 - Affichez le nombre d'Ã©quipes qui ont Ã©tÃ© crÃ©Ã©es.
        System.out.println("Nombres d'equpes creer : " +Equipe.getCompteurEquipe());
        System.out.println("25------------------------------------------------------------------------");
    }
}
 
/*
 * // 26 - InsÃ©rez vos rÃ©sultats en commentaire ici.
 * 1------------------------------------------------------------------------
Voici : Equipe [nom=canadiensMontreal, nombreChampionnats=1, capitaineInfo=Capitaine [nom=indefini, position=indefini, numeroJoueur=0], annee=2024, nombreEquipe=1]
2------------------------------------------------------------------------
3------------------------------------------------------------------------
Voici : Equipe [nom=canadiensMontreal, nombreChampionnats=1, capitaineInfo=Capitaine [nom=Jean Beliveau, position=attaquant, numeroJoueur=4], annee=2024, nombreEquipe=1]
4------------------------------------------------------------------------
Voici l'equipe canadien : Equipe [nom=canadiens de Montreal, nombreChampionnats=24, capitaineInfo=Capitaine [nom=indefini, position=indefini, numeroJoueur=0], annee=1909, nombreEquipe=1]

Voici l'equipe canadien : Equipe [nom=canadiensMontreal, nombreChampionnats=1, capitaineInfo=Capitaine [nom=Jean Beliveau, position=attaquant, numeroJoueur=4], annee=2024, nombreEquipe=1]
5------------------------------------------------------------------------
6------------------------------------------------------------------------
Voici :Equipe [nom=Penguins de Pittsburgh, nombreChampionnats=5, capitaineInfo=Capitaine [nom=Mario Lemineux, position=attaquant, numeroJoueur=66], annee=1967, nombreEquipe=2]

7------------------------------------------------------------------------
8------------------------------------------------------------------------
9------------------------------------------------------------------------
Voici nombres de championnats: 5

10------------------------------------------------------------------------
nombres de champs Canadien de Montreal sont:2
11------------------------------------------------------------------------
Nouveau capitaine :Capitaine [nom=wayne Gretzky, position=attaquant, numeroJoueur=99]
12------------------------------------------------------------------------
Le nom du capitaine de Montreal : Jean Beliveau

Le nom du capitaine de Montreal : indefini
13------------------------------------------------------------------------
Voici Rangers de New York :Equipe [nom=Rangers de New York, nombreChampionnats=4, capitaineInfo=Capitaine [nom=indefini, position=indefini, numeroJoueur=0], annee=1926, nombreEquipe=1]
14------------------------------------------------------------------------
Voici Rangers de New York :Equipe [nom=Rangers de New York, nombreChampionnats=4, capitaineInfo=Capitaine [nom=indefini, position=indefini, numeroJoueur=0], annee=1926, nombreEquipe=1]
15------------------------------------------------------------------------
Capitaine : Capitaine [nom=Mark Messier, position=centre, numeroJoueur=11]
16------------------------------------------------------------------------
Annee de fondation1971
 Nombre de championnat6
17------------------------------------------------------------------------
Nouveau position de Jean :defenseur
18------------------------------------------------------------------------
Le numero saisi n'est pas comprise entre 0 et 99
11
19------------------------------------------------------------------------
20------------------------------------------------------------------------
senateurOttawa égale à bruinsBoston : false

21------------------------------------------------------------------------
 égale raymondBourque à martinBrodeur : true

22------------------------------------------------------------------------
Le nom du capitaine de Montreal : Capitaine [nom=indefini, position=indefini, numeroJoueur=0]
23------------------------------------------------------------------------
24------------------------------------------------------------------------
Nombres d'equpes creer : 1
25------------------------------------------------------------------------
 */
        
 