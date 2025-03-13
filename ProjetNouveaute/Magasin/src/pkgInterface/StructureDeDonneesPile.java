package pkgInterface;

public interface StructureDeDonneesPile<T> {
    // Méthodes de la pile
    void push(T element); // Ajouter un élément au sommet de la pile
    T pop(); // Retirer et retourner l'élément en haut de la pile
    int size(); // Retourner la taille de la pile et la file
    boolean isEmpty(); // Vérifier si la pile ou file est vide
    T top(); // Retourner l'élément en haut de la pile sans le retirer

  
}
