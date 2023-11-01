import javax.swing.JOptionPane;

public class TestBissextile {
    public static void main(String[] args) {
        int annee = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre l'annee "));

        //Check bissextile 
        if(annee%4 == 0){
            JOptionPane.showMessageDialog(null,  "L'annee" +annee+ " est bissextile");
        }else if(annee%100 == 0 && annee%400 == 0){
            JOptionPane.showMessageDialog(null,  "L'annee" +annee+ " est bissextile");
        }else{
             JOptionPane.showMessageDialog(null,  "L'annee" +annee+ " n'est pas bissextile");
        }
        System.exit(0);
    }
}
