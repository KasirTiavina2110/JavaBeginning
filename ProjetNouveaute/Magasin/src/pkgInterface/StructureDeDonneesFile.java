package pkgInterface;

public interface StructureDeDonneesFile<T> {
      // Méthodes de la file
      void enqueue(T element); // Ajouter un élément à la fin de la file
      T dequeue(); // Retirer et retourner l'élément en tête de la file
      T front(); // Retourner l'élément en tête de la file sans le retirer
      int size(); // Retourner la taille de la pile et la file
      boolean isEmpty(); // Vérifier si la pile ou file est vide
}
