import javax.swing.JOptionPane;

public class Verification {
    public static void main(String[] args) {
        String nbr = JOptionPane.showInputDialog ( " Entrez un nombre entier " );
        int iNbr = Integer.parseInt ( nbr );
        if (iNbr > 0)
           System.out.println(nbr + "EST POSITIVE");
 
        else if (iNbr < 0)
        System.out.println(nbr + "EST NEGATIVE");
 
        else
        System.out.println("EST 0");
    }

    }

