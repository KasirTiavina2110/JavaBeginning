package pkgQuizInterfaceH2024;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestQuizInterfaceH2024 {
    
    public static ArrayList<Forme> DEUX = new ArrayList<>();
    
    public static void main(String[] args) {
        
        // Déclaration des objets
        Carre carre = new Carre(4);
        Rectangle rectangle = new Rectangle(10, 5);
        double cote, longueur, largeur ,  perimetreTotal = 0.0, aireMoyenne = 0.0;; 

        
        
        // 1. Avec la variable référence carre, créer un objet de la classe Carre
        //    dont la dimension (la variable cote) est saisie par l'utilisateur.
         cote = Double.parseDouble(JOptionPane.showInputDialog(null, "Entrez cote du carre : "));
         carre = new Carre(cote);
        System.out.println("1. Création de l'objet carre --------------------------------------------------------");

        // 2. Avec la variable référence rectangle, créer un objet de la classe Rectangle 
        //    dont les dimensions (les variables longueur et largeur) sont saisies par l'utilisateur.
        longueur = Double.parseDouble(JOptionPane.showInputDialog(null, "Entrez cote du longeur : "));
        largeur = Double.parseDouble(JOptionPane.showInputDialog(null, "Entrez cote du largeur : "));
        rectangle = new Rectangle(longueur, largeur);
        System.out.println("2. Création de l'objet rectangle ----------------------------------------------------");


        // 3. Déclarer une ArrayList d'un type approprié pour contenir des objets de type Carre et Rectangle.
        
        System.out.println("3. Déclaration de l'ArrayList -------------------------------------------------------");
        
        
        // 4. Ajouter les objets carre et rectangle à l'ArrayList.
        DEUX.add(rectangle);
        DEUX.add(carre);
        System.out.println("4. Ajout des objets à l'ArrayList ---------------------------------------------------");


        // 5. À l'aide d'une boucle appropriée, calculer le périmètre total et l'aire moyenne des objets de l'ArrayList.
        for (int ctr = 0; ctr < DEUX.size(); ctr++) {
			Object formeObjet = DEUX.get(ctr);
			if (formeObjet instanceof Forme) {
				Forme forme1 = (Forme) formeObjet;
				perimetreTotal += forme1.getPerimetre();
                aireMoyenne += forme1.getAire();
			} else {
				// Gérer l'erreur ici, si nécessaire
				System.err.println("Erreur: L'élément à l'index " + ctr + " n'implémente pas l'interface Forme.");
			}
            
		}
       

        System.out.println("5. Calcul du périmètre total et de l'aire moyenne -----------------------------------");
        // Calcul du prix total
        System.out.println("Perimetre total: " + perimetreTotal);


        // 6. Afficher le périmètre total et l'aire moyenne.
        System.out.println("6. Affichage du périmètre total et de l'aire moyenne --------------------------------");
        System.out.println("Perimetre total: " + aireMoyenne);

        System.exit(0);

    }


   

}
