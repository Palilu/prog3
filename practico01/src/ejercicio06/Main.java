package ejercicio06;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListUtils listUtils = new ListUtils();
        List<String> list1 = List.of("B", "C", "A", "E", "E");
        List<String> list2 = List.of("A", "C", "E", "F", "G");
        System.out.println("A1 " + listUtils.sortedIntersectionA1(list1, list2));
        System.out.println("A2 " + listUtils.sortedIntersectionA2(list1, list2));
        List<String> list3 = List.of("A", "B", "C", "D", "E");
        List<String> list4 = List.of("A", "C", "E", "F", "G");
        System.out.println("B " + listUtils.sortedIntersectionB(list3, list3));
        System.out.println("B " + listUtils.sortedIntersectionB(list3, list4));
    }
}
