package pkgMagasin;

import java.util.ArrayList;

import pkgInterface.StructureDeDonneesPile;

public class Pile<T> implements StructureDeDonneesPile<T>{
    private ArrayList<T> elements;

    public Pile() {
        elements = new ArrayList<>();
    }

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide");
        }
        return elements.remove(elements.size() - 1);
    }

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public T top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide");
        }
        return elements.get(elements.size() - 1);
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
