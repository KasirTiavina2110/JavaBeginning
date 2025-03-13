package pkgTest;
import javax.swing.JOptionPane;
import pkgMagasin.Magasin;
import pkgMagasin.Pile;
import pkgMagasin.File;
import pkgMagasin.Deque;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        // Création de la pile et de la file de magasins
        Pile<Magasin> pileMagasins = new Pile<>();
        File<Magasin> fileMagasins = new File<>();
        Deque<Magasin> dequeMagasins = new Deque<>();
        // Ajout de produits fictifs dans la pile
        pileMagasins.push(new Magasin("Banane", 10, 1.99,
                new GregorianCalendar(2024, 3, 1),
                new GregorianCalendar(2024, 3, 15)));
        pileMagasins.push(new Magasin("Pomme", 20, 2.49,
                new GregorianCalendar(2024, 2, 15),
                new GregorianCalendar(2024, 2, 25)));
        pileMagasins.push(new Magasin("Orange", 15, 3.50,
                new GregorianCalendar(2024, 3, 5),
                new GregorianCalendar(2024, 3, 20)));

        // Ajout de produits fictifs dans la file
        fileMagasins.enqueue(new Magasin("Ananas", 8, 4.99,
                new GregorianCalendar(2024, 3, 10),
                new GregorianCalendar(2024, 3, 25)));
        fileMagasins.enqueue(new Magasin("Kiwi", 12, 2.99,
                new GregorianCalendar(2024, 3, 2),
                new GregorianCalendar(2024, 3, 17)));
        fileMagasins.enqueue(new Magasin("Fraise", 5, 6.49,
                new GregorianCalendar(2024, 3, 8),
                new GregorianCalendar(2024, 3, 22)));

                // Ajout de produits fictifs dans la deque
                dequeMagasins.insertFirst(new Magasin("Pastèque", 3, 12.50,
                new GregorianCalendar(2024, 3, 7),
                new GregorianCalendar(2024, 3, 22)));
                dequeMagasins.insertLast(new Magasin("Melon", 7, 8.99,
                new GregorianCalendar(2024, 3, 12),
                new GregorianCalendar(2024, 3, 27)));
                dequeMagasins.insertLast(new Magasin("Cerise", 18, 4.75,
                new GregorianCalendar(2024, 3, 3),
                new GregorianCalendar(2024, 3, 18)));

        boolean quitter = false;

        do {
           // Menu principal
           String[] options = {"Pile", "File", "Deque", "Quitter"};
            int choixPrincipal = JOptionPane.showOptionDialog(null, "Choisissez une structure de données :",
                    "Menu Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[0]);

            switch (choixPrincipal) {
                case 0:
                    // Sous-menu pour tester les méthodes de la pile
                    String[] optionsPile = {"Push", "Pop", "Size", "IsEmpty", "Top", "Afficher produits", "Retour"};
                    int choixPile;
                    do {
                        choixPile = JOptionPane.showOptionDialog(null, "Choisissez une opération à effectuer sur la pile :",
                                "Menu Pile", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, optionsPile, optionsPile[0]);

                        try {
                            switch (choixPile) {
                                case 0:
                                    // Push
                                    // Ajouter un produit à la pile
                                    Magasin nouveauMagasin = creerMagasin();
                                    pileMagasins.push(nouveauMagasin);
                                    JOptionPane.showMessageDialog(null, "Produit ajouté à la pile avec succès.");
                                    break;
                                case 1:
                                    // Pop
                                    // Retirer un produit de la pile
                                    if (!pileMagasins.isEmpty()) {
                                        Magasin magasinDepile = pileMagasins.pop();
                                        JOptionPane.showMessageDialog(null, "Produit retiré de la pile : " + magasinDepile);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "La pile est vide.");
                                    }
                                    break;
                                case 2:
                                    // Size
                                    // Taille de la pile
                                    JOptionPane.showMessageDialog(null, "Taille de la pile : " + pileMagasins.size());
                                    break;
                                case 3:
                                    // IsEmpty
                                    // Vérifier si la pile est vide
                                    JOptionPane.showMessageDialog(null, "La pile est vide : " + pileMagasins.isEmpty());
                                    break;
                                case 4:
                                    // Top
                                    // Voir l'élément au sommet de la pile
                                    if (!pileMagasins.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Sommet de la pile : " + pileMagasins.top());
                                    } else {
                                        JOptionPane.showMessageDialog(null, "La pile est vide.");
                                    }
                                    break;
                                case 5:
                                    // Afficher produits
                                    JOptionPane.showMessageDialog(null, "Produits dans la pile :\n" + pileMagasins.toString());
                                    break;
                                case 6:
                                    // Retour au menu principal
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Choix invalide.");
                            }
                        } catch (IllegalStateException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (choixPile != 6);
                    break;
                case 1:
                    // Sous-menu pour tester les méthodes de la file
                    String[] optionsFile = {"Enqueue", "Dequeue", "Size", "IsEmpty", "Front", "Afficher produits", "Retour"};
                    int choixFile;
                    do {
                        choixFile = JOptionPane.showOptionDialog(null, "Choisissez une opération à effectuer sur la file :",
                                "Menu File", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, optionsFile, optionsFile[0]);

                        try {
                            switch (choixFile) {
                                case 0:
                                    // Enqueue
                                    // Ajouter un produit à la file
                                    Magasin nouveauMagasin = creerMagasin();
                                    fileMagasins.enqueue(nouveauMagasin);
                                    JOptionPane.showMessageDialog(null, "Produit ajouté à la file avec succès.");
                                    break;
                                case 1:
                                    // Dequeue
                                    // Retirer un produit de la file
                                    if (!fileMagasins.isEmpty()) {
                                        Magasin magasinDefile = fileMagasins.dequeue();
                                        JOptionPane.showMessageDialog(null, "Produit retiré de la file : " + magasinDefile);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "La file est vide.");
                                    }
                                    break;
                                case 2:
                                    // Size
                                    // Taille de la file
                                    JOptionPane.showMessageDialog(null, "Taille de la file : " + fileMagasins.size());
                                    break;
                                case 3:
                                    // IsEmpty
                                    // Vérifier si la file est vide
                                    JOptionPane.showMessageDialog(null, "La file est vide : " + fileMagasins.isEmpty());
                                    break;
                                case 4:
                                    // Front
                                    // Voir l'élément au début de la file
                                    if (!fileMagasins.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Premier élément de la file : " + fileMagasins.front());
                                    } else {
                                        JOptionPane.showMessageDialog(null, "La file est vide.");
                                    }
                                    break;
                                case 5:
                                    // Afficher produits
                                    JOptionPane.showMessageDialog(null, "Produits dans la file :\n" + fileMagasins.toString());
                                    break;
                                case 6:
                                    // Retour au menu principal
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Choix invalide.");
                            }
                        } catch (IllegalStateException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (choixFile != 6);
                    break;
                    case 2:
                    // Sous-menu pour tester les méthodes de la deque
                    String[] optionsDeque = {"InsertFirst", "InsertLast", "RemoveFirst", "RemoveLast", "Size", "IsEmpty", "Afficher produits", "Retour"};
                    int choixDeque;
                    do {
                        choixDeque = JOptionPane.showOptionDialog(null, "Choisissez une opération à effectuer sur la deque :",
                                "Menu Deque", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, optionsDeque, optionsDeque[0]);

                        try {
                            switch (choixDeque) {
                                case 0:
                                    // InsertFirst
                                    // Ajouter un produit au début de la deque
                                    Magasin nouveauMagasinFirst = creerMagasin();
                                    dequeMagasins.insertFirst(nouveauMagasinFirst);
                                    JOptionPane.showMessageDialog(null, "Produit ajouté au début de la deque avec succès.");
                                    break;
                                case 1:
                                    // InsertLast
                                    // Ajouter un produit à la fin de la deque
                                    Magasin nouveauMagasinLast = creerMagasin();
                                    dequeMagasins.insertLast(nouveauMagasinLast);
                                    JOptionPane.showMessageDialog(null, "Produit ajouté à la fin de la deque avec succès.");
                                    break;
                                case 2:
                                    // RemoveFirst
                                    // Retirer un produit du début de la deque
                                    if (!dequeMagasins.isEmpty()) {
                                        Magasin magasinDepileFirst = dequeMagasins.removeFirst();
                                        JOptionPane.showMessageDialog(null, "Produit retiré du début de la deque : " + magasinDepileFirst);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "La deque est vide.");
                                    }
                                    break;
                                case 3:
                                    // RemoveLast
                                    // Retirer un produit de la fin de la deque
                                    if (!dequeMagasins.isEmpty()) {
                                        Magasin magasinDepileLast = dequeMagasins.removeLast();
                                        JOptionPane.showMessageDialog(null, "Produit retiré de la fin de la deque : " + magasinDepileLast);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "La deque est vide.");
                                    }
                                    break;
                                case 4:
                                    // Size
                                    // Taille de la deque
                                    JOptionPane.showMessageDialog(null, "Taille de la deque : " + dequeMagasins.size());
                                    break;
                                case 5:
                                    // IsEmpty
                                    // Vérifier si la deque est vide
                                    JOptionPane.showMessageDialog(null, "La deque est vide : " + dequeMagasins.isEmpty());
                                    break;
                                case 6:
                                    // Afficher produits
                                    JOptionPane.showMessageDialog(null, "Produits dans la deque :\n" + dequeMagasins.toString());
                                    break;
                                case 7:
                                    // Retour au menu principal
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Choix invalide.");
                            }
                        } catch (IllegalStateException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (choixDeque != 7);
                    break;
                case 3:
                    // Quitter
                    quitter = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Choix invalide.");
            }
        } while (!quitter);
    }

    // Méthode pour créer un nouvel objet Magasin avec les données saisies par l'utilisateur
    private static Magasin creerMagasin() {
        try {
            String nomProduit = JOptionPane.showInputDialog("Nom du produit :");
            if (nomProduit == null || nomProduit.isEmpty()) {
                throw new IllegalArgumentException("Le nom du produit ne peut pas être vide.");
            }
    
            String quantiteString = JOptionPane.showInputDialog("Quantité du produit :");
            if (quantiteString == null || quantiteString.isEmpty()) {
                throw new IllegalArgumentException("La quantité du produit ne peut pas être vide.");
            }
            int quantiteProduit = Integer.parseInt(quantiteString);
            if (quantiteProduit <= 0) {
                throw new IllegalArgumentException("La quantité du produit doit être supérieure à zéro.");
            }
    
            String prixString = JOptionPane.showInputDialog("Prix du produit :");
            if (prixString == null || prixString.isEmpty()) {
                throw new IllegalArgumentException("Le prix du produit ne peut pas être vide.");
            }
            double prixProduit = Double.parseDouble(prixString);
            if (prixProduit <= 0) {
                throw new IllegalArgumentException("Le prix du produit doit être supérieur à zéro.");
            }
    
            int anneeEntree = Integer.parseInt(JOptionPane.showInputDialog("Année d'entrée du produit :"));
            int moisEntree = Integer.parseInt(JOptionPane.showInputDialog("Mois d'entrée du produit :")) - 1;
            int jourEntree = Integer.parseInt(JOptionPane.showInputDialog("Jour d'entrée du produit :"));
            int anneePeremption = Integer.parseInt(JOptionPane.showInputDialog("Année de péremption du produit :"));
            int moisPeremption = Integer.parseInt(JOptionPane.showInputDialog("Mois de péremption du produit :")) - 1;
            int jourPeremption = Integer.parseInt(JOptionPane.showInputDialog("Jour de péremption du produit :"));
    
            return new Magasin(nomProduit, quantiteProduit, prixProduit,
                    new GregorianCalendar(anneeEntree, moisEntree, jourEntree),
                    new GregorianCalendar(anneePeremption, moisPeremption, jourPeremption)
                    );
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Veuillez saisir une valeur numérique valide.");
        }
    }
}
