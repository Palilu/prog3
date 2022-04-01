package ejercicio08;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList<Integer> myLinkedList = new DoubleLinkedList<>();
        myLinkedList.print();
        myLinkedList.insertFront(2);
        myLinkedList.print();
        myLinkedList.insertBack(3);
        myLinkedList.print();
        myLinkedList.extractFront();
        myLinkedList.print();
        myLinkedList.extractBack();
        myLinkedList.print();
        myLinkedList.insertBack(2);
        myLinkedList.print();
        myLinkedList.insertBack(3);
        myLinkedList.print();
        myLinkedList.insertFront(1);
        myLinkedList.print();
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
    }
}
