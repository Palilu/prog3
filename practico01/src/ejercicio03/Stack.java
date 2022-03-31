package ejercicio03;

import ejercicio01.LinkedList;

public class Stack<T> {

    private LinkedList<T> list = new LinkedList<>();

    public void push(T o) {
        list.insertFront(o);
    }

    public T pop() {
        return list.extractFront();
    }

    public T top() {
        return list.get(list.size() - 1);
    }

    public void reverse() {
        if(list.isEmpty()) {
            return;
        }
        LinkedList<T> reverse = new LinkedList<>();
        T current;
        do {
            current = this.pop();
            reverse.insertFront(current);
        } while (this.top() != null);
        this.list = reverse;
    }

    public void print() {
        this.list.print();
    }

}
