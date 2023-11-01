package src;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class GestionCopmteBancaire {
    public static void main(String[] args) throws Exception {
        int  iChoixMenu  =  0;
        String  strChoixMenu [ ]  =  {  "Depot",   "Retrait", 
                    "Paiement", "Solde",  "Terminer", "Autres choix" };
                    double solde = 0 ;
                    String autres = " ";
                    do {
                        iChoixMenu = JOptionPane.showOptionDialog ( 
                            null, 
                            "Sélectionnez votre choix parmi les options suivantes: ",
                            "Operations Bancaires",   			  
                                        JOptionPane.YES_NO_OPTION, 
                            JOptionPane.PLAIN_MESSAGE, 
                            null,
                            strChoixMenu,
                            strChoixMenu[0] );
                           
                        DecimalFormat format = new DecimalFormat("0.00$");
                    
                    switch ( iChoixMenu )
                           {
                            
                           case 0: 
                           double montantDepot =  Double.parseDouble(JOptionPane.showInputDialog(null, "Entrer le montant que vous voulez deposer :" ));
                           if(montantDepot> 0){
                            solde += montantDepot;
                            JOptionPane.showMessageDialog(null, "Votre nouveau solde est de " +format.format(solde)); 
                           }
                           else{
                            JOptionPane.showMessageDialog(null, "solde insuffisant");
                           }
                          
                           break;
                                
                           case 1: 
                          double montantRetrait = Double.parseDouble(JOptionPane.showInputDialog(null, "Entrer le montant que vous voulez retirer :" )); 
                          if(solde > 0){
                            double resultat = solde - montantRetrait;
                            if(resultat > 0 ){
                                JOptionPane.showMessageDialog(null, "Vous avez retire " +format.format(montantRetrait)); 
                                JOptionPane.showMessageDialog(null, "Votre nouveau solde est de " +format.format(resultat)); 
                                solde = resultat;
                            }
                            else{
                            JOptionPane.showMessageDialog(null, "Vous n'avez pas assez d'argent dans votre compte, veuillez faire un Depot");
                            } 
                            }
                          else{
                            JOptionPane.showMessageDialog(null, "Votre solde est null");
                          }
                          break;
                                
                           case 2:  
                           double montantPaiement = Double.parseDouble(JOptionPane.showInputDialog(null, "Entrer le montant que vous voulez payer :" ));   
                           if(solde > 0){
                            double resultat = solde - montantPaiement;
                            if(resultat > 0 ){
                                JOptionPane.showMessageDialog(null, "Vous avez efectue un paiement de " +format.format(montantPaiement)); 
                                JOptionPane.showMessageDialog(null, "Votre nouveau solde est de " +format.format(resultat));  
                                solde = resultat;
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Vous n'avez pas assez d'argent dans votre compte, veuillez faire un Depot");
                                } 
                           }    
                           break;
                                
                           case 3: JOptionPane.showMessageDialog ( null, "Votre Solde est " +format.format(solde) );  		
                            break;
                            
                          case 4: 
                          JOptionPane.showMessageDialog ( null, "Terminer votre operation" );  
                                       break;
                           case 5 : 
                           autres =  JOptionPane.showInputDialog(null, "Entrez votre operation :");
                           if(autres != null || autres == null){

                            JOptionPane.showMessageDialog ( null, "saisi de choix non valide" );
                        }
                                   break;
                          }	
                    
                    }    while   (  iChoixMenu  != 4  );
                    
        
    }
}
