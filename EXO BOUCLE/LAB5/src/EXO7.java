import javax.swing.JOptionPane;

public class EXO7 {
    public static void main(String[] args) {
       
    int chiffre = Integer.parseInt(JOptionPane.showInputDialog(null, "Veuillez entrer le chiffre où on fera la table de multiplication jusqu'à 9"));
    int limite = 9; 

        System.out.println("Table de multiplication de 1 à " + limite + " :");
       //Verification si le chiffre est negatif
        if (chiffre > 9 || chiffre <= 0){
            System.out.println("Nombre non valide. Entrez un nombre entre 1 et 9.");
            return;
        }
        
            for (int multiplicateur = 1; multiplicateur <= limite; multiplicateur++) {
              
                //Affichage en tabulation
                System.out.print(chiffre + "  X  " + multiplicateur + "  =  " + (chiffre * multiplicateur) +  "\t"); // Calcul du produit et affichage avec une tabulation
            }

                
            System.exit(0);
    }
}
