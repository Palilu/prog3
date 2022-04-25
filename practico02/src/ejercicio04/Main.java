package ejercicio04;

import java.util.Arrays;

/**
 * Ejercicio 4.
 * Implemente un algoritmo de ordenamiento por selección en un arreglo.
 * Implemente un algoritmo de ordenamiento por burbujeo en un arreglo.
 * 1. ¿Qué complejidad O tienen estos algoritmos?
 *    Ambos son O(n˜2)
 */
public class Main {

    public static void main(String[] args) {
        ArrayUtils<Integer> arrayUtils = new ArrayUtils<>();

        Integer[] randomValuesForMinSort = {9, 4, 5, 7, 2, 6, 8, 3, 1};
        System.out.println(Arrays.toString(randomValuesForMinSort));
        arrayUtils.minSort(randomValuesForMinSort);
        System.out.println(Arrays.toString(randomValuesForMinSort));

        Integer[] randomValuesForBubbleSort = {9, 4, 5, 7, 2, 6, 8, 3, 1};
        System.out.println(Arrays.toString(randomValuesForBubbleSort));
        arrayUtils.bubbleSort(randomValuesForBubbleSort);
        System.out.println(Arrays.toString(randomValuesForBubbleSort));
    }
}
