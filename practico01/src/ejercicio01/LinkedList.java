package ejercicio01;

public class LinkedList<T> {

    protected Node<T> first;
    protected Integer size;

    public LinkedList() {
        first = null;
        size = 0;
    }

    public void insertFront(T o) {
        first = new Node<>(o, first);
        size++;
    }

    public T extractFront() {
        if (first == null) {
            return null;
        }

        T result = first.getValue();
        first = first.getNext();
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
        System.out.println("LinkedList(" + this.size() + "): " + this + " " + this.isEmpty());
    }
}