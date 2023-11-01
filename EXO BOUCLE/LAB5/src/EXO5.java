public class EXO5 {
    public static void main(String[] args) {
       // nombre de boucles
        int entier = 10;

        for (int n = 0; n <= entier; n++) {
            int fact = 1;
        
            System.out.print("La valeur factorielle de " + n + " est : " + n + "! = ");
        
            for (int i = 1; i <= n; i++) {
                fact *= i; // 1 *= 1 = 1, 
                if (i == 1) {
                    System.out.print(i); //Affiche 1 sans se mettre à la ligne
                } else {
                    System.out.print(" * " + i);
                    // fact *= 2 * 1 = 2 etc, si i != 1 
                }
            }
         System.out.println(" = " + fact);
         
        }
        System.exit(0);
    }
}
