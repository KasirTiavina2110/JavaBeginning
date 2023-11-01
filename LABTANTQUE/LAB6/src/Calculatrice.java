package src;

import javax.swing.JOptionPane;

public class Calculatrice {
    public static void main(String[] args) {
        int  iChoixMenu  =  0;
        String  strChoixMenu [ ]  =  {  " + ",   " - ", 
                    " * ", " / ", "Autre operation" ,"Terminer" };
                    iChoixMenu = 0;
                    String reponse= " " ;
                   do{
                  
                    int nbr = Integer.parseInt(JOptionPane.showInputDialog(null,"Entrer un premier chiffre : "));
                    
                    do{
                        iChoixMenu = JOptionPane.showOptionDialog ( 
                            null, 
                            "Sélectionnez l'operation votre choix parmi les options suivantes: ",
                            "Calculatrice",   			  
                                        JOptionPane.YES_NO_OPTION, 
                            JOptionPane.PLAIN_MESSAGE, 
                            null,
                            strChoixMenu,
                            strChoixMenu[0] );
                            
                        
                        switch(iChoixMenu ){
                            case 0 :
                           
                            int chiffreAdditioner = Integer.parseInt(JOptionPane.showInputDialog(null,"Entrer le chiffre a additioner : "));
                           nbr+=chiffreAdditioner;
                            JOptionPane.showMessageDialog(null, "l'addition des deux chiffres est : " +nbr);
                            break;
                            case 1 :
                            int chiffreSoustraire = Integer.parseInt(JOptionPane.showInputDialog(null,"Entrer le chiffre a soustraire : "));
                            nbr-=chiffreSoustraire ;
                            JOptionPane.showMessageDialog(null, "la soustraction des deux chiffres est : " +nbr);
                            break;
                            case 2 :
                            int chiffreMultiplication = Integer.parseInt(JOptionPane.showInputDialog(null,"Entrer le chiffre a multiplier : "));
                            nbr*=chiffreMultiplication;
                            JOptionPane.showMessageDialog(null, "la multiplication des deux chiffres est : " +nbr);
                            break;
                            case 3 :
                            int chiffreDivision = Integer.parseInt(JOptionPane.showInputDialog(null,"Entrer le chiffre a diviser : "));
                            if(  chiffreDivision != 0){
                            nbr/=chiffreDivision;
                            JOptionPane.showMessageDialog(null, "la division des deux chiffres est : " +nbr);
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Division par Zero impossible");
                            }
                            break;
                            case 4 :
                            
                            String autres =  JOptionPane.showInputDialog(null, "Entrez votre operation");
                            if(autres != null || autres == null){
                                JOptionPane.showMessageDialog ( null, "Operation impossible" );
                            }
                                       break;
                                    }

                                    }    while( iChoixMenu != 5 );
                   reponse = JOptionPane.showInputDialog ( null, "Voulez vous faire un autre calcul ?" );
       
                   } while (reponse.equalsIgnoreCase("O"));
                    
}
}
