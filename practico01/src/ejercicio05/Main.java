package ejercicio05;

/**
 * Ejercicio 5.
 *
 * A partir de la clase Lista implementada en el ejercicio 1, implemente el patrón
 * iterator-iterable, para que la lista sea iterable. ¿Existe alguna ventaja computacional a la
 * hora de recorrer la lista de principio a fin si se cuenta con un iterador?
 */
public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.insertFront(3);
        myLinkedList.insertFront(2);
        myLinkedList.insertFront(1);
        myLinkedList.print();
        for (Integer value : myLinkedList) {
            System.out.println(value);
        }
        // Q: ¿Existe alguna ventaja computacional a la hora de recorrer la lista
        //    de principio a fin si se cuenta con un iterador?
        // A: No
    }
}
