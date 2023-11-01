public class EXO10 {
   public static void main(String[] args) {
      int n = 20; // Nombre d'éléments à afficher dans la suite

    int first = 1; // Premier nombre de la suite
    int second = 1; // Deuxième nombre de la suite

    System.out.println("Les 20 premiers nombres de la suite de Fibonacci :");

    for (int i = 0; i < n; i++) {
        if (i < 2) {
            // Les deux premiers nombres sont 1
            System.out.print("1 ");
        } else {
            int next = first + second; // Calcul du prochain nombre de la suite
            System.out.print(next + " ");
            first = second; // Mise à jour des deux derniers nombres
            second = next;
        }
    }
    System.exit(0);
   }
  
}
// par principe de Fibonacci on prend 0 + 1 = 1, 1 + 1 = 2, 1 + 2 = 3 , 2 + 3 = 5 , 3 + 5 = 8 etc... 
