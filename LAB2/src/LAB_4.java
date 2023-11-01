import javax.swing.JOptionPane;

public class LAB_4 {
    public static void main(String[] args) {
     final float SURFACEROULEAU1 = 50f;
        String hauteur1 = JOptionPane.showInputDialog(null, "Entrez l'hauteur : ");
        String largeur1 = JOptionPane.showInputDialog(null, "Entrez la largeur : ");
        String hauteur2 = JOptionPane.showInputDialog(null, "Entrez l'hauteur2 : ");
        String largeur2 = JOptionPane.showInputDialog(null, "Entrez la largeur2 : ");
       float hauteur = Float.parseFloat(hauteur1);
       float largeur = Float.parseFloat(largeur1);
       float hauteurDeux = Float.parseFloat(hauteur2);
       float largeurDeux = Float.parseFloat(largeur2);
    float surfaceMural = hauteur * largeur;
    float surfaceMural2 = hauteurDeux * largeurDeux; 
   // DecimalFormat format = new DecimalFormat("0.00");
    float nombredePapier = (surfaceMural+surfaceMural2)/SURFACEROULEAU1;
    JOptionPane.showMessageDialog(null, "  Le nombre de rouleaux de papier peint requis est :" + (nombredePapier));
    JOptionPane.showMessageDialog(null, "  Le nombre de rouleaux de papier peint requis est :" + Math.round(nombredePapier));
         // Fermez le programme
         System.exit(0);
    }
}
