import javax.swing.JOptionPane;

public class EXO4 {
    
    public static void main(String[] args) {
          // Déclaration de variables
        int nombreMin = 0;
        int entier = 5;
        //on boucle l'affichage et aussi qu'à chaque tour de boucle on reaffecte la valeur de nombreMin
        for (int i = 0; i < entier; i++) {
            
            int nombre = Integer.parseInt(JOptionPane.showInputDialog(null, "Entrez le nombre"));

                if (nombre < nombreMin) {
                    nombreMin = nombre;
                }
                  //Cette Affichage montre le plus petit nombre à chaque tour de boucle
        System.out.println("La valeur minimale parmi les " +entier+ " entiers est " + nombreMin);
        
            } 
            System.exit(0);
        }
    }
          
        
        
        
 

