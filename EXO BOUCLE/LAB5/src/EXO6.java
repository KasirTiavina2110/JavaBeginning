public class EXO6 {
    public static void main(String[] args) {
        int n = 5; 

        System.out.println("Table de multiplication de 1 à " + n + " :");
        
      

        
        int multiplicande; // ligne 1
        int multiplicateur; // ligne 2
        for (multiplicande = 1; multiplicande <= n; multiplicande++) {
           

            for (multiplicateur = 1; multiplicateur <= n; multiplicateur++) {
                //Affichage ligne 1 * ligne 2 
                System.out.print(+ multiplicande + "  X  " + multiplicateur + "  =  " + (multiplicande * multiplicateur) +  "\t"); // Calcul du produit et affichage avec une tabulation
            }
            // Affichage de la table de multiplication
            System.out.println(); // Passer à la ligne suivante après chaque ligne de la table
            
        }
        System.exit(0);
    }
}


