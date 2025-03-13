package pkgMagasin;
import java.util.LinkedList;

import pkgInterface.StructureDeDonneesFile;

public class File<T> implements StructureDeDonneesFile<T>{
    private LinkedList<T> elements;

    public File() {
        elements = new LinkedList<>();
    }

    public void enqueue(T element) {
        elements.addLast(element);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La file est vide");
        }
        return elements.removeFirst();
    }

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public T front() {
        if (isEmpty()) {
            throw new IllegalStateException("La file est vide");
        }
        return elements.getFirst();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = elements.size() - 1; i >= 0; i--) {
            sb.append(elements.get(i)).append("\n");
        }
        return sb.toString();
    }
}
