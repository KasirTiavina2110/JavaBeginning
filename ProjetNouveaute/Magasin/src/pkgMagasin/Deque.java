package pkgMagasin;
import java.util.LinkedList;

import pkgInterface.StructureDeDonneesFile;
import pkgInterface.StructureDeDonneesFileDequeue;


public class Deque<T> implements StructureDeDonneesFile<T>, StructureDeDonneesFileDequeue<T> {
    private LinkedList<T> deque;

    public Deque() {
        deque = new LinkedList<>();
    }

    @Override
    public void insertFirst(T e) {
        deque.addFirst(e);
    }

    @Override
    public void insertLast(T e) {
        deque.addLast(e);
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("La deque est vide.");
        }
        return deque.removeFirst();
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("La deque est vide.");
        }
        return deque.removeLast();
    }

    @Override
    public void enqueue(T element) {
        deque.addLast(element);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La file est vide.");
        }
        return deque.removeFirst();
    }

    @Override
    public T front() {
        if (isEmpty()) {
            throw new IllegalStateException("La file est vide.");
        }
        return deque.getFirst();
    }

    @Override
    public int size() {
        return deque.size();
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < deque.size(); i++) {
        sb.append(deque.get(i)).append("\n");
    }
    return sb.toString();
}

}
