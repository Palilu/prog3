package ejercicio08;

/**
 * Ejercicio 8.
 *
 * Considerando la implementación de Lista del ejercicio 1, realice una Lista doblemente
 * vinculada.
 */
public class DoubleLinkedList<T> {

    protected Node<T> first;
    protected Node<T> last;
    protected Integer size;

    public DoubleLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    public void insertFront(T o) {
        Node<T> newNode = new Node<>(o, null, first);
        if (first != null) {
            first.setPrevious(newNode);
        } else {
            last = newNode;
        }
        first = newNode;
        size++;
    }

    public void insertBack(T o) {
        Node<T> newNode = new Node<>(o, last, null);
        if (last != null) {
            last.setNext(newNode);
        } else {
            first = newNode;
        }
        last = newNode;
        size++;
    }

    public T extractFront() {
        if (first == null) {
            return null;
        }

        T result = first.getValue();
        first = first.getNext();
        if (first != null) {
            first.setPrevious(null);
        } else {
            last = null;
        }
        size--;
        return result;
    }

    public T extractBack() {
        if (last == null) {
            return null;
        }

        T result = last.getValue();
        last = last.getPrevious();
        if (last != null) {
            last.setNext(null);
        } else {
            first = null;
        }
        size--;
        return result;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public T get(Integer index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public String toString() {
        if (first == null) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        Node<T> current = first;
        do {
            result.append(current.getValue().toString());
            current = current.getNext();
        } while (current != null);
        return result.toString();
    }

    public void print() {
        System.out.println("DoubleLinkedList(" + this.size() + "): " + this + " " + this.isEmpty());
    }
}
