import javax.swing.JOptionPane;

public class Pair {
    public static void main(String[] args) {
    String    strNbr =  JOptionPane.showInputDialog ( " Entrez un nombre entier " );
int iNbr    =  Integer.parseInt ( strNbr);
int reste = iNbr % 2;


if    ( reste != 0)
        System.out.println (" LE  NOMBRE " +  iNbr  +  "  EST  IMPAIR");
else  System.out.println (" LE  NOMBRE " + iNbr + "  EST PAIR");

    }
}
