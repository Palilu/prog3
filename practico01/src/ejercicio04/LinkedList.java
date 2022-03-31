package ejercicio04;

import ejercicio01.Node;

public class LinkedList<T> extends ejercicio01.LinkedList<T> {

    public int indexOf(T value) {
        Node<T> current = super.first;
        for (int i = 0; i < this.size(); i++) {
            if (current.getValue().equals(value)) {
                return i;
            }
            current = current.getNext();
        }
        return -1;
    }
}
