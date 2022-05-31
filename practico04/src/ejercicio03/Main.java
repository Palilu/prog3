package ejercicio03;

import java.util.Set;

public class Main {


    public static void main(String[] args) {
        SetUtils setUtils = new SetUtils();

        System.out.println(setUtils.subsets(Set.of(1, 2, 3, 4, 5, 6, 7), 14));
    }
}
