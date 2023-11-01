import javax.swing.JOptionPane;

public class Age {
    public static void main(String[] args) throws Exception {
        final  int  AGE  = 18;

String strAge =  JOptionPane.showInputDialog ( "Entrez l`âge de la personne" );
int Age    =  Integer.parseInt ( strAge );

if   ( AGE <= Age)
       System.out.println ("La personne est majeure et a  "  +  Age +   "ans");
else System.out.println ("La personne est mineure et a  "  +  Age +   "ans");

    

    System.exit(0);
}
}