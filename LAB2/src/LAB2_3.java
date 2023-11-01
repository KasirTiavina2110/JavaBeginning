import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class LAB2_3 {
    public static void main(String[] args) {

        int examI, examII, examIII, travailI, travailII, travailIII, travailIV;
        //final int pointmax = 100;
        float ponderationExam = 0.6f;
        float ponderationTravail = 0.4f;

        String prenom = JOptionPane.showInputDialog(null, "le prénom : ");
        String nom = JOptionPane.showInputDialog(null, "le nom : ");
        String examen1 = JOptionPane.showInputDialog(null, "la note de l'examen 1 : ");
        String examen2 = JOptionPane.showInputDialog(null, "la note de l'examen 2 : ");
        String examen3 = JOptionPane.showInputDialog(null, "la note de l'examen 3 : ");
        String travail1 = JOptionPane.showInputDialog(null, "la note de Travail 1 : ");
        String travail2 = JOptionPane.showInputDialog(null, "la note de Travail 2 : ");
        String travail3 = JOptionPane.showInputDialog(null, "la note de Travail 3 : ");
        String travail4 = JOptionPane.showInputDialog(null, "la note de Travail 4 : ");

        // parseInt exam
        examI = Integer.parseInt(examen1);
        examII = Integer.parseInt(examen2);
        examIII = Integer.parseInt(examen3);
        // parseInt travail
        travailI = Integer.parseInt(travail1);
        travailII = Integer.parseInt(travail2);
        travailIII = Integer.parseInt(travail3);
        travailIV = Integer.parseInt(travail4);

        // ponderation pour chaque exam & travail
        float ponderationExamTotal = (float) (examI + examII + examIII) / 3 * ponderationExam;
        float ponderationTravauxTotal = (float) (travailI + travailII + travailIII + travailIV) / 4 * ponderationTravail;

        // Decimal format
        DecimalFormat format = new DecimalFormat("0.00");

        String strResultat = " ";
        strResultat += "\n Voici les détails des notes pour l'examen : " + format.format(ponderationExamTotal);
        strResultat += "\n Voici pour les travaux : " + format.format(ponderationTravauxTotal);
        strResultat += "\n" + prenom + "  " + nom + " obtient un resultat final de "  + format.format(ponderationExamTotal + ponderationTravauxTotal) + "%  au cours d'introduction à la programmation";

        JOptionPane.showMessageDialog(null,strResultat );

        // Fermez le programme
        System.exit(0);
    }
}
