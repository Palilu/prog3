package ejercicio10;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        SetUtils setUtils = new SetUtils();

        System.out.println(setUtils.zeroSumSubsetsOfSize(Set.of(-7, -3, -2, -1, 5, 8), 3));
    }
}
