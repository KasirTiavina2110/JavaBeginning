import javax.swing.JOptionPane;

public class test
{
    
    public static void main(String[] args) 
    {
        
        
        String strNombre, strCtr;
        int i,  iMin = 0, ctr = 0 , iNombre;
         // on va mettre dans la boucle le nombre de fois où elle va etre executer
        strCtr = JOptionPane.showInputDialog(null, "Entrer le nombre de fois que la commande sera exécutée");
        ctr = Integer.parseInt(strCtr);

        for( i = 0; i < ctr; i++){
          
            strNombre = JOptionPane.showInputDialog(null, "Entrer le nombre");
            iNombre = Integer.parseInt(strNombre);
           
            if(iNombre < iMin){
                

                iMin = iNombre;
            }
           
        }
        System.out.println(" La valeur minimale parmis les " + ctr + " entiers est " + iMin);
        


    }
}