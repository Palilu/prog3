package ejercicio01;

public class Node<T> {
    private T value;
    private Node<T> next;

    public Node() {
        value = null;
        next = null;
    }
    public Node(T o, Node n) {
        setValue(o);
        setNext(n);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T o) {
        value = o;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node n) {
        next = n;
    }
}