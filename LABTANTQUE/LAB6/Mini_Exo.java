import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Mini_Exo {

    public static void main(String[] args) throws Exception {

 /*  int iNbrs=0;

        int iNbrs2=0;

        String strNbr2;

        char cfin;

        do {

           

       

 

        String strNbr=JOptionPane.showInputDialog(null, "Entrez le premier nombre :");

        iNbrs=Integer.parseInt(strNbr);

 

 

        int  iChoixMenu  =  0;

        String  strChoixMenu [ ]  =  {  "Addition",   "Soustraction",

                    "Division", "Multiplication",  "=" };

       

 

        do {

 

            iChoixMenu = JOptionPane.showOptionDialog (

                null,

                "Sélectionnez votre choix parmi les options suivantes: ",

                "Menu principal sur les piles",              

                 JOptionPane.YES_NO_OPTION,

                JOptionPane.PLAIN_MESSAGE,

                null,

                strChoixMenu,

                strChoixMenu[0] );

       

       

        switch ( iChoixMenu )

               {

               case 0:

                strNbr2=JOptionPane.showInputDialog(null,"Entrez la valeur à être additionnée : ");

                iNbrs2=Integer.parseInt(strNbr2);

                iNbrs+=iNbrs2;

                break;

                   

               case 1:  

               strNbr2=JOptionPane.showInputDialog(null,"Entrez la valeur à être soustrait : ");

               iNbrs2=Integer.parseInt(strNbr2);

               iNbrs-=iNbrs2;

               break;

 

               case 2:

               strNbr2=JOptionPane.showInputDialog(null,"Entrez la valeur pour esffectuer la division : ");

                iNbrs2=Integer.parseInt(strNbr2);

               iNbrs/=iNbrs2;

               if (iNbrs2==0){

                JOptionPane.showMessageDialog(null, "action non valide");

               }

               break;

                   

               case 3:

 

               strNbr2=JOptionPane.showInputDialog(null,"Entrez la valeur pour la multiplication : ");

               iNbrs2=Integer.parseInt(strNbr2);

              iNbrs*=iNbrs2;

       

               break;

           

               case 4:

                JOptionPane.showMessageDialog(null, "Le résultat est = "+iNbrs);

               break;

 

              }

       

        }    while   (  iChoixMenu  != 4   );

 

        cfin=JOptionPane.showInputDialog(null, "Voulez vous faire un autre calcul ?").charAt(0);

       

    } while (cfin=='o'||cfin=='O');       */

//Exo 1
/*
 * //int   iNbra;
  //    boolean   fini = false;

//      iNbra  =  1;
  //    while  (  !fini  )
    //          {
      //        if   ( iNbra == 5 )
        //             fini  = true;
          //    iNbra++;
              };
      //JOptionPane.showMessageDialog ( null, "Le nombre a vaut: "  +  iNbra );
 */


//Exo 2
/*int   iNbra , iNbrb;
          iNbrb  = 1;
          iNbra  = 1;
         while  (  iNbra  <=  5  )
                  {
                  iNbrb++;
                  iNbra++;
                  };
         JOptionPane.showMessageDialog ( null,"Le nombre a et b: " + iNbra + " " + iNbrb);
*/

//Exo 3 
/*int  iNbra;
       boolean   fini = false;

      iNbra = 1;

      do
         {
         if  (  iNbra  ==  5 )
                fini   =  true;
         iNbra++;
         } while  ( ! fini );

     JOptionPane.showMessageDialog ( null,  "Le nombre a vaut: "  +  iNbra );

*/
//Exo 4
/*int   iNbra , iNbrb;
      iNbra  =  1;
      iNbrb  =  1;

     do
          {
          iNbrb++;
          iNbra++;
          }  while  (  iNbra  <=  5 );

     JOptionPane.showMessageDialog(null, "Le nombre a et b " +  iNbra + " " + iNbrb );

*/
//Exo 5
/* 
int  iNbr        =  1;
      Int  iSomme   =  0;
      do
            {
            iSomme  +=   iNbr;
            JOptionPane.showMessageDialog ( null,"Le nombre iNbr vaut: "   +   iNbr );
            }
       while  (   iNbr++  <  5 );

       JOptionPane.showMessageDialog ( null, "Le nombre iNbr vaut:" +  iNbr );
       JOptionPane.showMessageDialog ( null, "La somme vaut: "         +  iSomme );
somme = 15

int  iNbr        =  1;
int  iSomme   =  0;
 while  (   iNbr++  <  5 ){
  iSomme  +=   iNbr;
      JOptionPane.showMessageDialog ( null,"Le nombre iNbr vaut: "   +   iNbr );
 };

 JOptionPane.showMessageDialog ( null, "Le nombre iNbr vaut:" +  iNbr );
 JOptionPane.showMessageDialog ( null, "La somme vaut: "         +  iSomme );

 //somme = 14 , sinon metre iNbr = 0
 */

//Exo 6 




//Exo 7 



 
//Exo 8  
/*
 * int  iNbra,  iNbrb,  iNbrc;
    iNbra = 1;   iNbrb = 1;   iNbrc = 1;
    while    (  ++iNbrc   <=   10 )
                  iNbra   +=   iNbrc++;
JOptionPane.showMessageDialog  (  null, "Le a vaut: "    +  iNbra );
JOptionPane.showMessageDialog  (  null, "Le b vaut: "    +  iNbrb );
JOptionPane.showMessageDialog  (  null, "Le c vaut: "    +  iNbrc );
 */

 
 
   

//Exo 9
/*int j;
int k;
int i;
for  (   i =  j = 1;    i < 5;    i++ )
j   +=   i;
k   =   2  *  i;
JOptionPane.showMessageDialog  ( null,  " i, j, et k "   +   i   +   j   +   k  );

while   (  i  < 10    &&    j  >  10  )
    k   +=   j--    -   ++i;
   JOptionPane.showMessageDialog   ( null,  " i, j, et k "   +   i   +   j   +   k  );

*/



}

}
