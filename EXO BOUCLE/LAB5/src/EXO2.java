public class EXO2 {
    public static void main(String[] args) {
       //initialisation de la somme des multiples
        int somme = 0;

        for(int i = 0; i<=100; i++){
            if(i % 3 == 0){
                //la somme des multiples entiers positifs de 3 qui sont inférieurs à 100.
                somme += i;
            }
        }
        //Affichage
        System.out.println("La somme des multiples entiers positifs \r\n" + //
                "de 3 qui sont inférieurs à 100: " + somme);
                System.exit(0);
    }
}
