package ejercicio05;

import java.util.Iterator;

public class LinkedList<T> extends ejercicio01.LinkedList<T> implements Iterable<T> {

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<>(this.first);
    }
}
