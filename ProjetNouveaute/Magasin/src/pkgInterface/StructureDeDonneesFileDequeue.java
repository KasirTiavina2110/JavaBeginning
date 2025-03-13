package pkgInterface;

public interface StructureDeDonneesFileDequeue<T> {
    void insertFirst(T e);
    void insertLast(T e);
    T removeFirst();
    T removeLast();
}

