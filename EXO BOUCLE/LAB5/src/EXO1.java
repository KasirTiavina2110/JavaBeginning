public class EXO1 {
    public static void main(String[] args) throws Exception {
       //initialisation des operation à faire
                int sommeA = 0;
                int sommeB = 0;
                int sommeC = 0;
        
                // a) Somme des nombres entiers de 0 à 20
                for (int i = 0; i <= 20; i++) {
                    sommeA += i;
                }
        
                // b) Somme des nombres entiers pairs de 21 à 50
                for (int i = 21; i <= 50; i++) {
                    if (i % 2 == 0) {
                        sommeB += i;
                    }
                }
        
                // c) Somme des nombres entiers impairs de 51 à 100
                for (int i = 51; i <= 100; i++) {
                    if (i % 2 != 0) {
                        sommeC += i;
                    }
                }
        
                System.out.println("Somme des nombres entiers de 0 à 20 : " + sommeA);
                System.out.println("Somme des nombres entiers pairs de 21 à 50 : " + sommeB);
                System.out.println("Somme des nombres entiers impairs de 51 à 100 : " + sommeC);
                System.exit(0);
            }
        }
        
    

