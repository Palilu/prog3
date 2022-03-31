package ejercicio03;

/**
 * Ejercicio 3.
 *
 * Implemente una Pila utilizando la Lista del ejercicio 1. A una pila se le pueden agregar
 * elementos utilizando el método push(T o). Para retirar elementos de la colección se utiliza el
 * método pop(), que retorna el último elemento agregado a la colección y lo elimina de la
 * misma. Es posible consultar el tope de la pila (sin eliminarlo) utilizando el método top(). Por
 * último, es posible invertir el orden de los elementos de la pila mediante el método reverse().
 */
public class Main {

    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        myStack.print();
        myStack.push("Hola ");
        myStack.print();
        myStack.push("Cómo ");
        myStack.print();
        myStack.push("Estan ");
        System.out.println(myStack.top());
        myStack.print();
        myStack.pop();
        myStack.print();
        myStack.push("Estas ");
        myStack.print();
        myStack.reverse();
        myStack.print();
    }
}
