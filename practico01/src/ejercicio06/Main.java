package ejercicio06;

import java.util.List;

/**
 * Ejercicio 6.
 *
 * Escriba un procedimiento que dadas dos listas construya otra con los elementos comunes,
 * suponiendo que:
 *
 * a) Las listas están desordenadas y la lista resultante debe quedar ordenada.
 * b) Las listas están ordenadas y la lista resultante debe mantenerse ordenada.
 */
public class Main {

    public static void main(String[] args) {
        ListUtils listUtils = new ListUtils();
        List<String> list1 = List.of("B", "C", "A", "E", "D");
        List<String> list2 = List.of("A", "C", "E", "F", "G");
        System.out.println("A1 " + listUtils.sortedIntersectionA1(list1, list2));
        System.out.println("A2 " + listUtils.sortedIntersectionA2(list1, list2));
        List<String> list3 = List.of("A", "B", "C", "D", "E");
        List<String> list4 = List.of("A", "C", "E", "F", "G");
        System.out.println("B " + listUtils.sortedIntersectionB(list3, list3));
        System.out.println("B " + listUtils.sortedIntersectionB(list3, list4));
    }
}
