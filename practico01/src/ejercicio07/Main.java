package ejercicio07;

import java.util.List;

/**
 * Ejercicio 7.
 *
 * Escriba una función que dadas dos listas construya otra con los elementos que están en la
 * primera pero no en la segunda.
 */
public class Main {

    public static void main(String[] args) {
        ListUtils listUtils = new ListUtils();
        List<String> list1 = List.of("B", "C", "A", "E", "D");
        List<String> list2 = List.of("A", "C", "E", "F", "G");
        System.out.println("Result: " + listUtils.elementsInList1AndNotInList2(list1, list2));
    }
}
