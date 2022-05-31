package ejercicio04;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        SetUtils setUtils = new SetUtils();
        System.out.println(setUtils.hasDisjointSubsets(Set.of(1, 2, 11, 37, 39, 40)));
        System.out.println(setUtils.hasDisjointSubsets(Set.of(1, 5, 56)));
        System.out.println(setUtils.hasDisjointSubsets(Set.of(1, 3, 6, 8)));
    }
}
